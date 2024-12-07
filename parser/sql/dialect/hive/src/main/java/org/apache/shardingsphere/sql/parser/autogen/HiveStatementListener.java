// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/hive/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/HiveStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HiveStatementParser}.
 */
public interface HiveStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(HiveStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(HiveStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(HiveStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(HiveStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void enterInsertSpecification(HiveStatementParser.InsertSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void exitInsertSpecification(HiveStatementParser.InsertSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(HiveStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(HiveStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(HiveStatementParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(HiveStatementParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInsertIdentifier(HiveStatementParser.InsertIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInsertIdentifier(HiveStatementParser.InsertIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void enterTableWild(HiveStatementParser.TableWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void exitTableWild(HiveStatementParser.TableWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(HiveStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(HiveStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterOnDuplicateKeyClause(HiveStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitOnDuplicateKeyClause(HiveStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void enterValueReference(HiveStatementParser.ValueReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void exitValueReference(HiveStatementParser.ValueReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void enterDerivedColumns(HiveStatementParser.DerivedColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void exitDerivedColumns(HiveStatementParser.DerivedColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(HiveStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(HiveStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSpecification_(HiveStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSpecification_(HiveStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HiveStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HiveStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(HiveStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(HiveStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(HiveStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(HiveStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(HiveStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(HiveStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(HiveStatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(HiveStatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(HiveStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(HiveStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSpecification(HiveStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSpecification(HiveStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(HiveStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(HiveStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(HiveStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(HiveStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(HiveStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(HiveStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithInto(HiveStatementParser.SelectWithIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithInto(HiveStatementParser.SelectWithIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(HiveStatementParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(HiveStatementParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionBody(HiveStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionBody(HiveStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void enterCombineClause(HiveStatementParser.CombineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void exitCombineClause(HiveStatementParser.CombineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionParens(HiveStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionParens(HiveStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimary(HiveStatementParser.QueryPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimary(HiveStatementParser.QueryPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(HiveStatementParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(HiveStatementParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void enterTableStatement(HiveStatementParser.TableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void exitTableStatement(HiveStatementParser.TableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableValueConstructor(HiveStatementParser.TableValueConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableValueConstructor(HiveStatementParser.TableValueConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructorList(HiveStatementParser.RowConstructorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructorList(HiveStatementParser.RowConstructorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(HiveStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(HiveStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void enterCteClause(HiveStatementParser.CteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void exitCteClause(HiveStatementParser.CteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(HiveStatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(HiveStatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(HiveStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(HiveStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(HiveStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(HiveStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(HiveStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(HiveStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(HiveStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(HiveStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(HiveStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(HiveStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(HiveStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(HiveStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(HiveStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(HiveStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(HiveStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(HiveStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(HiveStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(HiveStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(HiveStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(HiveStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNames(HiveStatementParser.PartitionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNames(HiveStatementParser.PartitionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintList(HiveStatementParser.IndexHintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintList(HiveStatementParser.IndexHintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(HiveStatementParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(HiveStatementParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(HiveStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(HiveStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoinType(HiveStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoinType(HiveStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoinType(HiveStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoinType(HiveStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoinType(HiveStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoinType(HiveStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(HiveStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(HiveStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(HiveStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(HiveStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(HiveStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(HiveStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(HiveStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(HiveStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(HiveStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(HiveStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(HiveStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(HiveStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(HiveStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(HiveStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(HiveStatementParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(HiveStatementParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void enterWindowItem(HiveStatementParser.WindowItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void exitWindowItem(HiveStatementParser.WindowItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(HiveStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(HiveStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(HiveStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(HiveStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(HiveStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(HiveStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoExpression(HiveStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoExpression(HiveStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(HiveStatementParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(HiveStatementParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void enterLockClauseList(HiveStatementParser.LockClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void exitLockClauseList(HiveStatementParser.LockClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void enterLockStrength(HiveStatementParser.LockStrengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void exitLockStrength(HiveStatementParser.LockStrengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void enterLockedRowAction(HiveStatementParser.LockedRowActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void exitLockedRowAction(HiveStatementParser.LockedRowActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void enterTableLockingList(HiveStatementParser.TableLockingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void exitTableLockingList(HiveStatementParser.TableLockingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentOptWild(HiveStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentOptWild(HiveStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void enterTableAliasRefList(HiveStatementParser.TableAliasRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void exitTableAliasRefList(HiveStatementParser.TableAliasRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(HiveStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(HiveStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCustomKeyword(HiveStatementParser.CustomKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCustomKeyword(HiveStatementParser.CustomKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(HiveStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(HiveStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(HiveStatementParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(HiveStatementParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(HiveStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(HiveStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(HiveStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(HiveStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterTemporalLiterals(HiveStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitTemporalLiterals(HiveStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(HiveStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(HiveStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(HiveStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(HiveStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(HiveStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(HiveStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(HiveStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(HiveStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(HiveStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(HiveStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HiveStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HiveStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsUnambiguous(HiveStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsUnambiguous(HiveStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous1RolesAndLabels(HiveStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous1RolesAndLabels(HiveStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous2Labels(HiveStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous2Labels(HiveStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous3Roles(HiveStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous3Roles(HiveStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous4SystemVariables(HiveStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous4SystemVariables(HiveStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTextOrIdentifier(HiveStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTextOrIdentifier(HiveStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void enterIpAddress(HiveStatementParser.IpAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void exitIpAddress(HiveStatementParser.IpAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(HiveStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(HiveStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(HiveStatementParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(HiveStatementParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariable(HiveStatementParser.SystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariable(HiveStatementParser.SystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterRvalueSystemVariable(HiveStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitRvalueSystemVariable(HiveStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariable(HiveStatementParser.SetSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariable(HiveStatementParser.SetSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionType(HiveStatementParser.OptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionType(HiveStatementParser.OptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void enterInternalVariableName(HiveStatementParser.InternalVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void exitInternalVariableName(HiveStatementParser.InternalVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterSetExprOrDefault(HiveStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitSetExprOrDefault(HiveStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void enterTransactionCharacteristics(HiveStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void exitTransactionCharacteristics(HiveStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(HiveStatementParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(HiveStatementParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void enterIsolationTypes(HiveStatementParser.IsolationTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void exitIsolationTypes(HiveStatementParser.IsolationTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionAccessMode(HiveStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionAccessMode(HiveStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(HiveStatementParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(HiveStatementParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(HiveStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(HiveStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(HiveStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(HiveStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(HiveStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(HiveStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(HiveStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(HiveStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void enterOldColumn(HiveStatementParser.OldColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void exitOldColumn(HiveStatementParser.OldColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void enterNewColumn(HiveStatementParser.NewColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void exitNewColumn(HiveStatementParser.NewColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void enterDelimiterName(HiveStatementParser.DelimiterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void exitDelimiterName(HiveStatementParser.DelimiterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterUserIdentifierOrText(HiveStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitUserIdentifierOrText(HiveStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void enterUsername(HiveStatementParser.UsernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void exitUsername(HiveStatementParser.UsernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(HiveStatementParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(HiveStatementParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void enterServerName(HiveStatementParser.ServerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void exitServerName(HiveStatementParser.ServerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void enterWrapperName(HiveStatementParser.WrapperNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void exitWrapperName(HiveStatementParser.WrapperNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(HiveStatementParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(HiveStatementParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(HiveStatementParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(HiveStatementParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(HiveStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(HiveStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(HiveStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(HiveStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(HiveStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(HiveStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HiveStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HiveStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(HiveStatementParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(HiveStatementParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void enterViewNames(HiveStatementParser.ViewNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void exitViewNames(HiveStatementParser.ViewNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(HiveStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(HiveStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(HiveStatementParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(HiveStatementParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(HiveStatementParser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(HiveStatementParser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void enterShardLibraryName(HiveStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void exitShardLibraryName(HiveStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(HiveStatementParser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(HiveStatementParser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void enterPluginName(HiveStatementParser.PluginNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void exitPluginName(HiveStatementParser.PluginNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(HiveStatementParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(HiveStatementParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(HiveStatementParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(HiveStatementParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void enterCloneInstance(HiveStatementParser.CloneInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void exitCloneInstance(HiveStatementParser.CloneInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void enterCloneDir(HiveStatementParser.CloneDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void exitCloneDir(HiveStatementParser.CloneDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void enterChannelName(HiveStatementParser.ChannelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void exitChannelName(HiveStatementParser.ChannelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void enterLogName(HiveStatementParser.LogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void exitLogName(HiveStatementParser.LogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(HiveStatementParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(HiveStatementParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterRoleIdentifierOrText(HiveStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitRoleIdentifierOrText(HiveStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void enterEngineRef(HiveStatementParser.EngineRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void exitEngineRef(HiveStatementParser.EngineRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(HiveStatementParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(HiveStatementParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTime(HiveStatementParser.TriggerTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTime(HiveStatementParser.TriggerTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void enterTableOrTables(HiveStatementParser.TableOrTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void exitTableOrTables(HiveStatementParser.TableOrTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRole(HiveStatementParser.UserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRole(HiveStatementParser.UserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void enterPartitionName(HiveStatementParser.PartitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void exitPartitionName(HiveStatementParser.PartitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(HiveStatementParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(HiveStatementParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void enterAllOrPartitionNameList(HiveStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void exitAllOrPartitionNameList(HiveStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(HiveStatementParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(HiveStatementParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOrder(HiveStatementParser.TriggerOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOrder(HiveStatementParser.TriggerOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HiveStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HiveStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(HiveStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(HiveStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(HiveStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(HiveStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(HiveStatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(HiveStatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(HiveStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(HiveStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(HiveStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(HiveStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(HiveStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(HiveStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(HiveStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(HiveStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(HiveStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(HiveStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(HiveStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(HiveStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(HiveStatementParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(HiveStatementParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void enterOnEmptyError(HiveStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void exitOnEmptyError(HiveStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void enterColumnRef(HiveStatementParser.ColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void exitColumnRef(HiveStatementParser.ColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnRefList(HiveStatementParser.ColumnRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnRefList(HiveStatementParser.ColumnRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HiveStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HiveStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunction(HiveStatementParser.UdfFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunction(HiveStatementParser.UdfFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(HiveStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(HiveStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunction(HiveStatementParser.JsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunction(HiveStatementParser.JsonFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunctionName(HiveStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunctionName(HiveStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(HiveStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(HiveStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(HiveStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(HiveStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(HiveStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(HiveStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(HiveStatementParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(HiveStatementParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(HiveStatementParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(HiveStatementParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart(HiveStatementParser.FrameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart(HiveStatementParser.FrameStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd(HiveStatementParser.FrameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd(HiveStatementParser.FrameEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(HiveStatementParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(HiveStatementParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(HiveStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(HiveStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUserFunction(HiveStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUserFunction(HiveStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupConcatFunction(HiveStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupConcatFunction(HiveStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(HiveStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(HiveStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(HiveStatementParser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(HiveStatementParser.WindowingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void enterLeadLagInfo(HiveStatementParser.LeadLagInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void exitLeadLagInfo(HiveStatementParser.LeadLagInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void enterNullTreatment(HiveStatementParser.NullTreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void exitNullTreatment(HiveStatementParser.NullTreatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(HiveStatementParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(HiveStatementParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void enterRepairType(HiveStatementParser.RepairTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void exitRepairType(HiveStatementParser.RepairTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(HiveStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(HiveStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(HiveStatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(HiveStatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(HiveStatementParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(HiveStatementParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(HiveStatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(HiveStatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(HiveStatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(HiveStatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(HiveStatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(HiveStatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(HiveStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(HiveStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(HiveStatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(HiveStatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunction(HiveStatementParser.ValuesFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunction(HiveStatementParser.ValuesFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightStringFunction(HiveStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightStringFunction(HiveStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void enterLevelClause(HiveStatementParser.LevelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void exitLevelClause(HiveStatementParser.LevelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(HiveStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(HiveStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(HiveStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(HiveStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterShorthandRegularFunction(HiveStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitShorthandRegularFunction(HiveStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterCompleteRegularFunction(HiveStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitCompleteRegularFunction(HiveStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(HiveStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(HiveStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(HiveStatementParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(HiveStatementParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void enterMatchSearchModifier(HiveStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void exitMatchSearchModifier(HiveStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(HiveStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(HiveStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeExpr(HiveStatementParser.DatetimeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeExpr(HiveStatementParser.DatetimeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogFileIndexNumber(HiveStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogFileIndexNumber(HiveStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(HiveStatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(HiveStatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(HiveStatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(HiveStatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(HiveStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(HiveStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(HiveStatementParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(HiveStatementParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(HiveStatementParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(HiveStatementParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(HiveStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(HiveStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(HiveStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(HiveStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(HiveStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(HiveStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(HiveStatementParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(HiveStatementParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void enterTextString(HiveStatementParser.TextStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void exitTextString(HiveStatementParser.TextStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void enterTextStringHash(HiveStatementParser.TextStringHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void exitTextStringHash(HiveStatementParser.TextStringHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void enterFieldOptions(HiveStatementParser.FieldOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void exitFieldOptions(HiveStatementParser.FieldOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(HiveStatementParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(HiveStatementParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void enterTypeDatetimePrecision(HiveStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void exitTypeDatetimePrecision(HiveStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void enterCharsetWithOptBinary(HiveStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void exitCharsetWithOptBinary(HiveStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void enterAscii(HiveStatementParser.AsciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void exitAscii(HiveStatementParser.AsciiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void enterUnicode(HiveStatementParser.UnicodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void exitUnicode(HiveStatementParser.UnicodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterCharset(HiveStatementParser.CharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitCharset(HiveStatementParser.CharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCollation(HiveStatementParser.DefaultCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCollation(HiveStatementParser.DefaultCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultEncryption(HiveStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultEncryption(HiveStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCharset(HiveStatementParser.DefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCharset(HiveStatementParser.DefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void enterNow(HiveStatementParser.NowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void exitNow(HiveStatementParser.NowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void enterColumnFormat(HiveStatementParser.ColumnFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void exitColumnFormat(HiveStatementParser.ColumnFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void enterStorageMedia(HiveStatementParser.StorageMediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void exitStorageMedia(HiveStatementParser.StorageMediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(HiveStatementParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(HiveStatementParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void enterKeyOrIndex(HiveStatementParser.KeyOrIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void exitKeyOrIndex(HiveStatementParser.KeyOrIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(HiveStatementParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(HiveStatementParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(HiveStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(HiveStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(HiveStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(HiveStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void enterFieldOrVarSpec(HiveStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void exitFieldOrVarSpec(HiveStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(HiveStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(HiveStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(HiveStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(HiveStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void enterConnectionId(HiveStatementParser.ConnectionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void exitConnectionId(HiveStatementParser.ConnectionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(HiveStatementParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(HiveStatementParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(HiveStatementParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(HiveStatementParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void enterConditionName(HiveStatementParser.ConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void exitConditionName(HiveStatementParser.ConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void enterCombineOption(HiveStatementParser.CombineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void exitCombineOption(HiveStatementParser.CombineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void enterNoWriteToBinLog(HiveStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void exitNoWriteToBinLog(HiveStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link HiveStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(HiveStatementParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HiveStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(HiveStatementParser.ChannelOptionContext ctx);
}