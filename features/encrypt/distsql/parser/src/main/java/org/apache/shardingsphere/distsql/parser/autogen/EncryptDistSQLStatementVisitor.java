// Generated from /Users/code/gitcode/shardingsphere/features/encrypt/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/EncryptDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EncryptDistSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EncryptDistSQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(EncryptDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#createEncryptRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEncryptRule(EncryptDistSQLStatementParser.CreateEncryptRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#alterEncryptRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEncryptRule(EncryptDistSQLStatementParser.AlterEncryptRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#dropEncryptRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropEncryptRule(EncryptDistSQLStatementParser.DropEncryptRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#encryptRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptRuleDefinition(EncryptDistSQLStatementParser.EncryptRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#encryptTableRuleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptTableRuleDefinition(EncryptDistSQLStatementParser.EncryptTableRuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#encryptColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptColumnDefinition(EncryptDistSQLStatementParser.EncryptColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(EncryptDistSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(EncryptDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#cipherColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCipherColumnDefinition(EncryptDistSQLStatementParser.CipherColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#cipherColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCipherColumnName(EncryptDistSQLStatementParser.CipherColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssistedQueryColumnDefinition(EncryptDistSQLStatementParser.AssistedQueryColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssistedQueryColumnName(EncryptDistSQLStatementParser.AssistedQueryColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeQueryColumnDefinition(EncryptDistSQLStatementParser.LikeQueryColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeQueryColumnName(EncryptDistSQLStatementParser.LikeQueryColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#encryptAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryptAlgorithm(EncryptDistSQLStatementParser.EncryptAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssistedQueryAlgorithm(EncryptDistSQLStatementParser.AssistedQueryAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeQueryAlgorithm(EncryptDistSQLStatementParser.LikeQueryAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(EncryptDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(EncryptDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(EncryptDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDefinition(EncryptDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmTypeName(EncryptDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#buildInEncryptAlgorithmType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInEncryptAlgorithmType(EncryptDistSQLStatementParser.BuildInEncryptAlgorithmTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#standardEncryptAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardEncryptAlgorithm(EncryptDistSQLStatementParser.StandardEncryptAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#assistedEncryptAlgorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssistedEncryptAlgorithm(EncryptDistSQLStatementParser.AssistedEncryptAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesDefinition(EncryptDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(EncryptDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(EncryptDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(EncryptDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#showEncryptRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEncryptRules(EncryptDistSQLStatementParser.ShowEncryptRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRule(EncryptDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#countEncryptRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountEncryptRule(EncryptDistSQLStatementParser.CountEncryptRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(EncryptDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EncryptDistSQLStatementParser#showEncryptAlgorithmPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEncryptAlgorithmPlugins(EncryptDistSQLStatementParser.ShowEncryptAlgorithmPluginsContext ctx);
}