// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/presto/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/PrestoStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrestoStatementParser}.
 */
public interface PrestoStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(PrestoStatementParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(PrestoStatementParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(PrestoStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(PrestoStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void enterInsertSpecification(PrestoStatementParser.InsertSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void exitInsertSpecification(PrestoStatementParser.InsertSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(PrestoStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(PrestoStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(PrestoStatementParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(PrestoStatementParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInsertIdentifier(PrestoStatementParser.InsertIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInsertIdentifier(PrestoStatementParser.InsertIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void enterTableWild(PrestoStatementParser.TableWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void exitTableWild(PrestoStatementParser.TableWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(PrestoStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(PrestoStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterOnDuplicateKeyClause(PrestoStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitOnDuplicateKeyClause(PrestoStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void enterValueReference(PrestoStatementParser.ValueReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void exitValueReference(PrestoStatementParser.ValueReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void enterDerivedColumns(PrestoStatementParser.DerivedColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void exitDerivedColumns(PrestoStatementParser.DerivedColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(PrestoStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(PrestoStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSpecification_(PrestoStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSpecification_(PrestoStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PrestoStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PrestoStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(PrestoStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(PrestoStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(PrestoStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(PrestoStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#valuesTable}.
	 * @param ctx the parse tree
	 */
	void enterValuesTable(PrestoStatementParser.ValuesTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#valuesTable}.
	 * @param ctx the parse tree
	 */
	void exitValuesTable(PrestoStatementParser.ValuesTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#valuesRow}.
	 * @param ctx the parse tree
	 */
	void enterValuesRow(PrestoStatementParser.ValuesRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#valuesRow}.
	 * @param ctx the parse tree
	 */
	void exitValuesRow(PrestoStatementParser.ValuesRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(PrestoStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(PrestoStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(PrestoStatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(PrestoStatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(PrestoStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(PrestoStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSpecification(PrestoStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSpecification(PrestoStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(PrestoStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(PrestoStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(PrestoStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(PrestoStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(PrestoStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(PrestoStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithInto(PrestoStatementParser.SelectWithIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithInto(PrestoStatementParser.SelectWithIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(PrestoStatementParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(PrestoStatementParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionBody(PrestoStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionBody(PrestoStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void enterCombineClause(PrestoStatementParser.CombineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void exitCombineClause(PrestoStatementParser.CombineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionParens(PrestoStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionParens(PrestoStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimary(PrestoStatementParser.QueryPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimary(PrestoStatementParser.QueryPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(PrestoStatementParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(PrestoStatementParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void enterTableStatement(PrestoStatementParser.TableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void exitTableStatement(PrestoStatementParser.TableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableValueConstructor(PrestoStatementParser.TableValueConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableValueConstructor(PrestoStatementParser.TableValueConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructorList(PrestoStatementParser.RowConstructorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructorList(PrestoStatementParser.RowConstructorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(PrestoStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(PrestoStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void enterCteClause(PrestoStatementParser.CteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void exitCteClause(PrestoStatementParser.CteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(PrestoStatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(PrestoStatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(PrestoStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(PrestoStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(PrestoStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(PrestoStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(PrestoStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(PrestoStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(PrestoStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(PrestoStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(PrestoStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(PrestoStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(PrestoStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(PrestoStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(PrestoStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(PrestoStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(PrestoStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(PrestoStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(PrestoStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(PrestoStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(PrestoStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(PrestoStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNames(PrestoStatementParser.PartitionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNames(PrestoStatementParser.PartitionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintList(PrestoStatementParser.IndexHintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintList(PrestoStatementParser.IndexHintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(PrestoStatementParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(PrestoStatementParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(PrestoStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(PrestoStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoinType(PrestoStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoinType(PrestoStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoinType(PrestoStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoinType(PrestoStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoinType(PrestoStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoinType(PrestoStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(PrestoStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(PrestoStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(PrestoStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(PrestoStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(PrestoStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(PrestoStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(PrestoStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(PrestoStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(PrestoStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(PrestoStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(PrestoStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(PrestoStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(PrestoStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(PrestoStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(PrestoStatementParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(PrestoStatementParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void enterWindowItem(PrestoStatementParser.WindowItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void exitWindowItem(PrestoStatementParser.WindowItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(PrestoStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(PrestoStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(PrestoStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(PrestoStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(PrestoStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(PrestoStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoExpression(PrestoStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoExpression(PrestoStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(PrestoStatementParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(PrestoStatementParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void enterLockClauseList(PrestoStatementParser.LockClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void exitLockClauseList(PrestoStatementParser.LockClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void enterLockStrength(PrestoStatementParser.LockStrengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void exitLockStrength(PrestoStatementParser.LockStrengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void enterLockedRowAction(PrestoStatementParser.LockedRowActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void exitLockedRowAction(PrestoStatementParser.LockedRowActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void enterTableLockingList(PrestoStatementParser.TableLockingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void exitTableLockingList(PrestoStatementParser.TableLockingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentOptWild(PrestoStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentOptWild(PrestoStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void enterTableAliasRefList(PrestoStatementParser.TableAliasRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void exitTableAliasRefList(PrestoStatementParser.TableAliasRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(PrestoStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(PrestoStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCustomKeyword(PrestoStatementParser.CustomKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCustomKeyword(PrestoStatementParser.CustomKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(PrestoStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(PrestoStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(PrestoStatementParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(PrestoStatementParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(PrestoStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(PrestoStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(PrestoStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(PrestoStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterTemporalLiterals(PrestoStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitTemporalLiterals(PrestoStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(PrestoStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(PrestoStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(PrestoStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(PrestoStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(PrestoStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(PrestoStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(PrestoStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(PrestoStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(PrestoStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(PrestoStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PrestoStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PrestoStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsUnambiguous(PrestoStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsUnambiguous(PrestoStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous1RolesAndLabels(PrestoStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous1RolesAndLabels(PrestoStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous2Labels(PrestoStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous2Labels(PrestoStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous3Roles(PrestoStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous3Roles(PrestoStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous4SystemVariables(PrestoStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous4SystemVariables(PrestoStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTextOrIdentifier(PrestoStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTextOrIdentifier(PrestoStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void enterIpAddress(PrestoStatementParser.IpAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void exitIpAddress(PrestoStatementParser.IpAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PrestoStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PrestoStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(PrestoStatementParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(PrestoStatementParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariable(PrestoStatementParser.SystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariable(PrestoStatementParser.SystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterRvalueSystemVariable(PrestoStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitRvalueSystemVariable(PrestoStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariable(PrestoStatementParser.SetSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariable(PrestoStatementParser.SetSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionType(PrestoStatementParser.OptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionType(PrestoStatementParser.OptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void enterInternalVariableName(PrestoStatementParser.InternalVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void exitInternalVariableName(PrestoStatementParser.InternalVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterSetExprOrDefault(PrestoStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitSetExprOrDefault(PrestoStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void enterTransactionCharacteristics(PrestoStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void exitTransactionCharacteristics(PrestoStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(PrestoStatementParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(PrestoStatementParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void enterIsolationTypes(PrestoStatementParser.IsolationTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void exitIsolationTypes(PrestoStatementParser.IsolationTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionAccessMode(PrestoStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionAccessMode(PrestoStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(PrestoStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(PrestoStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#schemaNames}.
	 * @param ctx the parse tree
	 */
	void enterSchemaNames(PrestoStatementParser.SchemaNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#schemaNames}.
	 * @param ctx the parse tree
	 */
	void exitSchemaNames(PrestoStatementParser.SchemaNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(PrestoStatementParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(PrestoStatementParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#schemaPairs}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPairs(PrestoStatementParser.SchemaPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#schemaPairs}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPairs(PrestoStatementParser.SchemaPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#schemaPair}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPair(PrestoStatementParser.SchemaPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#schemaPair}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPair(PrestoStatementParser.SchemaPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(PrestoStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(PrestoStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseName(PrestoStatementParser.DatabaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#databaseName}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseName(PrestoStatementParser.DatabaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(PrestoStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(PrestoStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(PrestoStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(PrestoStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(PrestoStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(PrestoStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void enterOldColumn(PrestoStatementParser.OldColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void exitOldColumn(PrestoStatementParser.OldColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void enterNewColumn(PrestoStatementParser.NewColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void exitNewColumn(PrestoStatementParser.NewColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void enterDelimiterName(PrestoStatementParser.DelimiterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void exitDelimiterName(PrestoStatementParser.DelimiterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterUserIdentifierOrText(PrestoStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitUserIdentifierOrText(PrestoStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void enterUsername(PrestoStatementParser.UsernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void exitUsername(PrestoStatementParser.UsernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(PrestoStatementParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(PrestoStatementParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void enterServerName(PrestoStatementParser.ServerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void exitServerName(PrestoStatementParser.ServerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void enterWrapperName(PrestoStatementParser.WrapperNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void exitWrapperName(PrestoStatementParser.WrapperNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(PrestoStatementParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(PrestoStatementParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(PrestoStatementParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(PrestoStatementParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(PrestoStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(PrestoStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(PrestoStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(PrestoStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(PrestoStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(PrestoStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PrestoStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PrestoStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(PrestoStatementParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(PrestoStatementParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void enterViewNames(PrestoStatementParser.ViewNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void exitViewNames(PrestoStatementParser.ViewNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(PrestoStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(PrestoStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(PrestoStatementParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(PrestoStatementParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(PrestoStatementParser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(PrestoStatementParser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void enterShardLibraryName(PrestoStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void exitShardLibraryName(PrestoStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(PrestoStatementParser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(PrestoStatementParser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void enterPluginName(PrestoStatementParser.PluginNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void exitPluginName(PrestoStatementParser.PluginNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(PrestoStatementParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(PrestoStatementParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(PrestoStatementParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(PrestoStatementParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void enterCloneInstance(PrestoStatementParser.CloneInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void exitCloneInstance(PrestoStatementParser.CloneInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void enterCloneDir(PrestoStatementParser.CloneDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void exitCloneDir(PrestoStatementParser.CloneDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void enterChannelName(PrestoStatementParser.ChannelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void exitChannelName(PrestoStatementParser.ChannelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void enterLogName(PrestoStatementParser.LogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void exitLogName(PrestoStatementParser.LogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(PrestoStatementParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(PrestoStatementParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterRoleIdentifierOrText(PrestoStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitRoleIdentifierOrText(PrestoStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void enterEngineRef(PrestoStatementParser.EngineRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void exitEngineRef(PrestoStatementParser.EngineRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(PrestoStatementParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(PrestoStatementParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTime(PrestoStatementParser.TriggerTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTime(PrestoStatementParser.TriggerTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void enterTableOrTables(PrestoStatementParser.TableOrTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void exitTableOrTables(PrestoStatementParser.TableOrTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRole(PrestoStatementParser.UserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRole(PrestoStatementParser.UserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void enterPartitionName(PrestoStatementParser.PartitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void exitPartitionName(PrestoStatementParser.PartitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PrestoStatementParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PrestoStatementParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void enterAllOrPartitionNameList(PrestoStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void exitAllOrPartitionNameList(PrestoStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(PrestoStatementParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(PrestoStatementParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOrder(PrestoStatementParser.TriggerOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOrder(PrestoStatementParser.TriggerOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PrestoStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PrestoStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(PrestoStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(PrestoStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(PrestoStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(PrestoStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(PrestoStatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(PrestoStatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(PrestoStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(PrestoStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PrestoStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PrestoStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(PrestoStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(PrestoStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(PrestoStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(PrestoStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(PrestoStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(PrestoStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(PrestoStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(PrestoStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(PrestoStatementParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(PrestoStatementParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void enterOnEmptyError(PrestoStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void exitOnEmptyError(PrestoStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void enterColumnRef(PrestoStatementParser.ColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void exitColumnRef(PrestoStatementParser.ColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnRefList(PrestoStatementParser.ColumnRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnRefList(PrestoStatementParser.ColumnRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PrestoStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PrestoStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunction(PrestoStatementParser.UdfFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunction(PrestoStatementParser.UdfFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(PrestoStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(PrestoStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunction(PrestoStatementParser.JsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunction(PrestoStatementParser.JsonFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunctionName(PrestoStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunctionName(PrestoStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(PrestoStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(PrestoStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(PrestoStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(PrestoStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(PrestoStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(PrestoStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(PrestoStatementParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(PrestoStatementParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(PrestoStatementParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(PrestoStatementParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart(PrestoStatementParser.FrameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart(PrestoStatementParser.FrameStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd(PrestoStatementParser.FrameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd(PrestoStatementParser.FrameEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(PrestoStatementParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(PrestoStatementParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(PrestoStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(PrestoStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#rowFunciton}.
	 * @param ctx the parse tree
	 */
	void enterRowFunciton(PrestoStatementParser.RowFuncitonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#rowFunciton}.
	 * @param ctx the parse tree
	 */
	void exitRowFunciton(PrestoStatementParser.RowFuncitonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#mapFunction}.
	 * @param ctx the parse tree
	 */
	void enterMapFunction(PrestoStatementParser.MapFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#mapFunction}.
	 * @param ctx the parse tree
	 */
	void exitMapFunction(PrestoStatementParser.MapFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#arrayFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrayFunction(PrestoStatementParser.ArrayFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#arrayFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrayFunction(PrestoStatementParser.ArrayFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#timezoneFunction}.
	 * @param ctx the parse tree
	 */
	void enterTimezoneFunction(PrestoStatementParser.TimezoneFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#timezoneFunction}.
	 * @param ctx the parse tree
	 */
	void exitTimezoneFunction(PrestoStatementParser.TimezoneFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#indexFunction}.
	 * @param ctx the parse tree
	 */
	void enterIndexFunction(PrestoStatementParser.IndexFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#indexFunction}.
	 * @param ctx the parse tree
	 */
	void exitIndexFunction(PrestoStatementParser.IndexFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUserFunction(PrestoStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUserFunction(PrestoStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupConcatFunction(PrestoStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupConcatFunction(PrestoStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(PrestoStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(PrestoStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(PrestoStatementParser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(PrestoStatementParser.WindowingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void enterLeadLagInfo(PrestoStatementParser.LeadLagInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void exitLeadLagInfo(PrestoStatementParser.LeadLagInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void enterNullTreatment(PrestoStatementParser.NullTreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void exitNullTreatment(PrestoStatementParser.NullTreatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(PrestoStatementParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(PrestoStatementParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void enterRepairType(PrestoStatementParser.RepairTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void exitRepairType(PrestoStatementParser.RepairTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(PrestoStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(PrestoStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(PrestoStatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(PrestoStatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(PrestoStatementParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(PrestoStatementParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(PrestoStatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(PrestoStatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(PrestoStatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(PrestoStatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(PrestoStatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(PrestoStatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(PrestoStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(PrestoStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(PrestoStatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(PrestoStatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunction(PrestoStatementParser.ValuesFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunction(PrestoStatementParser.ValuesFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightStringFunction(PrestoStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightStringFunction(PrestoStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void enterLevelClause(PrestoStatementParser.LevelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void exitLevelClause(PrestoStatementParser.LevelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(PrestoStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(PrestoStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(PrestoStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(PrestoStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterShorthandRegularFunction(PrestoStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitShorthandRegularFunction(PrestoStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterCompleteRegularFunction(PrestoStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitCompleteRegularFunction(PrestoStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(PrestoStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(PrestoStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(PrestoStatementParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(PrestoStatementParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void enterMatchSearchModifier(PrestoStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void exitMatchSearchModifier(PrestoStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(PrestoStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(PrestoStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeExpr(PrestoStatementParser.DatetimeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeExpr(PrestoStatementParser.DatetimeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogFileIndexNumber(PrestoStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogFileIndexNumber(PrestoStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(PrestoStatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(PrestoStatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(PrestoStatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(PrestoStatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(PrestoStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(PrestoStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(PrestoStatementParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(PrestoStatementParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(PrestoStatementParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(PrestoStatementParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(PrestoStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(PrestoStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(PrestoStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(PrestoStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(PrestoStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(PrestoStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(PrestoStatementParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(PrestoStatementParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PrestoStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PrestoStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(PrestoStatementParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(PrestoStatementParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void enterTextString(PrestoStatementParser.TextStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void exitTextString(PrestoStatementParser.TextStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void enterTextStringHash(PrestoStatementParser.TextStringHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void exitTextStringHash(PrestoStatementParser.TextStringHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void enterFieldOptions(PrestoStatementParser.FieldOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void exitFieldOptions(PrestoStatementParser.FieldOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(PrestoStatementParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(PrestoStatementParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void enterTypeDatetimePrecision(PrestoStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void exitTypeDatetimePrecision(PrestoStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void enterCharsetWithOptBinary(PrestoStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void exitCharsetWithOptBinary(PrestoStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void enterAscii(PrestoStatementParser.AsciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void exitAscii(PrestoStatementParser.AsciiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void enterUnicode(PrestoStatementParser.UnicodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void exitUnicode(PrestoStatementParser.UnicodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterCharset(PrestoStatementParser.CharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitCharset(PrestoStatementParser.CharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCollation(PrestoStatementParser.DefaultCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCollation(PrestoStatementParser.DefaultCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultEncryption(PrestoStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultEncryption(PrestoStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCharset(PrestoStatementParser.DefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCharset(PrestoStatementParser.DefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void enterNow(PrestoStatementParser.NowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void exitNow(PrestoStatementParser.NowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void enterColumnFormat(PrestoStatementParser.ColumnFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void exitColumnFormat(PrestoStatementParser.ColumnFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void enterStorageMedia(PrestoStatementParser.StorageMediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void exitStorageMedia(PrestoStatementParser.StorageMediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(PrestoStatementParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(PrestoStatementParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void enterKeyOrIndex(PrestoStatementParser.KeyOrIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void exitKeyOrIndex(PrestoStatementParser.KeyOrIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(PrestoStatementParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(PrestoStatementParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(PrestoStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(PrestoStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(PrestoStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(PrestoStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void enterFieldOrVarSpec(PrestoStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void exitFieldOrVarSpec(PrestoStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(PrestoStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(PrestoStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(PrestoStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(PrestoStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void enterConnectionId(PrestoStatementParser.ConnectionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void exitConnectionId(PrestoStatementParser.ConnectionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(PrestoStatementParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(PrestoStatementParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(PrestoStatementParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(PrestoStatementParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void enterConditionName(PrestoStatementParser.ConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void exitConditionName(PrestoStatementParser.ConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void enterCombineOption(PrestoStatementParser.CombineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void exitCombineOption(PrestoStatementParser.CombineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void enterNoWriteToBinLog(PrestoStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void exitNoWriteToBinLog(PrestoStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(PrestoStatementParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(PrestoStatementParser.ChannelOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(PrestoStatementParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(PrestoStatementParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(PrestoStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(PrestoStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableActions(PrestoStatementParser.AlterTableActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableActions(PrestoStatementParser.AlterTableActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#alterCommandList}.
	 * @param ctx the parse tree
	 */
	void enterAlterCommandList(PrestoStatementParser.AlterCommandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#alterCommandList}.
	 * @param ctx the parse tree
	 */
	void exitAlterCommandList(PrestoStatementParser.AlterCommandListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#alterList}.
	 * @param ctx the parse tree
	 */
	void enterAlterList(PrestoStatementParser.AlterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#alterList}.
	 * @param ctx the parse tree
	 */
	void exitAlterList(PrestoStatementParser.AlterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(PrestoStatementParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(PrestoStatementParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableDrop}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDrop(PrestoStatementParser.AlterTableDropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableDrop}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDrop(PrestoStatementParser.AlterTableDropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterRenameColumn(PrestoStatementParser.RenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitRenameColumn(PrestoStatementParser.RenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterRenameTable}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void enterAlterRenameTable(PrestoStatementParser.AlterRenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterRenameTable}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 */
	void exitAlterRenameTable(PrestoStatementParser.AlterRenameTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#duplicateAsQueryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateAsQueryExpression(PrestoStatementParser.DuplicateAsQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#duplicateAsQueryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateAsQueryExpression(PrestoStatementParser.DuplicateAsQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateLikeClause(PrestoStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateLikeClause(PrestoStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void enterTableElementList(PrestoStatementParser.TableElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 */
	void exitTableElementList(PrestoStatementParser.TableElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(PrestoStatementParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(PrestoStatementParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(PrestoStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(PrestoStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(PrestoStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(PrestoStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(PrestoStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(PrestoStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitionClause(PrestoStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitionClause(PrestoStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterTableAttributeList(PrestoStatementParser.TableAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitTableAttributeList(PrestoStatementParser.TableAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#tableAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTableAttribute(PrestoStatementParser.TableAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#tableAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTableAttribute(PrestoStatementParser.TableAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(PrestoStatementParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(PrestoStatementParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 */
	void enterFromSchema(PrestoStatementParser.FromSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 */
	void exitFromSchema(PrestoStatementParser.FromSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(PrestoStatementParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(PrestoStatementParser.FromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void enterShowLike(PrestoStatementParser.ShowLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void exitShowLike(PrestoStatementParser.ShowLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterShowWhereClause(PrestoStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitShowWhereClause(PrestoStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(PrestoStatementParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(PrestoStatementParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(PrestoStatementParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(PrestoStatementParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionCode(PrestoStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionCode(PrestoStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showFunctions}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(PrestoStatementParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showFunctions}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(PrestoStatementParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(PrestoStatementParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(PrestoStatementParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showSession}.
	 * @param ctx the parse tree
	 */
	void enterShowSession(PrestoStatementParser.ShowSessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showSession}.
	 * @param ctx the parse tree
	 */
	void exitShowSession(PrestoStatementParser.ShowSessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showCatalogs}.
	 * @param ctx the parse tree
	 */
	void enterShowCatalogs(PrestoStatementParser.ShowCatalogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showCatalogs}.
	 * @param ctx the parse tree
	 */
	void exitShowCatalogs(PrestoStatementParser.ShowCatalogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showSchemas}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemas(PrestoStatementParser.ShowSchemasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showSchemas}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemas(PrestoStatementParser.ShowSchemasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(PrestoStatementParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(PrestoStatementParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrestoStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(PrestoStatementParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrestoStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(PrestoStatementParser.ShowContext ctx);
}