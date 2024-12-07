// Generated from /Users/code/gitcode/shardingsphere/features/readwrite-splitting/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/ReadwriteSplittingDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReadwriteSplittingDistSQLStatementParser}.
 */
public interface ReadwriteSplittingDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(ReadwriteSplittingDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(ReadwriteSplittingDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#alterReadwriteSplittingStorageUnitStatus}.
	 * @param ctx the parse tree
	 */
	void enterAlterReadwriteSplittingStorageUnitStatus(ReadwriteSplittingDistSQLStatementParser.AlterReadwriteSplittingStorageUnitStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#alterReadwriteSplittingStorageUnitStatus}.
	 * @param ctx the parse tree
	 */
	void exitAlterReadwriteSplittingStorageUnitStatus(ReadwriteSplittingDistSQLStatementParser.AlterReadwriteSplittingStorageUnitStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#showStatusFromReadwriteSplittingRules}.
	 * @param ctx the parse tree
	 */
	void enterShowStatusFromReadwriteSplittingRules(ReadwriteSplittingDistSQLStatementParser.ShowStatusFromReadwriteSplittingRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#showStatusFromReadwriteSplittingRules}.
	 * @param ctx the parse tree
	 */
	void exitShowStatusFromReadwriteSplittingRules(ReadwriteSplittingDistSQLStatementParser.ShowStatusFromReadwriteSplittingRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ReadwriteSplittingDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ReadwriteSplittingDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(ReadwriteSplittingDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(ReadwriteSplittingDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(ReadwriteSplittingDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(ReadwriteSplittingDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#buildInReadQueryLoadBalanceAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInReadQueryLoadBalanceAlgorithmType(ReadwriteSplittingDistSQLStatementParser.BuildInReadQueryLoadBalanceAlgorithmTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#buildInReadQueryLoadBalanceAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInReadQueryLoadBalanceAlgorithmType(ReadwriteSplittingDistSQLStatementParser.BuildInReadQueryLoadBalanceAlgorithmTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(ReadwriteSplittingDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(ReadwriteSplittingDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(ReadwriteSplittingDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(ReadwriteSplittingDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ReadwriteSplittingDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ReadwriteSplittingDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(ReadwriteSplittingDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(ReadwriteSplittingDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(ReadwriteSplittingDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(ReadwriteSplittingDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 */
	void enterStorageUnitName(ReadwriteSplittingDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 */
	void exitStorageUnitName(ReadwriteSplittingDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#createReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.CreateReadwriteSplittingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#createReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.CreateReadwriteSplittingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#alterReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.AlterReadwriteSplittingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#alterReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.AlterReadwriteSplittingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#dropReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 */
	void enterDropReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.DropReadwriteSplittingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#dropReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 */
	void exitDropReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.DropReadwriteSplittingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readwriteSplittingRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReadwriteSplittingRuleDefinition(ReadwriteSplittingDistSQLStatementParser.ReadwriteSplittingRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readwriteSplittingRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReadwriteSplittingRuleDefinition(ReadwriteSplittingDistSQLStatementParser.ReadwriteSplittingRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#dataSourceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDataSourceDefinition(ReadwriteSplittingDistSQLStatementParser.DataSourceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#dataSourceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDataSourceDefinition(ReadwriteSplittingDistSQLStatementParser.DataSourceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#writeStorageUnit}.
	 * @param ctx the parse tree
	 */
	void enterWriteStorageUnit(ReadwriteSplittingDistSQLStatementParser.WriteStorageUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#writeStorageUnit}.
	 * @param ctx the parse tree
	 */
	void exitWriteStorageUnit(ReadwriteSplittingDistSQLStatementParser.WriteStorageUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readStorageUnits}.
	 * @param ctx the parse tree
	 */
	void enterReadStorageUnits(ReadwriteSplittingDistSQLStatementParser.ReadStorageUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readStorageUnits}.
	 * @param ctx the parse tree
	 */
	void exitReadStorageUnits(ReadwriteSplittingDistSQLStatementParser.ReadStorageUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#transactionalReadQueryStrategy}.
	 * @param ctx the parse tree
	 */
	void enterTransactionalReadQueryStrategy(ReadwriteSplittingDistSQLStatementParser.TransactionalReadQueryStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#transactionalReadQueryStrategy}.
	 * @param ctx the parse tree
	 */
	void exitTransactionalReadQueryStrategy(ReadwriteSplittingDistSQLStatementParser.TransactionalReadQueryStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#writeStorageUnitName}.
	 * @param ctx the parse tree
	 */
	void enterWriteStorageUnitName(ReadwriteSplittingDistSQLStatementParser.WriteStorageUnitNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#writeStorageUnitName}.
	 * @param ctx the parse tree
	 */
	void exitWriteStorageUnitName(ReadwriteSplittingDistSQLStatementParser.WriteStorageUnitNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readStorageUnitsNames}.
	 * @param ctx the parse tree
	 */
	void enterReadStorageUnitsNames(ReadwriteSplittingDistSQLStatementParser.ReadStorageUnitsNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readStorageUnitsNames}.
	 * @param ctx the parse tree
	 */
	void exitReadStorageUnitsNames(ReadwriteSplittingDistSQLStatementParser.ReadStorageUnitsNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#transactionalReadQueryStrategyName}.
	 * @param ctx the parse tree
	 */
	void enterTransactionalReadQueryStrategyName(ReadwriteSplittingDistSQLStatementParser.TransactionalReadQueryStrategyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#transactionalReadQueryStrategyName}.
	 * @param ctx the parse tree
	 */
	void exitTransactionalReadQueryStrategyName(ReadwriteSplittingDistSQLStatementParser.TransactionalReadQueryStrategyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(ReadwriteSplittingDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(ReadwriteSplittingDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(ReadwriteSplittingDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(ReadwriteSplittingDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#showReadwriteSplittingRules}.
	 * @param ctx the parse tree
	 */
	void enterShowReadwriteSplittingRules(ReadwriteSplittingDistSQLStatementParser.ShowReadwriteSplittingRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#showReadwriteSplittingRules}.
	 * @param ctx the parse tree
	 */
	void exitShowReadwriteSplittingRules(ReadwriteSplittingDistSQLStatementParser.ShowReadwriteSplittingRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#countReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 */
	void enterCountReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.CountReadwriteSplittingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#countReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 */
	void exitCountReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.CountReadwriteSplittingRuleContext ctx);
}