// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/sql92/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/SQL92Statement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQL92StatementParser}.
 */
public interface SQL92StatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(SQL92StatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(SQL92StatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SQL92StatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SQL92StatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(SQL92StatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(SQL92StatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SQL92StatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SQL92StatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SQL92StatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SQL92StatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(SQL92StatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(SQL92StatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SQL92StatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SQL92StatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SQL92StatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SQL92StatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableSpecification(SQL92StatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createTableSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableSpecification(SQL92StatementParser.CreateTableSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(SQL92StatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(SQL92StatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseSpecification_(SQL92StatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createDatabaseSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseSpecification_(SQL92StatementParser.CreateDatabaseSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinition(SQL92StatementParser.CreateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinition(SQL92StatementParser.CreateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SQL92StatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SQL92StatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dataTypeOption}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeOption(SQL92StatementParser.DataTypeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dataTypeOption}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeOption(SQL92StatementParser.DataTypeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#checkConstraintDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraintDefinition(SQL92StatementParser.CheckConstraintDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#checkConstraintDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraintDefinition(SQL92StatementParser.CheckConstraintDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(SQL92StatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(SQL92StatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void enterReferenceOption(SQL92StatementParser.ReferenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void exitReferenceOption(SQL92StatementParser.ReferenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#keyParts}.
	 * @param ctx the parse tree
	 */
	void enterKeyParts(SQL92StatementParser.KeyPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#keyParts}.
	 * @param ctx the parse tree
	 */
	void exitKeyParts(SQL92StatementParser.KeyPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#keyPart}.
	 * @param ctx the parse tree
	 */
	void enterKeyPart(SQL92StatementParser.KeyPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#keyPart}.
	 * @param ctx the parse tree
	 */
	void exitKeyPart(SQL92StatementParser.KeyPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDefinition(SQL92StatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#constraintDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDefinition(SQL92StatementParser.ConstraintDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyOption(SQL92StatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#primaryKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyOption(SQL92StatementParser.PrimaryKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(SQL92StatementParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(SQL92StatementParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#uniqueOption}.
	 * @param ctx the parse tree
	 */
	void enterUniqueOption(SQL92StatementParser.UniqueOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#uniqueOption}.
	 * @param ctx the parse tree
	 */
	void exitUniqueOption(SQL92StatementParser.UniqueOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyOption(SQL92StatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#foreignKeyOption}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyOption(SQL92StatementParser.ForeignKeyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLikeClause(SQL92StatementParser.CreateLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLikeClause(SQL92StatementParser.CreateLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefinitionClause(SQL92StatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#alterDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefinitionClause(SQL92StatementParser.AlterDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnSpecification(SQL92StatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#addColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnSpecification(SQL92StatementParser.AddColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterModifyColumnSpecification(SQL92StatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#modifyColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitModifyColumnSpecification(SQL92StatementParser.ModifyColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnSpecification(SQL92StatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropColumnSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnSpecification(SQL92StatementParser.DropColumnSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintSpecification(SQL92StatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#addConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintSpecification(SQL92StatementParser.AddConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintSpecification(SQL92StatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropConstraintSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintSpecification(SQL92StatementParser.DropConstraintSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(SQL92StatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(SQL92StatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(SQL92StatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(SQL92StatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(SQL92StatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(SQL92StatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(SQL92StatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(SQL92StatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SQL92StatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SQL92StatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(SQL92StatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(SQL92StatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(SQL92StatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(SQL92StatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(SQL92StatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(SQL92StatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(SQL92StatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(SQL92StatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SQL92StatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SQL92StatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(SQL92StatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(SQL92StatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SQL92StatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SQL92StatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void enterCombineClause(SQL92StatementParser.CombineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void exitCombineClause(SQL92StatementParser.CombineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SQL92StatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SQL92StatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(SQL92StatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(SQL92StatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(SQL92StatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(SQL92StatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(SQL92StatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(SQL92StatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(SQL92StatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(SQL92StatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SQL92StatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SQL92StatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(SQL92StatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(SQL92StatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(SQL92StatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(SQL92StatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SQL92StatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SQL92StatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(SQL92StatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(SQL92StatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(SQL92StatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(SQL92StatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SQL92StatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SQL92StatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(SQL92StatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(SQL92StatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(SQL92StatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(SQL92StatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(SQL92StatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(SQL92StatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SQL92StatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SQL92StatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SQL92StatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SQL92StatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SQL92StatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SQL92StatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SQL92StatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SQL92StatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(SQL92StatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(SQL92StatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(SQL92StatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(SQL92StatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SQL92StatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SQL92StatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(SQL92StatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(SQL92StatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(SQL92StatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(SQL92StatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(SQL92StatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(SQL92StatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(SQL92StatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(SQL92StatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiterals(SQL92StatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiterals(SQL92StatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(SQL92StatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(SQL92StatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(SQL92StatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(SQL92StatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(SQL92StatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(SQL92StatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(SQL92StatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(SQL92StatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQL92StatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQL92StatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(SQL92StatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(SQL92StatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SQL92StatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SQL92StatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SQL92StatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SQL92StatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQL92StatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQL92StatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQL92StatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQL92StatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(SQL92StatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(SQL92StatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(SQL92StatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(SQL92StatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQL92StatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQL92StatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(SQL92StatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(SQL92StatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(SQL92StatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(SQL92StatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(SQL92StatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(SQL92StatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#characterSetName}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSetName(SQL92StatementParser.CharacterSetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#characterSetName}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSetName(SQL92StatementParser.CharacterSetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQL92StatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQL92StatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(SQL92StatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(SQL92StatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(SQL92StatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(SQL92StatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(SQL92StatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(SQL92StatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(SQL92StatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(SQL92StatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SQL92StatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SQL92StatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SQL92StatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SQL92StatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(SQL92StatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(SQL92StatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(SQL92StatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(SQL92StatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SQL92StatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SQL92StatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(SQL92StatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(SQL92StatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(SQL92StatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(SQL92StatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(SQL92StatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(SQL92StatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(SQL92StatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(SQL92StatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(SQL92StatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(SQL92StatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(SQL92StatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(SQL92StatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(SQL92StatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(SQL92StatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(SQL92StatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(SQL92StatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(SQL92StatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(SQL92StatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(SQL92StatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(SQL92StatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(SQL92StatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(SQL92StatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(SQL92StatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(SQL92StatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(SQL92StatementParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(SQL92StatementParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(SQL92StatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(SQL92StatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(SQL92StatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(SQL92StatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(SQL92StatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(SQL92StatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(SQL92StatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(SQL92StatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(SQL92StatementParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(SQL92StatementParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SQL92StatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SQL92StatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(SQL92StatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(SQL92StatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SQL92StatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SQL92StatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(SQL92StatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(SQL92StatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(SQL92StatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(SQL92StatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(SQL92StatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(SQL92StatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(SQL92StatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(SQL92StatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier(SQL92StatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier(SQL92StatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#dropBehaviour}.
	 * @param ctx the parse tree
	 */
	void enterDropBehaviour(SQL92StatementParser.DropBehaviourContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#dropBehaviour}.
	 * @param ctx the parse tree
	 */
	void exitDropBehaviour(SQL92StatementParser.DropBehaviourContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(SQL92StatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#setTransaction}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(SQL92StatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(SQL92StatementParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(SQL92StatementParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(SQL92StatementParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(SQL92StatementParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void enterLevelOfIsolation(SQL92StatementParser.LevelOfIsolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#levelOfIsolation}.
	 * @param ctx the parse tree
	 */
	void exitLevelOfIsolation(SQL92StatementParser.LevelOfIsolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(SQL92StatementParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(SQL92StatementParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(SQL92StatementParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(SQL92StatementParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeClause(SQL92StatementParser.PrivilegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#privilegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeClause(SQL92StatementParser.PrivilegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(SQL92StatementParser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(SQL92StatementParser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeType(SQL92StatementParser.PrivilegeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#privilegeType}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeType(SQL92StatementParser.PrivilegeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(SQL92StatementParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(SQL92StatementParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterOnObjectClause(SQL92StatementParser.OnObjectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#onObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitOnObjectClause(SQL92StatementParser.OnObjectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(SQL92StatementParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(SQL92StatementParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQL92StatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegeLevel(SQL92StatementParser.PrivilegeLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQL92StatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegeLevel(SQL92StatementParser.PrivilegeLevelContext ctx);
}