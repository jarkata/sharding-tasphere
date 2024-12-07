// Generated from /Users/code/gitcode/shardingsphere/features/readwrite-splitting/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/ReadwriteSplittingDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReadwriteSplittingDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReadwriteSplittingDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(ReadwriteSplittingDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#alterReadwriteSplittingStorageUnitStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterReadwriteSplittingStorageUnitStatus(ReadwriteSplittingDistSQLStatementParser.AlterReadwriteSplittingStorageUnitStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#showStatusFromReadwriteSplittingRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatusFromReadwriteSplittingRules(ReadwriteSplittingDistSQLStatementParser.ShowStatusFromReadwriteSplittingRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ReadwriteSplittingDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(ReadwriteSplittingDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(ReadwriteSplittingDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#buildInReadQueryLoadBalanceAlgorithmType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInReadQueryLoadBalanceAlgorithmType(ReadwriteSplittingDistSQLStatementParser.BuildInReadQueryLoadBalanceAlgorithmTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(ReadwriteSplittingDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(ReadwriteSplittingDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ReadwriteSplittingDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(ReadwriteSplittingDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ruleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleName(ReadwriteSplittingDistSQLStatementParser.RuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#storageUnitName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageUnitName(ReadwriteSplittingDistSQLStatementParser.StorageUnitNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#createReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.CreateReadwriteSplittingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#alterReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.AlterReadwriteSplittingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#dropReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.DropReadwriteSplittingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readwriteSplittingRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadwriteSplittingRuleDefinition(ReadwriteSplittingDistSQLStatementParser.ReadwriteSplittingRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#dataSourceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSourceDefinition(ReadwriteSplittingDistSQLStatementParser.DataSourceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#writeStorageUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStorageUnit(ReadwriteSplittingDistSQLStatementParser.WriteStorageUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readStorageUnits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStorageUnits(ReadwriteSplittingDistSQLStatementParser.ReadStorageUnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#transactionalReadQueryStrategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionalReadQueryStrategy(ReadwriteSplittingDistSQLStatementParser.TransactionalReadQueryStrategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#writeStorageUnitName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStorageUnitName(ReadwriteSplittingDistSQLStatementParser.WriteStorageUnitNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#readStorageUnitsNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStorageUnitsNames(ReadwriteSplittingDistSQLStatementParser.ReadStorageUnitsNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#transactionalReadQueryStrategyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionalReadQueryStrategyName(ReadwriteSplittingDistSQLStatementParser.TransactionalReadQueryStrategyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(ReadwriteSplittingDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(ReadwriteSplittingDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#showReadwriteSplittingRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowReadwriteSplittingRules(ReadwriteSplittingDistSQLStatementParser.ShowReadwriteSplittingRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReadwriteSplittingDistSQLStatementParser#countReadwriteSplittingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountReadwriteSplittingRule(ReadwriteSplittingDistSQLStatementParser.CountReadwriteSplittingRuleContext ctx);
}