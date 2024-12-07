// Generated from /Users/code/gitcode/shardingsphere/kernel/authority/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/AuthorityDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AuthorityDistSQLStatementParser}.
 */
public interface AuthorityDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AuthorityDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(AuthorityDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuthorityDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(AuthorityDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AuthorityDistSQLStatementParser#showAuthorityRule}.
	 * @param ctx the parse tree
	 */
	void enterShowAuthorityRule(AuthorityDistSQLStatementParser.ShowAuthorityRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AuthorityDistSQLStatementParser#showAuthorityRule}.
	 * @param ctx the parse tree
	 */
	void exitShowAuthorityRule(AuthorityDistSQLStatementParser.ShowAuthorityRuleContext ctx);
}