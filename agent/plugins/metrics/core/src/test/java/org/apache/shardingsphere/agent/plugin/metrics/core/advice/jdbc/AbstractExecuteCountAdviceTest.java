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

package org.apache.shardingsphere.agent.plugin.metrics.core.advice.jdbc;

import org.apache.shardingsphere.agent.api.advice.TargetAdviceMethod;
import org.apache.shardingsphere.agent.plugin.metrics.core.collector.MetricsCollectorRegistry;
import org.apache.shardingsphere.agent.plugin.metrics.core.config.MetricCollectorType;
import org.apache.shardingsphere.agent.plugin.metrics.core.config.MetricConfiguration;
import org.apache.shardingsphere.agent.plugin.metrics.core.fixture.TargetAdviceObjectFixture;
import org.apache.shardingsphere.agent.plugin.metrics.core.fixture.collector.MetricsCollectorFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

class AbstractExecuteCountAdviceTest {
    
    private final MetricConfiguration config = new MetricConfiguration("jdbc_statement_execute_total", MetricCollectorType.COUNTER,
            "Total number of statement execute", Collections.singletonList("statement_type"));
    
    @AfterEach
    void reset() {
        ((MetricsCollectorFixture) MetricsCollectorRegistry.get(config, "FIXTURE")).reset();
    }
    
    @Test
    void assertWithStatement() {
        StatementExecuteCountAdvice advice = new StatementExecuteCountAdvice();
        advice.afterMethod(new TargetAdviceObjectFixture(), mock(TargetAdviceMethod.class), new Object[]{}, null, "FIXTURE");
        assertThat(MetricsCollectorRegistry.get(config, "FIXTURE").toString(), is("statement=1"));
    }
    
    @Test
    void assertWithPreparedStatement() {
        PreparedStatementExecuteCountAdvice advice = new PreparedStatementExecuteCountAdvice();
        advice.afterMethod(new TargetAdviceObjectFixture(), mock(TargetAdviceMethod.class), new Object[]{}, null, "FIXTURE");
        assertThat(MetricsCollectorRegistry.get(config, "FIXTURE").toString(), is("prepared_statement=1"));
    }
}