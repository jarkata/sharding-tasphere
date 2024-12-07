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

package org.apache.shardingsphere.data.pipeline.core.job.executor;

import org.apache.shardingsphere.data.pipeline.core.context.PipelineJobItemContext;
import org.apache.shardingsphere.data.pipeline.core.context.TransmissionProcessContext;
import org.apache.shardingsphere.data.pipeline.core.datasource.PipelineDataSourceManager;
import org.apache.shardingsphere.data.pipeline.core.job.config.PipelineJobConfiguration;
import org.apache.shardingsphere.data.pipeline.core.job.progress.PipelineJobItemProgress;
import org.apache.shardingsphere.data.pipeline.core.task.runner.PipelineTasksRunner;

import java.sql.SQLException;

/**
 * Distributed pipeline job executor callback.
 * 
 * @param <T> type of pipeline job configuration
 * @param <I> type of pipeline job item context
 * @param <P> type of pipeline job item progress
 */
public interface DistributedPipelineJobExecutorCallback<T extends PipelineJobConfiguration, I extends PipelineJobItemContext, P extends PipelineJobItemProgress> {
    
    /**
     * Build job item context.
     *
     * @param jobConfig job configuration
     * @param shardingItem sharding item
     * @param jobItemProgress job item progress
     * @param jobProcessContext job process context
     * @param dataSourceManager pipeline data source manager
     * @return built job item context
     */
    I buildJobItemContext(T jobConfig, int shardingItem, P jobItemProgress, TransmissionProcessContext jobProcessContext, PipelineDataSourceManager dataSourceManager);
    
    /**
     * Build tasks runner.
     *
     * @param jobItemContext job item context
     * @return built tasks runner
     */
    PipelineTasksRunner buildTasksRunner(I jobItemContext);
    
    /**
     * Prepare.
     *
     * @param jobItemContext job item context
     * @throws SQLException SQL exception
     */
    void prepare(I jobItemContext) throws SQLException;
}
