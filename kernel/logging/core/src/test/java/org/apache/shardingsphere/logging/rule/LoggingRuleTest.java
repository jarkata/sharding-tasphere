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

package org.apache.shardingsphere.logging.rule;

import org.apache.shardingsphere.logging.config.LoggingRuleConfiguration;
import org.apache.shardingsphere.logging.constant.LoggingConstants;
import org.apache.shardingsphere.logging.logger.ShardingSphereAppender;
import org.apache.shardingsphere.logging.logger.ShardingSphereLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoggingRuleTest {
    
    private LoggingRule loggingRule;
    
    @BeforeEach
    void setup() {
        loggingRule = new LoggingRule(new LoggingRuleConfiguration(Collections.singleton(new ShardingSphereLogger(LoggingConstants.SQL_LOG_TOPIC, "INFO", true, "console")),
                Collections.singleton(new ShardingSphereAppender("console", "ch.qos.logback.core.ConsoleAppender", "[%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %logger{36} - %msg%n", null))));
    }
    
    @Test
    void assertGetSQLLoggerWhenLoggingRulePresent() {
        Optional<ShardingSphereLogger> logger = loggingRule.getSQLLogger();
        assertTrue(logger.isPresent());
        assertThat(logger.get().getLoggerName(), is(LoggingConstants.SQL_LOG_TOPIC));
        assertThat(logger.get().getLevel(), is("INFO"));
        assertTrue(logger.get().getAdditivity());
        assertThat(logger.get().getAppenderName(), is("console"));
    }
}