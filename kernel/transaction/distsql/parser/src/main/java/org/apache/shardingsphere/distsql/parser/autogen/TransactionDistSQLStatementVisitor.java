// Generated from /Users/code/gitcode/shardingsphere/kernel/transaction/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/TransactionDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TransactionDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TransactionDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(TransactionDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#showTransactionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTransactionRule(TransactionDistSQLStatementParser.ShowTransactionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#alterTransactionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTransactionRule(TransactionDistSQLStatementParser.AlterTransactionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#transactionRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionRuleDefinition(TransactionDistSQLStatementParser.TransactionRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#providerDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProviderDefinition(TransactionDistSQLStatementParser.ProviderDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#defaultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultType(TransactionDistSQLStatementParser.DefaultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#buildInDefaultTransactionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInDefaultTransactionType(TransactionDistSQLStatementParser.BuildInDefaultTransactionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#providerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProviderName(TransactionDistSQLStatementParser.ProviderNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#buildInProviderTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInProviderTypeName(TransactionDistSQLStatementParser.BuildInProviderTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(TransactionDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(TransactionDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(TransactionDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TransactionDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TransactionDistSQLStatementParser.LiteralContext ctx);
}