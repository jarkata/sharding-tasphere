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

package org.apache.shardingsphere.shadow.distsql.query;

import org.apache.shardingsphere.distsql.statement.DistSQLStatement;
import org.apache.shardingsphere.infra.algorithm.core.config.AlgorithmConfiguration;
import org.apache.shardingsphere.infra.config.rule.scope.DatabaseRuleConfiguration;
import org.apache.shardingsphere.infra.merge.result.impl.local.LocalDataQueryResultRow;
import org.apache.shardingsphere.shadow.config.ShadowRuleConfiguration;
import org.apache.shardingsphere.shadow.config.datasource.ShadowDataSourceConfiguration;
import org.apache.shardingsphere.shadow.config.table.ShadowTableConfiguration;
import org.apache.shardingsphere.shadow.distsql.statement.ShowShadowRulesStatement;
import org.apache.shardingsphere.shadow.rule.ShadowRule;
import org.apache.shardingsphere.test.it.distsql.handler.engine.query.DistSQLDatabaseRuleQueryExecutorTest;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;
import java.util.stream.Stream;

import static org.mockito.Mockito.mock;

class ShowShadowRuleExecutorTest extends DistSQLDatabaseRuleQueryExecutorTest {
    
    ShowShadowRuleExecutorTest() {
        super(mock(ShadowRule.class));
    }
    
    @ParameterizedTest(name = "{0}")
    @ArgumentsSource(TestCaseArgumentsProvider.class)
    void assertExecuteQuery(final String name, final DatabaseRuleConfiguration ruleConfig, final DistSQLStatement sqlStatement,
                            final Collection<LocalDataQueryResultRow> expected) throws SQLException {
        assertQueryResultRows(ruleConfig, sqlStatement, expected);
    }
    
    private static class TestCaseArgumentsProvider implements ArgumentsProvider {
        
        @Override
        public Stream<? extends Arguments> provideArguments(final ExtensionContext extensionContext) {
            return Stream.of(Arguments.arguments("normal", createRuleConfiguration(), new ShowShadowRulesStatement(null, null),
                    Arrays.asList(new LocalDataQueryResultRow("t_order", "shadow_rule", "source", "shadow", "REGEX_MATCH", ""),
                            new LocalDataQueryResultRow("t_order_item", "shadow_rule", "source", "shadow", "REGEX_MATCH", ""))));
        }
        
        private ShadowRuleConfiguration createRuleConfiguration() {
            ShadowRuleConfiguration result = new ShadowRuleConfiguration();
            result.getDataSources().add(new ShadowDataSourceConfiguration("shadow_rule", "source", "shadow"));
            result.getShadowAlgorithms().put("user_id_select_match_algorithm", new AlgorithmConfiguration("REGEX_MATCH", new Properties()));
            result.getTables().put("t_order", new ShadowTableConfiguration(Collections.singleton("shadow_rule"), Collections.singleton("user_id_select_match_algorithm")));
            result.getTables().put("t_order_item", new ShadowTableConfiguration(Collections.singleton("shadow_rule"), Collections.singleton("user_id_select_match_algorithm")));
            return result;
        }
    }
}