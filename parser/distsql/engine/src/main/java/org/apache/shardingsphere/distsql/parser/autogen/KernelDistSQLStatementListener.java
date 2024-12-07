// Generated from /Users/code/gitcode/shardingsphere/parser/distsql/engine/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/KernelDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KernelDistSQLStatementParser}.
 */
public interface KernelDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(KernelDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(KernelDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#setDistVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetDistVariable(KernelDistSQLStatementParser.SetDistVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#setDistVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetDistVariable(KernelDistSQLStatementParser.SetDistVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showDistVariable}.
	 * @param ctx the parse tree
	 */
	void enterShowDistVariable(KernelDistSQLStatementParser.ShowDistVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showDistVariable}.
	 * @param ctx the parse tree
	 */
	void exitShowDistVariable(KernelDistSQLStatementParser.ShowDistVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showDistVariables}.
	 * @param ctx the parse tree
	 */
	void enterShowDistVariables(KernelDistSQLStatementParser.ShowDistVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showDistVariables}.
	 * @param ctx the parse tree
	 */
	void exitShowDistVariables(KernelDistSQLStatementParser.ShowDistVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#alterComputeNode}.
	 * @param ctx the parse tree
	 */
	void enterAlterComputeNode(KernelDistSQLStatementParser.AlterComputeNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#alterComputeNode}.
	 * @param ctx the parse tree
	 */
	void exitAlterComputeNode(KernelDistSQLStatementParser.AlterComputeNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#enableComputeNode}.
	 * @param ctx the parse tree
	 */
	void enterEnableComputeNode(KernelDistSQLStatementParser.EnableComputeNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#enableComputeNode}.
	 * @param ctx the parse tree
	 */
	void exitEnableComputeNode(KernelDistSQLStatementParser.EnableComputeNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#disableComputeNode}.
	 * @param ctx the parse tree
	 */
	void enterDisableComputeNode(KernelDistSQLStatementParser.DisableComputeNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#disableComputeNode}.
	 * @param ctx the parse tree
	 */
	void exitDisableComputeNode(KernelDistSQLStatementParser.DisableComputeNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodes}.
	 * @param ctx the parse tree
	 */
	void enterShowComputeNodes(KernelDistSQLStatementParser.ShowComputeNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodes}.
	 * @param ctx the parse tree
	 */
	void exitShowComputeNodes(KernelDistSQLStatementParser.ShowComputeNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#refreshDatabaseMetadata}.
	 * @param ctx the parse tree
	 */
	void enterRefreshDatabaseMetadata(KernelDistSQLStatementParser.RefreshDatabaseMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#refreshDatabaseMetadata}.
	 * @param ctx the parse tree
	 */
	void exitRefreshDatabaseMetadata(KernelDistSQLStatementParser.RefreshDatabaseMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#refreshTableMetadata}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTableMetadata(KernelDistSQLStatementParser.RefreshTableMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#refreshTableMetadata}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTableMetadata(KernelDistSQLStatementParser.RefreshTableMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showTableMetadata}.
	 * @param ctx the parse tree
	 */
	void enterShowTableMetadata(KernelDistSQLStatementParser.ShowTableMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showTableMetadata}.
	 * @param ctx the parse tree
	 */
	void exitShowTableMetadata(KernelDistSQLStatementParser.ShowTableMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodeInfo}.
	 * @param ctx the parse tree
	 */
	void enterShowComputeNodeInfo(KernelDistSQLStatementParser.ShowComputeNodeInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodeInfo}.
	 * @param ctx the parse tree
	 */
	void exitShowComputeNodeInfo(KernelDistSQLStatementParser.ShowComputeNodeInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodeMode}.
	 * @param ctx the parse tree
	 */
	void enterShowComputeNodeMode(KernelDistSQLStatementParser.ShowComputeNodeModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showComputeNodeMode}.
	 * @param ctx the parse tree
	 */
	void exitShowComputeNodeMode(KernelDistSQLStatementParser.ShowComputeNodeModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#labelComputeNode}.
	 * @param ctx the parse tree
	 */
	void enterLabelComputeNode(KernelDistSQLStatementParser.LabelComputeNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#labelComputeNode}.
	 * @param ctx the parse tree
	 */
	void exitLabelComputeNode(KernelDistSQLStatementParser.LabelComputeNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#unlabelComputeNode}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelComputeNode(KernelDistSQLStatementParser.UnlabelComputeNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#unlabelComputeNode}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelComputeNode(KernelDistSQLStatementParser.UnlabelComputeNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#exportDatabaseConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterExportDatabaseConfiguration(KernelDistSQLStatementParser.ExportDatabaseConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#exportDatabaseConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitExportDatabaseConfiguration(KernelDistSQLStatementParser.ExportDatabaseConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#importDatabaseConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterImportDatabaseConfiguration(KernelDistSQLStatementParser.ImportDatabaseConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#importDatabaseConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitImportDatabaseConfiguration(KernelDistSQLStatementParser.ImportDatabaseConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#exportMetaData}.
	 * @param ctx the parse tree
	 */
	void enterExportMetaData(KernelDistSQLStatementParser.ExportMetaDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#exportMetaData}.
	 * @param ctx the parse tree
	 */
	void exitExportMetaData(KernelDistSQLStatementParser.ExportMetaDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#importMetaData}.
	 * @param ctx the parse tree
	 */
	void enterImportMetaData(KernelDistSQLStatementParser.ImportMetaDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#importMetaData}.
	 * @param ctx the parse tree
	 */
	void exitImportMetaData(KernelDistSQLStatementParser.ImportMetaDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#exportStorageNodes}.
	 * @param ctx the parse tree
	 */
	void enterExportStorageNodes(KernelDistSQLStatementParser.ExportStorageNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#exportStorageNodes}.
	 * @param ctx the parse tree
	 */
	void exitExportStorageNodes(KernelDistSQLStatementParser.ExportStorageNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#convertYamlConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterConvertYamlConfiguration(KernelDistSQLStatementParser.ConvertYamlConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#convertYamlConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitConvertYamlConfiguration(KernelDistSQLStatementParser.ConvertYamlConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#lockCluster}.
	 * @param ctx the parse tree
	 */
	void enterLockCluster(KernelDistSQLStatementParser.LockClusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#lockCluster}.
	 * @param ctx the parse tree
	 */
	void exitLockCluster(KernelDistSQLStatementParser.LockClusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#unlockCluster}.
	 * @param ctx the parse tree
	 */
	void enterUnlockCluster(KernelDistSQLStatementParser.UnlockClusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#unlockCluster}.
	 * @param ctx the parse tree
	 */
	void exitUnlockCluster(KernelDistSQLStatementParser.UnlockClusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showPluginImplementations}.
	 * @param ctx the parse tree
	 */
	void enterShowPluginImplementations(KernelDistSQLStatementParser.ShowPluginImplementationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showPluginImplementations}.
	 * @param ctx the parse tree
	 */
	void exitShowPluginImplementations(KernelDistSQLStatementParser.ShowPluginImplementationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showKeyGenerateAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowKeyGenerateAlgorithmPlugins(KernelDistSQLStatementParser.ShowKeyGenerateAlgorithmPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showKeyGenerateAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowKeyGenerateAlgorithmPlugins(KernelDistSQLStatementParser.ShowKeyGenerateAlgorithmPluginsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showLoadBalanceAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowLoadBalanceAlgorithmPlugins(KernelDistSQLStatementParser.ShowLoadBalanceAlgorithmPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showLoadBalanceAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowLoadBalanceAlgorithmPlugins(KernelDistSQLStatementParser.ShowLoadBalanceAlgorithmPluginsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#confPath}.
	 * @param ctx the parse tree
	 */
	void enterConfPath(KernelDistSQLStatementParser.ConfPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#confPath}.
	 * @param ctx the parse tree
	 */
	void exitConfPath(KernelDistSQLStatementParser.ConfPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#filePath}.
	 * @param ctx the parse tree
	 */
	void enterFilePath(KernelDistSQLStatementParser.FilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#filePath}.
	 * @param ctx the parse tree
	 */
	void exitFilePath(KernelDistSQLStatementParser.FilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#metaDataValue}.
	 * @param ctx the parse tree
	 */
	void enterMetaDataValue(KernelDistSQLStatementParser.MetaDataValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#metaDataValue}.
	 * @param ctx the parse tree
	 */
	void exitMetaDataValue(KernelDistSQLStatementParser.MetaDataValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(KernelDistSQLStatementParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(KernelDistSQLStatementParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#variableValues}.
	 * @param ctx the parse tree
	 */
	void enterVariableValues(KernelDistSQLStatementParser.VariableValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#variableValues}.
	 * @param ctx the parse tree
	 */
	void exitVariableValues(KernelDistSQLStatementParser.VariableValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(KernelDistSQLStatementParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(KernelDistSQLStatementParser.VariableValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#instanceId}.
	 * @param ctx the parse tree
	 */
	void enterInstanceId(KernelDistSQLStatementParser.InstanceIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#instanceId}.
	 * @param ctx the parse tree
	 */
	void exitInstanceId(KernelDistSQLStatementParser.InstanceIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#refreshScope}.
	 * @param ctx the parse tree
	 */
	void enterRefreshScope(KernelDistSQLStatementParser.RefreshScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#refreshScope}.
	 * @param ctx the parse tree
	 */
	void exitRefreshScope(KernelDistSQLStatementParser.RefreshScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#fromSegment}.
	 * @param ctx the parse tree
	 */
	void enterFromSegment(KernelDistSQLStatementParser.FromSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#fromSegment}.
	 * @param ctx the parse tree
	 */
	void exitFromSegment(KernelDistSQLStatementParser.FromSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#lockStrategy}.
	 * @param ctx the parse tree
	 */
	void enterLockStrategy(KernelDistSQLStatementParser.LockStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#lockStrategy}.
	 * @param ctx the parse tree
	 */
	void exitLockStrategy(KernelDistSQLStatementParser.LockStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(KernelDistSQLStatementParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(KernelDistSQLStatementParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void enterShowLike(KernelDistSQLStatementParser.ShowLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void exitShowLike(KernelDistSQLStatementParser.ShowLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#likePattern}.
	 * @param ctx the parse tree
	 */
	void enterLikePattern(KernelDistSQLStatementParser.LikePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#likePattern}.
	 * @param ctx the parse tree
	 */
	void exitLikePattern(KernelDistSQLStatementParser.LikePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#pluginClass}.
	 * @param ctx the parse tree
	 */
	void enterPluginClass(KernelDistSQLStatementParser.PluginClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#pluginClass}.
	 * @param ctx the parse tree
	 */
	void exitPluginClass(KernelDistSQLStatementParser.PluginClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(KernelDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(KernelDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(KernelDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(KernelDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(KernelDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(KernelDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(KernelDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(KernelDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(KernelDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(KernelDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(KernelDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(KernelDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(KernelDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(KernelDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(KernelDistSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(KernelDistSQLStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(KernelDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(KernelDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#resourceName}.
	 * @param ctx the parse tree
	 */
	void enterResourceName(KernelDistSQLStatementParser.ResourceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#resourceName}.
	 * @param ctx the parse tree
	 */
	void exitResourceName(KernelDistSQLStatementParser.ResourceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnitName(KernelDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnitName(KernelDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(KernelDistSQLStatementParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(KernelDistSQLStatementParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#registerStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterRegisterStorageUnit(KernelDistSQLStatementParser.RegisterStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#registerStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitRegisterStorageUnit(KernelDistSQLStatementParser.RegisterStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#alterStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterAlterStorageUnit(KernelDistSQLStatementParser.AlterStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#alterStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitAlterStorageUnit(KernelDistSQLStatementParser.AlterStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#unregisterStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterUnregisterStorageUnit(KernelDistSQLStatementParser.UnregisterStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#unregisterStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitUnregisterStorageUnit(KernelDistSQLStatementParser.UnregisterStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnitsDefinition(KernelDistSQLStatementParser.StorageUnitsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnitsDefinition(KernelDistSQLStatementParser.StorageUnitsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnitDefinition(KernelDistSQLStatementParser.StorageUnitDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#storageUnitDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnitDefinition(KernelDistSQLStatementParser.StorageUnitDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#simpleSource}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSource(KernelDistSQLStatementParser.SimpleSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#simpleSource}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSource(KernelDistSQLStatementParser.SimpleSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#urlSource}.
	 * @param ctx the parse tree
	 */
	void enterUrlSource(KernelDistSQLStatementParser.UrlSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#urlSource}.
	 * @param ctx the parse tree
	 */
	void exitUrlSource(KernelDistSQLStatementParser.UrlSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(KernelDistSQLStatementParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(KernelDistSQLStatementParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(KernelDistSQLStatementParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(KernelDistSQLStatementParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#dbName}.
	 * @param ctx the parse tree
	 */
	void enterDbName(KernelDistSQLStatementParser.DbNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#dbName}.
	 * @param ctx the parse tree
	 */
	void exitDbName(KernelDistSQLStatementParser.DbNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(KernelDistSQLStatementParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(KernelDistSQLStatementParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(KernelDistSQLStatementParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(KernelDistSQLStatementParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(KernelDistSQLStatementParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(KernelDistSQLStatementParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreSingleAndBroadcastTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreSingleAndBroadcastTables(KernelDistSQLStatementParser.IgnoreSingleAndBroadcastTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreSingleAndBroadcastTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreSingleAndBroadcastTables(KernelDistSQLStatementParser.IgnoreSingleAndBroadcastTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreSingleTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreSingleTables(KernelDistSQLStatementParser.IgnoreSingleTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreSingleTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreSingleTables(KernelDistSQLStatementParser.IgnoreSingleTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreBroadcastTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreBroadcastTables(KernelDistSQLStatementParser.IgnoreBroadcastTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreBroadcastTables}
	 * labeled alternative in {@link KernelDistSQLStatementParser#ignoreTables}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreBroadcastTables(KernelDistSQLStatementParser.IgnoreBroadcastTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(KernelDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(KernelDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(KernelDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(KernelDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#checkPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterCheckPrivileges(KernelDistSQLStatementParser.CheckPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#checkPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitCheckPrivileges(KernelDistSQLStatementParser.CheckPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType(KernelDistSQLStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType(KernelDistSQLStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showStorageUnits}.
	 * @param ctx the parse tree
	 */
	void enterShowStorageUnits(KernelDistSQLStatementParser.ShowStorageUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showStorageUnits}.
	 * @param ctx the parse tree
	 */
	void exitShowStorageUnits(KernelDistSQLStatementParser.ShowStorageUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showRulesUsedStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterShowRulesUsedStorageUnit(KernelDistSQLStatementParser.ShowRulesUsedStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showRulesUsedStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitShowRulesUsedStorageUnit(KernelDistSQLStatementParser.ShowRulesUsedStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KernelDistSQLStatementParser#showLogicalTables}.
	 * @param ctx the parse tree
	 */
	void enterShowLogicalTables(KernelDistSQLStatementParser.ShowLogicalTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KernelDistSQLStatementParser#showLogicalTables}.
	 * @param ctx the parse tree
	 */
	void exitShowLogicalTables(KernelDistSQLStatementParser.ShowLogicalTablesContext ctx);
}