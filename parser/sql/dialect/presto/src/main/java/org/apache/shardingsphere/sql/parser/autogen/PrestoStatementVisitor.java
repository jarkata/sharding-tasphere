// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/presto/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/PrestoStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrestoStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrestoStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(PrestoStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(PrestoStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSpecification(PrestoStatementParser.InsertSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(PrestoStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(PrestoStatementParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIdentifier(PrestoStatementParser.InsertIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableWild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableWild(PrestoStatementParser.TableWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(PrestoStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDuplicateKeyClause(PrestoStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#valueReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueReference(PrestoStatementParser.ValueReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedColumns(PrestoStatementParser.DerivedColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(PrestoStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpecification_(PrestoStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PrestoStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(PrestoStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(PrestoStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#valuesTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesTable(PrestoStatementParser.ValuesTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#valuesRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesRow(PrestoStatementParser.ValuesRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(PrestoStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#blobValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobValue(PrestoStatementParser.BlobValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(PrestoStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSpecification(PrestoStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(PrestoStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(PrestoStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(PrestoStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectWithInto(PrestoStatementParser.SelectWithIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(PrestoStatementParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionBody(PrestoStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#combineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineClause(PrestoStatementParser.CombineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionParens(PrestoStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimary(PrestoStatementParser.QueryPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(PrestoStatementParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStatement(PrestoStatementParser.TableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValueConstructor(PrestoStatementParser.TableValueConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructorList(PrestoStatementParser.RowConstructorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(PrestoStatementParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#cteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteClause(PrestoStatementParser.CteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecification(PrestoStatementParser.SelectSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(PrestoStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(PrestoStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(PrestoStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(PrestoStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(PrestoStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(PrestoStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(PrestoStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedTableReference(PrestoStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(PrestoStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(PrestoStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNames(PrestoStatementParser.PartitionNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintList(PrestoStatementParser.IndexHintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(PrestoStatementParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(PrestoStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoinType(PrestoStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoinType(PrestoStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoinType(PrestoStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(PrestoStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(PrestoStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(PrestoStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(PrestoStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(PrestoStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(PrestoStatementParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffset(PrestoStatementParser.LimitOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(PrestoStatementParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#windowItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowItem(PrestoStatementParser.WindowItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(PrestoStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto(PrestoStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto(PrestoStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoExpression(PrestoStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(PrestoStatementParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClauseList(PrestoStatementParser.LockClauseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStrength(PrestoStatementParser.LockStrengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedRowAction(PrestoStatementParser.LockedRowActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLockingList(PrestoStatementParser.TableLockingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentOptWild(PrestoStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAliasRefList(PrestoStatementParser.TableAliasRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(PrestoStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomKeyword(PrestoStatementParser.CustomKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(PrestoStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#string_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(PrestoStatementParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(PrestoStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(PrestoStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalLiterals(PrestoStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(PrestoStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(PrestoStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(PrestoStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(PrestoStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(PrestoStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PrestoStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsUnambiguous(PrestoStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous1RolesAndLabels(PrestoStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous2Labels(PrestoStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous3Roles(PrestoStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous4SystemVariables(PrestoStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextOrIdentifier(PrestoStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpAddress(PrestoStatementParser.IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PrestoStatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#userVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(PrestoStatementParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariable(PrestoStatementParser.SystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalueSystemVariable(PrestoStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVariable(PrestoStatementParser.SetSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#optionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionType(PrestoStatementParser.OptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalVariableName(PrestoStatementParser.InternalVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprOrDefault(PrestoStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionCharacteristics(PrestoStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(PrestoStatementParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationTypes(PrestoStatementParser.IsolationTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionAccessMode(PrestoStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(PrestoStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#schemaNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaNames(PrestoStatementParser.SchemaNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(PrestoStatementParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#schemaPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaPairs(PrestoStatementParser.SchemaPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#schemaPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaPair(PrestoStatementParser.SchemaPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(PrestoStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#databaseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseName(PrestoStatementParser.DatabaseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(PrestoStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(PrestoStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(PrestoStatementParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldColumn(PrestoStatementParser.OldColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#newColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewColumn(PrestoStatementParser.NewColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiterName(PrestoStatementParser.DelimiterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserIdentifierOrText(PrestoStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#username}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsername(PrestoStatementParser.UsernameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(PrestoStatementParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#serverName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerName(PrestoStatementParser.ServerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapperName(PrestoStatementParser.WrapperNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(PrestoStatementParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(PrestoStatementParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(PrestoStatementParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(PrestoStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(PrestoStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PrestoStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableList(PrestoStatementParser.TableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#viewNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewNames(PrestoStatementParser.ViewNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(PrestoStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(PrestoStatementParser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(PrestoStatementParser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardLibraryName(PrestoStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#componentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentName(PrestoStatementParser.ComponentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#pluginName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginName(PrestoStatementParser.PluginNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(PrestoStatementParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(PrestoStatementParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneInstance(PrestoStatementParser.CloneInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneDir(PrestoStatementParser.CloneDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#channelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelName(PrestoStatementParser.ChannelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#logName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogName(PrestoStatementParser.LogNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#roleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleName(PrestoStatementParser.RoleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleIdentifierOrText(PrestoStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#engineRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineRef(PrestoStatementParser.EngineRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(PrestoStatementParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTime(PrestoStatementParser.TriggerTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOrTables(PrestoStatementParser.TableOrTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRole(PrestoStatementParser.UserOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#partitionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionName(PrestoStatementParser.PartitionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(PrestoStatementParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrPartitionNameList(PrestoStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvent(PrestoStatementParser.TriggerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOrder(PrestoStatementParser.TriggerOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PrestoStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(PrestoStatementParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(PrestoStatementParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(PrestoStatementParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(PrestoStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(PrestoStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(PrestoStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(PrestoStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(PrestoStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(PrestoStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(PrestoStatementParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEmptyError(PrestoStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#columnRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRef(PrestoStatementParser.ColumnRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRefList(PrestoStatementParser.ColumnRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PrestoStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunction(PrestoStatementParser.UdfFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(PrestoStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunction(PrestoStatementParser.JsonFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunctionName(PrestoStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(PrestoStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(PrestoStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(PrestoStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(PrestoStatementParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(PrestoStatementParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#frameStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart(PrestoStatementParser.FrameStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameEnd(PrestoStatementParser.FrameEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween(PrestoStatementParser.FrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(PrestoStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#rowFunciton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFunciton(PrestoStatementParser.RowFuncitonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#mapFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapFunction(PrestoStatementParser.MapFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#arrayFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunction(PrestoStatementParser.ArrayFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#timezoneFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezoneFunction(PrestoStatementParser.TimezoneFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#indexFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexFunction(PrestoStatementParser.IndexFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUserFunction(PrestoStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupConcatFunction(PrestoStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(PrestoStatementParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowingClause(PrestoStatementParser.WindowingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadLagInfo(PrestoStatementParser.LeadLagInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTreatment(PrestoStatementParser.NullTreatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#checkType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(PrestoStatementParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#repairType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairType(PrestoStatementParser.RepairTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(PrestoStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(PrestoStatementParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(PrestoStatementParser.CastTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunction(PrestoStatementParser.PositionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringFunction(PrestoStatementParser.SubstringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(PrestoStatementParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(PrestoStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction(PrestoStatementParser.TrimFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunction(PrestoStatementParser.ValuesFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightStringFunction(PrestoStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#levelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelClause(PrestoStatementParser.LevelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(PrestoStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(PrestoStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandRegularFunction(PrestoStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteRegularFunction(PrestoStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(PrestoStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(PrestoStatementParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchSearchModifier(PrestoStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(PrestoStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeExpr(PrestoStatementParser.DatetimeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogFileIndexNumber(PrestoStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(PrestoStatementParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(PrestoStatementParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(PrestoStatementParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(PrestoStatementParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit(PrestoStatementParser.IntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(PrestoStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(PrestoStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(PrestoStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(PrestoStatementParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(PrestoStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(PrestoStatementParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#textString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextString(PrestoStatementParser.TextStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStringHash(PrestoStatementParser.TextStringHashContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOptions(PrestoStatementParser.FieldOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(PrestoStatementParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDatetimePrecision(PrestoStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetWithOptBinary(PrestoStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#ascii}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscii(PrestoStatementParser.AsciiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#unicode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicode(PrestoStatementParser.UnicodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset(PrestoStatementParser.CharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCollation(PrestoStatementParser.DefaultCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultEncryption(PrestoStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCharset(PrestoStatementParser.DefaultCharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#now}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNow(PrestoStatementParser.NowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnFormat(PrestoStatementParser.ColumnFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageMedia(PrestoStatementParser.StorageMediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(PrestoStatementParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyOrIndex(PrestoStatementParser.KeyOrIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLength(PrestoStatementParser.FieldLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(PrestoStatementParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(PrestoStatementParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOrVarSpec(PrestoStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(PrestoStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(PrestoStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#connectionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionId(PrestoStatementParser.ConnectionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(PrestoStatementParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(PrestoStatementParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionName(PrestoStatementParser.ConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#combineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineOption(PrestoStatementParser.CombineOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoWriteToBinLog(PrestoStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#channelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption(PrestoStatementParser.ChannelOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(PrestoStatementParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(PrestoStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#alterTableActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableActions(PrestoStatementParser.AlterTableActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#alterCommandList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCommandList(PrestoStatementParser.AlterCommandListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#alterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterList(PrestoStatementParser.AlterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumn(PrestoStatementParser.AddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableDrop}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableDrop(PrestoStatementParser.AlterTableDropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameColumn}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameColumn(PrestoStatementParser.RenameColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterRenameTable}
	 * labeled alternative in {@link PrestoStatementParser#alterListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRenameTable(PrestoStatementParser.AlterRenameTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#duplicateAsQueryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateAsQueryExpression(PrestoStatementParser.DuplicateAsQueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#createLikeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLikeClause(PrestoStatementParser.CreateLikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementList(PrestoStatementParser.TableElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElement(PrestoStatementParser.TableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(PrestoStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(PrestoStatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(PrestoStatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#createDefinitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitionClause(PrestoStatementParser.CreateDefinitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAttributeList(PrestoStatementParser.TableAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#tableAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAttribute(PrestoStatementParser.TableAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(PrestoStatementParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSchema(PrestoStatementParser.FromSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(PrestoStatementParser.FromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showLike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLike(PrestoStatementParser.ShowLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWhereClause(PrestoStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFilter(PrestoStatementParser.ShowFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(PrestoStatementParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionCode(PrestoStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(PrestoStatementParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(PrestoStatementParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showSession}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSession(PrestoStatementParser.ShowSessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showCatalogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCatalogs(PrestoStatementParser.ShowCatalogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showSchemas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemas(PrestoStatementParser.ShowSchemasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(PrestoStatementParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrestoStatementParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(PrestoStatementParser.ShowContext ctx);
}