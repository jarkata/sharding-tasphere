// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/firebird/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/FirebirdStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FirebirdStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FirebirdStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(FirebirdStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(FirebirdStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCollation(FirebirdStatementParser.CreateCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#fromCollationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromCollationClause(FirebirdStatementParser.FromCollationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#paddingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingClause(FirebirdStatementParser.PaddingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#caseSensitivityClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseSensitivityClause(FirebirdStatementParser.CaseSensitivityClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#accentSensitivityClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccentSensitivityClause(FirebirdStatementParser.AccentSensitivityClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#attributeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeClause(FirebirdStatementParser.AttributeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomain(FirebirdStatementParser.CreateDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(FirebirdStatementParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#notNullClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNullClause(FirebirdStatementParser.NotNullClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#checkClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckClause(FirebirdStatementParser.CheckClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#characterSetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSetClause(FirebirdStatementParser.CharacterSetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(FirebirdStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#alterSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequence(FirebirdStatementParser.AlterSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequence(FirebirdStatementParser.CreateSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#alterDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomain(FirebirdStatementParser.AlterDomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#toTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTableClause(FirebirdStatementParser.ToTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#defaultAlterDomainClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultAlterDomainClause(FirebirdStatementParser.DefaultAlterDomainClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#notNullAlterDomainClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotNullAlterDomainClause(FirebirdStatementParser.NotNullAlterDomainClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#constraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintClause(FirebirdStatementParser.ConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#typeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeClause(FirebirdStatementParser.TypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(FirebirdStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(FirebirdStatementParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(FirebirdStatementParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FirebirdStatementParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#cursorOpenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorOpenStatement(FirebirdStatementParser.CursorOpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#cursorCloseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorCloseStatement(FirebirdStatementParser.CursorCloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcementClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncementClause(FirebirdStatementParser.AnnouncementClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncement(FirebirdStatementParser.AnnouncementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#localVariableOrCursorAnnouncement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableOrCursorAnnouncement(FirebirdStatementParser.LocalVariableOrCursorAnnouncementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#procedureAnnouncement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAnnouncement(FirebirdStatementParser.ProcedureAnnouncementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#functioneAnnouncement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioneAnnouncement(FirebirdStatementParser.FunctioneAnnouncementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#inputArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArgument(FirebirdStatementParser.InputArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#inputArgumentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArgumentClause(FirebirdStatementParser.InputArgumentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(FirebirdStatementParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(FirebirdStatementParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(FirebirdStatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#viewAliasClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewAliasClause(FirebirdStatementParser.ViewAliasClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#viewAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewAlias(FirebirdStatementParser.ViewAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(FirebirdStatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createTemporaryTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTemporaryTable(FirebirdStatementParser.CreateTemporaryTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#sqlSecurity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlSecurity(FirebirdStatementParser.SqlSecurityContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(FirebirdStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#sequenceRestartClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceRestartClause(FirebirdStatementParser.SequenceRestartClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#sequenceIncrementClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceIncrementClause(FirebirdStatementParser.SequenceIncrementClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseSpecification_(FirebirdStatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinition(FirebirdStatementParser.CreateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(FirebirdStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dataTypeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeOption(FirebirdStatementParser.DataTypeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#checkConstraintDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraintDefinition(FirebirdStatementParser.CheckConstraintDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceDefinition(FirebirdStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#referenceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceOption(FirebirdStatementParser.ReferenceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#usingDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDefinition(FirebirdStatementParser.UsingDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintDefinition(FirebirdStatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyOption(FirebirdStatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(FirebirdStatementParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#uniqueOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueOption(FirebirdStatementParser.UniqueOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyOption(FirebirdStatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLikeClause(FirebirdStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefinitionClause(FirebirdStatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnSpecification(FirebirdStatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumnSpecification(FirebirdStatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#modifyColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyColumn(FirebirdStatementParser.ModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnSpecification(FirebirdStatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraintSpecification(FirebirdStatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintSpecification(FirebirdStatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FirebirdStatementParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(FirebirdStatementParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(FirebirdStatementParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#procedureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureClause(FirebirdStatementParser.ProcedureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#executeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStmt(FirebirdStatementParser.ExecuteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#executeProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteProcedure(FirebirdStatementParser.ExecuteProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#exprClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprClause(FirebirdStatementParser.ExprClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#returningValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturningValuesClause(FirebirdStatementParser.ReturningValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(FirebirdStatementParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#alterTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTrigger(FirebirdStatementParser.AlterTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcmentTriggerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncmentTriggerClause(FirebirdStatementParser.AnnouncmentTriggerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#triggerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerClause(FirebirdStatementParser.TriggerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcmentTableTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncmentTableTrigger(FirebirdStatementParser.AnnouncmentTableTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#eventListTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventListTable(FirebirdStatementParser.EventListTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#listDDLStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDDLStatement(FirebirdStatementParser.ListDDLStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(FirebirdStatementParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#ddlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlStatement(FirebirdStatementParser.DdlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcmentTableTriggerSQL_2003Standart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncmentTableTriggerSQL_2003Standart(FirebirdStatementParser.AnnouncmentTableTriggerSQL_2003StandartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcmentDataBaseTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncmentDataBaseTrigger(FirebirdStatementParser.AnnouncmentDataBaseTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#eventConnectOrTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventConnectOrTransaction(FirebirdStatementParser.EventConnectOrTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcmentDDLTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncmentDDLTrigger(FirebirdStatementParser.AnnouncmentDDLTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#executeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteBlock(FirebirdStatementParser.ExecuteBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#inputArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputArgumentList(FirebirdStatementParser.InputArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#outputArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputArgumentList(FirebirdStatementParser.OutputArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(FirebirdStatementParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#transferStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransferStatement(FirebirdStatementParser.TransferStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(FirebirdStatementParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#fetchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchStatement(FirebirdStatementParser.FetchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FirebirdStatementParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(FirebirdStatementParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#beginStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginStatement(FirebirdStatementParser.BeginStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeaveStatement(FirebirdStatementParser.LeaveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(FirebirdStatementParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#baseTypeComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeComment(FirebirdStatementParser.BaseTypeCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(FirebirdStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(FirebirdStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(FirebirdStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(FirebirdStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FirebirdStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(FirebirdStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(FirebirdStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(FirebirdStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#blobValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobValue(FirebirdStatementParser.BlobValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(FirebirdStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(FirebirdStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(FirebirdStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#combineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineClause(FirebirdStatementParser.CombineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(FirebirdStatementParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecification(FirebirdStatementParser.SelectSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(FirebirdStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(FirebirdStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(FirebirdStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(FirebirdStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(FirebirdStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(FirebirdStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(FirebirdStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(FirebirdStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedTableReference(FirebirdStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(FirebirdStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(FirebirdStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(FirebirdStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(FirebirdStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(FirebirdStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(FirebirdStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(FirebirdStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(FirebirdStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(FirebirdStatementParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#cteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteClause(FirebirdStatementParser.CteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#merge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge(FirebirdStatementParser.MergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(FirebirdStatementParser.IntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#usingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClause(FirebirdStatementParser.UsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#mergeWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeWhen(FirebirdStatementParser.MergeWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#mergeWhenMatched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeWhenMatched(FirebirdStatementParser.MergeWhenMatchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#mergeWhenNotMatched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeWhenNotMatched(FirebirdStatementParser.MergeWhenNotMatchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#returnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(FirebirdStatementParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#returnExprListClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExprListClause(FirebirdStatementParser.ReturnExprListClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#variableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableList(FirebirdStatementParser.VariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#variableListClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableListClause(FirebirdStatementParser.VariableListClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(FirebirdStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(FirebirdStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(FirebirdStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(FirebirdStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeLiterals(FirebirdStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(FirebirdStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(FirebirdStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(FirebirdStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(FirebirdStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(FirebirdStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreservedWord(FirebirdStatementParser.UnreservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FirebirdStatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(FirebirdStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#savepointName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepointName(FirebirdStatementParser.SavepointNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(FirebirdStatementParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#domainName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainName(FirebirdStatementParser.DomainNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(FirebirdStatementParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(FirebirdStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(FirebirdStatementParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(FirebirdStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(FirebirdStatementParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(FirebirdStatementParser.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(FirebirdStatementParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#roleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleName(FirebirdStatementParser.RoleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(FirebirdStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(FirebirdStatementParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(FirebirdStatementParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(FirebirdStatementParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#argumentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentName(FirebirdStatementParser.ArgumentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(FirebirdStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#engineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineName(FirebirdStatementParser.EngineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformation(FirebirdStatementParser.InformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#localVariableDeclarationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationName(FirebirdStatementParser.LocalVariableDeclarationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#baseSortName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSortName(FirebirdStatementParser.BaseSortNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(FirebirdStatementParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#externalModuleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalModuleName(FirebirdStatementParser.ExternalModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(FirebirdStatementParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(FirebirdStatementParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(FirebirdStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(FirebirdStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#tableNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNames(FirebirdStatementParser.TableNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#characterSetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSetName(FirebirdStatementParser.CharacterSetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FirebirdStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(FirebirdStatementParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(FirebirdStatementParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(FirebirdStatementParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(FirebirdStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(FirebirdStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(FirebirdStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(FirebirdStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(FirebirdStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FirebirdStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(FirebirdStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(FirebirdStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(FirebirdStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(FirebirdStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(FirebirdStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(FirebirdStatementParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunction(FirebirdStatementParser.PositionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringFunction(FirebirdStatementParser.SubstringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(FirebirdStatementParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction(FirebirdStatementParser.TrimFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(FirebirdStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(FirebirdStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#timeConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeConstants(FirebirdStatementParser.TimeConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(FirebirdStatementParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(FirebirdStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(FirebirdStatementParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(FirebirdStatementParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(FirebirdStatementParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit(FirebirdStatementParser.IntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(FirebirdStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(FirebirdStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(FirebirdStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#rowsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsClause(FirebirdStatementParser.RowsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#offsetDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetDefinition(FirebirdStatementParser.OffsetDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(FirebirdStatementParser.OffsetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#fetchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchClause(FirebirdStatementParser.FetchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(FirebirdStatementParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffset(FirebirdStatementParser.LimitOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(FirebirdStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(FirebirdStatementParser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeLength(FirebirdStatementParser.DataTypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(FirebirdStatementParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(FirebirdStatementParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoredIdentifier(FirebirdStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#dropBehaviour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropBehaviour(FirebirdStatementParser.DropBehaviourContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(FirebirdStatementParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(FirebirdStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#attributeCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeCollation(FirebirdStatementParser.AttributeCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#attributeCollationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeCollationName(FirebirdStatementParser.AttributeCollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(FirebirdStatementParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#contextVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextVariables(FirebirdStatementParser.ContextVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcementArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncementArgument(FirebirdStatementParser.AnnouncementArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#announcementArgumentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnouncementArgumentClause(FirebirdStatementParser.AnnouncementArgumentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#typeDescriptionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDescriptionArgument(FirebirdStatementParser.TypeDescriptionArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#externalModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalModule(FirebirdStatementParser.ExternalModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#sortOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortOrder(FirebirdStatementParser.SortOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(FirebirdStatementParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#bindLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindLiterals(FirebirdStatementParser.BindLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#setTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(FirebirdStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(FirebirdStatementParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(FirebirdStatementParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelOfIsolation(FirebirdStatementParser.LevelOfIsolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#savepoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint(FirebirdStatementParser.SavepointContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#grant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant(FirebirdStatementParser.GrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke(FirebirdStatementParser.RevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeClause(FirebirdStatementParser.PrivilegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(FirebirdStatementParser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#privilegeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeType(FirebirdStatementParser.PrivilegeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(FirebirdStatementParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnObjectClause(FirebirdStatementParser.OnObjectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(FirebirdStatementParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#objectRecepient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectRecepient(FirebirdStatementParser.ObjectRecepientContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#userRecepient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserRecepient(FirebirdStatementParser.UserRecepientContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegeLevel(FirebirdStatementParser.PrivilegeLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRole(FirebirdStatementParser.CreateRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUser(FirebirdStatementParser.CreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#firstNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstNameClause(FirebirdStatementParser.FirstNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#middleNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiddleNameClause(FirebirdStatementParser.MiddleNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#lastNameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastNameClause(FirebirdStatementParser.LastNameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#activeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActiveClause(FirebirdStatementParser.ActiveClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#usingPluginClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingPluginClause(FirebirdStatementParser.UsingPluginClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#tagsAttributeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagsAttributeClause(FirebirdStatementParser.TagsAttributeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirebirdStatementParser#grantAdminRoleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantAdminRoleClause(FirebirdStatementParser.GrantAdminRoleClauseContext ctx);
}