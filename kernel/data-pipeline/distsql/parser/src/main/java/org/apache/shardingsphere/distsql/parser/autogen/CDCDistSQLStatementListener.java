// Generated from /Users/code/gitcode/shardingsphere/kernel/data-pipeline/distsql/parser/src/main/antlr4/cdc/org/apache/shardingsphere/distsql/parser/autogen/CDCDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CDCDistSQLStatementParser}.
 */
public interface CDCDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(CDCDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(CDCDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingRule}.
	 * @param ctx the parse tree
	 */
	void enterShowStreamingRule(CDCDistSQLStatementParser.ShowStreamingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingRule}.
	 * @param ctx the parse tree
	 */
	void exitShowStreamingRule(CDCDistSQLStatementParser.ShowStreamingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#alterStreamingRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterStreamingRule(CDCDistSQLStatementParser.AlterStreamingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#alterStreamingRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterStreamingRule(CDCDistSQLStatementParser.AlterStreamingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#transmissionRule}.
	 * @param ctx the parse tree
	 */
	void enterTransmissionRule(CDCDistSQLStatementParser.TransmissionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#transmissionRule}.
	 * @param ctx the parse tree
	 */
	void exitTransmissionRule(CDCDistSQLStatementParser.TransmissionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#readDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReadDefinition(CDCDistSQLStatementParser.ReadDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#readDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReadDefinition(CDCDistSQLStatementParser.ReadDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#writeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWriteDefinition(CDCDistSQLStatementParser.WriteDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#writeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWriteDefinition(CDCDistSQLStatementParser.WriteDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#workerThread}.
	 * @param ctx the parse tree
	 */
	void enterWorkerThread(CDCDistSQLStatementParser.WorkerThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#workerThread}.
	 * @param ctx the parse tree
	 */
	void exitWorkerThread(CDCDistSQLStatementParser.WorkerThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#batchSize}.
	 * @param ctx the parse tree
	 */
	void enterBatchSize(CDCDistSQLStatementParser.BatchSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#batchSize}.
	 * @param ctx the parse tree
	 */
	void exitBatchSize(CDCDistSQLStatementParser.BatchSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#shardingSize}.
	 * @param ctx the parse tree
	 */
	void enterShardingSize(CDCDistSQLStatementParser.ShardingSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#shardingSize}.
	 * @param ctx the parse tree
	 */
	void exitShardingSize(CDCDistSQLStatementParser.ShardingSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#rateLimiter}.
	 * @param ctx the parse tree
	 */
	void enterRateLimiter(CDCDistSQLStatementParser.RateLimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#rateLimiter}.
	 * @param ctx the parse tree
	 */
	void exitRateLimiter(CDCDistSQLStatementParser.RateLimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#streamChannel}.
	 * @param ctx the parse tree
	 */
	void enterStreamChannel(CDCDistSQLStatementParser.StreamChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#streamChannel}.
	 * @param ctx the parse tree
	 */
	void exitStreamChannel(CDCDistSQLStatementParser.StreamChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingList}.
	 * @param ctx the parse tree
	 */
	void enterShowStreamingList(CDCDistSQLStatementParser.ShowStreamingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingList}.
	 * @param ctx the parse tree
	 */
	void exitShowStreamingList(CDCDistSQLStatementParser.ShowStreamingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowStreamingStatus(CDCDistSQLStatementParser.ShowStreamingStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowStreamingStatus(CDCDistSQLStatementParser.ShowStreamingStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#dropStreaming}.
	 * @param ctx the parse tree
	 */
	void enterDropStreaming(CDCDistSQLStatementParser.DropStreamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#dropStreaming}.
	 * @param ctx the parse tree
	 */
	void exitDropStreaming(CDCDistSQLStatementParser.DropStreamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#jobId}.
	 * @param ctx the parse tree
	 */
	void enterJobId(CDCDistSQLStatementParser.JobIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#jobId}.
	 * @param ctx the parse tree
	 */
	void exitJobId(CDCDistSQLStatementParser.JobIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(CDCDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(CDCDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(CDCDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(CDCDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(CDCDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(CDCDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(CDCDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(CDCDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CDCDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CDCDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CDCDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CDCDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CDCDistSQLStatementParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(CDCDistSQLStatementParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CDCDistSQLStatementParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(CDCDistSQLStatementParser.IntValueContext ctx);
}