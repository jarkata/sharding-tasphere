// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/clickhouse/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/ClickHouseStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClickHouseStatementParser}.
 */
public interface ClickHouseStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(ClickHouseStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(ClickHouseStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(ClickHouseStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(ClickHouseStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(ClickHouseStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(ClickHouseStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(ClickHouseStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(ClickHouseStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(ClickHouseStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(ClickHouseStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(ClickHouseStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(ClickHouseStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(ClickHouseStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(ClickHouseStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ClickHouseStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ClickHouseStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(ClickHouseStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(ClickHouseStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(ClickHouseStatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(ClickHouseStatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(ClickHouseStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(ClickHouseStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(ClickHouseStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(ClickHouseStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(ClickHouseStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(ClickHouseStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void enterCombineClause(ClickHouseStatementParser.CombineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void exitCombineClause(ClickHouseStatementParser.CombineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(ClickHouseStatementParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(ClickHouseStatementParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(ClickHouseStatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(ClickHouseStatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(ClickHouseStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(ClickHouseStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(ClickHouseStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(ClickHouseStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(ClickHouseStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(ClickHouseStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(ClickHouseStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(ClickHouseStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(ClickHouseStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(ClickHouseStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(ClickHouseStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(ClickHouseStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(ClickHouseStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(ClickHouseStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(ClickHouseStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(ClickHouseStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(ClickHouseStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(ClickHouseStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(ClickHouseStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(ClickHouseStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(ClickHouseStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(ClickHouseStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(ClickHouseStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(ClickHouseStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(ClickHouseStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(ClickHouseStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ClickHouseStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ClickHouseStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(ClickHouseStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(ClickHouseStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(ClickHouseStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(ClickHouseStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(ClickHouseStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(ClickHouseStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(ClickHouseStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(ClickHouseStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(ClickHouseStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(ClickHouseStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(ClickHouseStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(ClickHouseStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(ClickHouseStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(ClickHouseStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(ClickHouseStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(ClickHouseStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(ClickHouseStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(ClickHouseStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(ClickHouseStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(ClickHouseStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiterals(ClickHouseStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#dateTimeLiterals}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiterals(ClickHouseStatementParser.DateTimeLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(ClickHouseStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(ClickHouseStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(ClickHouseStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(ClickHouseStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(ClickHouseStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(ClickHouseStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(ClickHouseStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(ClickHouseStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ClickHouseStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ClickHouseStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedWord(ClickHouseStatementParser.UnreservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#unreservedWord}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedWord(ClickHouseStatementParser.UnreservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(ClickHouseStatementParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(ClickHouseStatementParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ClickHouseStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ClickHouseStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(ClickHouseStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(ClickHouseStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(ClickHouseStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(ClickHouseStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(ClickHouseStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(ClickHouseStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(ClickHouseStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(ClickHouseStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(ClickHouseStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(ClickHouseStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ClickHouseStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ClickHouseStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(ClickHouseStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(ClickHouseStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(ClickHouseStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(ClickHouseStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void enterTableNames(ClickHouseStatementParser.TableNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#tableNames}.
	 * @param ctx the parse tree
	 */
	void exitTableNames(ClickHouseStatementParser.TableNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#characterSetName}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSetName(ClickHouseStatementParser.CharacterSetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#characterSetName}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSetName(ClickHouseStatementParser.CharacterSetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#cluster}.
	 * @param ctx the parse tree
	 */
	void enterCluster(ClickHouseStatementParser.ClusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#cluster}.
	 * @param ctx the parse tree
	 */
	void exitCluster(ClickHouseStatementParser.ClusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ClickHouseStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ClickHouseStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(ClickHouseStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(ClickHouseStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(ClickHouseStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(ClickHouseStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(ClickHouseStatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(ClickHouseStatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(ClickHouseStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(ClickHouseStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(ClickHouseStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(ClickHouseStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(ClickHouseStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(ClickHouseStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(ClickHouseStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(ClickHouseStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(ClickHouseStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(ClickHouseStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ClickHouseStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ClickHouseStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(ClickHouseStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(ClickHouseStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(ClickHouseStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(ClickHouseStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(ClickHouseStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(ClickHouseStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(ClickHouseStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(ClickHouseStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(ClickHouseStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(ClickHouseStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(ClickHouseStatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(ClickHouseStatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(ClickHouseStatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(ClickHouseStatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(ClickHouseStatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(ClickHouseStatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(ClickHouseStatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(ClickHouseStatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(ClickHouseStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(ClickHouseStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(ClickHouseStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(ClickHouseStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(ClickHouseStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(ClickHouseStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(ClickHouseStatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(ClickHouseStatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(ClickHouseStatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(ClickHouseStatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(ClickHouseStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(ClickHouseStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(ClickHouseStatementParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(ClickHouseStatementParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(ClickHouseStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(ClickHouseStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(ClickHouseStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(ClickHouseStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(ClickHouseStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(ClickHouseStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(ClickHouseStatementParser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(ClickHouseStatementParser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeLength(ClickHouseStatementParser.DataTypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#dataTypeLength}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeLength(ClickHouseStatementParser.DataTypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(ClickHouseStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(ClickHouseStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(ClickHouseStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(ClickHouseStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIgnoredIdentifier(ClickHouseStatementParser.IgnoredIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseStatementParser#ignoredIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIgnoredIdentifier(ClickHouseStatementParser.IgnoredIdentifierContext ctx);
}