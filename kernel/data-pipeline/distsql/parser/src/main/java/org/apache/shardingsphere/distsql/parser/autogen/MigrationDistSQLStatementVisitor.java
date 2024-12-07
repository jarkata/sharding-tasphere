// Generated from /Users/code/gitcode/shardingsphere/kernel/data-pipeline/distsql/parser/src/main/antlr4/migration/org/apache/shardingsphere/distsql/parser/autogen/MigrationDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MigrationDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MigrationDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(MigrationDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMigrationRule(MigrationDistSQLStatementParser.ShowMigrationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#alterMigrationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterMigrationRule(MigrationDistSQLStatementParser.AlterMigrationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#transmissionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransmissionRule(MigrationDistSQLStatementParser.TransmissionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#readDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadDefinition(MigrationDistSQLStatementParser.ReadDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#writeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteDefinition(MigrationDistSQLStatementParser.WriteDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#workerThread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkerThread(MigrationDistSQLStatementParser.WorkerThreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#batchSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatchSize(MigrationDistSQLStatementParser.BatchSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#shardingSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingSize(MigrationDistSQLStatementParser.ShardingSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#rateLimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRateLimiter(MigrationDistSQLStatementParser.RateLimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#streamChannel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamChannel(MigrationDistSQLStatementParser.StreamChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#migrateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMigrateTable(MigrationDistSQLStatementParser.MigrateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMigrationList(MigrationDistSQLStatementParser.ShowMigrationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMigrationStatus(MigrationDistSQLStatementParser.ShowMigrationStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#startMigration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartMigration(MigrationDistSQLStatementParser.StartMigrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#stopMigration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopMigration(MigrationDistSQLStatementParser.StopMigrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#rollbackMigration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackMigration(MigrationDistSQLStatementParser.RollbackMigrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#commitMigration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitMigration(MigrationDistSQLStatementParser.CommitMigrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#checkMigration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckMigration(MigrationDistSQLStatementParser.CheckMigrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationCheckStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMigrationCheckStatus(MigrationDistSQLStatementParser.ShowMigrationCheckStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#stopMigrationCheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopMigrationCheck(MigrationDistSQLStatementParser.StopMigrationCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#startMigrationCheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartMigrationCheck(MigrationDistSQLStatementParser.StartMigrationCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#dropMigrationCheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropMigrationCheck(MigrationDistSQLStatementParser.DropMigrationCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationCheckAlgorithms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMigrationCheckAlgorithms(MigrationDistSQLStatementParser.ShowMigrationCheckAlgorithmsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#jobId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobId(MigrationDistSQLStatementParser.JobIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#sourceTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceTableName(MigrationDistSQLStatementParser.SourceTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#targetTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetTableName(MigrationDistSQLStatementParser.TargetTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(MigrationDistSQLStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(MigrationDistSQLStatementParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MigrationDistSQLStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MigrationDistSQLStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#storageUnitDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnitDefinition(MigrationDistSQLStatementParser.StorageUnitDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnitName(MigrationDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#simpleSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSource(MigrationDistSQLStatementParser.SimpleSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#urlSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlSource(MigrationDistSQLStatementParser.UrlSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(MigrationDistSQLStatementParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(MigrationDistSQLStatementParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#dbName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbName(MigrationDistSQLStatementParser.DbNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(MigrationDistSQLStatementParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(MigrationDistSQLStatementParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(MigrationDistSQLStatementParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#registerMigrationSourceStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisterMigrationSourceStorageUnit(MigrationDistSQLStatementParser.RegisterMigrationSourceStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#unregisterMigrationSourceStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnregisterMigrationSourceStorageUnit(MigrationDistSQLStatementParser.UnregisterMigrationSourceStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#intValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(MigrationDistSQLStatementParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MigrationDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(MigrationDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(MigrationDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(MigrationDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(MigrationDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(MigrationDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationSourceStorageUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMigrationSourceStorageUnits(MigrationDistSQLStatementParser.ShowMigrationSourceStorageUnitsContext ctx);
}