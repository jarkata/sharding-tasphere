// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/firebird/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/FirebirdStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FirebirdStatementParser}.
 */
public interface FirebirdStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(FirebirdStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(FirebirdStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(FirebirdStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(FirebirdStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createCollation}.
	 * @param ctx the parse tree
	 */
	void enterCreateCollation(FirebirdStatementParser.CreateCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createCollation}.
	 * @param ctx the parse tree
	 */
	void exitCreateCollation(FirebirdStatementParser.CreateCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#fromCollationClause}.
	 * @param ctx the parse tree
	 */
	void enterFromCollationClause(FirebirdStatementParser.FromCollationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#fromCollationClause}.
	 * @param ctx the parse tree
	 */
	void exitFromCollationClause(FirebirdStatementParser.FromCollationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#paddingClause}.
	 * @param ctx the parse tree
	 */
	void enterPaddingClause(FirebirdStatementParser.PaddingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#paddingClause}.
	 * @param ctx the parse tree
	 */
	void exitPaddingClause(FirebirdStatementParser.PaddingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#caseSensitivityClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseSensitivityClause(FirebirdStatementParser.CaseSensitivityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#caseSensitivityClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseSensitivityClause(FirebirdStatementParser.CaseSensitivityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#accentSensitivityClause}.
	 * @param ctx the parse tree
	 */
	void enterAccentSensitivityClause(FirebirdStatementParser.AccentSensitivityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#accentSensitivityClause}.
	 * @param ctx the parse tree
	 */
	void exitAccentSensitivityClause(FirebirdStatementParser.AccentSensitivityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#attributeClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeClause(FirebirdStatementParser.AttributeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#attributeClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeClause(FirebirdStatementParser.AttributeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createDomain}.
	 * @param ctx the parse tree
	 */
	void enterCreateDomain(FirebirdStatementParser.CreateDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createDomain}.
	 * @param ctx the parse tree
	 */
	void exitCreateDomain(FirebirdStatementParser.CreateDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(FirebirdStatementParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(FirebirdStatementParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#notNullClause}.
	 * @param ctx the parse tree
	 */
	void enterNotNullClause(FirebirdStatementParser.NotNullClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#notNullClause}.
	 * @param ctx the parse tree
	 */
	void exitNotNullClause(FirebirdStatementParser.NotNullClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#checkClause}.
	 * @param ctx the parse tree
	 */
	void enterCheckClause(FirebirdStatementParser.CheckClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#checkClause}.
	 * @param ctx the parse tree
	 */
	void exitCheckClause(FirebirdStatementParser.CheckClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#characterSetClause}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSetClause(FirebirdStatementParser.CharacterSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#characterSetClause}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSetClause(FirebirdStatementParser.CharacterSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(FirebirdStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(FirebirdStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequence(FirebirdStatementParser.AlterSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequence(FirebirdStatementParser.AlterSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequence(FirebirdStatementParser.CreateSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createSequence}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequence(FirebirdStatementParser.CreateSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 */
	void enterAlterDomain(FirebirdStatementParser.AlterDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 */
	void exitAlterDomain(FirebirdStatementParser.AlterDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#toTableClause}.
	 * @param ctx the parse tree
	 */
	void enterToTableClause(FirebirdStatementParser.ToTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#toTableClause}.
	 * @param ctx the parse tree
	 */
	void exitToTableClause(FirebirdStatementParser.ToTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#defaultAlterDomainClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultAlterDomainClause(FirebirdStatementParser.DefaultAlterDomainClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#defaultAlterDomainClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultAlterDomainClause(FirebirdStatementParser.DefaultAlterDomainClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#notNullAlterDomainClause}.
	 * @param ctx the parse tree
	 */
	void enterNotNullAlterDomainClause(FirebirdStatementParser.NotNullAlterDomainClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#notNullAlterDomainClause}.
	 * @param ctx the parse tree
	 */
	void exitNotNullAlterDomainClause(FirebirdStatementParser.NotNullAlterDomainClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void enterConstraintClause(FirebirdStatementParser.ConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 */
	void exitConstraintClause(FirebirdStatementParser.ConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#typeClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeClause(FirebirdStatementParser.TypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#typeClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeClause(FirebirdStatementParser.TypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(FirebirdStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(FirebirdStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(FirebirdStatementParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(FirebirdStatementParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(FirebirdStatementParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(FirebirdStatementParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FirebirdStatementParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FirebirdStatementParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#cursorOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorOpenStatement(FirebirdStatementParser.CursorOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#cursorOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorOpenStatement(FirebirdStatementParser.CursorOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#cursorCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorCloseStatement(FirebirdStatementParser.CursorCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#cursorCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorCloseStatement(FirebirdStatementParser.CursorCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcementClause}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncementClause(FirebirdStatementParser.AnnouncementClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcementClause}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncementClause(FirebirdStatementParser.AnnouncementClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcement}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncement(FirebirdStatementParser.AnnouncementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcement}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncement(FirebirdStatementParser.AnnouncementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#localVariableOrCursorAnnouncement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableOrCursorAnnouncement(FirebirdStatementParser.LocalVariableOrCursorAnnouncementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#localVariableOrCursorAnnouncement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableOrCursorAnnouncement(FirebirdStatementParser.LocalVariableOrCursorAnnouncementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#procedureAnnouncement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAnnouncement(FirebirdStatementParser.ProcedureAnnouncementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#procedureAnnouncement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAnnouncement(FirebirdStatementParser.ProcedureAnnouncementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#functioneAnnouncement}.
	 * @param ctx the parse tree
	 */
	void enterFunctioneAnnouncement(FirebirdStatementParser.FunctioneAnnouncementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#functioneAnnouncement}.
	 * @param ctx the parse tree
	 */
	void exitFunctioneAnnouncement(FirebirdStatementParser.FunctioneAnnouncementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#inputArgument}.
	 * @param ctx the parse tree
	 */
	void enterInputArgument(FirebirdStatementParser.InputArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#inputArgument}.
	 * @param ctx the parse tree
	 */
	void exitInputArgument(FirebirdStatementParser.InputArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#inputArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterInputArgumentClause(FirebirdStatementParser.InputArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#inputArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitInputArgumentClause(FirebirdStatementParser.InputArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(FirebirdStatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(FirebirdStatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(FirebirdStatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(FirebirdStatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(FirebirdStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(FirebirdStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#viewAliasClause}.
	 * @param ctx the parse tree
	 */
	void enterViewAliasClause(FirebirdStatementParser.ViewAliasClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#viewAliasClause}.
	 * @param ctx the parse tree
	 */
	void exitViewAliasClause(FirebirdStatementParser.ViewAliasClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#viewAlias}.
	 * @param ctx the parse tree
	 */
	void enterViewAlias(FirebirdStatementParser.ViewAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#viewAlias}.
	 * @param ctx the parse tree
	 */
	void exitViewAlias(FirebirdStatementParser.ViewAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(FirebirdStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(FirebirdStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createTemporaryTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTemporaryTable(FirebirdStatementParser.CreateTemporaryTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createTemporaryTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTemporaryTable(FirebirdStatementParser.CreateTemporaryTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#sqlSecurity}.
	 * @param ctx the parse tree
	 */
	void enterSqlSecurity(FirebirdStatementParser.SqlSecurityContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#sqlSecurity}.
	 * @param ctx the parse tree
	 */
	void exitSqlSecurity(FirebirdStatementParser.SqlSecurityContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(FirebirdStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(FirebirdStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#sequenceRestartClause}.
	 * @param ctx the parse tree
	 */
	void enterSequenceRestartClause(FirebirdStatementParser.SequenceRestartClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#sequenceRestartClause}.
	 * @param ctx the parse tree
	 */
	void exitSequenceRestartClause(FirebirdStatementParser.SequenceRestartClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#sequenceIncrementClause}.
	 * @param ctx the parse tree
	 */
	void enterSequenceIncrementClause(FirebirdStatementParser.SequenceIncrementClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#sequenceIncrementClause}.
	 * @param ctx the parse tree
	 */
	void exitSequenceIncrementClause(FirebirdStatementParser.SequenceIncrementClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseSpecification_(FirebirdStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseSpecification_(FirebirdStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinition(FirebirdStatementParser.CreateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinition(FirebirdStatementParser.CreateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(FirebirdStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(FirebirdStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dataTypeOption}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeOption(FirebirdStatementParser.DataTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dataTypeOption}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeOption(FirebirdStatementParser.DataTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#checkConstraintDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraintDefinition(FirebirdStatementParser.CheckConstraintDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#checkConstraintDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraintDefinition(FirebirdStatementParser.CheckConstraintDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(FirebirdStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(FirebirdStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void enterReferenceOption(FirebirdStatementParser.ReferenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void exitReferenceOption(FirebirdStatementParser.ReferenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#usingDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUsingDefinition(FirebirdStatementParser.UsingDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#usingDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUsingDefinition(FirebirdStatementParser.UsingDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDefinition(FirebirdStatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDefinition(FirebirdStatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyOption(FirebirdStatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyOption(FirebirdStatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(FirebirdStatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(FirebirdStatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#uniqueOption}.
	 * @param ctx the parse tree
	 */
	void enterUniqueOption(FirebirdStatementParser.UniqueOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#uniqueOption}.
	 * @param ctx the parse tree
	 */
	void exitUniqueOption(FirebirdStatementParser.UniqueOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyOption(FirebirdStatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyOption(FirebirdStatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLikeClause(FirebirdStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLikeClause(FirebirdStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(FirebirdStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(FirebirdStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(FirebirdStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(FirebirdStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(FirebirdStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(FirebirdStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumn(FirebirdStatementParser.ModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumn(FirebirdStatementParser.ModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(FirebirdStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(FirebirdStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintSpecification(FirebirdStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintSpecification(FirebirdStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintSpecification(FirebirdStatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintSpecification(FirebirdStatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FirebirdStatementParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FirebirdStatementParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(FirebirdStatementParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(FirebirdStatementParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(FirebirdStatementParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(FirebirdStatementParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#procedureClause}.
	 * @param ctx the parse tree
	 */
	void enterProcedureClause(FirebirdStatementParser.ProcedureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#procedureClause}.
	 * @param ctx the parse tree
	 */
	void exitProcedureClause(FirebirdStatementParser.ProcedureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(FirebirdStatementParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(FirebirdStatementParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#executeProcedure}.
	 * @param ctx the parse tree
	 */
	void enterExecuteProcedure(FirebirdStatementParser.ExecuteProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#executeProcedure}.
	 * @param ctx the parse tree
	 */
	void exitExecuteProcedure(FirebirdStatementParser.ExecuteProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#exprClause}.
	 * @param ctx the parse tree
	 */
	void enterExprClause(FirebirdStatementParser.ExprClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#exprClause}.
	 * @param ctx the parse tree
	 */
	void exitExprClause(FirebirdStatementParser.ExprClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#returningValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterReturningValuesClause(FirebirdStatementParser.ReturningValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#returningValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitReturningValuesClause(FirebirdStatementParser.ReturningValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(FirebirdStatementParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(FirebirdStatementParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterTrigger(FirebirdStatementParser.AlterTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterTrigger(FirebirdStatementParser.AlterTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcmentTriggerClause}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncmentTriggerClause(FirebirdStatementParser.AnnouncmentTriggerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcmentTriggerClause}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncmentTriggerClause(FirebirdStatementParser.AnnouncmentTriggerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#triggerClause}.
	 * @param ctx the parse tree
	 */
	void enterTriggerClause(FirebirdStatementParser.TriggerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#triggerClause}.
	 * @param ctx the parse tree
	 */
	void exitTriggerClause(FirebirdStatementParser.TriggerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcmentTableTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncmentTableTrigger(FirebirdStatementParser.AnnouncmentTableTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcmentTableTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncmentTableTrigger(FirebirdStatementParser.AnnouncmentTableTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#eventListTable}.
	 * @param ctx the parse tree
	 */
	void enterEventListTable(FirebirdStatementParser.EventListTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#eventListTable}.
	 * @param ctx the parse tree
	 */
	void exitEventListTable(FirebirdStatementParser.EventListTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#listDDLStatement}.
	 * @param ctx the parse tree
	 */
	void enterListDDLStatement(FirebirdStatementParser.ListDDLStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#listDDLStatement}.
	 * @param ctx the parse tree
	 */
	void exitListDDLStatement(FirebirdStatementParser.ListDDLStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(FirebirdStatementParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(FirebirdStatementParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(FirebirdStatementParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(FirebirdStatementParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcmentTableTriggerSQL_2003Standart}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncmentTableTriggerSQL_2003Standart(FirebirdStatementParser.AnnouncmentTableTriggerSQL_2003StandartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcmentTableTriggerSQL_2003Standart}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncmentTableTriggerSQL_2003Standart(FirebirdStatementParser.AnnouncmentTableTriggerSQL_2003StandartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcmentDataBaseTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncmentDataBaseTrigger(FirebirdStatementParser.AnnouncmentDataBaseTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcmentDataBaseTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncmentDataBaseTrigger(FirebirdStatementParser.AnnouncmentDataBaseTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#eventConnectOrTransaction}.
	 * @param ctx the parse tree
	 */
	void enterEventConnectOrTransaction(FirebirdStatementParser.EventConnectOrTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#eventConnectOrTransaction}.
	 * @param ctx the parse tree
	 */
	void exitEventConnectOrTransaction(FirebirdStatementParser.EventConnectOrTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcmentDDLTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncmentDDLTrigger(FirebirdStatementParser.AnnouncmentDDLTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcmentDDLTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncmentDDLTrigger(FirebirdStatementParser.AnnouncmentDDLTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#executeBlock}.
	 * @param ctx the parse tree
	 */
	void enterExecuteBlock(FirebirdStatementParser.ExecuteBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#executeBlock}.
	 * @param ctx the parse tree
	 */
	void exitExecuteBlock(FirebirdStatementParser.ExecuteBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#inputArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterInputArgumentList(FirebirdStatementParser.InputArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#inputArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitInputArgumentList(FirebirdStatementParser.InputArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#outputArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterOutputArgumentList(FirebirdStatementParser.OutputArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#outputArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitOutputArgumentList(FirebirdStatementParser.OutputArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(FirebirdStatementParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(FirebirdStatementParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#transferStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransferStatement(FirebirdStatementParser.TransferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#transferStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransferStatement(FirebirdStatementParser.TransferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(FirebirdStatementParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(FirebirdStatementParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#fetchStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchStatement(FirebirdStatementParser.FetchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#fetchStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchStatement(FirebirdStatementParser.FetchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FirebirdStatementParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FirebirdStatementParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(FirebirdStatementParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(FirebirdStatementParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#beginStatement}.
	 * @param ctx the parse tree
	 */
	void enterBeginStatement(FirebirdStatementParser.BeginStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#beginStatement}.
	 * @param ctx the parse tree
	 */
	void exitBeginStatement(FirebirdStatementParser.BeginStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(FirebirdStatementParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(FirebirdStatementParser.LeaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(FirebirdStatementParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(FirebirdStatementParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#baseTypeComment}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeComment(FirebirdStatementParser.BaseTypeCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#baseTypeComment}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeComment(FirebirdStatementParser.BaseTypeCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(FirebirdStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(FirebirdStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(FirebirdStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(FirebirdStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(FirebirdStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(FirebirdStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(FirebirdStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(FirebirdStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FirebirdStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FirebirdStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(FirebirdStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(FirebirdStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(FirebirdStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(FirebirdStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(FirebirdStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(FirebirdStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(FirebirdStatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(FirebirdStatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(FirebirdStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(FirebirdStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(FirebirdStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(FirebirdStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(FirebirdStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(FirebirdStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void enterCombineClause(FirebirdStatementParser.CombineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void exitCombineClause(FirebirdStatementParser.CombineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(FirebirdStatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(FirebirdStatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(FirebirdStatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(FirebirdStatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(FirebirdStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(FirebirdStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(FirebirdStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(FirebirdStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(FirebirdStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(FirebirdStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(FirebirdStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(FirebirdStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(FirebirdStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(FirebirdStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(FirebirdStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(FirebirdStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(FirebirdStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(FirebirdStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(FirebirdStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(FirebirdStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(FirebirdStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(FirebirdStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(FirebirdStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(FirebirdStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(FirebirdStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(FirebirdStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(FirebirdStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(FirebirdStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(FirebirdStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(FirebirdStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(FirebirdStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(FirebirdStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(FirebirdStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(FirebirdStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(FirebirdStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(FirebirdStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(FirebirdStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(FirebirdStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(FirebirdStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(FirebirdStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void enterCteClause(FirebirdStatementParser.CteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void exitCteClause(FirebirdStatementParser.CteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#merge}.
	 * @param ctx the parse tree
	 */
	void enterMerge(FirebirdStatementParser.MergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#merge}.
	 * @param ctx the parse tree
	 */
	void exitMerge(FirebirdStatementParser.MergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(FirebirdStatementParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(FirebirdStatementParser.IntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingClause(FirebirdStatementParser.UsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingClause(FirebirdStatementParser.UsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#mergeWhen}.
	 * @param ctx the parse tree
	 */
	void enterMergeWhen(FirebirdStatementParser.MergeWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#mergeWhen}.
	 * @param ctx the parse tree
	 */
	void exitMergeWhen(FirebirdStatementParser.MergeWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#mergeWhenMatched}.
	 * @param ctx the parse tree
	 */
	void enterMergeWhenMatched(FirebirdStatementParser.MergeWhenMatchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#mergeWhenMatched}.
	 * @param ctx the parse tree
	 */
	void exitMergeWhenMatched(FirebirdStatementParser.MergeWhenMatchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#mergeWhenNotMatched}.
	 * @param ctx the parse tree
	 */
	void enterMergeWhenNotMatched(FirebirdStatementParser.MergeWhenNotMatchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#mergeWhenNotMatched}.
	 * @param ctx the parse tree
	 */
	void exitMergeWhenNotMatched(FirebirdStatementParser.MergeWhenNotMatchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(FirebirdStatementParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(FirebirdStatementParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#returnExprListClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnExprListClause(FirebirdStatementParser.ReturnExprListClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#returnExprListClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnExprListClause(FirebirdStatementParser.ReturnExprListClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(FirebirdStatementParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(FirebirdStatementParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#variableListClause}.
	 * @param ctx the parse tree
	 */
	void enterVariableListClause(FirebirdStatementParser.VariableListClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#variableListClause}.
	 * @param ctx the parse tree
	 */
	void exitVariableListClause(FirebirdStatementParser.VariableListClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(FirebirdStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(FirebirdStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(FirebirdStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(FirebirdStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(FirebirdStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(FirebirdStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(FirebirdStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(FirebirdStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiterals(FirebirdStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiterals(FirebirdStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(FirebirdStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(FirebirdStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(FirebirdStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(FirebirdStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(FirebirdStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(FirebirdStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(FirebirdStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(FirebirdStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FirebirdStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FirebirdStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(FirebirdStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(FirebirdStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FirebirdStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FirebirdStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(FirebirdStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(FirebirdStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#savepointName}.
	 * @param ctx the parse tree
	 */
	void enterSavepointName(FirebirdStatementParser.SavepointNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#savepointName}.
	 * @param ctx the parse tree
	 */
	void exitSavepointName(FirebirdStatementParser.SavepointNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(FirebirdStatementParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(FirebirdStatementParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#domainName}.
	 * @param ctx the parse tree
	 */
	void enterDomainName(FirebirdStatementParser.DomainNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#domainName}.
	 * @param ctx the parse tree
	 */
	void exitDomainName(FirebirdStatementParser.DomainNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(FirebirdStatementParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(FirebirdStatementParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(FirebirdStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(FirebirdStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(FirebirdStatementParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(FirebirdStatementParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(FirebirdStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(FirebirdStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(FirebirdStatementParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(FirebirdStatementParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(FirebirdStatementParser.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(FirebirdStatementParser.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(FirebirdStatementParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(FirebirdStatementParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(FirebirdStatementParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(FirebirdStatementParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(FirebirdStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(FirebirdStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(FirebirdStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(FirebirdStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(FirebirdStatementParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(FirebirdStatementParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(FirebirdStatementParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(FirebirdStatementParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(FirebirdStatementParser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(FirebirdStatementParser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(FirebirdStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(FirebirdStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(FirebirdStatementParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(FirebirdStatementParser.EngineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#information}.
	 * @param ctx the parse tree
	 */
	void enterInformation(FirebirdStatementParser.InformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#information}.
	 * @param ctx the parse tree
	 */
	void exitInformation(FirebirdStatementParser.InformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#localVariableDeclarationName}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationName(FirebirdStatementParser.LocalVariableDeclarationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#localVariableDeclarationName}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationName(FirebirdStatementParser.LocalVariableDeclarationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#baseSortName}.
	 * @param ctx the parse tree
	 */
	void enterBaseSortName(FirebirdStatementParser.BaseSortNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#baseSortName}.
	 * @param ctx the parse tree
	 */
	void exitBaseSortName(FirebirdStatementParser.BaseSortNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(FirebirdStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(FirebirdStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#externalModuleName}.
	 * @param ctx the parse tree
	 */
	void enterExternalModuleName(FirebirdStatementParser.ExternalModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#externalModuleName}.
	 * @param ctx the parse tree
	 */
	void exitExternalModuleName(FirebirdStatementParser.ExternalModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(FirebirdStatementParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(FirebirdStatementParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(FirebirdStatementParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(FirebirdStatementParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(FirebirdStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(FirebirdStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(FirebirdStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(FirebirdStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(FirebirdStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(FirebirdStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#characterSetName}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSetName(FirebirdStatementParser.CharacterSetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#characterSetName}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSetName(FirebirdStatementParser.CharacterSetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FirebirdStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FirebirdStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(FirebirdStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(FirebirdStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(FirebirdStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(FirebirdStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(FirebirdStatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(FirebirdStatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(FirebirdStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(FirebirdStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(FirebirdStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(FirebirdStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(FirebirdStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(FirebirdStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(FirebirdStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(FirebirdStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(FirebirdStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(FirebirdStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FirebirdStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FirebirdStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(FirebirdStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(FirebirdStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(FirebirdStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(FirebirdStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(FirebirdStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(FirebirdStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(FirebirdStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(FirebirdStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(FirebirdStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(FirebirdStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(FirebirdStatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(FirebirdStatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(FirebirdStatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(FirebirdStatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(FirebirdStatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(FirebirdStatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(FirebirdStatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(FirebirdStatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(FirebirdStatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(FirebirdStatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(FirebirdStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(FirebirdStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(FirebirdStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(FirebirdStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#timeConstants}.
	 * @param ctx the parse tree
	 */
	void enterTimeConstants(FirebirdStatementParser.TimeConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#timeConstants}.
	 * @param ctx the parse tree
	 */
	void exitTimeConstants(FirebirdStatementParser.TimeConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(FirebirdStatementParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(FirebirdStatementParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(FirebirdStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(FirebirdStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(FirebirdStatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(FirebirdStatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(FirebirdStatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(FirebirdStatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(FirebirdStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(FirebirdStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(FirebirdStatementParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(FirebirdStatementParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(FirebirdStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(FirebirdStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(FirebirdStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(FirebirdStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(FirebirdStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(FirebirdStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#rowsClause}.
	 * @param ctx the parse tree
	 */
	void enterRowsClause(FirebirdStatementParser.RowsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#rowsClause}.
	 * @param ctx the parse tree
	 */
	void exitRowsClause(FirebirdStatementParser.RowsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#offsetDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOffsetDefinition(FirebirdStatementParser.OffsetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#offsetDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOffsetDefinition(FirebirdStatementParser.OffsetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(FirebirdStatementParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(FirebirdStatementParser.OffsetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void enterFetchClause(FirebirdStatementParser.FetchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void exitFetchClause(FirebirdStatementParser.FetchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(FirebirdStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(FirebirdStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(FirebirdStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(FirebirdStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(FirebirdStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(FirebirdStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(FirebirdStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(FirebirdStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(FirebirdStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(FirebirdStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(FirebirdStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(FirebirdStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(FirebirdStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(FirebirdStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier(FirebirdStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier(FirebirdStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#dropBehaviour}.
	 * @param ctx the parse tree
	 */
	void enterDropBehaviour(FirebirdStatementParser.DropBehaviourContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#dropBehaviour}.
	 * @param ctx the parse tree
	 */
	void exitDropBehaviour(FirebirdStatementParser.DropBehaviourContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(FirebirdStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(FirebirdStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(FirebirdStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(FirebirdStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#attributeCollation}.
	 * @param ctx the parse tree
	 */
	void enterAttributeCollation(FirebirdStatementParser.AttributeCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#attributeCollation}.
	 * @param ctx the parse tree
	 */
	void exitAttributeCollation(FirebirdStatementParser.AttributeCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#attributeCollationName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeCollationName(FirebirdStatementParser.AttributeCollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#attributeCollationName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeCollationName(FirebirdStatementParser.AttributeCollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(FirebirdStatementParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(FirebirdStatementParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#contextVariables}.
	 * @param ctx the parse tree
	 */
	void enterContextVariables(FirebirdStatementParser.ContextVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#contextVariables}.
	 * @param ctx the parse tree
	 */
	void exitContextVariables(FirebirdStatementParser.ContextVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcementArgument}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncementArgument(FirebirdStatementParser.AnnouncementArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcementArgument}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncementArgument(FirebirdStatementParser.AnnouncementArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#announcementArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAnnouncementArgumentClause(FirebirdStatementParser.AnnouncementArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#announcementArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAnnouncementArgumentClause(FirebirdStatementParser.AnnouncementArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#typeDescriptionArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeDescriptionArgument(FirebirdStatementParser.TypeDescriptionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#typeDescriptionArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeDescriptionArgument(FirebirdStatementParser.TypeDescriptionArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#externalModule}.
	 * @param ctx the parse tree
	 */
	void enterExternalModule(FirebirdStatementParser.ExternalModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#externalModule}.
	 * @param ctx the parse tree
	 */
	void exitExternalModule(FirebirdStatementParser.ExternalModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#sortOrder}.
	 * @param ctx the parse tree
	 */
	void enterSortOrder(FirebirdStatementParser.SortOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#sortOrder}.
	 * @param ctx the parse tree
	 */
	void exitSortOrder(FirebirdStatementParser.SortOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(FirebirdStatementParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(FirebirdStatementParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#bindLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBindLiterals(FirebirdStatementParser.BindLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#bindLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBindLiterals(FirebirdStatementParser.BindLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(FirebirdStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(FirebirdStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(FirebirdStatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(FirebirdStatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(FirebirdStatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(FirebirdStatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void enterLevelOfIsolation(FirebirdStatementParser.LevelOfIsolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void exitLevelOfIsolation(FirebirdStatementParser.LevelOfIsolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint(FirebirdStatementParser.SavepointContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#savepoint}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint(FirebirdStatementParser.SavepointContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(FirebirdStatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(FirebirdStatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(FirebirdStatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(FirebirdStatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeClause(FirebirdStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeClause(FirebirdStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(FirebirdStatementParser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(FirebirdStatementParser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType(FirebirdStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType(FirebirdStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(FirebirdStatementParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(FirebirdStatementParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterOnObjectClause(FirebirdStatementParser.OnObjectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitOnObjectClause(FirebirdStatementParser.OnObjectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(FirebirdStatementParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(FirebirdStatementParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#objectRecepient}.
	 * @param ctx the parse tree
	 */
	void enterObjectRecepient(FirebirdStatementParser.ObjectRecepientContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#objectRecepient}.
	 * @param ctx the parse tree
	 */
	void exitObjectRecepient(FirebirdStatementParser.ObjectRecepientContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#userRecepient}.
	 * @param ctx the parse tree
	 */
	void enterUserRecepient(FirebirdStatementParser.UserRecepientContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#userRecepient}.
	 * @param ctx the parse tree
	 */
	void exitUserRecepient(FirebirdStatementParser.UserRecepientContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeLevel(FirebirdStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeLevel(FirebirdStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateRole(FirebirdStatementParser.CreateRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateRole(FirebirdStatementParser.CreateRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUser(FirebirdStatementParser.CreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUser(FirebirdStatementParser.CreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#firstNameClause}.
	 * @param ctx the parse tree
	 */
	void enterFirstNameClause(FirebirdStatementParser.FirstNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#firstNameClause}.
	 * @param ctx the parse tree
	 */
	void exitFirstNameClause(FirebirdStatementParser.FirstNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#middleNameClause}.
	 * @param ctx the parse tree
	 */
	void enterMiddleNameClause(FirebirdStatementParser.MiddleNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#middleNameClause}.
	 * @param ctx the parse tree
	 */
	void exitMiddleNameClause(FirebirdStatementParser.MiddleNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#lastNameClause}.
	 * @param ctx the parse tree
	 */
	void enterLastNameClause(FirebirdStatementParser.LastNameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#lastNameClause}.
	 * @param ctx the parse tree
	 */
	void exitLastNameClause(FirebirdStatementParser.LastNameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#activeClause}.
	 * @param ctx the parse tree
	 */
	void enterActiveClause(FirebirdStatementParser.ActiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#activeClause}.
	 * @param ctx the parse tree
	 */
	void exitActiveClause(FirebirdStatementParser.ActiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#usingPluginClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingPluginClause(FirebirdStatementParser.UsingPluginClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#usingPluginClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingPluginClause(FirebirdStatementParser.UsingPluginClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#tagsAttributeClause}.
	 * @param ctx the parse tree
	 */
	void enterTagsAttributeClause(FirebirdStatementParser.TagsAttributeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#tagsAttributeClause}.
	 * @param ctx the parse tree
	 */
	void exitTagsAttributeClause(FirebirdStatementParser.TagsAttributeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirebirdStatementParser#grantAdminRoleClause}.
	 * @param ctx the parse tree
	 */
	void enterGrantAdminRoleClause(FirebirdStatementParser.GrantAdminRoleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirebirdStatementParser#grantAdminRoleClause}.
	 * @param ctx the parse tree
	 */
	void exitGrantAdminRoleClause(FirebirdStatementParser.GrantAdminRoleClauseContext ctx);
}