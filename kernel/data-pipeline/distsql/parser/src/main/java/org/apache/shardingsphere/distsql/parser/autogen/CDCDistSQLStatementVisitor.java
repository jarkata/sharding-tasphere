// Generated from /Users/code/gitcode/shardingsphere/kernel/data-pipeline/distsql/parser/src/main/antlr4/cdc/org/apache/shardingsphere/distsql/parser/autogen/CDCDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CDCDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CDCDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(CDCDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStreamingRule(CDCDistSQLStatementParser.ShowStreamingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#alterStreamingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStreamingRule(CDCDistSQLStatementParser.AlterStreamingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#transmissionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransmissionRule(CDCDistSQLStatementParser.TransmissionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#readDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadDefinition(CDCDistSQLStatementParser.ReadDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#writeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteDefinition(CDCDistSQLStatementParser.WriteDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#workerThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkerThread(CDCDistSQLStatementParser.WorkerThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#batchSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatchSize(CDCDistSQLStatementParser.BatchSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#shardingSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingSize(CDCDistSQLStatementParser.ShardingSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#rateLimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRateLimiter(CDCDistSQLStatementParser.RateLimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#streamChannel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamChannel(CDCDistSQLStatementParser.StreamChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStreamingList(CDCDistSQLStatementParser.ShowStreamingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#showStreamingStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStreamingStatus(CDCDistSQLStatementParser.ShowStreamingStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#dropStreaming}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStreaming(CDCDistSQLStatementParser.DropStreamingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#jobId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobId(CDCDistSQLStatementParser.JobIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(CDCDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(CDCDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(CDCDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(CDCDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(CDCDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CDCDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CDCDistSQLStatementParser#intValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(CDCDistSQLStatementParser.IntValueContext ctx);
}