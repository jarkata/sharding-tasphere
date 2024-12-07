// Generated from /Users/code/gitcode/shardingsphere/features/sharding/distsql/parser/src/main/antlr4/sharding/org/apache/shardingsphere/distsql/parser/autogen/ShardingDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShardingDistSQLStatementParser}.
 */
public interface ShardingDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(ShardingDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(ShardingDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#createShardingTableRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateShardingTableRule(ShardingDistSQLStatementParser.CreateShardingTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#createShardingTableRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateShardingTableRule(ShardingDistSQLStatementParser.CreateShardingTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#alterShardingTableRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterShardingTableRule(ShardingDistSQLStatementParser.AlterShardingTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#alterShardingTableRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterShardingTableRule(ShardingDistSQLStatementParser.AlterShardingTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingTableRule}.
	 * @param ctx the parse tree
	 */
	void enterDropShardingTableRule(ShardingDistSQLStatementParser.DropShardingTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingTableRule}.
	 * @param ctx the parse tree
	 */
	void exitDropShardingTableRule(ShardingDistSQLStatementParser.DropShardingTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#createShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateShardingTableReferenceRule(ShardingDistSQLStatementParser.CreateShardingTableReferenceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#createShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateShardingTableReferenceRule(ShardingDistSQLStatementParser.CreateShardingTableReferenceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#alterShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterShardingTableReferenceRule(ShardingDistSQLStatementParser.AlterShardingTableReferenceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#alterShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterShardingTableReferenceRule(ShardingDistSQLStatementParser.AlterShardingTableReferenceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 */
	void enterDropShardingTableReferenceRule(ShardingDistSQLStatementParser.DropShardingTableReferenceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 */
	void exitDropShardingTableReferenceRule(ShardingDistSQLStatementParser.DropShardingTableReferenceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterDropShardingAlgorithm(ShardingDistSQLStatementParser.DropShardingAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitDropShardingAlgorithm(ShardingDistSQLStatementParser.DropShardingAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#createDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefaultShardingStrategy(ShardingDistSQLStatementParser.CreateDefaultShardingStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#createDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefaultShardingStrategy(ShardingDistSQLStatementParser.CreateDefaultShardingStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#alterDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefaultShardingStrategy(ShardingDistSQLStatementParser.AlterDefaultShardingStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#alterDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefaultShardingStrategy(ShardingDistSQLStatementParser.AlterDefaultShardingStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#dropDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 */
	void enterDropDefaultShardingStrategy(ShardingDistSQLStatementParser.DropDefaultShardingStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#dropDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 */
	void exitDropDefaultShardingStrategy(ShardingDistSQLStatementParser.DropDefaultShardingStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingKeyGenerator}.
	 * @param ctx the parse tree
	 */
	void enterDropShardingKeyGenerator(ShardingDistSQLStatementParser.DropShardingKeyGeneratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingKeyGenerator}.
	 * @param ctx the parse tree
	 */
	void exitDropShardingKeyGenerator(ShardingDistSQLStatementParser.DropShardingKeyGeneratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingAuditor}.
	 * @param ctx the parse tree
	 */
	void enterDropShardingAuditor(ShardingDistSQLStatementParser.DropShardingAuditorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingAuditor}.
	 * @param ctx the parse tree
	 */
	void exitDropShardingAuditor(ShardingDistSQLStatementParser.DropShardingAuditorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingTableRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterShardingTableRuleDefinition(ShardingDistSQLStatementParser.ShardingTableRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingTableRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitShardingTableRuleDefinition(ShardingDistSQLStatementParser.ShardingTableRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAutoTableRule}.
	 * @param ctx the parse tree
	 */
	void enterShardingAutoTableRule(ShardingDistSQLStatementParser.ShardingAutoTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAutoTableRule}.
	 * @param ctx the parse tree
	 */
	void exitShardingAutoTableRule(ShardingDistSQLStatementParser.ShardingAutoTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingTableRule}.
	 * @param ctx the parse tree
	 */
	void enterShardingTableRule(ShardingDistSQLStatementParser.ShardingTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingTableRule}.
	 * @param ctx the parse tree
	 */
	void exitShardingTableRule(ShardingDistSQLStatementParser.ShardingTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#keyGeneratorName}.
	 * @param ctx the parse tree
	 */
	void enterKeyGeneratorName(ShardingDistSQLStatementParser.KeyGeneratorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#keyGeneratorName}.
	 * @param ctx the parse tree
	 */
	void exitKeyGeneratorName(ShardingDistSQLStatementParser.KeyGeneratorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#auditorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAuditorDefinition(ShardingDistSQLStatementParser.AuditorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#auditorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAuditorDefinition(ShardingDistSQLStatementParser.AuditorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#auditorName}.
	 * @param ctx the parse tree
	 */
	void enterAuditorName(ShardingDistSQLStatementParser.AuditorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#auditorName}.
	 * @param ctx the parse tree
	 */
	void exitAuditorName(ShardingDistSQLStatementParser.AuditorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#storageUnits}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnits(ShardingDistSQLStatementParser.StorageUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#storageUnits}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnits(ShardingDistSQLStatementParser.StorageUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#storageUnit}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnit(ShardingDistSQLStatementParser.StorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#storageUnit}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnit(ShardingDistSQLStatementParser.StorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#dataNodes}.
	 * @param ctx the parse tree
	 */
	void enterDataNodes(ShardingDistSQLStatementParser.DataNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#dataNodes}.
	 * @param ctx the parse tree
	 */
	void exitDataNodes(ShardingDistSQLStatementParser.DataNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#dataNode}.
	 * @param ctx the parse tree
	 */
	void enterDataNode(ShardingDistSQLStatementParser.DataNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#dataNode}.
	 * @param ctx the parse tree
	 */
	void exitDataNode(ShardingDistSQLStatementParser.DataNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#autoShardingColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAutoShardingColumnDefinition(ShardingDistSQLStatementParser.AutoShardingColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#autoShardingColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAutoShardingColumnDefinition(ShardingDistSQLStatementParser.AutoShardingColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterShardingColumnDefinition(ShardingDistSQLStatementParser.ShardingColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitShardingColumnDefinition(ShardingDistSQLStatementParser.ShardingColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumn}.
	 * @param ctx the parse tree
	 */
	void enterShardingColumn(ShardingDistSQLStatementParser.ShardingColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumn}.
	 * @param ctx the parse tree
	 */
	void exitShardingColumn(ShardingDistSQLStatementParser.ShardingColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumns}.
	 * @param ctx the parse tree
	 */
	void enterShardingColumns(ShardingDistSQLStatementParser.ShardingColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumns}.
	 * @param ctx the parse tree
	 */
	void exitShardingColumns(ShardingDistSQLStatementParser.ShardingColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterShardingAlgorithm(ShardingDistSQLStatementParser.ShardingAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitShardingAlgorithm(ShardingDistSQLStatementParser.ShardingAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingStrategy}.
	 * @param ctx the parse tree
	 */
	void enterShardingStrategy(ShardingDistSQLStatementParser.ShardingStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingStrategy}.
	 * @param ctx the parse tree
	 */
	void exitShardingStrategy(ShardingDistSQLStatementParser.ShardingStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#databaseStrategy}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseStrategy(ShardingDistSQLStatementParser.DatabaseStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#databaseStrategy}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseStrategy(ShardingDistSQLStatementParser.DatabaseStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#tableStrategy}.
	 * @param ctx the parse tree
	 */
	void enterTableStrategy(ShardingDistSQLStatementParser.TableStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#tableStrategy}.
	 * @param ctx the parse tree
	 */
	void exitTableStrategy(ShardingDistSQLStatementParser.TableStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#keyGenerateDefinition}.
	 * @param ctx the parse tree
	 */
	void enterKeyGenerateDefinition(ShardingDistSQLStatementParser.KeyGenerateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#keyGenerateDefinition}.
	 * @param ctx the parse tree
	 */
	void exitKeyGenerateDefinition(ShardingDistSQLStatementParser.KeyGenerateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#auditDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAuditDefinition(ShardingDistSQLStatementParser.AuditDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#auditDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAuditDefinition(ShardingDistSQLStatementParser.AuditDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#multiAuditDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMultiAuditDefinition(ShardingDistSQLStatementParser.MultiAuditDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#multiAuditDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMultiAuditDefinition(ShardingDistSQLStatementParser.MultiAuditDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#singleAuditDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSingleAuditDefinition(ShardingDistSQLStatementParser.SingleAuditDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#singleAuditDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSingleAuditDefinition(ShardingDistSQLStatementParser.SingleAuditDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#auditAllowHintDisable}.
	 * @param ctx the parse tree
	 */
	void enterAuditAllowHintDisable(ShardingDistSQLStatementParser.AuditAllowHintDisableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#auditAllowHintDisable}.
	 * @param ctx the parse tree
	 */
	void exitAuditAllowHintDisable(ShardingDistSQLStatementParser.AuditAllowHintDisableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(ShardingDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(ShardingDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#tableReferenceRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTableReferenceRuleDefinition(ShardingDistSQLStatementParser.TableReferenceRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#tableReferenceRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTableReferenceRuleDefinition(ShardingDistSQLStatementParser.TableReferenceRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#strategyType}.
	 * @param ctx the parse tree
	 */
	void enterStrategyType(ShardingDistSQLStatementParser.StrategyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#strategyType}.
	 * @param ctx the parse tree
	 */
	void exitStrategyType(ShardingDistSQLStatementParser.StrategyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#buildInStrategyType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInStrategyType(ShardingDistSQLStatementParser.BuildInStrategyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#buildInStrategyType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInStrategyType(ShardingDistSQLStatementParser.BuildInStrategyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(ShardingDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(ShardingDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(ShardingDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(ShardingDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ShardingDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ShardingDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(ShardingDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(ShardingDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(ShardingDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(ShardingDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#buildInShardingAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInShardingAlgorithmType(ShardingDistSQLStatementParser.BuildInShardingAlgorithmTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#buildInShardingAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInShardingAlgorithmType(ShardingDistSQLStatementParser.BuildInShardingAlgorithmTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#buildInKeyGenerateAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInKeyGenerateAlgorithmType(ShardingDistSQLStatementParser.BuildInKeyGenerateAlgorithmTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#buildInKeyGenerateAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInKeyGenerateAlgorithmType(ShardingDistSQLStatementParser.BuildInKeyGenerateAlgorithmTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#buildInShardingAuditAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInShardingAuditAlgorithmType(ShardingDistSQLStatementParser.BuildInShardingAuditAlgorithmTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#buildInShardingAuditAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInShardingAuditAlgorithmType(ShardingDistSQLStatementParser.BuildInShardingAuditAlgorithmTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(ShardingDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(ShardingDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(ShardingDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(ShardingDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ShardingDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ShardingDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(ShardingDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(ShardingDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAlgorithmName}.
	 * @param ctx the parse tree
	 */
	void enterShardingAlgorithmName(ShardingDistSQLStatementParser.ShardingAlgorithmNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAlgorithmName}.
	 * @param ctx the parse tree
	 */
	void exitShardingAlgorithmName(ShardingDistSQLStatementParser.ShardingAlgorithmNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(ShardingDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(ShardingDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRules}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingTableRules(ShardingDistSQLStatementParser.ShowShardingTableRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRules}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingTableRules(ShardingDistSQLStatementParser.ShowShardingTableRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableReferenceRules}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingTableReferenceRules(ShardingDistSQLStatementParser.ShowShardingTableReferenceRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableReferenceRules}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingTableReferenceRules(ShardingDistSQLStatementParser.ShowShardingTableReferenceRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAlgorithms}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingAlgorithms(ShardingDistSQLStatementParser.ShowShardingAlgorithmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAlgorithms}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingAlgorithms(ShardingDistSQLStatementParser.ShowShardingAlgorithmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAuditors}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingAuditors(ShardingDistSQLStatementParser.ShowShardingAuditorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAuditors}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingAuditors(ShardingDistSQLStatementParser.ShowShardingAuditorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableNodes}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingTableNodes(ShardingDistSQLStatementParser.ShowShardingTableNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableNodes}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingTableNodes(ShardingDistSQLStatementParser.ShowShardingTableNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingKeyGenerators}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingKeyGenerators(ShardingDistSQLStatementParser.ShowShardingKeyGeneratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingKeyGenerators}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingKeyGenerators(ShardingDistSQLStatementParser.ShowShardingKeyGeneratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 */
	void enterShowDefaultShardingStrategy(ShardingDistSQLStatementParser.ShowDefaultShardingStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 */
	void exitShowDefaultShardingStrategy(ShardingDistSQLStatementParser.ShowDefaultShardingStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingAlgorithms}.
	 * @param ctx the parse tree
	 */
	void enterShowUnusedShardingAlgorithms(ShardingDistSQLStatementParser.ShowUnusedShardingAlgorithmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingAlgorithms}.
	 * @param ctx the parse tree
	 */
	void exitShowUnusedShardingAlgorithms(ShardingDistSQLStatementParser.ShowUnusedShardingAlgorithmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingKeyGenerators}.
	 * @param ctx the parse tree
	 */
	void enterShowUnusedShardingKeyGenerators(ShardingDistSQLStatementParser.ShowUnusedShardingKeyGeneratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingKeyGenerators}.
	 * @param ctx the parse tree
	 */
	void exitShowUnusedShardingKeyGenerators(ShardingDistSQLStatementParser.ShowUnusedShardingKeyGeneratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingAuditors}.
	 * @param ctx the parse tree
	 */
	void enterShowUnusedShardingAuditors(ShardingDistSQLStatementParser.ShowUnusedShardingAuditorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingAuditors}.
	 * @param ctx the parse tree
	 */
	void exitShowUnusedShardingAuditors(ShardingDistSQLStatementParser.ShowUnusedShardingAuditorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingTableRulesUsedAlgorithm(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingTableRulesUsedAlgorithm(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedKeyGenerator}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingTableRulesUsedKeyGenerator(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedKeyGeneratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedKeyGenerator}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingTableRulesUsedKeyGenerator(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedKeyGeneratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedAuditor}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingTableRulesUsedAuditor(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedAuditorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedAuditor}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingTableRulesUsedAuditor(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedAuditorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#countShardingRule}.
	 * @param ctx the parse tree
	 */
	void enterCountShardingRule(ShardingDistSQLStatementParser.CountShardingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#countShardingRule}.
	 * @param ctx the parse tree
	 */
	void exitCountShardingRule(ShardingDistSQLStatementParser.CountShardingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 */
	void enterTableRule(ShardingDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 */
	void exitTableRule(ShardingDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(ShardingDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(ShardingDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowShardingAlgorithmPlugins(ShardingDistSQLStatementParser.ShowShardingAlgorithmPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowShardingAlgorithmPlugins(ShardingDistSQLStatementParser.ShowShardingAlgorithmPluginsContext ctx);
}