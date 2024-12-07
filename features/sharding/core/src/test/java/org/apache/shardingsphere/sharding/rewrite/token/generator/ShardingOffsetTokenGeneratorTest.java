/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sharding.rewrite.token.generator;

import org.apache.shardingsphere.infra.binder.context.segment.select.pagination.PaginationContext;
import org.apache.shardingsphere.infra.binder.context.statement.dml.InsertStatementContext;
import org.apache.shardingsphere.infra.binder.context.statement.dml.SelectStatementContext;
import org.apache.shardingsphere.sharding.rewrite.token.generator.impl.ShardingOffsetTokenGenerator;
import org.apache.shardingsphere.sql.parser.statement.core.segment.dml.pagination.NumberLiteralPaginationValueSegment;
import org.apache.shardingsphere.sql.parser.statement.core.segment.dml.pagination.PaginationValueSegment;
import org.apache.shardingsphere.sql.parser.statement.core.segment.dml.pagination.ParameterMarkerPaginationValueSegment;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShardingOffsetTokenGeneratorTest {
    
    @Test
    void assertIsGenerateSQLToken() {
        InsertStatementContext insertStatementContext = mock(InsertStatementContext.class);
        ShardingOffsetTokenGenerator shardingOffsetTokenGenerator = new ShardingOffsetTokenGenerator();
        assertFalse(shardingOffsetTokenGenerator.isGenerateSQLToken(insertStatementContext));
        SelectStatementContext selectStatementContext = mock(SelectStatementContext.class, RETURNS_DEEP_STUBS);
        when(selectStatementContext.getPaginationContext().getOffsetSegment().isPresent()).thenReturn(Boolean.FALSE);
        assertFalse(shardingOffsetTokenGenerator.isGenerateSQLToken(selectStatementContext));
        when(selectStatementContext.getPaginationContext().getOffsetSegment().isPresent()).thenReturn(Boolean.TRUE);
        ParameterMarkerPaginationValueSegment parameterMarkerPaginationValueSegment = mock(ParameterMarkerPaginationValueSegment.class);
        when(selectStatementContext.getPaginationContext().getOffsetSegment().get()).thenReturn(parameterMarkerPaginationValueSegment);
        assertFalse(shardingOffsetTokenGenerator.isGenerateSQLToken(selectStatementContext));
        NumberLiteralPaginationValueSegment numberLiteralPaginationValueSegment = mock(NumberLiteralPaginationValueSegment.class);
        when(selectStatementContext.getPaginationContext().getOffsetSegment().get()).thenReturn(numberLiteralPaginationValueSegment);
        assertTrue(shardingOffsetTokenGenerator.isGenerateSQLToken(selectStatementContext));
    }
    
    @Test
    void assertGenerateSQLToken() {
        PaginationValueSegment paginationValueSegment = mock(PaginationValueSegment.class);
        final int testStartIndex = 1;
        when(paginationValueSegment.getStartIndex()).thenReturn(testStartIndex);
        final int testStopIndex = 3;
        when(paginationValueSegment.getStopIndex()).thenReturn(testStopIndex);
        PaginationContext paginationContext = mock(PaginationContext.class);
        when(paginationContext.getOffsetSegment()).thenReturn(Optional.of(paginationValueSegment));
        final long testRevisedOffset = 2L;
        when(paginationContext.getRevisedOffset()).thenReturn(testRevisedOffset);
        SelectStatementContext selectStatementContext = mock(SelectStatementContext.class);
        when(selectStatementContext.getPaginationContext()).thenReturn(paginationContext);
        ShardingOffsetTokenGenerator shardingOffsetTokenGenerator = new ShardingOffsetTokenGenerator();
        assertThat(shardingOffsetTokenGenerator.generateSQLToken(selectStatementContext).toString(), is(String.valueOf(testRevisedOffset)));
    }
}
