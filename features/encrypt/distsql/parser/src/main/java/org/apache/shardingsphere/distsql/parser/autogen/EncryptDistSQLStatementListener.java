// Generated from /Users/code/gitcode/shardingsphere/features/encrypt/distsql/parser/src/main/antlr4/org/apache/shardingsphere/distsql/parser/autogen/EncryptDistSQLStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EncryptDistSQLStatementParser}.
 */
public interface EncryptDistSQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(EncryptDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(EncryptDistSQLStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#createEncryptRule}.
	 * @param ctx the parse tree
	 */
	void enterCreateEncryptRule(EncryptDistSQLStatementParser.CreateEncryptRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#createEncryptRule}.
	 * @param ctx the parse tree
	 */
	void exitCreateEncryptRule(EncryptDistSQLStatementParser.CreateEncryptRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#alterEncryptRule}.
	 * @param ctx the parse tree
	 */
	void enterAlterEncryptRule(EncryptDistSQLStatementParser.AlterEncryptRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#alterEncryptRule}.
	 * @param ctx the parse tree
	 */
	void exitAlterEncryptRule(EncryptDistSQLStatementParser.AlterEncryptRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#dropEncryptRule}.
	 * @param ctx the parse tree
	 */
	void enterDropEncryptRule(EncryptDistSQLStatementParser.DropEncryptRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#dropEncryptRule}.
	 * @param ctx the parse tree
	 */
	void exitDropEncryptRule(EncryptDistSQLStatementParser.DropEncryptRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#encryptRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEncryptRuleDefinition(EncryptDistSQLStatementParser.EncryptRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#encryptRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEncryptRuleDefinition(EncryptDistSQLStatementParser.EncryptRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#encryptTableRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEncryptTableRuleDefinition(EncryptDistSQLStatementParser.EncryptTableRuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#encryptTableRuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEncryptTableRuleDefinition(EncryptDistSQLStatementParser.EncryptTableRuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#encryptColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEncryptColumnDefinition(EncryptDistSQLStatementParser.EncryptColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#encryptColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEncryptColumnDefinition(EncryptDistSQLStatementParser.EncryptColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(EncryptDistSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(EncryptDistSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(EncryptDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(EncryptDistSQLStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#cipherColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCipherColumnDefinition(EncryptDistSQLStatementParser.CipherColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#cipherColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCipherColumnDefinition(EncryptDistSQLStatementParser.CipherColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#cipherColumnName}.
	 * @param ctx the parse tree
	 */
	void enterCipherColumnName(EncryptDistSQLStatementParser.CipherColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#cipherColumnName}.
	 * @param ctx the parse tree
	 */
	void exitCipherColumnName(EncryptDistSQLStatementParser.CipherColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssistedQueryColumnDefinition(EncryptDistSQLStatementParser.AssistedQueryColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssistedQueryColumnDefinition(EncryptDistSQLStatementParser.AssistedQueryColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryColumnName}.
	 * @param ctx the parse tree
	 */
	void enterAssistedQueryColumnName(EncryptDistSQLStatementParser.AssistedQueryColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryColumnName}.
	 * @param ctx the parse tree
	 */
	void exitAssistedQueryColumnName(EncryptDistSQLStatementParser.AssistedQueryColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLikeQueryColumnDefinition(EncryptDistSQLStatementParser.LikeQueryColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLikeQueryColumnDefinition(EncryptDistSQLStatementParser.LikeQueryColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryColumnName}.
	 * @param ctx the parse tree
	 */
	void enterLikeQueryColumnName(EncryptDistSQLStatementParser.LikeQueryColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryColumnName}.
	 * @param ctx the parse tree
	 */
	void exitLikeQueryColumnName(EncryptDistSQLStatementParser.LikeQueryColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#encryptAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterEncryptAlgorithm(EncryptDistSQLStatementParser.EncryptAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#encryptAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitEncryptAlgorithm(EncryptDistSQLStatementParser.EncryptAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterAssistedQueryAlgorithm(EncryptDistSQLStatementParser.AssistedQueryAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#assistedQueryAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitAssistedQueryAlgorithm(EncryptDistSQLStatementParser.AssistedQueryAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterLikeQueryAlgorithm(EncryptDistSQLStatementParser.LikeQueryAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#likeQueryAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitLikeQueryAlgorithm(EncryptDistSQLStatementParser.LikeQueryAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(EncryptDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(EncryptDistSQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(EncryptDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(EncryptDistSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EncryptDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EncryptDistSQLStatementParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDefinition(EncryptDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#algorithmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDefinition(EncryptDistSQLStatementParser.AlgorithmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmTypeName(EncryptDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#algorithmTypeName}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmTypeName(EncryptDistSQLStatementParser.AlgorithmTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#buildInEncryptAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void enterBuildInEncryptAlgorithmType(EncryptDistSQLStatementParser.BuildInEncryptAlgorithmTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#buildInEncryptAlgorithmType}.
	 * @param ctx the parse tree
	 */
	void exitBuildInEncryptAlgorithmType(EncryptDistSQLStatementParser.BuildInEncryptAlgorithmTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#standardEncryptAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterStandardEncryptAlgorithm(EncryptDistSQLStatementParser.StandardEncryptAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#standardEncryptAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitStandardEncryptAlgorithm(EncryptDistSQLStatementParser.StandardEncryptAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#assistedEncryptAlgorithm}.
	 * @param ctx the parse tree
	 */
	void enterAssistedEncryptAlgorithm(EncryptDistSQLStatementParser.AssistedEncryptAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#assistedEncryptAlgorithm}.
	 * @param ctx the parse tree
	 */
	void exitAssistedEncryptAlgorithm(EncryptDistSQLStatementParser.AssistedEncryptAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesDefinition(EncryptDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#propertiesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesDefinition(EncryptDistSQLStatementParser.PropertiesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(EncryptDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(EncryptDistSQLStatementParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(EncryptDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(EncryptDistSQLStatementParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(EncryptDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(EncryptDistSQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#showEncryptRules}.
	 * @param ctx the parse tree
	 */
	void enterShowEncryptRules(EncryptDistSQLStatementParser.ShowEncryptRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#showEncryptRules}.
	 * @param ctx the parse tree
	 */
	void exitShowEncryptRules(EncryptDistSQLStatementParser.ShowEncryptRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 */
	void enterTableRule(EncryptDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#tableRule}.
	 * @param ctx the parse tree
	 */
	void exitTableRule(EncryptDistSQLStatementParser.TableRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#countEncryptRule}.
	 * @param ctx the parse tree
	 */
	void enterCountEncryptRule(EncryptDistSQLStatementParser.CountEncryptRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#countEncryptRule}.
	 * @param ctx the parse tree
	 */
	void exitCountEncryptRule(EncryptDistSQLStatementParser.CountEncryptRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(EncryptDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(EncryptDistSQLStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EncryptDistSQLStatementParser#showEncryptAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowEncryptAlgorithmPlugins(EncryptDistSQLStatementParser.ShowEncryptAlgorithmPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EncryptDistSQLStatementParser#showEncryptAlgorithmPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowEncryptAlgorithmPlugins(EncryptDistSQLStatementParser.ShowEncryptAlgorithmPluginsContext ctx);
}