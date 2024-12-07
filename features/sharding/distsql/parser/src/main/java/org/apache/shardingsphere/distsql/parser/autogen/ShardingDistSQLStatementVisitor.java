// Generated from /Users/code/gitcode/shardingsphere/features/sharding/distsql/parser/src/main/antlr4/sharding/org/apache/shardingsphere/distsql/parser/autogen/ShardingDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShardingDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShardingDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(ShardingDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#createShardingTableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateShardingTableRule(ShardingDistSQLStatementParser.CreateShardingTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#alterShardingTableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterShardingTableRule(ShardingDistSQLStatementParser.AlterShardingTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingTableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropShardingTableRule(ShardingDistSQLStatementParser.DropShardingTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#createShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateShardingTableReferenceRule(ShardingDistSQLStatementParser.CreateShardingTableReferenceRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#alterShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterShardingTableReferenceRule(ShardingDistSQLStatementParser.AlterShardingTableReferenceRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingTableReferenceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropShardingTableReferenceRule(ShardingDistSQLStatementParser.DropShardingTableReferenceRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropShardingAlgorithm(ShardingDistSQLStatementParser.DropShardingAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#createDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefaultShardingStrategy(ShardingDistSQLStatementParser.CreateDefaultShardingStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#alterDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultShardingStrategy(ShardingDistSQLStatementParser.AlterDefaultShardingStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#dropDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDefaultShardingStrategy(ShardingDistSQLStatementParser.DropDefaultShardingStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingKeyGenerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropShardingKeyGenerator(ShardingDistSQLStatementParser.DropShardingKeyGeneratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#dropShardingAuditor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropShardingAuditor(ShardingDistSQLStatementParser.DropShardingAuditorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingTableRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingTableRuleDefinition(ShardingDistSQLStatementParser.ShardingTableRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAutoTableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingAutoTableRule(ShardingDistSQLStatementParser.ShardingAutoTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingTableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingTableRule(ShardingDistSQLStatementParser.ShardingTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#keyGeneratorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyGeneratorName(ShardingDistSQLStatementParser.KeyGeneratorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#auditorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuditorDefinition(ShardingDistSQLStatementParser.AuditorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#auditorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuditorName(ShardingDistSQLStatementParser.AuditorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#storageUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnits(ShardingDistSQLStatementParser.StorageUnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#storageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnit(ShardingDistSQLStatementParser.StorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#dataNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataNodes(ShardingDistSQLStatementParser.DataNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#dataNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataNode(ShardingDistSQLStatementParser.DataNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#autoShardingColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoShardingColumnDefinition(ShardingDistSQLStatementParser.AutoShardingColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingColumnDefinition(ShardingDistSQLStatementParser.ShardingColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingColumn(ShardingDistSQLStatementParser.ShardingColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingColumns(ShardingDistSQLStatementParser.ShardingColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingAlgorithm(ShardingDistSQLStatementParser.ShardingAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingStrategy(ShardingDistSQLStatementParser.ShardingStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#databaseStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseStrategy(ShardingDistSQLStatementParser.DatabaseStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#tableStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStrategy(ShardingDistSQLStatementParser.TableStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#keyGenerateDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyGenerateDefinition(ShardingDistSQLStatementParser.KeyGenerateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#auditDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuditDefinition(ShardingDistSQLStatementParser.AuditDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#multiAuditDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiAuditDefinition(ShardingDistSQLStatementParser.MultiAuditDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#singleAuditDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleAuditDefinition(ShardingDistSQLStatementParser.SingleAuditDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#auditAllowHintDisable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuditAllowHintDisable(ShardingDistSQLStatementParser.AuditAllowHintDisableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(ShardingDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#tableReferenceRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferenceRuleDefinition(ShardingDistSQLStatementParser.TableReferenceRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#strategyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrategyType(ShardingDistSQLStatementParser.StrategyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#buildInStrategyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInStrategyType(ShardingDistSQLStatementParser.BuildInStrategyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(ShardingDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(ShardingDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ShardingDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(ShardingDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(ShardingDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#buildInShardingAlgorithmType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInShardingAlgorithmType(ShardingDistSQLStatementParser.BuildInShardingAlgorithmTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#buildInKeyGenerateAlgorithmType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInKeyGenerateAlgorithmType(ShardingDistSQLStatementParser.BuildInKeyGenerateAlgorithmTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#buildInShardingAuditAlgorithmType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInShardingAuditAlgorithmType(ShardingDistSQLStatementParser.BuildInShardingAuditAlgorithmTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(ShardingDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(ShardingDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ShardingDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(ShardingDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#shardingAlgorithmName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardingAlgorithmName(ShardingDistSQLStatementParser.ShardingAlgorithmNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleName(ShardingDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingTableRules(ShardingDistSQLStatementParser.ShowShardingTableRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableReferenceRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingTableReferenceRules(ShardingDistSQLStatementParser.ShowShardingTableReferenceRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAlgorithms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingAlgorithms(ShardingDistSQLStatementParser.ShowShardingAlgorithmsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAuditors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingAuditors(ShardingDistSQLStatementParser.ShowShardingAuditorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingTableNodes(ShardingDistSQLStatementParser.ShowShardingTableNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingKeyGenerators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingKeyGenerators(ShardingDistSQLStatementParser.ShowShardingKeyGeneratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showDefaultShardingStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDefaultShardingStrategy(ShardingDistSQLStatementParser.ShowDefaultShardingStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingAlgorithms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowUnusedShardingAlgorithms(ShardingDistSQLStatementParser.ShowUnusedShardingAlgorithmsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingKeyGenerators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowUnusedShardingKeyGenerators(ShardingDistSQLStatementParser.ShowUnusedShardingKeyGeneratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showUnusedShardingAuditors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowUnusedShardingAuditors(ShardingDistSQLStatementParser.ShowUnusedShardingAuditorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingTableRulesUsedAlgorithm(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedKeyGenerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingTableRulesUsedKeyGenerator(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedKeyGeneratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingTableRulesUsedAuditor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingTableRulesUsedAuditor(ShardingDistSQLStatementParser.ShowShardingTableRulesUsedAuditorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#countShardingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountShardingRule(ShardingDistSQLStatementParser.CountShardingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRule(ShardingDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(ShardingDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShardingDistSQLStatementParser#showShardingAlgorithmPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowShardingAlgorithmPlugins(ShardingDistSQLStatementParser.ShowShardingAlgorithmPluginsContext ctx);
}