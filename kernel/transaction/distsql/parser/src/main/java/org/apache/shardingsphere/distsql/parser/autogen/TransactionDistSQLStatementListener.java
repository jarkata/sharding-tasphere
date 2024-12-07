// Generated from /Users/code/gitcode/shardingsphere/kernel/transaction/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/TransactionDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TransactionDistSQLStatementParser}.
 */
public interface TransactionDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(TransactionDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(TransactionDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#showTransactionRule}.
	 * @param ctx the parse tree
	 */
	void enterShowTransactionRule(TransactionDistSQLStatementParser.ShowTransactionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#showTransactionRule}.
	 * @param ctx the parse tree
	 */
	void exitShowTransactionRule(TransactionDistSQLStatementParser.ShowTransactionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#alterTransactionRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterTransactionRule(TransactionDistSQLStatementParser.AlterTransactionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#alterTransactionRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterTransactionRule(TransactionDistSQLStatementParser.AlterTransactionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#transactionRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTransactionRuleDefinition(TransactionDistSQLStatementParser.TransactionRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#transactionRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTransactionRuleDefinition(TransactionDistSQLStatementParser.TransactionRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#providerDefinition}.
	 * @param ctx the parse tree
	 */
	void enterProviderDefinition(TransactionDistSQLStatementParser.ProviderDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#providerDefinition}.
	 * @param ctx the parse tree
	 */
	void exitProviderDefinition(TransactionDistSQLStatementParser.ProviderDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#defaultType}.
	 * @param ctx the parse tree
	 */
	void enterDefaultType(TransactionDistSQLStatementParser.DefaultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#defaultType}.
	 * @param ctx the parse tree
	 */
	void exitDefaultType(TransactionDistSQLStatementParser.DefaultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#buildInDefaultTransactionType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInDefaultTransactionType(TransactionDistSQLStatementParser.BuildInDefaultTransactionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#buildInDefaultTransactionType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInDefaultTransactionType(TransactionDistSQLStatementParser.BuildInDefaultTransactionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#providerName}.
	 * @param ctx the parse tree
	 */
	void enterProviderName(TransactionDistSQLStatementParser.ProviderNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#providerName}.
	 * @param ctx the parse tree
	 */
	void exitProviderName(TransactionDistSQLStatementParser.ProviderNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#buildInProviderTypeName}.
	 * @param ctx the parse tree
	 */
	void enterBuildInProviderTypeName(TransactionDistSQLStatementParser.BuildInProviderTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#buildInProviderTypeName}.
	 * @param ctx the parse tree
	 */
	void exitBuildInProviderTypeName(TransactionDistSQLStatementParser.BuildInProviderTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(TransactionDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(TransactionDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(TransactionDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(TransactionDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(TransactionDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(TransactionDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TransactionDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TransactionDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TransactionDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TransactionDistSQLStatementParser.LiteralContext ctx);
}