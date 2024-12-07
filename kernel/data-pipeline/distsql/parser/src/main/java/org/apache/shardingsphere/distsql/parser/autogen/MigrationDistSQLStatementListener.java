// Generated from /Users/code/gitcode/shardingsphere/kernel/data-pipeline/distsql/parser/src/main/antlr4/migration/org/apache/shardingsphere/distsql/parser/autogen/MigrationDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MigrationDistSQLStatementParser}.
 */
public interface MigrationDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(MigrationDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(MigrationDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationRule}.
	 * @param ctx the parse tree
	 */
	void enterShowMigrationRule(MigrationDistSQLStatementParser.ShowMigrationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationRule}.
	 * @param ctx the parse tree
	 */
	void exitShowMigrationRule(MigrationDistSQLStatementParser.ShowMigrationRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#alterMigrationRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterMigrationRule(MigrationDistSQLStatementParser.AlterMigrationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#alterMigrationRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterMigrationRule(MigrationDistSQLStatementParser.AlterMigrationRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#transmissionRule}.
	 * @param ctx the parse tree
	 */
	void enterTransmissionRule(MigrationDistSQLStatementParser.TransmissionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#transmissionRule}.
	 * @param ctx the parse tree
	 */
	void exitTransmissionRule(MigrationDistSQLStatementParser.TransmissionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#readDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReadDefinition(MigrationDistSQLStatementParser.ReadDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#readDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReadDefinition(MigrationDistSQLStatementParser.ReadDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#writeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWriteDefinition(MigrationDistSQLStatementParser.WriteDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#writeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWriteDefinition(MigrationDistSQLStatementParser.WriteDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#workerThread}.
	 * @param ctx the parse tree
	 */
	void enterWorkerThread(MigrationDistSQLStatementParser.WorkerThreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#workerThread}.
	 * @param ctx the parse tree
	 */
	void exitWorkerThread(MigrationDistSQLStatementParser.WorkerThreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#batchSize}.
	 * @param ctx the parse tree
	 */
	void enterBatchSize(MigrationDistSQLStatementParser.BatchSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#batchSize}.
	 * @param ctx the parse tree
	 */
	void exitBatchSize(MigrationDistSQLStatementParser.BatchSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#shardingSize}.
	 * @param ctx the parse tree
	 */
	void enterShardingSize(MigrationDistSQLStatementParser.ShardingSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#shardingSize}.
	 * @param ctx the parse tree
	 */
	void exitShardingSize(MigrationDistSQLStatementParser.ShardingSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#rateLimiter}.
	 * @param ctx the parse tree
	 */
	void enterRateLimiter(MigrationDistSQLStatementParser.RateLimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#rateLimiter}.
	 * @param ctx the parse tree
	 */
	void exitRateLimiter(MigrationDistSQLStatementParser.RateLimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#streamChannel}.
	 * @param ctx the parse tree
	 */
	void enterStreamChannel(MigrationDistSQLStatementParser.StreamChannelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#streamChannel}.
	 * @param ctx the parse tree
	 */
	void exitStreamChannel(MigrationDistSQLStatementParser.StreamChannelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#migrateTable}.
	 * @param ctx the parse tree
	 */
	void enterMigrateTable(MigrationDistSQLStatementParser.MigrateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#migrateTable}.
	 * @param ctx the parse tree
	 */
	void exitMigrateTable(MigrationDistSQLStatementParser.MigrateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationList}.
	 * @param ctx the parse tree
	 */
	void enterShowMigrationList(MigrationDistSQLStatementParser.ShowMigrationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationList}.
	 * @param ctx the parse tree
	 */
	void exitShowMigrationList(MigrationDistSQLStatementParser.ShowMigrationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowMigrationStatus(MigrationDistSQLStatementParser.ShowMigrationStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowMigrationStatus(MigrationDistSQLStatementParser.ShowMigrationStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#startMigration}.
	 * @param ctx the parse tree
	 */
	void enterStartMigration(MigrationDistSQLStatementParser.StartMigrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#startMigration}.
	 * @param ctx the parse tree
	 */
	void exitStartMigration(MigrationDistSQLStatementParser.StartMigrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#stopMigration}.
	 * @param ctx the parse tree
	 */
	void enterStopMigration(MigrationDistSQLStatementParser.StopMigrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#stopMigration}.
	 * @param ctx the parse tree
	 */
	void exitStopMigration(MigrationDistSQLStatementParser.StopMigrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#rollbackMigration}.
	 * @param ctx the parse tree
	 */
	void enterRollbackMigration(MigrationDistSQLStatementParser.RollbackMigrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#rollbackMigration}.
	 * @param ctx the parse tree
	 */
	void exitRollbackMigration(MigrationDistSQLStatementParser.RollbackMigrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#commitMigration}.
	 * @param ctx the parse tree
	 */
	void enterCommitMigration(MigrationDistSQLStatementParser.CommitMigrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#commitMigration}.
	 * @param ctx the parse tree
	 */
	void exitCommitMigration(MigrationDistSQLStatementParser.CommitMigrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#checkMigration}.
	 * @param ctx the parse tree
	 */
	void enterCheckMigration(MigrationDistSQLStatementParser.CheckMigrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#checkMigration}.
	 * @param ctx the parse tree
	 */
	void exitCheckMigration(MigrationDistSQLStatementParser.CheckMigrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationCheckStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowMigrationCheckStatus(MigrationDistSQLStatementParser.ShowMigrationCheckStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationCheckStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowMigrationCheckStatus(MigrationDistSQLStatementParser.ShowMigrationCheckStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#stopMigrationCheck}.
	 * @param ctx the parse tree
	 */
	void enterStopMigrationCheck(MigrationDistSQLStatementParser.StopMigrationCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#stopMigrationCheck}.
	 * @param ctx the parse tree
	 */
	void exitStopMigrationCheck(MigrationDistSQLStatementParser.StopMigrationCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#startMigrationCheck}.
	 * @param ctx the parse tree
	 */
	void enterStartMigrationCheck(MigrationDistSQLStatementParser.StartMigrationCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#startMigrationCheck}.
	 * @param ctx the parse tree
	 */
	void exitStartMigrationCheck(MigrationDistSQLStatementParser.StartMigrationCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#dropMigrationCheck}.
	 * @param ctx the parse tree
	 */
	void enterDropMigrationCheck(MigrationDistSQLStatementParser.DropMigrationCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#dropMigrationCheck}.
	 * @param ctx the parse tree
	 */
	void exitDropMigrationCheck(MigrationDistSQLStatementParser.DropMigrationCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationCheckAlgorithms}.
	 * @param ctx the parse tree
	 */
	void enterShowMigrationCheckAlgorithms(MigrationDistSQLStatementParser.ShowMigrationCheckAlgorithmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationCheckAlgorithms}.
	 * @param ctx the parse tree
	 */
	void exitShowMigrationCheckAlgorithms(MigrationDistSQLStatementParser.ShowMigrationCheckAlgorithmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#jobId}.
	 * @param ctx the parse tree
	 */
	void enterJobId(MigrationDistSQLStatementParser.JobIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#jobId}.
	 * @param ctx the parse tree
	 */
	void exitJobId(MigrationDistSQLStatementParser.JobIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#sourceTableName}.
	 * @param ctx the parse tree
	 */
	void enterSourceTableName(MigrationDistSQLStatementParser.SourceTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#sourceTableName}.
	 * @param ctx the parse tree
	 */
	void exitSourceTableName(MigrationDistSQLStatementParser.SourceTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#targetTableName}.
	 * @param ctx the parse tree
	 */
	void enterTargetTableName(MigrationDistSQLStatementParser.TargetTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#targetTableName}.
	 * @param ctx the parse tree
	 */
	void exitTargetTableName(MigrationDistSQLStatementParser.TargetTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(MigrationDistSQLStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(MigrationDistSQLStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(MigrationDistSQLStatementParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(MigrationDistSQLStatementParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MigrationDistSQLStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MigrationDistSQLStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MigrationDistSQLStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MigrationDistSQLStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#storageUnitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnitDefinition(MigrationDistSQLStatementParser.StorageUnitDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#storageUnitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnitDefinition(MigrationDistSQLStatementParser.StorageUnitDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnitName(MigrationDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnitName(MigrationDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#simpleSource}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSource(MigrationDistSQLStatementParser.SimpleSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#simpleSource}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSource(MigrationDistSQLStatementParser.SimpleSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#urlSource}.
	 * @param ctx the parse tree
	 */
	void enterUrlSource(MigrationDistSQLStatementParser.UrlSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#urlSource}.
	 * @param ctx the parse tree
	 */
	void exitUrlSource(MigrationDistSQLStatementParser.UrlSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(MigrationDistSQLStatementParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(MigrationDistSQLStatementParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(MigrationDistSQLStatementParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(MigrationDistSQLStatementParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#dbName}.
	 * @param ctx the parse tree
	 */
	void enterDbName(MigrationDistSQLStatementParser.DbNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#dbName}.
	 * @param ctx the parse tree
	 */
	void exitDbName(MigrationDistSQLStatementParser.DbNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(MigrationDistSQLStatementParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(MigrationDistSQLStatementParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(MigrationDistSQLStatementParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(MigrationDistSQLStatementParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(MigrationDistSQLStatementParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(MigrationDistSQLStatementParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#registerMigrationSourceStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterRegisterMigrationSourceStorageUnit(MigrationDistSQLStatementParser.RegisterMigrationSourceStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#registerMigrationSourceStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitRegisterMigrationSourceStorageUnit(MigrationDistSQLStatementParser.RegisterMigrationSourceStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#unregisterMigrationSourceStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterUnregisterMigrationSourceStorageUnit(MigrationDistSQLStatementParser.UnregisterMigrationSourceStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#unregisterMigrationSourceStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitUnregisterMigrationSourceStorageUnit(MigrationDistSQLStatementParser.UnregisterMigrationSourceStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(MigrationDistSQLStatementParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(MigrationDistSQLStatementParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MigrationDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MigrationDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(MigrationDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(MigrationDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(MigrationDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(MigrationDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(MigrationDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(MigrationDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(MigrationDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(MigrationDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(MigrationDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(MigrationDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationSourceStorageUnits}.
	 * @param ctx the parse tree
	 */
	void enterShowMigrationSourceStorageUnits(MigrationDistSQLStatementParser.ShowMigrationSourceStorageUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MigrationDistSQLStatementParser#showMigrationSourceStorageUnits}.
	 * @param ctx the parse tree
	 */
	void exitShowMigrationSourceStorageUnits(MigrationDistSQLStatementParser.ShowMigrationSourceStorageUnitsContext ctx);
}