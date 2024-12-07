// Generated from /Users/code/gitcode/shardingsphere/kernel/authority/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/AuthorityDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AuthorityDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AuthorityDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AuthorityDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(AuthorityDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AuthorityDistSQLStatementParser#showAuthorityRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowAuthorityRule(AuthorityDistSQLStatementParser.ShowAuthorityRuleContext ctx);
}