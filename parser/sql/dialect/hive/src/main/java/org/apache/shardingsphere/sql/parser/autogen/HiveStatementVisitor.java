// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/hive/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/HiveStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.sql.parser.autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HiveStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HiveStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(HiveStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(HiveStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSpecification(HiveStatementParser.InsertSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(HiveStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(HiveStatementParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIdentifier(HiveStatementParser.InsertIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableWild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableWild(HiveStatementParser.TableWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(HiveStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDuplicateKeyClause(HiveStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#valueReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueReference(HiveStatementParser.ValueReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedColumns(HiveStatementParser.DerivedColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(HiveStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpecification_(HiveStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(HiveStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(HiveStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(HiveStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(HiveStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#blobValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobValue(HiveStatementParser.BlobValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(HiveStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSpecification(HiveStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(HiveStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(HiveStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(HiveStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectWithInto(HiveStatementParser.SelectWithIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(HiveStatementParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionBody(HiveStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#combineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineClause(HiveStatementParser.CombineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionParens(HiveStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimary(HiveStatementParser.QueryPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(HiveStatementParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStatement(HiveStatementParser.TableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValueConstructor(HiveStatementParser.TableValueConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructorList(HiveStatementParser.RowConstructorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(HiveStatementParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#cteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteClause(HiveStatementParser.CteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecification(HiveStatementParser.SelectSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(HiveStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(HiveStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(HiveStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(HiveStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(HiveStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(HiveStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(HiveStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedTableReference(HiveStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(HiveStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(HiveStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNames(HiveStatementParser.PartitionNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintList(HiveStatementParser.IndexHintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(HiveStatementParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(HiveStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoinType(HiveStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoinType(HiveStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoinType(HiveStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(HiveStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(HiveStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(HiveStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(HiveStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(HiveStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(HiveStatementParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffset(HiveStatementParser.LimitOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(HiveStatementParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#windowItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowItem(HiveStatementParser.WindowItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(HiveStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto(HiveStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto(HiveStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoExpression(HiveStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(HiveStatementParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClauseList(HiveStatementParser.LockClauseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStrength(HiveStatementParser.LockStrengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedRowAction(HiveStatementParser.LockedRowActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLockingList(HiveStatementParser.TableLockingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentOptWild(HiveStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAliasRefList(HiveStatementParser.TableAliasRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(HiveStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomKeyword(HiveStatementParser.CustomKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(HiveStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#string_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(HiveStatementParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(HiveStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(HiveStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalLiterals(HiveStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(HiveStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(HiveStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(HiveStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(HiveStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(HiveStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(HiveStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsUnambiguous(HiveStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous1RolesAndLabels(HiveStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous2Labels(HiveStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous3Roles(HiveStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous4SystemVariables(HiveStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextOrIdentifier(HiveStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpAddress(HiveStatementParser.IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(HiveStatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#userVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(HiveStatementParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariable(HiveStatementParser.SystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalueSystemVariable(HiveStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVariable(HiveStatementParser.SetSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#optionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionType(HiveStatementParser.OptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalVariableName(HiveStatementParser.InternalVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprOrDefault(HiveStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionCharacteristics(HiveStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(HiveStatementParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationTypes(HiveStatementParser.IsolationTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionAccessMode(HiveStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(HiveStatementParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(HiveStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(HiveStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(HiveStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(HiveStatementParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldColumn(HiveStatementParser.OldColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#newColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewColumn(HiveStatementParser.NewColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiterName(HiveStatementParser.DelimiterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserIdentifierOrText(HiveStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#username}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsername(HiveStatementParser.UsernameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(HiveStatementParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#serverName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerName(HiveStatementParser.ServerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapperName(HiveStatementParser.WrapperNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(HiveStatementParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(HiveStatementParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(HiveStatementParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(HiveStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(HiveStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(HiveStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableList(HiveStatementParser.TableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#viewNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewNames(HiveStatementParser.ViewNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(HiveStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(HiveStatementParser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(HiveStatementParser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardLibraryName(HiveStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#componentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentName(HiveStatementParser.ComponentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#pluginName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginName(HiveStatementParser.PluginNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(HiveStatementParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(HiveStatementParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneInstance(HiveStatementParser.CloneInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneDir(HiveStatementParser.CloneDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#channelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelName(HiveStatementParser.ChannelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#logName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogName(HiveStatementParser.LogNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#roleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleName(HiveStatementParser.RoleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleIdentifierOrText(HiveStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#engineRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineRef(HiveStatementParser.EngineRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(HiveStatementParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTime(HiveStatementParser.TriggerTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOrTables(HiveStatementParser.TableOrTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRole(HiveStatementParser.UserOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#partitionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionName(HiveStatementParser.PartitionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(HiveStatementParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrPartitionNameList(HiveStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvent(HiveStatementParser.TriggerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOrder(HiveStatementParser.TriggerOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HiveStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(HiveStatementParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(HiveStatementParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(HiveStatementParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(HiveStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(HiveStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(HiveStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(HiveStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(HiveStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(HiveStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(HiveStatementParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEmptyError(HiveStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#columnRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRef(HiveStatementParser.ColumnRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRefList(HiveStatementParser.ColumnRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HiveStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunction(HiveStatementParser.UdfFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(HiveStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunction(HiveStatementParser.JsonFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunctionName(HiveStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(HiveStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(HiveStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(HiveStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(HiveStatementParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(HiveStatementParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#frameStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart(HiveStatementParser.FrameStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameEnd(HiveStatementParser.FrameEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween(HiveStatementParser.FrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(HiveStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUserFunction(HiveStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupConcatFunction(HiveStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(HiveStatementParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowingClause(HiveStatementParser.WindowingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadLagInfo(HiveStatementParser.LeadLagInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTreatment(HiveStatementParser.NullTreatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#checkType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(HiveStatementParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#repairType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairType(HiveStatementParser.RepairTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(HiveStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(HiveStatementParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(HiveStatementParser.CastTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunction(HiveStatementParser.PositionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringFunction(HiveStatementParser.SubstringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(HiveStatementParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(HiveStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction(HiveStatementParser.TrimFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunction(HiveStatementParser.ValuesFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightStringFunction(HiveStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#levelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelClause(HiveStatementParser.LevelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(HiveStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(HiveStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandRegularFunction(HiveStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteRegularFunction(HiveStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(HiveStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(HiveStatementParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchSearchModifier(HiveStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(HiveStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeExpr(HiveStatementParser.DatetimeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogFileIndexNumber(HiveStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(HiveStatementParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(HiveStatementParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(HiveStatementParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(HiveStatementParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit(HiveStatementParser.IntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(HiveStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(HiveStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(HiveStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(HiveStatementParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#textString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextString(HiveStatementParser.TextStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStringHash(HiveStatementParser.TextStringHashContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOptions(HiveStatementParser.FieldOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(HiveStatementParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDatetimePrecision(HiveStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetWithOptBinary(HiveStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#ascii}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscii(HiveStatementParser.AsciiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#unicode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicode(HiveStatementParser.UnicodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset(HiveStatementParser.CharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCollation(HiveStatementParser.DefaultCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultEncryption(HiveStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCharset(HiveStatementParser.DefaultCharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#now}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNow(HiveStatementParser.NowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnFormat(HiveStatementParser.ColumnFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageMedia(HiveStatementParser.StorageMediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(HiveStatementParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyOrIndex(HiveStatementParser.KeyOrIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLength(HiveStatementParser.FieldLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(HiveStatementParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(HiveStatementParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOrVarSpec(HiveStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(HiveStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(HiveStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#connectionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionId(HiveStatementParser.ConnectionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(HiveStatementParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(HiveStatementParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionName(HiveStatementParser.ConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#combineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineOption(HiveStatementParser.CombineOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoWriteToBinLog(HiveStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link HiveStatementParser#channelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption(HiveStatementParser.ChannelOptionContext ctx);
}