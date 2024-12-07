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

package org.apache.shardingsphere.test.e2e.agent.file.cases;

import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.test.e2e.agent.engine.cases.AgentE2ETestCase;
import org.apache.shardingsphere.test.e2e.agent.engine.env.props.AgentE2ETestConfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Log E2E test case.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public final class LogE2ETestCase implements AgentE2ETestCase {
    
    @XmlAttribute(name = "log-regex", required = true)
    private String logRegex;
    
    @Override
    public String toString() {
        return String.format("%s -> `%s`", AgentE2ETestConfiguration.getInstance().getAdapter(), logRegex);
    }
}
