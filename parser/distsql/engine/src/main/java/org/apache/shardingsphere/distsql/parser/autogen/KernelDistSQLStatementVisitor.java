// Generated from /Users/code/gitcode/shardingsphere/parser/distsql/engine/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/KernelDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KernelDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KernelDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(KernelDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#setDistVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDistVariable(KernelDistSQLStatementParser.SetDistVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showDistVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDistVariable(KernelDistSQLStatementParser.ShowDistVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showDistVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDistVariables(KernelDistSQLStatementParser.ShowDistVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#alterComputeNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterComputeNode(KernelDistSQLStatementParser.AlterComputeNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#enableComputeNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableComputeNode(KernelDistSQLStatementParser.EnableComputeNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#disableComputeNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisableComputeNode(KernelDistSQLStatementParser.DisableComputeNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowComputeNodes(KernelDistSQLStatementParser.ShowComputeNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#refreshDatabaseMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshDatabaseMetadata(KernelDistSQLStatementParser.RefreshDatabaseMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#refreshTableMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTableMetadata(KernelDistSQLStatementParser.RefreshTableMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showTableMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableMetadata(KernelDistSQLStatementParser.ShowTableMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodeInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowComputeNodeInfo(KernelDistSQLStatementParser.ShowComputeNodeInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodeMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowComputeNodeMode(KernelDistSQLStatementParser.ShowComputeNodeModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#labelComputeNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelComputeNode(KernelDistSQLStatementParser.LabelComputeNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#unlabelComputeNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelComputeNode(KernelDistSQLStatementParser.UnlabelComputeNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#exportDatabaseConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDatabaseConfiguration(KernelDistSQLStatementParser.ExportDatabaseConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#importDatabaseConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDatabaseConfiguration(KernelDistSQLStatementParser.ImportDatabaseConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#exportMetaData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportMetaData(KernelDistSQLStatementParser.ExportMetaDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#importMetaData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportMetaData(KernelDistSQLStatementParser.ImportMetaDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#exportStorageNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStorageNodes(KernelDistSQLStatementParser.ExportStorageNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#convertYamlConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertYamlConfiguration(KernelDistSQLStatementParser.ConvertYamlConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#lockCluster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockCluster(KernelDistSQLStatementParser.LockClusterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#unlockCluster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockCluster(KernelDistSQLStatementParser.UnlockClusterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showPluginImplementations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPluginImplementations(KernelDistSQLStatementParser.ShowPluginImplementationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showKeyGenerateAlgorithmPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowKeyGenerateAlgorithmPlugins(KernelDistSQLStatementParser.ShowKeyGenerateAlgorithmPluginsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showLoadBalanceAlgorithmPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLoadBalanceAlgorithmPlugins(KernelDistSQLStatementParser.ShowLoadBalanceAlgorithmPluginsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#confPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfPath(KernelDistSQLStatementParser.ConfPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#filePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilePath(KernelDistSQLStatementParser.FilePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#metaDataValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaDataValue(KernelDistSQLStatementParser.MetaDataValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(KernelDistSQLStatementParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#variableValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValues(KernelDistSQLStatementParser.VariableValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue(KernelDistSQLStatementParser.VariableValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#instanceId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceId(KernelDistSQLStatementParser.InstanceIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#refreshScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshScope(KernelDistSQLStatementParser.RefreshScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#fromSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSegment(KernelDistSQLStatementParser.FromSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#lockStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStrategy(KernelDistSQLStatementParser.LockStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(KernelDistSQLStatementParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLike(KernelDistSQLStatementParser.ShowLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#likePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePattern(KernelDistSQLStatementParser.LikePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#pluginClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginClass(KernelDistSQLStatementParser.PluginClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(KernelDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(KernelDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(KernelDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(KernelDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(KernelDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(KernelDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(KernelDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(KernelDistSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(KernelDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#resourceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceName(KernelDistSQLStatementParser.ResourceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnitName(KernelDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(KernelDistSQLStatementParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#registerStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisterStorageUnit(KernelDistSQLStatementParser.RegisterStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#alterStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStorageUnit(KernelDistSQLStatementParser.AlterStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#unregisterStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnregisterStorageUnit(KernelDistSQLStatementParser.UnregisterStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitsDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnitsDefinition(KernelDistSQLStatementParser.StorageUnitsDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnitDefinition(KernelDistSQLStatementParser.StorageUnitDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#simpleSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSource(KernelDistSQLStatementParser.SimpleSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#urlSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlSource(KernelDistSQLStatementParser.UrlSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(KernelDistSQLStatementParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(KernelDistSQLStatementParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#dbName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbName(KernelDistSQLStatementParser.DbNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(KernelDistSQLStatementParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(KernelDistSQLStatementParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(KernelDistSQLStatementParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreSingleAndBroadcastTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreSingleAndBroadcastTables(KernelDistSQLStatementParser.IgnoreSingleAndBroadcastTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreSingleTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreSingleTables(KernelDistSQLStatementParser.IgnoreSingleTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreBroadcastTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreBroadcastTables(KernelDistSQLStatementParser.IgnoreBroadcastTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(KernelDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(KernelDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#checkPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckPrivileges(KernelDistSQLStatementParser.CheckPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType(KernelDistSQLStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showStorageUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStorageUnits(KernelDistSQLStatementParser.ShowStorageUnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showRulesUsedStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRulesUsedStorageUnit(KernelDistSQLStatementParser.ShowRulesUsedStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KernelDistSQLStatementParser#showLogicalTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLogicalTables(KernelDistSQLStatementParser.ShowLogicalTablesContext ctx);
}