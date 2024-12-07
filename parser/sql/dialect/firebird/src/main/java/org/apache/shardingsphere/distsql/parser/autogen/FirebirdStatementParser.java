// Generated from /Users/code/gitcode/shardingsphere/parser/sql/dialect/firebird/src/main/antlr4/org/apache/shardingsphere/sql/parser/autogen/FirebirdStatement.g4 by ANTLR 4.13.2
package org.apache.shardingsphere.distsql.parser.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FirebirdStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCK_COMMENT=1, INLINE_COMMENT=2, AND_=3, CONCAT_=4, NOT_=5, TILDE_=6, 
		VERTICAL_BAR_=7, AMPERSAND_=8, SIGNED_LEFT_SHIFT_=9, SIGNED_RIGHT_SHIFT_=10, 
		CARET_=11, MOD_=12, COLON_=13, PLUS_=14, MINUS_=15, ASTERISK_=16, SLASH_=17, 
		BACKSLASH_=18, DOT_=19, DOT_ASTERISK_=20, SAFE_EQ_=21, DEQ_=22, EQ_=23, 
		NEQ_=24, GT_=25, GTE_=26, LT_=27, LTE_=28, POUND_=29, LP_=30, RP_=31, 
		LBE_=32, RBE_=33, LBT_=34, RBT_=35, COMMA_=36, DQ_=37, SQ_=38, QUESTION_=39, 
		AT_=40, SEMI_=41, COMMENT_=42, WS=43, SELECT=44, INSERT=45, UPDATE=46, 
		DELETE=47, CREATE=48, ALTER=49, DROP=50, TRUNCATE=51, SCHEMA=52, GRANT=53, 
		REVOKE=54, ADD=55, SET=56, TABLE=57, COLUMN=58, INDEX=59, CONSTRAINT=60, 
		PRIMARY=61, UNIQUE=62, FOREIGN=63, KEY=64, POSITION=65, PRECISION=66, 
		FUNCTION=67, TRIGGER=68, PROCEDURE=69, VIEW=70, INTO=71, VALUES=72, WITH=73, 
		UNION=74, DISTINCT=75, CASE=76, WHEN=77, CAST=78, TRIM=79, SUBSTRING=80, 
		FROM=81, NATURAL=82, JOIN=83, FULL=84, INNER=85, OUTER=86, LEFT=87, RIGHT=88, 
		CROSS=89, USING=90, WHERE=91, AS=92, ON=93, IF=94, ELSE=95, THEN=96, FOR=97, 
		TO=98, AND=99, OR=100, IS=101, NOT=102, NULL=103, TRUE=104, FALSE=105, 
		EXISTS=106, BETWEEN=107, IN=108, ALL=109, ANY=110, LIKE=111, ORDER=112, 
		GROUP=113, BY=114, ASC=115, DESC=116, HAVING=117, LIMIT=118, OFFSET=119, 
		BEGIN=120, COMMIT=121, ROLLBACK=122, SAVEPOINT=123, BOOLEAN=124, DOUBLE=125, 
		CHAR=126, CHARACTER=127, ARRAY=128, INTERVAL=129, DATE=130, TIME=131, 
		TIMESTAMP=132, LOCALTIME=133, LOCALTIMESTAMP=134, YEAR=135, QUARTER=136, 
		MONTH=137, WEEK=138, DAY=139, HOUR=140, MINUTE=141, SECOND=142, MICROSECOND=143, 
		MAX=144, MIN=145, SUM=146, COUNT=147, AVG=148, DEFAULT=149, CURRENT=150, 
		ENABLE=151, DISABLE=152, CALL=153, INSTANCE=154, PRESERVE=155, DO=156, 
		DEFINER=157, CURRENT_USER=158, SQL=159, CASCADED=160, LOCAL=161, CLOSE=162, 
		OPEN=163, NEXT=164, NAME=165, COLLATION=166, NAMES=167, INTEGER=168, REAL=169, 
		DECIMAL=170, TYPE=171, VARCHAR=172, FLOAT=173, FOR_GENERATOR=174, ADA=175, 
		C92=176, CATALOG_NAME=177, CHARACTER_SET_CATALOG=178, CHARACTER_SET_NAME=179, 
		CHARACTER_SET_SCHEMA=180, CLASS_ORIGIN=181, COBOL=182, COLLATION_CATALOG=183, 
		COLLATION_NAME=184, COLLATION_SCHEMA=185, COLUMN_NAME=186, COMMAND_FUNCTION=187, 
		COMMITTED=188, CONDITION_NUMBER=189, CONNECTION_NAME=190, CONSTRAINT_CATALOG=191, 
		CONSTRAINT_NAME=192, CONSTRAINT_SCHEMA=193, CURSOR_NAME=194, DATA=195, 
		DATETIME_INTERVAL_CODE=196, DATETIME_INTERVAL_PRECISION=197, DYNAMIC_FUNCTION=198, 
		FORTRAN=199, LENGTH=200, MESSAGE_LENGTH=201, MESSAGE_OCTET_LENGTH=202, 
		MESSAGE_TEXT=203, MORE92=204, MUMPS=205, NULLABLE=206, NUMBER=207, PASCAL=208, 
		PLI=209, REPEATABLE=210, RETURNED_LENGTH=211, RETURNED_OCTET_LENGTH=212, 
		RETURNED_SQLSTATE=213, ROW_COUNT=214, SCALE=215, SCHEMA_NAME=216, SERIALIZABLE=217, 
		SERVER_NAME=218, SUBCLASS_ORIGIN=219, TABLE_NAME=220, UNCOMMITTED=221, 
		UNNAMED=222, ABSOLUTE=223, ACTION=224, ALLOCATE=225, ARE=226, ASSERTION=227, 
		AT=228, AUTHORIZATION=229, BIT=230, BIT_LENGTH=231, BOTH=232, CASCADE=233, 
		CATALOG=234, CHAR_LENGTH=235, CHARACTER_LENGTH=236, CHECK=237, COALESCE=238, 
		COLLATE=239, CONNECT=240, CONNECTION=241, CONSTRAINTS=242, CONTINUE=243, 
		CONVERT=244, CORRESPONDING=245, CURRENT_DATE=246, CURRENT_TIME=247, CURRENT_TIMESTAMP=248, 
		CURSOR=249, DEALLOCATE=250, DEC=251, DECLARE=252, DEFERRABLE=253, DEFERRED=254, 
		DESCRIBE=255, DESCRIPTOR=256, DIAGNOSTICS=257, DISCONNECT=258, DOMAIN=259, 
		END=260, END_EXEC=261, ESCAPE=262, EXCEPT=263, EXCEPTION=264, EXEC=265, 
		EXECUTE=266, EXTERNAL=267, EXTRACT=268, FETCH=269, FIRST=270, FOUND=271, 
		GET=272, GLOBAL=273, GO=274, GOTO=275, IDENTITY=276, IMMEDIATE=277, INDICATOR=278, 
		INITIALLY=279, INPUT=280, INSENSITIVE=281, INTERSECT=282, ISOLATION=283, 
		LANGUAGE=284, LAST=285, LEADING=286, LEVEL=287, LOWER=288, MATCH=289, 
		MODULE=290, NATIONAL=291, NCHAR=292, NO=293, NULLIF=294, NUMERIC=295, 
		OCTET_LENGTH=296, OF=297, ONLY=298, OPTION=299, OUTPUT=300, OVERLAPS=301, 
		PAD=302, PARTIAL=303, PREPARE=304, PRIOR=305, PRIVILEGES=306, PUBLIC=307, 
		READ=308, REFERENCES=309, RELATIVE=310, RESTRICT=311, ROWS=312, SCROLL=313, 
		SECTION=314, SESSION=315, SESSION_USER=316, SIZE=317, SMALLINT=318, SOME=319, 
		SPACE=320, SQLCODE=321, SQLERROR=322, SQLSTATE=323, SYSTEM_USER=324, TEMPORARY=325, 
		TIMEZONE_HOUR=326, TIMEZONE_MINUTE=327, TRAILING=328, TRANSACTION=329, 
		TRANSLATE=330, TRANSLATION=331, UNKNOWN=332, UPPER=333, USAGE=334, USER=335, 
		VALUE=336, VARYING=337, WHENEVER=338, WORK=339, WRITE=340, ZONE=341, ENDING=342, 
		SECURITY=343, INVOKER=344, RECURSIVE=345, ROW=346, RETURNS=347, DETERMINISTIC=348, 
		ENGINE=349, SECIRITY=350, VARIABLE=351, RETURN=352, AUTHID=353, OWNER=354, 
		CALLER=355, ROW_NUMBER=356, RANK=357, DENSE_RANK=358, LEAD=359, LAG=360, 
		FIRST_VALUE=361, LAST_VALUE=362, NTH_VALUE=363, PARTITION=364, OVER=365, 
		GENERATED=366, ALWAYS=367, COMPUTED=368, RESTART=369, SEQUENCE=370, INCREMENT=371, 
		SENSITIVE=372, ACCENT=373, DISABLE_COMPRESSIONS=374, DISABLE_EXPANSIONS=375, 
		ICU_VERSION=376, MULTI_LEVEL=377, NUMERIC_SORT=378, SPECIALS_FIRST=379, 
		LOCALE=380, STARTING=381, MERGE=382, RETURNING=383, MATCHED=384, PASSWORD=385, 
		FIRSTNAME=386, MIDDLENAME=387, LASTNAME=388, RETURNING_VALUES=389, ACTIVE=390, 
		INACTIVE=391, PLUGIN=392, TAGS=393, ADMIN=394, BEFORE=395, AFTER=396, 
		BLOCK=397, SUSPEND=398, ROLE=399, START=400, DDL=401, STATEMENT=402, PACKAGE=403, 
		BODY=404, MAPPING=405, GENERATOR=406, WHILE=407, LEAVE=408, FILTER=409, 
		PARAMETER=410, DATABASE=411, COMMENT=412, SIMILAR=413, IDENTIFIER_=414, 
		STRING_=415, NUMBER_=416, HEX_DIGIT_=417, BIT_NUM_=418, CURRENT_CONNECTION=419, 
		CURRENT_ROLE=420, CURRENT_TRANSACTION=421, INSERTING=422, UPDATING=423, 
		DELETING=424, NEW=425, NOW=426, OLD=427, GDSCODE=428, TODAY=429, TOMORROW=430, 
		YESTERDAY=431, DOS850=432, DB_DEU850=433, DB_ESP850=434, DB_FRA850=435, 
		DB_FRC850=436, DB_ITA850=437, DB_NLD850=438, DB_PTB850=439, DB_SVE850=440, 
		DB_UK850=441, DB_US850=442, DOS852=443, DB_CSY=444, DB_PLK=445, DB_SLO=446, 
		PDOX_CSY=447, PDOX_HUN=448, PDOX_PLK=449, PDOX_SLO=450, DOS857=451, DB_TRK=452, 
		DOS858=453, DOS860=454, DB_PTG860=455, DOS861=456, PDOX_IS=457, DOS862=458, 
		DOS863=459, DB_FRC863=460, DOS864=461, DOS865=462, DB_DAN865=463, DB_NOR865=464, 
		PDOX_NORDAN4=465, DOS866=466, DOS869=467, EUCJ_0208=468, GB_2312=469, 
		ISO8859_1=470, DA_DA=471, DE_DE=472, DU_NL=473, EN_UK=474, EN_US=475, 
		ES_ES=476, ES_ES_CI_AI=477, FI_FI=478, FR_CA=479, FR_FR=480, IS_IS=481, 
		IT_IT=482, NO_NO=483, PT_PT=484, PT_BR=485, SV_SV=486, ISO8859_2=487, 
		CS_CZ=488, ISO_HUN=489, ISO_PLK=490, ISO8859_3=491, ISO8859_4=492, ISO8859_5=493, 
		ISO8859_6=494, ISO8859_7=495, ISO8859_8=496, ISO8859_9=497, ISO8859_13=498, 
		LT_LT=499, KOI8R=500, KOI8R_RU=501, KOI8U=502, KOI8R_UA=503, KSC_5601=504, 
		KSC_DIC_TIONAR=505, NXT_DEU=506, NXT_ESP=507, NXT_FRA=508, NXT_ITA=509, 
		NXT_US=510, NONE=511, OCTETS=512, SJIS_0208=513, UNICODE_FSS=514, UTF8=515, 
		USC_BASIC=516, UNICODE=517, WIN1250=518, BS_BA=519, PXW_CSY=520, PXW_HUN=521, 
		PXW_HUNDC=522, PXW_PLK=523, PXW_SLOV=524, WIN_CZ=525, WIN_CZ_CI_AI=526, 
		WIN1251=527, WIN1251_UA=528, PXW_CYRL=529, WIN1252=530, PXW_INTL=531, 
		PXW_INTL850=532, PXW_NORDAN4=533, PXW_SPAN=534, PXW_SWEDFIN=535, WIN_PTBR=536, 
		WIN1253=537, PXW_GREEK=538, WIN1254=539, PXW_TURK=540, WIN1255=541, WIN1256=542, 
		WIN1257=543, WIN1257_EE=544, WIN1257_LT=545, WIN1257_LV=546, WIN1258=547;
	public static final int
		RULE_execute = 0, RULE_createTable = 1, RULE_createCollation = 2, RULE_fromCollationClause = 3, 
		RULE_paddingClause = 4, RULE_caseSensitivityClause = 5, RULE_accentSensitivityClause = 6, 
		RULE_attributeClause = 7, RULE_createDomain = 8, RULE_defaultClause = 9, 
		RULE_notNullClause = 10, RULE_checkClause = 11, RULE_characterSetClause = 12, 
		RULE_alterTable = 13, RULE_alterSequence = 14, RULE_createSequence = 15, 
		RULE_alterDomain = 16, RULE_toTableClause = 17, RULE_defaultAlterDomainClause = 18, 
		RULE_notNullAlterDomainClause = 19, RULE_constraintClause = 20, RULE_typeClause = 21, 
		RULE_dropTable = 22, RULE_createFunction = 23, RULE_statementBlock = 24, 
		RULE_statement = 25, RULE_cursorOpenStatement = 26, RULE_cursorCloseStatement = 27, 
		RULE_announcementClause = 28, RULE_announcement = 29, RULE_localVariableOrCursorAnnouncement = 30, 
		RULE_procedureAnnouncement = 31, RULE_functioneAnnouncement = 32, RULE_inputArgument = 33, 
		RULE_inputArgumentClause = 34, RULE_createDatabase = 35, RULE_dropDatabase = 36, 
		RULE_createView = 37, RULE_viewAliasClause = 38, RULE_viewAlias = 39, 
		RULE_dropView = 40, RULE_createTemporaryTable = 41, RULE_sqlSecurity = 42, 
		RULE_createDefinitionClause = 43, RULE_sequenceRestartClause = 44, RULE_sequenceIncrementClause = 45, 
		RULE_createDatabaseSpecification_ = 46, RULE_createDefinition = 47, RULE_columnDefinition = 48, 
		RULE_dataTypeOption = 49, RULE_checkConstraintDefinition = 50, RULE_referenceDefinition = 51, 
		RULE_referenceOption = 52, RULE_usingDefinition = 53, RULE_constraintDefinition = 54, 
		RULE_primaryKeyOption = 55, RULE_primaryKey = 56, RULE_uniqueOption = 57, 
		RULE_foreignKeyOption = 58, RULE_createLikeClause = 59, RULE_alterDefinitionClause = 60, 
		RULE_addColumnSpecification = 61, RULE_modifyColumnSpecification = 62, 
		RULE_modifyColumn = 63, RULE_dropColumnSpecification = 64, RULE_addConstraintSpecification = 65, 
		RULE_dropConstraintSpecification = 66, RULE_returnStatement = 67, RULE_createProcedure = 68, 
		RULE_alterProcedure = 69, RULE_procedureClause = 70, RULE_executeStmt = 71, 
		RULE_executeProcedure = 72, RULE_exprClause = 73, RULE_returningValuesClause = 74, 
		RULE_createTrigger = 75, RULE_alterTrigger = 76, RULE_announcmentTriggerClause = 77, 
		RULE_triggerClause = 78, RULE_announcmentTableTrigger = 79, RULE_eventListTable = 80, 
		RULE_listDDLStatement = 81, RULE_dmlStatement = 82, RULE_ddlStatement = 83, 
		RULE_announcmentTableTriggerSQL_2003Standart = 84, RULE_announcmentDataBaseTrigger = 85, 
		RULE_eventConnectOrTransaction = 86, RULE_announcmentDDLTrigger = 87, 
		RULE_executeBlock = 88, RULE_inputArgumentList = 89, RULE_outputArgumentList = 90, 
		RULE_assignmentStatement = 91, RULE_transferStatement = 92, RULE_whileStatement = 93, 
		RULE_fetchStatement = 94, RULE_ifStatement = 95, RULE_compoundStatement = 96, 
		RULE_beginStatement = 97, RULE_leaveStatement = 98, RULE_comment = 99, 
		RULE_baseTypeComment = 100, RULE_insert = 101, RULE_insertValuesClause = 102, 
		RULE_insertSelectClause = 103, RULE_update = 104, RULE_assignment = 105, 
		RULE_setAssignmentsClause = 106, RULE_assignmentValues = 107, RULE_assignmentValue = 108, 
		RULE_blobValue = 109, RULE_delete = 110, RULE_singleTableClause = 111, 
		RULE_select = 112, RULE_combineClause = 113, RULE_selectClause = 114, 
		RULE_selectSpecification = 115, RULE_duplicateSpecification = 116, RULE_projections = 117, 
		RULE_projection = 118, RULE_alias = 119, RULE_unqualifiedShorthand = 120, 
		RULE_qualifiedShorthand = 121, RULE_fromClause = 122, RULE_tableReferences = 123, 
		RULE_escapedTableReference = 124, RULE_tableReference = 125, RULE_tableFactor = 126, 
		RULE_joinedTable = 127, RULE_joinSpecification = 128, RULE_whereClause = 129, 
		RULE_groupByClause = 130, RULE_havingClause = 131, RULE_subquery = 132, 
		RULE_withClause = 133, RULE_cteClause = 134, RULE_merge = 135, RULE_intoClause = 136, 
		RULE_usingClause = 137, RULE_mergeWhen = 138, RULE_mergeWhenMatched = 139, 
		RULE_mergeWhenNotMatched = 140, RULE_returnExpr = 141, RULE_returnExprListClause = 142, 
		RULE_variableList = 143, RULE_variableListClause = 144, RULE_parameterMarker = 145, 
		RULE_literals = 146, RULE_stringLiterals = 147, RULE_numberLiterals = 148, 
		RULE_dateTimeLiterals = 149, RULE_hexadecimalLiterals = 150, RULE_bitValueLiterals = 151, 
		RULE_booleanLiterals = 152, RULE_nullValueLiterals = 153, RULE_identifier = 154, 
		RULE_unreservedWord = 155, RULE_variable = 156, RULE_schemaName = 157, 
		RULE_savepointName = 158, RULE_variableName = 159, RULE_domainName = 160, 
		RULE_packageName = 161, RULE_tableName = 162, RULE_parameterName = 163, 
		RULE_collationName = 164, RULE_attributeName = 165, RULE_login = 166, 
		RULE_password = 167, RULE_roleName = 168, RULE_columnName = 169, RULE_viewName = 170, 
		RULE_functionName = 171, RULE_triggerName = 172, RULE_argumentName = 173, 
		RULE_owner = 174, RULE_engineName = 175, RULE_information = 176, RULE_localVariableDeclarationName = 177, 
		RULE_baseSortName = 178, RULE_constraintName = 179, RULE_externalModuleName = 180, 
		RULE_cursorName = 181, RULE_procedureName = 182, RULE_name = 183, RULE_columnNames = 184, 
		RULE_tableNames = 185, RULE_characterSetName = 186, RULE_expr = 187, RULE_andOperator = 188, 
		RULE_orOperator = 189, RULE_notOperator = 190, RULE_booleanPrimary = 191, 
		RULE_comparisonOperator = 192, RULE_predicate = 193, RULE_bitExpr = 194, 
		RULE_simpleExpr = 195, RULE_functionCall = 196, RULE_aggregationFunction = 197, 
		RULE_aggregationFunctionName = 198, RULE_distinct = 199, RULE_specialFunction = 200, 
		RULE_castFunction = 201, RULE_convertFunction = 202, RULE_positionFunction = 203, 
		RULE_substringFunction = 204, RULE_extractFunction = 205, RULE_trimFunction = 206, 
		RULE_regularFunction = 207, RULE_regularFunctionName = 208, RULE_timeConstants = 209, 
		RULE_matchExpression = 210, RULE_caseExpression = 211, RULE_caseWhen = 212, 
		RULE_caseElse = 213, RULE_intervalExpression = 214, RULE_intervalUnit = 215, 
		RULE_orderByClause = 216, RULE_orderByItem = 217, RULE_limitClause = 218, 
		RULE_rowsClause = 219, RULE_offsetDefinition = 220, RULE_offsetClause = 221, 
		RULE_fetchClause = 222, RULE_limitRowCount = 223, RULE_limitOffset = 224, 
		RULE_dataType = 225, RULE_dataTypeName = 226, RULE_dataTypeLength = 227, 
		RULE_characterSet = 228, RULE_collateClause = 229, RULE_ignoredIdentifier = 230, 
		RULE_dropBehaviour = 231, RULE_windowFunction = 232, RULE_overClause = 233, 
		RULE_attributeCollation = 234, RULE_attributeCollationName = 235, RULE_defaultValue = 236, 
		RULE_contextVariables = 237, RULE_announcementArgument = 238, RULE_announcementArgumentClause = 239, 
		RULE_typeDescriptionArgument = 240, RULE_externalModule = 241, RULE_sortOrder = 242, 
		RULE_attribute = 243, RULE_bindLiterals = 244, RULE_setTransaction = 245, 
		RULE_commit = 246, RULE_rollback = 247, RULE_levelOfIsolation = 248, RULE_savepoint = 249, 
		RULE_grant = 250, RULE_revoke = 251, RULE_privilegeClause = 252, RULE_privileges = 253, 
		RULE_privilegeType = 254, RULE_grantee = 255, RULE_onObjectClause = 256, 
		RULE_objectType = 257, RULE_objectRecepient = 258, RULE_userRecepient = 259, 
		RULE_privilegeLevel = 260, RULE_createRole = 261, RULE_createUser = 262, 
		RULE_firstNameClause = 263, RULE_middleNameClause = 264, RULE_lastNameClause = 265, 
		RULE_activeClause = 266, RULE_usingPluginClause = 267, RULE_tagsAttributeClause = 268, 
		RULE_grantAdminRoleClause = 269;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "createTable", "createCollation", "fromCollationClause", "paddingClause", 
			"caseSensitivityClause", "accentSensitivityClause", "attributeClause", 
			"createDomain", "defaultClause", "notNullClause", "checkClause", "characterSetClause", 
			"alterTable", "alterSequence", "createSequence", "alterDomain", "toTableClause", 
			"defaultAlterDomainClause", "notNullAlterDomainClause", "constraintClause", 
			"typeClause", "dropTable", "createFunction", "statementBlock", "statement", 
			"cursorOpenStatement", "cursorCloseStatement", "announcementClause", 
			"announcement", "localVariableOrCursorAnnouncement", "procedureAnnouncement", 
			"functioneAnnouncement", "inputArgument", "inputArgumentClause", "createDatabase", 
			"dropDatabase", "createView", "viewAliasClause", "viewAlias", "dropView", 
			"createTemporaryTable", "sqlSecurity", "createDefinitionClause", "sequenceRestartClause", 
			"sequenceIncrementClause", "createDatabaseSpecification_", "createDefinition", 
			"columnDefinition", "dataTypeOption", "checkConstraintDefinition", "referenceDefinition", 
			"referenceOption", "usingDefinition", "constraintDefinition", "primaryKeyOption", 
			"primaryKey", "uniqueOption", "foreignKeyOption", "createLikeClause", 
			"alterDefinitionClause", "addColumnSpecification", "modifyColumnSpecification", 
			"modifyColumn", "dropColumnSpecification", "addConstraintSpecification", 
			"dropConstraintSpecification", "returnStatement", "createProcedure", 
			"alterProcedure", "procedureClause", "executeStmt", "executeProcedure", 
			"exprClause", "returningValuesClause", "createTrigger", "alterTrigger", 
			"announcmentTriggerClause", "triggerClause", "announcmentTableTrigger", 
			"eventListTable", "listDDLStatement", "dmlStatement", "ddlStatement", 
			"announcmentTableTriggerSQL_2003Standart", "announcmentDataBaseTrigger", 
			"eventConnectOrTransaction", "announcmentDDLTrigger", "executeBlock", 
			"inputArgumentList", "outputArgumentList", "assignmentStatement", "transferStatement", 
			"whileStatement", "fetchStatement", "ifStatement", "compoundStatement", 
			"beginStatement", "leaveStatement", "comment", "baseTypeComment", "insert", 
			"insertValuesClause", "insertSelectClause", "update", "assignment", "setAssignmentsClause", 
			"assignmentValues", "assignmentValue", "blobValue", "delete", "singleTableClause", 
			"select", "combineClause", "selectClause", "selectSpecification", "duplicateSpecification", 
			"projections", "projection", "alias", "unqualifiedShorthand", "qualifiedShorthand", 
			"fromClause", "tableReferences", "escapedTableReference", "tableReference", 
			"tableFactor", "joinedTable", "joinSpecification", "whereClause", "groupByClause", 
			"havingClause", "subquery", "withClause", "cteClause", "merge", "intoClause", 
			"usingClause", "mergeWhen", "mergeWhenMatched", "mergeWhenNotMatched", 
			"returnExpr", "returnExprListClause", "variableList", "variableListClause", 
			"parameterMarker", "literals", "stringLiterals", "numberLiterals", "dateTimeLiterals", 
			"hexadecimalLiterals", "bitValueLiterals", "booleanLiterals", "nullValueLiterals", 
			"identifier", "unreservedWord", "variable", "schemaName", "savepointName", 
			"variableName", "domainName", "packageName", "tableName", "parameterName", 
			"collationName", "attributeName", "login", "password", "roleName", "columnName", 
			"viewName", "functionName", "triggerName", "argumentName", "owner", "engineName", 
			"information", "localVariableDeclarationName", "baseSortName", "constraintName", 
			"externalModuleName", "cursorName", "procedureName", "name", "columnNames", 
			"tableNames", "characterSetName", "expr", "andOperator", "orOperator", 
			"notOperator", "booleanPrimary", "comparisonOperator", "predicate", "bitExpr", 
			"simpleExpr", "functionCall", "aggregationFunction", "aggregationFunctionName", 
			"distinct", "specialFunction", "castFunction", "convertFunction", "positionFunction", 
			"substringFunction", "extractFunction", "trimFunction", "regularFunction", 
			"regularFunctionName", "timeConstants", "matchExpression", "caseExpression", 
			"caseWhen", "caseElse", "intervalExpression", "intervalUnit", "orderByClause", 
			"orderByItem", "limitClause", "rowsClause", "offsetDefinition", "offsetClause", 
			"fetchClause", "limitRowCount", "limitOffset", "dataType", "dataTypeName", 
			"dataTypeLength", "characterSet", "collateClause", "ignoredIdentifier", 
			"dropBehaviour", "windowFunction", "overClause", "attributeCollation", 
			"attributeCollationName", "defaultValue", "contextVariables", "announcementArgument", 
			"announcementArgumentClause", "typeDescriptionArgument", "externalModule", 
			"sortOrder", "attribute", "bindLiterals", "setTransaction", "commit", 
			"rollback", "levelOfIsolation", "savepoint", "grant", "revoke", "privilegeClause", 
			"privileges", "privilegeType", "grantee", "onObjectClause", "objectType", 
			"objectRecepient", "userRecepient", "privilegeLevel", "createRole", "createUser", 
			"firstNameClause", "middleNameClause", "lastNameClause", "activeClause", 
			"usingPluginClause", "tagsAttributeClause", "grantAdminRoleClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", 
			"'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", 
			"'.*'", "'<=>'", "'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'?'", 
			"'@'", "';'", "'--'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLOCK_COMMENT", "INLINE_COMMENT", "AND_", "CONCAT_", "NOT_", "TILDE_", 
			"VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", 
			"CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", "ASTERISK_", "SLASH_", 
			"BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", 
			"GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", "RP_", "LBE_", "RBE_", 
			"LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "QUESTION_", "AT_", "SEMI_", 
			"COMMENT_", "WS", "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "ALTER", 
			"DROP", "TRUNCATE", "SCHEMA", "GRANT", "REVOKE", "ADD", "SET", "TABLE", 
			"COLUMN", "INDEX", "CONSTRAINT", "PRIMARY", "UNIQUE", "FOREIGN", "KEY", 
			"POSITION", "PRECISION", "FUNCTION", "TRIGGER", "PROCEDURE", "VIEW", 
			"INTO", "VALUES", "WITH", "UNION", "DISTINCT", "CASE", "WHEN", "CAST", 
			"TRIM", "SUBSTRING", "FROM", "NATURAL", "JOIN", "FULL", "INNER", "OUTER", 
			"LEFT", "RIGHT", "CROSS", "USING", "WHERE", "AS", "ON", "IF", "ELSE", 
			"THEN", "FOR", "TO", "AND", "OR", "IS", "NOT", "NULL", "TRUE", "FALSE", 
			"EXISTS", "BETWEEN", "IN", "ALL", "ANY", "LIKE", "ORDER", "GROUP", "BY", 
			"ASC", "DESC", "HAVING", "LIMIT", "OFFSET", "BEGIN", "COMMIT", "ROLLBACK", 
			"SAVEPOINT", "BOOLEAN", "DOUBLE", "CHAR", "CHARACTER", "ARRAY", "INTERVAL", 
			"DATE", "TIME", "TIMESTAMP", "LOCALTIME", "LOCALTIMESTAMP", "YEAR", "QUARTER", 
			"MONTH", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "MICROSECOND", "MAX", 
			"MIN", "SUM", "COUNT", "AVG", "DEFAULT", "CURRENT", "ENABLE", "DISABLE", 
			"CALL", "INSTANCE", "PRESERVE", "DO", "DEFINER", "CURRENT_USER", "SQL", 
			"CASCADED", "LOCAL", "CLOSE", "OPEN", "NEXT", "NAME", "COLLATION", "NAMES", 
			"INTEGER", "REAL", "DECIMAL", "TYPE", "VARCHAR", "FLOAT", "FOR_GENERATOR", 
			"ADA", "C92", "CATALOG_NAME", "CHARACTER_SET_CATALOG", "CHARACTER_SET_NAME", 
			"CHARACTER_SET_SCHEMA", "CLASS_ORIGIN", "COBOL", "COLLATION_CATALOG", 
			"COLLATION_NAME", "COLLATION_SCHEMA", "COLUMN_NAME", "COMMAND_FUNCTION", 
			"COMMITTED", "CONDITION_NUMBER", "CONNECTION_NAME", "CONSTRAINT_CATALOG", 
			"CONSTRAINT_NAME", "CONSTRAINT_SCHEMA", "CURSOR_NAME", "DATA", "DATETIME_INTERVAL_CODE", 
			"DATETIME_INTERVAL_PRECISION", "DYNAMIC_FUNCTION", "FORTRAN", "LENGTH", 
			"MESSAGE_LENGTH", "MESSAGE_OCTET_LENGTH", "MESSAGE_TEXT", "MORE92", "MUMPS", 
			"NULLABLE", "NUMBER", "PASCAL", "PLI", "REPEATABLE", "RETURNED_LENGTH", 
			"RETURNED_OCTET_LENGTH", "RETURNED_SQLSTATE", "ROW_COUNT", "SCALE", "SCHEMA_NAME", 
			"SERIALIZABLE", "SERVER_NAME", "SUBCLASS_ORIGIN", "TABLE_NAME", "UNCOMMITTED", 
			"UNNAMED", "ABSOLUTE", "ACTION", "ALLOCATE", "ARE", "ASSERTION", "AT", 
			"AUTHORIZATION", "BIT", "BIT_LENGTH", "BOTH", "CASCADE", "CATALOG", "CHAR_LENGTH", 
			"CHARACTER_LENGTH", "CHECK", "COALESCE", "COLLATE", "CONNECT", "CONNECTION", 
			"CONSTRAINTS", "CONTINUE", "CONVERT", "CORRESPONDING", "CURRENT_DATE", 
			"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURSOR", "DEALLOCATE", "DEC", "DECLARE", 
			"DEFERRABLE", "DEFERRED", "DESCRIBE", "DESCRIPTOR", "DIAGNOSTICS", "DISCONNECT", 
			"DOMAIN", "END", "END_EXEC", "ESCAPE", "EXCEPT", "EXCEPTION", "EXEC", 
			"EXECUTE", "EXTERNAL", "EXTRACT", "FETCH", "FIRST", "FOUND", "GET", "GLOBAL", 
			"GO", "GOTO", "IDENTITY", "IMMEDIATE", "INDICATOR", "INITIALLY", "INPUT", 
			"INSENSITIVE", "INTERSECT", "ISOLATION", "LANGUAGE", "LAST", "LEADING", 
			"LEVEL", "LOWER", "MATCH", "MODULE", "NATIONAL", "NCHAR", "NO", "NULLIF", 
			"NUMERIC", "OCTET_LENGTH", "OF", "ONLY", "OPTION", "OUTPUT", "OVERLAPS", 
			"PAD", "PARTIAL", "PREPARE", "PRIOR", "PRIVILEGES", "PUBLIC", "READ", 
			"REFERENCES", "RELATIVE", "RESTRICT", "ROWS", "SCROLL", "SECTION", "SESSION", 
			"SESSION_USER", "SIZE", "SMALLINT", "SOME", "SPACE", "SQLCODE", "SQLERROR", 
			"SQLSTATE", "SYSTEM_USER", "TEMPORARY", "TIMEZONE_HOUR", "TIMEZONE_MINUTE", 
			"TRAILING", "TRANSACTION", "TRANSLATE", "TRANSLATION", "UNKNOWN", "UPPER", 
			"USAGE", "USER", "VALUE", "VARYING", "WHENEVER", "WORK", "WRITE", "ZONE", 
			"ENDING", "SECURITY", "INVOKER", "RECURSIVE", "ROW", "RETURNS", "DETERMINISTIC", 
			"ENGINE", "SECIRITY", "VARIABLE", "RETURN", "AUTHID", "OWNER", "CALLER", 
			"ROW_NUMBER", "RANK", "DENSE_RANK", "LEAD", "LAG", "FIRST_VALUE", "LAST_VALUE", 
			"NTH_VALUE", "PARTITION", "OVER", "GENERATED", "ALWAYS", "COMPUTED", 
			"RESTART", "SEQUENCE", "INCREMENT", "SENSITIVE", "ACCENT", "DISABLE_COMPRESSIONS", 
			"DISABLE_EXPANSIONS", "ICU_VERSION", "MULTI_LEVEL", "NUMERIC_SORT", "SPECIALS_FIRST", 
			"LOCALE", "STARTING", "MERGE", "RETURNING", "MATCHED", "PASSWORD", "FIRSTNAME", 
			"MIDDLENAME", "LASTNAME", "RETURNING_VALUES", "ACTIVE", "INACTIVE", "PLUGIN", 
			"TAGS", "ADMIN", "BEFORE", "AFTER", "BLOCK", "SUSPEND", "ROLE", "START", 
			"DDL", "STATEMENT", "PACKAGE", "BODY", "MAPPING", "GENERATOR", "WHILE", 
			"LEAVE", "FILTER", "PARAMETER", "DATABASE", "COMMENT", "SIMILAR", "IDENTIFIER_", 
			"STRING_", "NUMBER_", "HEX_DIGIT_", "BIT_NUM_", "CURRENT_CONNECTION", 
			"CURRENT_ROLE", "CURRENT_TRANSACTION", "INSERTING", "UPDATING", "DELETING", 
			"NEW", "NOW", "OLD", "GDSCODE", "TODAY", "TOMORROW", "YESTERDAY", "DOS850", 
			"DB_DEU850", "DB_ESP850", "DB_FRA850", "DB_FRC850", "DB_ITA850", "DB_NLD850", 
			"DB_PTB850", "DB_SVE850", "DB_UK850", "DB_US850", "DOS852", "DB_CSY", 
			"DB_PLK", "DB_SLO", "PDOX_CSY", "PDOX_HUN", "PDOX_PLK", "PDOX_SLO", "DOS857", 
			"DB_TRK", "DOS858", "DOS860", "DB_PTG860", "DOS861", "PDOX_IS", "DOS862", 
			"DOS863", "DB_FRC863", "DOS864", "DOS865", "DB_DAN865", "DB_NOR865", 
			"PDOX_NORDAN4", "DOS866", "DOS869", "EUCJ_0208", "GB_2312", "ISO8859_1", 
			"DA_DA", "DE_DE", "DU_NL", "EN_UK", "EN_US", "ES_ES", "ES_ES_CI_AI", 
			"FI_FI", "FR_CA", "FR_FR", "IS_IS", "IT_IT", "NO_NO", "PT_PT", "PT_BR", 
			"SV_SV", "ISO8859_2", "CS_CZ", "ISO_HUN", "ISO_PLK", "ISO8859_3", "ISO8859_4", 
			"ISO8859_5", "ISO8859_6", "ISO8859_7", "ISO8859_8", "ISO8859_9", "ISO8859_13", 
			"LT_LT", "KOI8R", "KOI8R_RU", "KOI8U", "KOI8R_UA", "KSC_5601", "KSC_DIC_TIONAR", 
			"NXT_DEU", "NXT_ESP", "NXT_FRA", "NXT_ITA", "NXT_US", "NONE", "OCTETS", 
			"SJIS_0208", "UNICODE_FSS", "UTF8", "USC_BASIC", "UNICODE", "WIN1250", 
			"BS_BA", "PXW_CSY", "PXW_HUN", "PXW_HUNDC", "PXW_PLK", "PXW_SLOV", "WIN_CZ", 
			"WIN_CZ_CI_AI", "WIN1251", "WIN1251_UA", "PXW_CYRL", "WIN1252", "PXW_INTL", 
			"PXW_INTL850", "PXW_NORDAN4", "PXW_SPAN", "PXW_SWEDFIN", "WIN_PTBR", 
			"WIN1253", "PXW_GREEK", "WIN1254", "PXW_TURK", "WIN1255", "WIN1256", 
			"WIN1257", "WIN1257_EE", "WIN1257_LT", "WIN1257_LV", "WIN1258"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FirebirdStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FirebirdStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FirebirdStatementParser.EOF, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CreateDatabaseContext createDatabase() {
			return getRuleContext(CreateDatabaseContext.class,0);
		}
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public CreateViewContext createView() {
			return getRuleContext(CreateViewContext.class,0);
		}
		public DropViewContext dropView() {
			return getRuleContext(DropViewContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public CreateFunctionContext createFunction() {
			return getRuleContext(CreateFunctionContext.class,0);
		}
		public CreateProcedureContext createProcedure() {
			return getRuleContext(CreateProcedureContext.class,0);
		}
		public AlterSequenceContext alterSequence() {
			return getRuleContext(AlterSequenceContext.class,0);
		}
		public CreateCollationContext createCollation() {
			return getRuleContext(CreateCollationContext.class,0);
		}
		public CreateDomainContext createDomain() {
			return getRuleContext(CreateDomainContext.class,0);
		}
		public AlterDomainContext alterDomain() {
			return getRuleContext(AlterDomainContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public SavepointContext savepoint() {
			return getRuleContext(SavepointContext.class,0);
		}
		public CreateTriggerContext createTrigger() {
			return getRuleContext(CreateTriggerContext.class,0);
		}
		public AlterTriggerContext alterTrigger() {
			return getRuleContext(AlterTriggerContext.class,0);
		}
		public CreateSequenceContext createSequence() {
			return getRuleContext(CreateSequenceContext.class,0);
		}
		public MergeContext merge() {
			return getRuleContext(MergeContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public ExecuteStmtContext executeStmt() {
			return getRuleContext(ExecuteStmtContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(540);
				select();
				}
				break;
			case 2:
				{
				setState(541);
				insert();
				}
				break;
			case 3:
				{
				setState(542);
				update();
				}
				break;
			case 4:
				{
				setState(543);
				delete();
				}
				break;
			case 5:
				{
				setState(544);
				createDatabase();
				}
				break;
			case 6:
				{
				setState(545);
				dropDatabase();
				}
				break;
			case 7:
				{
				setState(546);
				createTable();
				}
				break;
			case 8:
				{
				setState(547);
				alterTable();
				}
				break;
			case 9:
				{
				setState(548);
				dropTable();
				}
				break;
			case 10:
				{
				setState(549);
				createView();
				}
				break;
			case 11:
				{
				setState(550);
				dropView();
				}
				break;
			case 12:
				{
				setState(551);
				setTransaction();
				}
				break;
			case 13:
				{
				setState(552);
				commit();
				}
				break;
			case 14:
				{
				setState(553);
				rollback();
				}
				break;
			case 15:
				{
				setState(554);
				grant();
				}
				break;
			case 16:
				{
				setState(555);
				revoke();
				}
				break;
			case 17:
				{
				setState(556);
				createFunction();
				}
				break;
			case 18:
				{
				setState(557);
				createProcedure();
				}
				break;
			case 19:
				{
				setState(558);
				alterSequence();
				}
				break;
			case 20:
				{
				setState(559);
				createCollation();
				}
				break;
			case 21:
				{
				setState(560);
				createDomain();
				}
				break;
			case 22:
				{
				setState(561);
				alterDomain();
				}
				break;
			case 23:
				{
				setState(562);
				createRole();
				}
				break;
			case 24:
				{
				setState(563);
				savepoint();
				}
				break;
			case 25:
				{
				setState(564);
				createTrigger();
				}
				break;
			case 26:
				{
				setState(565);
				alterTrigger();
				}
				break;
			case 27:
				{
				setState(566);
				createSequence();
				}
				break;
			case 28:
				{
				setState(567);
				merge();
				}
				break;
			case 29:
				{
				setState(568);
				createUser();
				}
				break;
			case 30:
				{
				setState(569);
				executeStmt();
				}
				break;
			case 31:
				{
				setState(570);
				comment();
				}
				break;
			}
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(573);
				match(SEMI_);
				}
			}

			setState(576);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(FirebirdStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionClauseContext createDefinitionClause() {
			return getRuleContext(CreateDefinitionClauseContext.class,0);
		}
		public CreateTemporaryTableContext createTemporaryTable() {
			return getRuleContext(CreateTemporaryTableContext.class,0);
		}
		public SqlSecurityContext sqlSecurity() {
			return getRuleContext(SqlSecurityContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(CREATE);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(579);
				createTemporaryTable();
				}
			}

			setState(582);
			match(TABLE);
			setState(583);
			tableName();
			setState(584);
			createDefinitionClause();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQL) {
				{
				setState(585);
				sqlSecurity();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateCollationContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode COLLATION() { return getToken(FirebirdStatementParser.COLLATION, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode FOR() { return getToken(FirebirdStatementParser.FOR, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public FromCollationClauseContext fromCollationClause() {
			return getRuleContext(FromCollationClauseContext.class,0);
		}
		public PaddingClauseContext paddingClause() {
			return getRuleContext(PaddingClauseContext.class,0);
		}
		public CaseSensitivityClauseContext caseSensitivityClause() {
			return getRuleContext(CaseSensitivityClauseContext.class,0);
		}
		public AccentSensitivityClauseContext accentSensitivityClause() {
			return getRuleContext(AccentSensitivityClauseContext.class,0);
		}
		public AttributeClauseContext attributeClause() {
			return getRuleContext(AttributeClauseContext.class,0);
		}
		public CreateCollationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCollation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateCollation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateCollation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateCollation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateCollationContext createCollation() throws RecognitionException {
		CreateCollationContext _localctx = new CreateCollationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createCollation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(CREATE);
			setState(589);
			match(COLLATION);
			setState(590);
			collationName();
			setState(591);
			match(FOR);
			setState(592);
			characterSetName();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(593);
				fromCollationClause();
				}
			}

			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO || _la==PAD) {
				{
				setState(596);
				paddingClause();
				}
			}

			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(599);
				caseSensitivityClause();
				}
			}

			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCENT) {
				{
				setState(602);
				accentSensitivityClause();
				}
			}

			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQ_) {
				{
				setState(605);
				attributeClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromCollationClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public BaseSortNameContext baseSortName() {
			return getRuleContext(BaseSortNameContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(FirebirdStatementParser.EXTERNAL, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public FromCollationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromCollationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterFromCollationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitFromCollationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitFromCollationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromCollationClauseContext fromCollationClause() throws RecognitionException {
		FromCollationClauseContext _localctx = new FromCollationClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fromCollationClause);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(FROM);
				setState(609);
				baseSortName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(FROM);
				setState(611);
				match(EXTERNAL);
				setState(612);
				match(LP_);
				setState(613);
				match(STRING_);
				setState(614);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PaddingClauseContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(FirebirdStatementParser.NO, 0); }
		public TerminalNode PAD() { return getToken(FirebirdStatementParser.PAD, 0); }
		public TerminalNode SPACE() { return getToken(FirebirdStatementParser.SPACE, 0); }
		public PaddingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paddingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPaddingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPaddingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPaddingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingClauseContext paddingClause() throws RecognitionException {
		PaddingClauseContext _localctx = new PaddingClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paddingClause);
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				match(NO);
				setState(618);
				match(PAD);
				}
				break;
			case PAD:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(PAD);
				setState(620);
				match(SPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseSensitivityClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FirebirdStatementParser.CASE, 0); }
		public TerminalNode SENSITIVE() { return getToken(FirebirdStatementParser.SENSITIVE, 0); }
		public TerminalNode INSENSITIVE() { return getToken(FirebirdStatementParser.INSENSITIVE, 0); }
		public CaseSensitivityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseSensitivityClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCaseSensitivityClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCaseSensitivityClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCaseSensitivityClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseSensitivityClauseContext caseSensitivityClause() throws RecognitionException {
		CaseSensitivityClauseContext _localctx = new CaseSensitivityClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_caseSensitivityClause);
		try {
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(CASE);
				setState(624);
				match(SENSITIVE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(CASE);
				setState(626);
				match(INSENSITIVE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccentSensitivityClauseContext extends ParserRuleContext {
		public TerminalNode ACCENT() { return getToken(FirebirdStatementParser.ACCENT, 0); }
		public TerminalNode SENSITIVE() { return getToken(FirebirdStatementParser.SENSITIVE, 0); }
		public TerminalNode INSENSITIVE() { return getToken(FirebirdStatementParser.INSENSITIVE, 0); }
		public AccentSensitivityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accentSensitivityClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAccentSensitivityClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAccentSensitivityClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAccentSensitivityClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccentSensitivityClauseContext accentSensitivityClause() throws RecognitionException {
		AccentSensitivityClauseContext _localctx = new AccentSensitivityClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accentSensitivityClause);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(ACCENT);
				setState(630);
				match(SENSITIVE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(ACCENT);
				setState(632);
				match(INSENSITIVE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeClauseContext extends ParserRuleContext {
		public List<AttributeCollationContext> attributeCollation() {
			return getRuleContexts(AttributeCollationContext.class);
		}
		public AttributeCollationContext attributeCollation(int i) {
			return getRuleContext(AttributeCollationContext.class,i);
		}
		public List<TerminalNode> SEMI_() { return getTokens(FirebirdStatementParser.SEMI_); }
		public TerminalNode SEMI_(int i) {
			return getToken(FirebirdStatementParser.SEMI_, i);
		}
		public AttributeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAttributeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAttributeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAttributeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeClauseContext attributeClause() throws RecognitionException {
		AttributeClauseContext _localctx = new AttributeClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			attributeCollation();
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(636);
					match(SEMI_);
					setState(637);
					attributeCollation();
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDomainContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode DOMAIN() { return getToken(FirebirdStatementParser.DOMAIN, 0); }
		public DomainNameContext domainName() {
			return getRuleContext(DomainNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public NotNullClauseContext notNullClause() {
			return getRuleContext(NotNullClauseContext.class,0);
		}
		public CheckClauseContext checkClause() {
			return getRuleContext(CheckClauseContext.class,0);
		}
		public CharacterSetClauseContext characterSetClause() {
			return getRuleContext(CharacterSetClauseContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public CreateDomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDomain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDomainContext createDomain() throws RecognitionException {
		CreateDomainContext _localctx = new CreateDomainContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createDomain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(CREATE);
			setState(644);
			match(DOMAIN);
			setState(645);
			domainName();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(646);
				match(AS);
				}
			}

			setState(649);
			dataType();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(650);
				defaultClause();
				}
			}

			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(653);
				notNullClause();
				}
			}

			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECK) {
				{
				setState(656);
				checkClause();
				}
			}

			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(659);
				characterSetClause();
				}
			}

			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(662);
				collateClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDefaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDefaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(DEFAULT);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4295016448L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 36028797958488071L) != 0) || ((((_la - 214)) & ~0x3f) == 0 && ((1L << (_la - 214)) & 30064771073L) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & 16389L) != 0) || ((((_la - 414)) & ~0x3f) == 0 && ((1L << (_la - 414)) & 262143L) != 0)) {
				{
				setState(666);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotNullClauseContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public NotNullClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNullClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterNotNullClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitNotNullClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitNotNullClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNullClauseContext notNullClause() throws RecognitionException {
		NotNullClauseContext _localctx = new NotNullClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_notNullClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(NOT);
			setState(670);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CheckClauseContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(FirebirdStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public CheckClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCheckClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCheckClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCheckClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckClauseContext checkClause() throws RecognitionException {
		CheckClauseContext _localctx = new CheckClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_checkClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(CHECK);
			setState(673);
			match(LP_);
			setState(674);
			expr(0);
			setState(675);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterSetClauseContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(FirebirdStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public CharacterSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCharacterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCharacterSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCharacterSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSetClauseContext characterSetClause() throws RecognitionException {
		CharacterSetClauseContext _localctx = new CharacterSetClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_characterSetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(CHARACTER);
			setState(678);
			match(SET);
			setState(679);
			characterSetName();
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(680);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(FirebirdStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterDefinitionClauseContext alterDefinitionClause() {
			return getRuleContext(AlterDefinitionClauseContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAlterTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(ALTER);
			setState(684);
			match(TABLE);
			setState(685);
			tableName();
			setState(686);
			alterDefinitionClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterSequenceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public TerminalNode SEQUENCE() { return getToken(FirebirdStatementParser.SEQUENCE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public SequenceRestartClauseContext sequenceRestartClause() {
			return getRuleContext(SequenceRestartClauseContext.class,0);
		}
		public SequenceIncrementClauseContext sequenceIncrementClause() {
			return getRuleContext(SequenceIncrementClauseContext.class,0);
		}
		public AlterSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAlterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAlterSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAlterSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterSequenceContext alterSequence() throws RecognitionException {
		AlterSequenceContext _localctx = new AlterSequenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alterSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(ALTER);
			setState(689);
			match(SEQUENCE);
			setState(690);
			tableName();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTART) {
				{
				setState(691);
				sequenceRestartClause();
				}
			}

			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT) {
				{
				setState(694);
				sequenceIncrementClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateSequenceContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode GENERATOR() { return getToken(FirebirdStatementParser.GENERATOR, 0); }
		public TerminalNode SEQUENCE() { return getToken(FirebirdStatementParser.SEQUENCE, 0); }
		public SequenceRestartClauseContext sequenceRestartClause() {
			return getRuleContext(SequenceRestartClauseContext.class,0);
		}
		public SequenceIncrementClauseContext sequenceIncrementClause() {
			return getRuleContext(SequenceIncrementClauseContext.class,0);
		}
		public CreateSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSequenceContext createSequence() throws RecognitionException {
		CreateSequenceContext _localctx = new CreateSequenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_createSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(CREATE);
			setState(698);
			_la = _input.LA(1);
			if ( !(_la==SEQUENCE || _la==GENERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(699);
			tableName();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTART) {
				{
				setState(700);
				sequenceRestartClause();
				}
			}

			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT) {
				{
				setState(703);
				sequenceIncrementClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterDomainContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public TerminalNode DOMAIN() { return getToken(FirebirdStatementParser.DOMAIN, 0); }
		public DomainNameContext domainName() {
			return getRuleContext(DomainNameContext.class,0);
		}
		public ToTableClauseContext toTableClause() {
			return getRuleContext(ToTableClauseContext.class,0);
		}
		public DefaultAlterDomainClauseContext defaultAlterDomainClause() {
			return getRuleContext(DefaultAlterDomainClauseContext.class,0);
		}
		public NotNullAlterDomainClauseContext notNullAlterDomainClause() {
			return getRuleContext(NotNullAlterDomainClauseContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public TypeClauseContext typeClause() {
			return getRuleContext(TypeClauseContext.class,0);
		}
		public AlterDomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDomain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAlterDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAlterDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAlterDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDomainContext alterDomain() throws RecognitionException {
		AlterDomainContext _localctx = new AlterDomainContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alterDomain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(ALTER);
			setState(707);
			match(DOMAIN);
			setState(708);
			domainName();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(709);
				toTableClause();
				}
			}

			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(712);
				defaultAlterDomainClause();
				}
				break;
			}
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(715);
				notNullAlterDomainClause();
				}
				break;
			}
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DROP || _la==ADD) {
				{
				setState(718);
				constraintClause();
				}
			}

			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(721);
				typeClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ToTableClauseContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(FirebirdStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ToTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toTableClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterToTableClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitToTableClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitToTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToTableClauseContext toTableClause() throws RecognitionException {
		ToTableClauseContext _localctx = new ToTableClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_toTableClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(TO);
			setState(725);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultAlterDomainClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public DefaultAlterDomainClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultAlterDomainClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDefaultAlterDomainClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDefaultAlterDomainClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDefaultAlterDomainClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultAlterDomainClauseContext defaultAlterDomainClause() throws RecognitionException {
		DefaultAlterDomainClauseContext _localctx = new DefaultAlterDomainClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defaultAlterDomainClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(727);
				match(SET);
				setState(728);
				match(DEFAULT);
				setState(729);
				defaultValue();
				}
				break;
			case DROP:
				{
				setState(730);
				match(DROP);
				setState(731);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotNullAlterDomainClauseContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public NotNullAlterDomainClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notNullAlterDomainClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterNotNullAlterDomainClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitNotNullAlterDomainClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitNotNullAlterDomainClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotNullAlterDomainClauseContext notNullAlterDomainClause() throws RecognitionException {
		NotNullAlterDomainClauseContext _localctx = new NotNullAlterDomainClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_notNullAlterDomainClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_la = _input.LA(1);
			if ( !(_la==DROP || _la==SET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(735);
			match(NOT);
			setState(736);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintClauseContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(FirebirdStatementParser.ADD, 0); }
		public TerminalNode CHECK() { return getToken(FirebirdStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(FirebirdStatementParser.CONSTRAINT, 0); }
		public ConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterConstraintClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitConstraintClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitConstraintClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintClauseContext constraintClause() throws RecognitionException {
		ConstraintClauseContext _localctx = new ConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(738);
				match(ADD);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(739);
					match(CONSTRAINT);
					}
				}

				setState(742);
				match(CHECK);
				setState(743);
				match(LP_);
				setState(744);
				expr(0);
				setState(745);
				match(RP_);
				}
				break;
			case DROP:
				{
				setState(747);
				match(DROP);
				setState(748);
				match(CONSTRAINT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeClauseContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(FirebirdStatementParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(FirebirdStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(FirebirdStatementParser.COLLATE, 0); }
		public SortOrderContext sortOrder() {
			return getRuleContext(SortOrderContext.class,0);
		}
		public TypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTypeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTypeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTypeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeClauseContext typeClause() throws RecognitionException {
		TypeClauseContext _localctx = new TypeClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(TYPE);
			setState(752);
			dataType();
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARACTER) {
				{
				setState(753);
				match(CHARACTER);
				setState(754);
				match(SET);
				setState(755);
				literals();
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(756);
					match(COLLATE);
					setState(757);
					sortOrder();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(FirebirdStatementParser.TABLE, 0); }
		public TableNamesContext tableNames() {
			return getRuleContext(TableNamesContext.class,0);
		}
		public DropBehaviourContext dropBehaviour() {
			return getRuleContext(DropBehaviourContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(DROP);
			setState(763);
			match(TABLE);
			setState(764);
			tableNames();
			setState(765);
			dropBehaviour();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateFunctionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(FirebirdStatementParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(FirebirdStatementParser.RETURNS, 0); }
		public TypeDescriptionArgumentContext typeDescriptionArgument() {
			return getRuleContext(TypeDescriptionArgumentContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(FirebirdStatementParser.EXTERNAL, 0); }
		public TerminalNode NAME() { return getToken(FirebirdStatementParser.NAME, 0); }
		public ExternalModuleNameContext externalModuleName() {
			return getRuleContext(ExternalModuleNameContext.class,0);
		}
		public TerminalNode ENGINE() { return getToken(FirebirdStatementParser.ENGINE, 0); }
		public EngineNameContext engineName() {
			return getRuleContext(EngineNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(FirebirdStatementParser.BEGIN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(FirebirdStatementParser.END, 0); }
		public InputArgumentClauseContext inputArgumentClause() {
			return getRuleContext(InputArgumentClauseContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DETERMINISTIC() { return getToken(FirebirdStatementParser.DETERMINISTIC, 0); }
		public TerminalNode SQL() { return getToken(FirebirdStatementParser.SQL, 0); }
		public TerminalNode SECURITY() { return getToken(FirebirdStatementParser.SECURITY, 0); }
		public AnnouncementClauseContext announcementClause() {
			return getRuleContext(AnnouncementClauseContext.class,0);
		}
		public TerminalNode DEFINER() { return getToken(FirebirdStatementParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(FirebirdStatementParser.INVOKER, 0); }
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_createFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(CREATE);
			setState(768);
			match(FUNCTION);
			setState(769);
			functionName();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(770);
				inputArgumentClause();
				}
			}

			setState(773);
			match(RETURNS);
			setState(774);
			typeDescriptionArgument();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(775);
				collateClause();
				}
			}

			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETERMINISTIC) {
				{
				setState(778);
				match(DETERMINISTIC);
				}
			}

			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTERNAL:
				{
				setState(781);
				match(EXTERNAL);
				setState(782);
				match(NAME);
				setState(783);
				externalModuleName();
				setState(784);
				match(ENGINE);
				setState(785);
				engineName();
				}
				break;
			case AS:
			case SQL:
				{
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQL) {
					{
					setState(787);
					match(SQL);
					setState(788);
					match(SECURITY);
					setState(789);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(792);
				match(AS);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION || _la==PROCEDURE || _la==DECLARE) {
					{
					setState(793);
					announcementClause();
					}
				}

				setState(796);
				match(BEGIN);
				setState(797);
				statementBlock();
				setState(798);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI_() { return getTokens(FirebirdStatementParser.SEMI_); }
		public TerminalNode SEMI_(int i) {
			return getToken(FirebirdStatementParser.SEMI_, i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 1125900443713551L) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & 2305843009213686283L) != 0) || _la==EXECUTE || _la==FETCH || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 4619567317775351809L) != 0) || _la==WHILE || _la==IDENTIFIER_) {
				{
				{
				setState(802);
				statement();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_) {
					{
					setState(803);
					match(SEMI_);
					}
				}

				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CursorOpenStatementContext cursorOpenStatement() {
			return getRuleContext(CursorOpenStatementContext.class,0);
		}
		public CursorCloseStatementContext cursorCloseStatement() {
			return getRuleContext(CursorCloseStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public TransferStatementContext transferStatement() {
			return getRuleContext(TransferStatementContext.class,0);
		}
		public FetchStatementContext fetchStatement() {
			return getRuleContext(FetchStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExecuteStmtContext executeStmt() {
			return getRuleContext(ExecuteStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				select();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				insert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				update();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(814);
				delete();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(815);
				returnStatement();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(816);
				cursorOpenStatement();
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(817);
				cursorCloseStatement();
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 8);
				{
				setState(818);
				assignmentStatement();
				}
				break;
			case SUSPEND:
				enterOuterAlt(_localctx, 9);
				{
				setState(819);
				transferStatement();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 10);
				{
				setState(820);
				fetchStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(821);
				whileStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 12);
				{
				setState(822);
				ifStatement();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 13);
				{
				setState(823);
				executeStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CursorOpenStatementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(FirebirdStatementParser.OPEN, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public CursorOpenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorOpenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCursorOpenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCursorOpenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCursorOpenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorOpenStatementContext cursorOpenStatement() throws RecognitionException {
		CursorOpenStatementContext _localctx = new CursorOpenStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cursorOpenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(OPEN);
			setState(827);
			cursorName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CursorCloseStatementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(FirebirdStatementParser.CLOSE, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public CursorCloseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorCloseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCursorCloseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCursorCloseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCursorCloseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorCloseStatementContext cursorCloseStatement() throws RecognitionException {
		CursorCloseStatementContext _localctx = new CursorCloseStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cursorCloseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(CLOSE);
			setState(830);
			cursorName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncementClauseContext extends ParserRuleContext {
		public List<AnnouncementContext> announcement() {
			return getRuleContexts(AnnouncementContext.class);
		}
		public AnnouncementContext announcement(int i) {
			return getRuleContext(AnnouncementContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public AnnouncementClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcementClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncementClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncementClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncementClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncementClauseContext announcementClause() throws RecognitionException {
		AnnouncementClauseContext _localctx = new AnnouncementClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_announcementClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			announcement();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(833);
				match(COMMA_);
				setState(834);
				announcement();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncementContext extends ParserRuleContext {
		public LocalVariableOrCursorAnnouncementContext localVariableOrCursorAnnouncement() {
			return getRuleContext(LocalVariableOrCursorAnnouncementContext.class,0);
		}
		public ProcedureAnnouncementContext procedureAnnouncement() {
			return getRuleContext(ProcedureAnnouncementContext.class,0);
		}
		public FunctioneAnnouncementContext functioneAnnouncement() {
			return getRuleContext(FunctioneAnnouncementContext.class,0);
		}
		public AnnouncementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncementContext announcement() throws RecognitionException {
		AnnouncementContext _localctx = new AnnouncementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_announcement);
		try {
			setState(843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				localVariableOrCursorAnnouncement();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				procedureAnnouncement();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				functioneAnnouncement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableOrCursorAnnouncementContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(FirebirdStatementParser.DECLARE, 0); }
		public LocalVariableDeclarationNameContext localVariableDeclarationName() {
			return getRuleContext(LocalVariableDeclarationNameContext.class,0);
		}
		public TypeDescriptionArgumentContext typeDescriptionArgument() {
			return getRuleContext(TypeDescriptionArgumentContext.class,0);
		}
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(FirebirdStatementParser.CURSOR, 0); }
		public TerminalNode FOR() { return getToken(FirebirdStatementParser.FOR, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode VARIABLE() { return getToken(FirebirdStatementParser.VARIABLE, 0); }
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode SCROLL() { return getToken(FirebirdStatementParser.SCROLL, 0); }
		public TerminalNode NO() { return getToken(FirebirdStatementParser.NO, 0); }
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public LocalVariableOrCursorAnnouncementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableOrCursorAnnouncement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLocalVariableOrCursorAnnouncement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLocalVariableOrCursorAnnouncement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLocalVariableOrCursorAnnouncement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableOrCursorAnnouncementContext localVariableOrCursorAnnouncement() throws RecognitionException {
		LocalVariableOrCursorAnnouncementContext _localctx = new LocalVariableOrCursorAnnouncementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_localVariableOrCursorAnnouncement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(DECLARE);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(846);
				match(VARIABLE);
				}
			}

			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(849);
				localVariableDeclarationName();
				setState(850);
				typeDescriptionArgument();
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(851);
					match(NOT);
					setState(852);
					match(NULL);
					}
				}

				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(855);
					collateClause();
					}
				}

				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_ || _la==DEFAULT) {
					{
					setState(858);
					_la = _input.LA(1);
					if ( !(_la==EQ_ || _la==DEFAULT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(859);
					defaultValue();
					}
				}

				}
				break;
			case 2:
				{
				setState(862);
				cursorName();
				setState(863);
				match(CURSOR);
				setState(864);
				match(FOR);
				setState(868);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCROLL:
					{
					setState(865);
					match(SCROLL);
					}
					break;
				case NO:
					{
					setState(866);
					match(NO);
					setState(867);
					match(SCROLL);
					}
					break;
				case LP_:
					break;
				default:
					break;
				}
				setState(870);
				match(LP_);
				setState(871);
				select();
				setState(872);
				match(RP_);
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_) {
					{
					setState(873);
					match(SEMI_);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureAnnouncementContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(FirebirdStatementParser.PROCEDURE, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public List<InputArgumentClauseContext> inputArgumentClause() {
			return getRuleContexts(InputArgumentClauseContext.class);
		}
		public InputArgumentClauseContext inputArgumentClause(int i) {
			return getRuleContext(InputArgumentClauseContext.class,i);
		}
		public TerminalNode RETURNS() { return getToken(FirebirdStatementParser.RETURNS, 0); }
		public ProcedureAnnouncementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAnnouncement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterProcedureAnnouncement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitProcedureAnnouncement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitProcedureAnnouncement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureAnnouncementContext procedureAnnouncement() throws RecognitionException {
		ProcedureAnnouncementContext _localctx = new ProcedureAnnouncementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_procedureAnnouncement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(PROCEDURE);
			setState(879);
			procedureName();
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(880);
				inputArgumentClause();
				}
			}

			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(883);
				match(RETURNS);
				setState(884);
				inputArgumentClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctioneAnnouncementContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FirebirdStatementParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(FirebirdStatementParser.RETURNS, 0); }
		public TypeDescriptionArgumentContext typeDescriptionArgument() {
			return getRuleContext(TypeDescriptionArgumentContext.class,0);
		}
		public InputArgumentClauseContext inputArgumentClause() {
			return getRuleContext(InputArgumentClauseContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DETERMINISTIC() { return getToken(FirebirdStatementParser.DETERMINISTIC, 0); }
		public FunctioneAnnouncementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioneAnnouncement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterFunctioneAnnouncement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitFunctioneAnnouncement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitFunctioneAnnouncement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioneAnnouncementContext functioneAnnouncement() throws RecognitionException {
		FunctioneAnnouncementContext _localctx = new FunctioneAnnouncementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functioneAnnouncement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(FUNCTION);
			setState(888);
			functionName();
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(889);
				inputArgumentClause();
				}
			}

			setState(892);
			match(RETURNS);
			setState(893);
			typeDescriptionArgument();
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(894);
				collateClause();
				}
			}

			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETERMINISTIC) {
				{
				setState(897);
				match(DETERMINISTIC);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputArgumentContext extends ParserRuleContext {
		public AnnouncementArgumentContext announcementArgument() {
			return getRuleContext(AnnouncementArgumentContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public InputArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterInputArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitInputArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitInputArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArgumentContext inputArgument() throws RecognitionException {
		InputArgumentContext _localctx = new InputArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_inputArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			announcementArgument();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_ || _la==DEFAULT) {
				{
				setState(901);
				_la = _input.LA(1);
				if ( !(_la==EQ_ || _la==DEFAULT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(902);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputArgumentClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<InputArgumentContext> inputArgument() {
			return getRuleContexts(InputArgumentContext.class);
		}
		public InputArgumentContext inputArgument(int i) {
			return getRuleContext(InputArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public InputArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterInputArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitInputArgumentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitInputArgumentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArgumentClauseContext inputArgumentClause() throws RecognitionException {
		InputArgumentClauseContext _localctx = new InputArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inputArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(LP_);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 288230376151710785L) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 7881299347898369L) != 0) || _la==IDENTIFIER_) {
				{
				setState(906);
				inputArgument();
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(907);
					match(COMMA_);
					setState(908);
					inputArgument();
					}
					}
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(916);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDatabaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(FirebirdStatementParser.SCHEMA, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public List<CreateDatabaseSpecification_Context> createDatabaseSpecification_() {
			return getRuleContexts(CreateDatabaseSpecification_Context.class);
		}
		public CreateDatabaseSpecification_Context createDatabaseSpecification_(int i) {
			return getRuleContext(CreateDatabaseSpecification_Context.class,i);
		}
		public CreateDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseContext createDatabase() throws RecognitionException {
		CreateDatabaseContext _localctx = new CreateDatabaseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_createDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(CREATE);
			setState(919);
			match(SCHEMA);
			setState(920);
			schemaName();
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT) {
				{
				{
				setState(921);
				createDatabaseSpecification_();
				}
				}
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropDatabaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(FirebirdStatementParser.SCHEMA, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public DropBehaviourContext dropBehaviour() {
			return getRuleContext(DropBehaviourContext.class,0);
		}
		public DropDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDatabaseContext dropDatabase() throws RecognitionException {
		DropDatabaseContext _localctx = new DropDatabaseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dropDatabase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(DROP);
			setState(928);
			match(SCHEMA);
			setState(929);
			schemaName();
			setState(930);
			dropBehaviour();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewContext extends ParserRuleContext {
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(FirebirdStatementParser.VIEW, 0); }
		public ViewAliasClauseContext viewAliasClause() {
			return getRuleContext(ViewAliasClauseContext.class,0);
		}
		public TerminalNode WITH() { return getToken(FirebirdStatementParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(FirebirdStatementParser.CHECK, 0); }
		public TerminalNode OPTION() { return getToken(FirebirdStatementParser.OPTION, 0); }
		public TerminalNode OR() { return getToken(FirebirdStatementParser.OR, 0); }
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public TerminalNode CASCADED() { return getToken(FirebirdStatementParser.CASCADED, 0); }
		public TerminalNode LOCAL() { return getToken(FirebirdStatementParser.LOCAL, 0); }
		public CreateViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewContext createView() throws RecognitionException {
		CreateViewContext _localctx = new CreateViewContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_createView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(932);
			match(CREATE);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(933);
				match(OR);
				setState(934);
				match(ALTER);
				}
			}

			setState(937);
			match(VIEW);
			}
			setState(939);
			viewName();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(940);
				viewAliasClause();
				}
			}

			setState(943);
			match(AS);
			setState(944);
			select();
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(945);
				match(WITH);
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADED || _la==LOCAL) {
					{
					setState(946);
					_la = _input.LA(1);
					if ( !(_la==CASCADED || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(949);
				match(CHECK);
				setState(950);
				match(OPTION);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewAliasClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<ViewAliasContext> viewAlias() {
			return getRuleContexts(ViewAliasContext.class);
		}
		public ViewAliasContext viewAlias(int i) {
			return getRuleContext(ViewAliasContext.class,i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public ViewAliasClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewAliasClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterViewAliasClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitViewAliasClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitViewAliasClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewAliasClauseContext viewAliasClause() throws RecognitionException {
		ViewAliasClauseContext _localctx = new ViewAliasClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_viewAliasClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(LP_);
			setState(954);
			viewAlias();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(955);
				match(COMMA_);
				setState(956);
				viewAlias();
				}
				}
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(962);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewAliasContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public ViewAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterViewAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitViewAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitViewAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewAliasContext viewAlias() throws RecognitionException {
		ViewAliasContext _localctx = new ViewAliasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_viewAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			columnName();
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(965);
				match(AS);
				setState(966);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropViewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(FirebirdStatementParser.VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public DropBehaviourContext dropBehaviour() {
			return getRuleContext(DropBehaviourContext.class,0);
		}
		public DropViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropViewContext dropView() throws RecognitionException {
		DropViewContext _localctx = new DropViewContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dropView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(DROP);
			setState(970);
			match(VIEW);
			setState(971);
			viewName();
			setState(972);
			dropBehaviour();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTemporaryTableContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(FirebirdStatementParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(FirebirdStatementParser.TEMPORARY, 0); }
		public CreateTemporaryTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTemporaryTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateTemporaryTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateTemporaryTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateTemporaryTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTemporaryTableContext createTemporaryTable() throws RecognitionException {
		CreateTemporaryTableContext _localctx = new CreateTemporaryTableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_createTemporaryTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(GLOBAL);
			setState(975);
			match(TEMPORARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlSecurityContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(FirebirdStatementParser.SQL, 0); }
		public TerminalNode SECURITY() { return getToken(FirebirdStatementParser.SECURITY, 0); }
		public TerminalNode DEFINER() { return getToken(FirebirdStatementParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(FirebirdStatementParser.INVOKER, 0); }
		public SqlSecurityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlSecurity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSqlSecurity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSqlSecurity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSqlSecurity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlSecurityContext sqlSecurity() throws RecognitionException {
		SqlSecurityContext _localctx = new SqlSecurityContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sqlSecurity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(SQL);
			setState(978);
			match(SECURITY);
			setState(979);
			_la = _input.LA(1);
			if ( !(_la==DEFINER || _la==INVOKER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDefinitionClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public CreateDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateDefinitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateDefinitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionClauseContext createDefinitionClause() throws RecognitionException {
		CreateDefinitionClauseContext _localctx = new CreateDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_createDefinitionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(LP_);
			setState(982);
			createDefinition();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(983);
				match(COMMA_);
				setState(984);
				createDefinition();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceRestartClauseContext extends ParserRuleContext {
		public TerminalNode RESTART() { return getToken(FirebirdStatementParser.RESTART, 0); }
		public TerminalNode WITH() { return getToken(FirebirdStatementParser.WITH, 0); }
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public SequenceRestartClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceRestartClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSequenceRestartClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSequenceRestartClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSequenceRestartClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceRestartClauseContext sequenceRestartClause() throws RecognitionException {
		SequenceRestartClauseContext _localctx = new SequenceRestartClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sequenceRestartClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(RESTART);
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(993);
				match(WITH);
				setState(994);
				bitExpr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceIncrementClauseContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(FirebirdStatementParser.INCREMENT, 0); }
		public TerminalNode NUMBER_() { return getToken(FirebirdStatementParser.NUMBER_, 0); }
		public TerminalNode BY() { return getToken(FirebirdStatementParser.BY, 0); }
		public SequenceIncrementClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceIncrementClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSequenceIncrementClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSequenceIncrementClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSequenceIncrementClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceIncrementClauseContext sequenceIncrementClause() throws RecognitionException {
		SequenceIncrementClauseContext _localctx = new SequenceIncrementClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sequenceIncrementClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(INCREMENT);
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(998);
				match(BY);
				}
			}

			setState(1001);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDatabaseSpecification_Context extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public TerminalNode CHARACTER() { return getToken(FirebirdStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public CreateDatabaseSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseSpecification_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateDatabaseSpecification_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateDatabaseSpecification_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateDatabaseSpecification_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDatabaseSpecification_Context createDatabaseSpecification_() throws RecognitionException {
		CreateDatabaseSpecification_Context _localctx = new CreateDatabaseSpecification_Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_createDatabaseSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(DEFAULT);
			setState(1004);
			match(CHARACTER);
			setState(1005);
			match(SET);
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1006);
				match(EQ_);
				}
			}

			setState(1009);
			characterSetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public CheckConstraintDefinitionContext checkConstraintDefinition() {
			return getRuleContext(CheckConstraintDefinitionContext.class,0);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_createDefinition);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				constraintDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				checkConstraintDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(FirebirdStatementParser.GENERATED, 0); }
		public TerminalNode BY() { return getToken(FirebirdStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(FirebirdStatementParser.IDENTITY, 0); }
		public List<DataTypeOptionContext> dataTypeOption() {
			return getRuleContexts(DataTypeOptionContext.class);
		}
		public DataTypeOptionContext dataTypeOption(int i) {
			return getRuleContext(DataTypeOptionContext.class,i);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode START() { return getToken(FirebirdStatementParser.START, 0); }
		public TerminalNode WITH() { return getToken(FirebirdStatementParser.WITH, 0); }
		public TerminalNode NUMBER_() { return getToken(FirebirdStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			columnName();
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(1017);
				dataType();
				}
				break;
			}
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(1020);
				match(GENERATED);
				setState(1021);
				match(BY);
				setState(1022);
				match(DEFAULT);
				setState(1023);
				match(AS);
				setState(1024);
				match(IDENTITY);
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1025);
					match(LP_);
					setState(1026);
					match(START);
					setState(1027);
					match(WITH);
					setState(1028);
					match(NUMBER_);
					setState(1029);
					match(RP_);
					}
				}

				}
				break;
			}
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 140737488355331L) != 0) || _la==CHECK || _la==COLLATE || ((((_la - 309)) & ~0x3f) == 0 && ((1L << (_la - 309)) & 720575940379279361L) != 0) || _la==STRING_) {
				{
				{
				setState(1034);
				dataTypeOption();
				}
				}
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeOptionContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public UsingDefinitionContext usingDefinition() {
			return getRuleContext(UsingDefinitionContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(FirebirdStatementParser.UNIQUE, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public CheckConstraintDefinitionContext checkConstraintDefinition() {
			return getRuleContext(CheckConstraintDefinitionContext.class,0);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode COMPUTED() { return getToken(FirebirdStatementParser.COMPUTED, 0); }
		public TerminalNode GENERATED() { return getToken(FirebirdStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(FirebirdStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public TerminalNode BY() { return getToken(FirebirdStatementParser.BY, 0); }
		public DataTypeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDataTypeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDataTypeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDataTypeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeOptionContext dataTypeOption() throws RecognitionException {
		DataTypeOptionContext _localctx = new DataTypeOptionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dataTypeOption);
		int _la;
		try {
			setState(1074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				primaryKey();
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1041);
					usingDefinition();
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				match(UNIQUE);
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1045);
					usingDefinition();
					}
				}

				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1048);
					match(NOT);
					}
				}

				setState(1051);
				match(NULL);
				}
				break;
			case COLLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1052);
				collateClause();
				}
				break;
			case CONSTRAINT:
			case CHECK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1053);
				checkConstraintDefinition();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(1054);
				referenceDefinition();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1055);
				match(DEFAULT);
				setState(1058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(1056);
					literals();
					}
					break;
				case 2:
					{
					setState(1057);
					expr(0);
					}
					break;
				}
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 8);
				{
				setState(1060);
				match(STRING_);
				}
				break;
			case GENERATED:
			case COMPUTED:
				enterOuterAlt(_localctx, 9);
				{
				setState(1068);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMPUTED:
					{
					setState(1061);
					match(COMPUTED);
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BY) {
						{
						setState(1062);
						match(BY);
						}
					}

					}
					break;
				case GENERATED:
					{
					setState(1065);
					match(GENERATED);
					setState(1066);
					match(ALWAYS);
					setState(1067);
					match(AS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1070);
				match(LP_);
				setState(1071);
				expr(0);
				setState(1072);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CheckConstraintDefinitionContext extends ParserRuleContext {
		public CheckClauseContext checkClause() {
			return getRuleContext(CheckClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(FirebirdStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public CheckConstraintDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraintDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCheckConstraintDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCheckConstraintDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCheckConstraintDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckConstraintDefinitionContext checkConstraintDefinition() throws RecognitionException {
		CheckConstraintDefinitionContext _localctx = new CheckConstraintDefinitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_checkConstraintDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1076);
				match(CONSTRAINT);
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 288230376151710785L) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 7881299347898369L) != 0) || _la==IDENTIFIER_) {
					{
					setState(1077);
					ignoredIdentifier();
					}
				}

				}
			}

			setState(1082);
			checkClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceDefinitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(FirebirdStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public UsingDefinitionContext usingDefinition() {
			return getRuleContext(UsingDefinitionContext.class,0);
		}
		public List<TerminalNode> ON() { return getTokens(FirebirdStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(FirebirdStatementParser.ON, i);
		}
		public List<ReferenceOptionContext> referenceOption() {
			return getRuleContexts(ReferenceOptionContext.class);
		}
		public ReferenceOptionContext referenceOption(int i) {
			return getRuleContext(ReferenceOptionContext.class,i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(FirebirdStatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(FirebirdStatementParser.UPDATE, i);
		}
		public List<TerminalNode> DELETE() { return getTokens(FirebirdStatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(FirebirdStatementParser.DELETE, i);
		}
		public ReferenceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterReferenceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitReferenceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitReferenceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceDefinitionContext referenceDefinition() throws RecognitionException {
		ReferenceDefinitionContext _localctx = new ReferenceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_referenceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(REFERENCES);
			setState(1085);
			tableName();
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(1086);
				columnNames();
				}
				break;
			}
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1089);
				usingDefinition();
				}
			}

			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(1092);
				match(ON);
				setState(1093);
				_la = _input.LA(1);
				if ( !(_la==UPDATE || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1094);
				referenceOption();
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceOptionContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(FirebirdStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(FirebirdStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(FirebirdStatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public ReferenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterReferenceOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitReferenceOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitReferenceOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceOptionContext referenceOption() throws RecognitionException {
		ReferenceOptionContext _localctx = new ReferenceOptionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_referenceOption);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				match(CASCADE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101);
				match(SET);
				setState(1102);
				match(NULL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(NO);
				setState(1104);
				match(ACTION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1105);
				match(SET);
				setState(1106);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingDefinitionContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(FirebirdStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(FirebirdStatementParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(FirebirdStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(FirebirdStatementParser.DESC, 0); }
		public TerminalNode ENDING() { return getToken(FirebirdStatementParser.ENDING, 0); }
		public UsingDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterUsingDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitUsingDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitUsingDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDefinitionContext usingDefinition() throws RecognitionException {
		UsingDefinitionContext _localctx = new UsingDefinitionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_usingDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(USING);
			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
				{
				setState(1110);
				match(ASC);
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENDING) {
					{
					setState(1111);
					match(ENDING);
					}
				}

				}
				break;
			case DESC:
				{
				setState(1114);
				match(DESC);
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENDING) {
					{
					setState(1115);
					match(ENDING);
					}
				}

				}
				break;
			case INDEX:
				break;
			default:
				break;
			}
			setState(1120);
			match(INDEX);
			setState(1121);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintDefinitionContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(FirebirdStatementParser.CONSTRAINT, 0); }
		public PrimaryKeyOptionContext primaryKeyOption() {
			return getRuleContext(PrimaryKeyOptionContext.class,0);
		}
		public UniqueOptionContext uniqueOption() {
			return getRuleContext(UniqueOptionContext.class,0);
		}
		public ForeignKeyOptionContext foreignKeyOption() {
			return getRuleContext(ForeignKeyOptionContext.class,0);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ConstraintDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterConstraintDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitConstraintDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitConstraintDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintDefinitionContext constraintDefinition() throws RecognitionException {
		ConstraintDefinitionContext _localctx = new ConstraintDefinitionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_constraintDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1123);
				match(CONSTRAINT);
				setState(1125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1124);
					constraintName();
					}
					break;
				}
				}
			}

			setState(1132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(1129);
				primaryKeyOption();
				}
				break;
			case UNIQUE:
				{
				setState(1130);
				uniqueOption();
				}
				break;
			case FOREIGN:
				{
				setState(1131);
				foreignKeyOption();
				}
				break;
			case EOF:
			case RP_:
			case COMMA_:
			case SEMI_:
			case SELECT:
			case INSERT:
			case UPDATE:
			case DELETE:
			case CREATE:
			case ALTER:
			case DROP:
			case WITH:
			case IF:
			case ELSE:
			case BEGIN:
			case CLOSE:
			case OPEN:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case END:
			case EXECUTE:
			case FETCH:
			case VALUE:
			case RETURN:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case SUSPEND:
			case WHILE:
			case LEAVE:
			case IDENTIFIER_:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyOptionContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public UsingDefinitionContext usingDefinition() {
			return getRuleContext(UsingDefinitionContext.class,0);
		}
		public PrimaryKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPrimaryKeyOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPrimaryKeyOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPrimaryKeyOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyOptionContext primaryKeyOption() throws RecognitionException {
		PrimaryKeyOptionContext _localctx = new PrimaryKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primaryKeyOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			primaryKey();
			setState(1135);
			columnNames();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1136);
				usingDefinition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(FirebirdStatementParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(FirebirdStatementParser.KEY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(PRIMARY);
			setState(1140);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueOptionContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(FirebirdStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public UsingDefinitionContext usingDefinition() {
			return getRuleContext(UsingDefinitionContext.class,0);
		}
		public UniqueOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterUniqueOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitUniqueOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitUniqueOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueOptionContext uniqueOption() throws RecognitionException {
		UniqueOptionContext _localctx = new UniqueOptionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_uniqueOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(UNIQUE);
			setState(1143);
			columnNames();
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1144);
				usingDefinition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForeignKeyOptionContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(FirebirdStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(FirebirdStatementParser.KEY, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public ForeignKeyOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterForeignKeyOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitForeignKeyOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitForeignKeyOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyOptionContext foreignKeyOption() throws RecognitionException {
		ForeignKeyOptionContext _localctx = new ForeignKeyOptionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_foreignKeyOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(FOREIGN);
			setState(1148);
			match(KEY);
			setState(1149);
			columnNames();
			setState(1150);
			referenceDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateLikeClauseContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(FirebirdStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public CreateLikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLikeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateLikeClauseContext createLikeClause() throws RecognitionException {
		CreateLikeClauseContext _localctx = new CreateLikeClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_createLikeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1152);
				match(LP_);
				}
			}

			setState(1155);
			match(LIKE);
			setState(1156);
			tableName();
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(1157);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterDefinitionClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public DropConstraintSpecificationContext dropConstraintSpecification() {
			return getRuleContext(DropConstraintSpecificationContext.class,0);
		}
		public AlterDefinitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDefinitionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAlterDefinitionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAlterDefinitionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAlterDefinitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterDefinitionClauseContext alterDefinitionClause() throws RecognitionException {
		AlterDefinitionClauseContext _localctx = new AlterDefinitionClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_alterDefinitionClause);
		try {
			setState(1165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				modifyColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1162);
				dropColumnSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1163);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1164);
				dropConstraintSpecification();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(FirebirdStatementParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(FirebirdStatementParser.COLUMN, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAddColumnSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAddColumnSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAddColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(ADD);
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1168);
				match(COLUMN);
				}
			}

			setState(1171);
			columnDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public ModifyColumnContext modifyColumn() {
			return getRuleContext(ModifyColumnContext.class,0);
		}
		public TerminalNode TO() { return getToken(FirebirdStatementParser.TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode POSITION() { return getToken(FirebirdStatementParser.POSITION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(FirebirdStatementParser.TYPE, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode RESTART() { return getToken(FirebirdStatementParser.RESTART, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DomainNameContext domainName() {
			return getRuleContext(DomainNameContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(FirebirdStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(FirebirdStatementParser.ALWAYS, 0); }
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public TerminalNode COMPUTED() { return getToken(FirebirdStatementParser.COMPUTED, 0); }
		public TerminalNode WITH() { return getToken(FirebirdStatementParser.WITH, 0); }
		public TerminalNode NUMBER_() { return getToken(FirebirdStatementParser.NUMBER_, 0); }
		public TerminalNode BY() { return getToken(FirebirdStatementParser.BY, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterModifyColumnSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitModifyColumnSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitModifyColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			modifyColumn();
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1174);
				match(TO);
				setState(1175);
				tableName();
				}
				break;
			case 2:
				{
				setState(1176);
				match(POSITION);
				setState(1177);
				expr(0);
				}
				break;
			case 3:
				{
				setState(1178);
				match(TYPE);
				setState(1181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1179);
					dataType();
					}
					break;
				case 2:
					{
					setState(1180);
					domainName();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(1183);
				match(SET);
				setState(1184);
				match(DEFAULT);
				setState(1185);
				defaultValue();
				}
				break;
			case 5:
				{
				setState(1186);
				match(DROP);
				setState(1187);
				match(DEFAULT);
				}
				break;
			case 6:
				{
				setState(1188);
				match(SET);
				setState(1189);
				match(NOT);
				setState(1190);
				match(NULL);
				}
				break;
			case 7:
				{
				setState(1191);
				match(DROP);
				setState(1192);
				match(NOT);
				setState(1193);
				match(NULL);
				}
				break;
			case 8:
				{
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(1194);
					match(TYPE);
					setState(1195);
					dataType();
					}
				}

				setState(1205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GENERATED:
					{
					setState(1198);
					match(GENERATED);
					setState(1199);
					match(ALWAYS);
					setState(1200);
					match(AS);
					}
					break;
				case COMPUTED:
					{
					setState(1201);
					match(COMPUTED);
					setState(1203);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BY) {
						{
						setState(1202);
						match(BY);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1207);
				match(LP_);
				setState(1208);
				expr(0);
				setState(1209);
				match(RP_);
				}
				break;
			case 9:
				{
				setState(1211);
				match(RESTART);
				setState(1214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1212);
					match(WITH);
					setState(1213);
					match(NUMBER_);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifyColumnContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(FirebirdStatementParser.COLUMN, 0); }
		public ModifyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterModifyColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitModifyColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitModifyColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyColumnContext modifyColumn() throws RecognitionException {
		ModifyColumnContext _localctx = new ModifyColumnContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_modifyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(ALTER);
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1219);
				match(COLUMN);
				}
			}

			setState(1222);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(FirebirdStatementParser.COLUMN, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDropColumnSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDropColumnSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDropColumnSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(DROP);
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(1225);
				match(COLUMN);
				}
			}

			setState(1228);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(FirebirdStatementParser.ADD, 0); }
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAddConstraintSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAddConstraintSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAddConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_addConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(ADD);
			setState(1231);
			constraintDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public DropConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDropConstraintSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDropConstraintSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDropConstraintSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropConstraintSpecificationContext dropConstraintSpecification() throws RecognitionException {
		DropConstraintSpecificationContext _localctx = new DropConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_dropConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(DROP);
			setState(1234);
			constraintDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FirebirdStatementParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(RETURN);
			setState(1237);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateProcedureContext extends ParserRuleContext {
		public ProcedureClauseContext procedureClause() {
			return getRuleContext(ProcedureClauseContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(FirebirdStatementParser.PROCEDURE, 0); }
		public TerminalNode OR() { return getToken(FirebirdStatementParser.OR, 0); }
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public CreateProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateProcedureContext createProcedure() throws RecognitionException {
		CreateProcedureContext _localctx = new CreateProcedureContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_createProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1239);
			match(CREATE);
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1240);
				match(OR);
				setState(1241);
				match(ALTER);
				}
			}

			setState(1244);
			match(PROCEDURE);
			}
			setState(1246);
			procedureClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterProcedureContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public TerminalNode PROCEDURE() { return getToken(FirebirdStatementParser.PROCEDURE, 0); }
		public ProcedureClauseContext procedureClause() {
			return getRuleContext(ProcedureClauseContext.class,0);
		}
		public AlterProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAlterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAlterProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAlterProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterProcedureContext alterProcedure() throws RecognitionException {
		AlterProcedureContext _localctx = new AlterProcedureContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_alterProcedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(ALTER);
			setState(1249);
			match(PROCEDURE);
			setState(1250);
			procedureClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureClauseContext extends ParserRuleContext {
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(FirebirdStatementParser.EXTERNAL, 0); }
		public TerminalNode NAME() { return getToken(FirebirdStatementParser.NAME, 0); }
		public ExternalModuleNameContext externalModuleName() {
			return getRuleContext(ExternalModuleNameContext.class,0);
		}
		public TerminalNode ENGINE() { return getToken(FirebirdStatementParser.ENGINE, 0); }
		public EngineNameContext engineName() {
			return getRuleContext(EngineNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(FirebirdStatementParser.BEGIN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(FirebirdStatementParser.END, 0); }
		public TerminalNode AUTHID() { return getToken(FirebirdStatementParser.AUTHID, 0); }
		public InputArgumentClauseContext inputArgumentClause() {
			return getRuleContext(InputArgumentClauseContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(FirebirdStatementParser.RETURNS, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public OutputArgumentListContext outputArgumentList() {
			return getRuleContext(OutputArgumentListContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode OWNER() { return getToken(FirebirdStatementParser.OWNER, 0); }
		public TerminalNode CALLER() { return getToken(FirebirdStatementParser.CALLER, 0); }
		public TerminalNode SQL() { return getToken(FirebirdStatementParser.SQL, 0); }
		public TerminalNode SECURITY() { return getToken(FirebirdStatementParser.SECURITY, 0); }
		public AnnouncementClauseContext announcementClause() {
			return getRuleContext(AnnouncementClauseContext.class,0);
		}
		public TerminalNode DEFINER() { return getToken(FirebirdStatementParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(FirebirdStatementParser.INVOKER, 0); }
		public ProcedureClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterProcedureClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitProcedureClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitProcedureClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureClauseContext procedureClause() throws RecognitionException {
		ProcedureClauseContext _localctx = new ProcedureClauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_procedureClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			procedureName();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHID) {
				{
				setState(1253);
				match(AUTHID);
				setState(1254);
				_la = _input.LA(1);
				if ( !(_la==OWNER || _la==CALLER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1257);
				inputArgumentClause();
				}
			}

			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(1260);
				match(RETURNS);
				setState(1261);
				match(LP_);
				setState(1262);
				outputArgumentList();
				setState(1263);
				match(RP_);
				}
			}

			setState(1286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTERNAL:
				{
				setState(1267);
				match(EXTERNAL);
				setState(1268);
				match(NAME);
				setState(1269);
				externalModuleName();
				setState(1270);
				match(ENGINE);
				setState(1271);
				engineName();
				}
				break;
			case AS:
			case SQL:
				{
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQL) {
					{
					setState(1273);
					match(SQL);
					setState(1274);
					match(SECURITY);
					setState(1275);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1278);
				match(AS);
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION || _la==PROCEDURE || _la==DECLARE) {
					{
					setState(1279);
					announcementClause();
					}
				}

				setState(1282);
				match(BEGIN);
				setState(1283);
				statementBlock();
				setState(1284);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteStmtContext extends ParserRuleContext {
		public ExecuteProcedureContext executeProcedure() {
			return getRuleContext(ExecuteProcedureContext.class,0);
		}
		public ExecuteBlockContext executeBlock() {
			return getRuleContext(ExecuteBlockContext.class,0);
		}
		public ExecuteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExecuteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExecuteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExecuteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteStmtContext executeStmt() throws RecognitionException {
		ExecuteStmtContext _localctx = new ExecuteStmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_executeStmt);
		try {
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				executeProcedure();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				executeBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteProcedureContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(FirebirdStatementParser.EXECUTE, 0); }
		public TerminalNode PROCEDURE() { return getToken(FirebirdStatementParser.PROCEDURE, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public ExprClauseContext exprClause() {
			return getRuleContext(ExprClauseContext.class,0);
		}
		public ReturningValuesClauseContext returningValuesClause() {
			return getRuleContext(ReturningValuesClauseContext.class,0);
		}
		public ExecuteProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExecuteProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExecuteProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExecuteProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteProcedureContext executeProcedure() throws RecognitionException {
		ExecuteProcedureContext _localctx = new ExecuteProcedureContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_executeProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(EXECUTE);
			setState(1293);
			match(PROCEDURE);
			setState(1294);
			procedureName();
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1295);
				exprClause();
				}
			}

			setState(1299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING_VALUES) {
				{
				setState(1298);
				returningValuesClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprClauseContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public ExprClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExprClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExprClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExprClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprClauseContext exprClause() throws RecognitionException {
		ExprClauseContext _localctx = new ExprClauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_exprClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(LP_);
			setState(1302);
			expr(0);
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1303);
				match(COMMA_);
				setState(1304);
				expr(0);
				}
				}
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1310);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturningValuesClauseContext extends ParserRuleContext {
		public TerminalNode RETURNING_VALUES() { return getToken(FirebirdStatementParser.RETURNING_VALUES, 0); }
		public ExprClauseContext exprClause() {
			return getRuleContext(ExprClauseContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public ReturningValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningValuesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterReturningValuesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitReturningValuesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitReturningValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningValuesClauseContext returningValuesClause() throws RecognitionException {
		ReturningValuesClauseContext _localctx = new ReturningValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_returningValuesClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			match(RETURNING_VALUES);
			setState(1313);
			exprClause();
			setState(1314);
			match(SEMI_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTriggerContext extends ParserRuleContext {
		public TriggerNameContext triggerName() {
			return getRuleContext(TriggerNameContext.class,0);
		}
		public TriggerClauseContext triggerClause() {
			return getRuleContext(TriggerClauseContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode TRIGGER() { return getToken(FirebirdStatementParser.TRIGGER, 0); }
		public TerminalNode OR() { return getToken(FirebirdStatementParser.OR, 0); }
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public CreateTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateTrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTriggerContext createTrigger() throws RecognitionException {
		CreateTriggerContext _localctx = new CreateTriggerContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_createTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1316);
			match(CREATE);
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1317);
				match(OR);
				setState(1318);
				match(ALTER);
				}
			}

			setState(1321);
			match(TRIGGER);
			}
			setState(1323);
			triggerName();
			setState(1324);
			triggerClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTriggerContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public TerminalNode TRIGGER() { return getToken(FirebirdStatementParser.TRIGGER, 0); }
		public TriggerNameContext triggerName() {
			return getRuleContext(TriggerNameContext.class,0);
		}
		public TriggerClauseContext triggerClause() {
			return getRuleContext(TriggerClauseContext.class,0);
		}
		public EventListTableContext eventListTable() {
			return getRuleContext(EventListTableContext.class,0);
		}
		public TerminalNode POSITION() { return getToken(FirebirdStatementParser.POSITION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ACTIVE() { return getToken(FirebirdStatementParser.ACTIVE, 0); }
		public TerminalNode INACTIVE() { return getToken(FirebirdStatementParser.INACTIVE, 0); }
		public TerminalNode BEFORE() { return getToken(FirebirdStatementParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(FirebirdStatementParser.AFTER, 0); }
		public AlterTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAlterTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAlterTrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAlterTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTriggerContext alterTrigger() throws RecognitionException {
		AlterTriggerContext _localctx = new AlterTriggerContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_alterTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(ALTER);
			setState(1327);
			match(TRIGGER);
			setState(1328);
			triggerName();
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1329);
				_la = _input.LA(1);
				if ( !(_la==ACTIVE || _la==INACTIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1332);
				_la = _input.LA(1);
				if ( !(_la==BEFORE || _la==AFTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1333);
				eventListTable();
				}
				break;
			}
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSITION) {
				{
				setState(1336);
				match(POSITION);
				setState(1337);
				expr(0);
				}
			}

			setState(1340);
			triggerClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncmentTriggerClauseContext extends ParserRuleContext {
		public AnnouncmentTableTriggerContext announcmentTableTrigger() {
			return getRuleContext(AnnouncmentTableTriggerContext.class,0);
		}
		public AnnouncmentTableTriggerSQL_2003StandartContext announcmentTableTriggerSQL_2003Standart() {
			return getRuleContext(AnnouncmentTableTriggerSQL_2003StandartContext.class,0);
		}
		public AnnouncmentDataBaseTriggerContext announcmentDataBaseTrigger() {
			return getRuleContext(AnnouncmentDataBaseTriggerContext.class,0);
		}
		public AnnouncmentDDLTriggerContext announcmentDDLTrigger() {
			return getRuleContext(AnnouncmentDDLTriggerContext.class,0);
		}
		public AnnouncmentTriggerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcmentTriggerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncmentTriggerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncmentTriggerClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncmentTriggerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncmentTriggerClauseContext announcmentTriggerClause() throws RecognitionException {
		AnnouncmentTriggerClauseContext _localctx = new AnnouncmentTriggerClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_announcmentTriggerClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1342);
				announcmentTableTrigger();
				}
				break;
			case 2:
				{
				setState(1343);
				announcmentTableTriggerSQL_2003Standart();
				}
				break;
			case 3:
				{
				setState(1344);
				announcmentDataBaseTrigger();
				}
				break;
			case 4:
				{
				setState(1345);
				announcmentDDLTrigger();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerClauseContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(FirebirdStatementParser.EXTERNAL, 0); }
		public TerminalNode NAME() { return getToken(FirebirdStatementParser.NAME, 0); }
		public ExternalModuleNameContext externalModuleName() {
			return getRuleContext(ExternalModuleNameContext.class,0);
		}
		public TerminalNode ENGINE() { return getToken(FirebirdStatementParser.ENGINE, 0); }
		public EngineNameContext engineName() {
			return getRuleContext(EngineNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(FirebirdStatementParser.BEGIN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(FirebirdStatementParser.END, 0); }
		public AnnouncmentTriggerClauseContext announcmentTriggerClause() {
			return getRuleContext(AnnouncmentTriggerClauseContext.class,0);
		}
		public TerminalNode SQL() { return getToken(FirebirdStatementParser.SQL, 0); }
		public TerminalNode SECURITY() { return getToken(FirebirdStatementParser.SECURITY, 0); }
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public AnnouncementClauseContext announcementClause() {
			return getRuleContext(AnnouncementClauseContext.class,0);
		}
		public TerminalNode DEFINER() { return getToken(FirebirdStatementParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(FirebirdStatementParser.INVOKER, 0); }
		public TriggerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTriggerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTriggerClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTriggerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerClauseContext triggerClause() throws RecognitionException {
		TriggerClauseContext _localctx = new TriggerClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_triggerClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON || _la==FOR || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & 99L) != 0)) {
				{
				setState(1348);
				announcmentTriggerClause();
				}
			}

			setState(1373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTERNAL:
				{
				setState(1351);
				match(EXTERNAL);
				setState(1352);
				match(NAME);
				setState(1353);
				externalModuleName();
				setState(1354);
				match(ENGINE);
				setState(1355);
				engineName();
				}
				break;
			case DROP:
			case AS:
			case SQL:
				{
				setState(1363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SQL:
					{
					setState(1357);
					match(SQL);
					setState(1358);
					match(SECURITY);
					setState(1359);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case DROP:
					{
					setState(1360);
					match(DROP);
					setState(1361);
					match(SQL);
					setState(1362);
					match(SECURITY);
					}
					break;
				case AS:
					break;
				default:
					break;
				}
				setState(1365);
				match(AS);
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION || _la==PROCEDURE || _la==DECLARE) {
					{
					setState(1366);
					announcementClause();
					}
				}

				setState(1369);
				match(BEGIN);
				setState(1370);
				statementBlock();
				setState(1371);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncmentTableTriggerContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FirebirdStatementParser.FOR, 0); }
		public EventListTableContext eventListTable() {
			return getRuleContext(EventListTableContext.class,0);
		}
		public TerminalNode BEFORE() { return getToken(FirebirdStatementParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(FirebirdStatementParser.AFTER, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TerminalNode POSITION() { return getToken(FirebirdStatementParser.POSITION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ACTIVE() { return getToken(FirebirdStatementParser.ACTIVE, 0); }
		public TerminalNode INACTIVE() { return getToken(FirebirdStatementParser.INACTIVE, 0); }
		public AnnouncmentTableTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcmentTableTrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncmentTableTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncmentTableTrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncmentTableTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncmentTableTriggerContext announcmentTableTrigger() throws RecognitionException {
		AnnouncmentTableTriggerContext _localctx = new AnnouncmentTableTriggerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_announcmentTableTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(FOR);
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1376);
				tableName();
				}
				break;
			case 2:
				{
				setState(1377);
				viewName();
				}
				break;
			}
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTIVE || _la==INACTIVE) {
				{
				setState(1380);
				_la = _input.LA(1);
				if ( !(_la==ACTIVE || _la==INACTIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1383);
			_la = _input.LA(1);
			if ( !(_la==BEFORE || _la==AFTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1384);
			eventListTable();
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSITION) {
				{
				setState(1385);
				match(POSITION);
				setState(1386);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventListTableContext extends ParserRuleContext {
		public List<DmlStatementContext> dmlStatement() {
			return getRuleContexts(DmlStatementContext.class);
		}
		public DmlStatementContext dmlStatement(int i) {
			return getRuleContext(DmlStatementContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(FirebirdStatementParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FirebirdStatementParser.OR, i);
		}
		public EventListTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventListTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterEventListTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitEventListTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitEventListTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventListTableContext eventListTable() throws RecognitionException {
		EventListTableContext _localctx = new EventListTableContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_eventListTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			dmlStatement();
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1390);
				match(OR);
				setState(1391);
				dmlStatement();
				}
				}
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListDDLStatementContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(FirebirdStatementParser.ANY, 0); }
		public TerminalNode DDL() { return getToken(FirebirdStatementParser.DDL, 0); }
		public TerminalNode STATEMENT() { return getToken(FirebirdStatementParser.STATEMENT, 0); }
		public List<DdlStatementContext> ddlStatement() {
			return getRuleContexts(DdlStatementContext.class);
		}
		public DdlStatementContext ddlStatement(int i) {
			return getRuleContext(DdlStatementContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(FirebirdStatementParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FirebirdStatementParser.OR, i);
		}
		public ListDDLStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDDLStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterListDDLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitListDDLStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitListDDLStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDDLStatementContext listDDLStatement() throws RecognitionException {
		ListDDLStatementContext _localctx = new ListDDLStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_listDDLStatement);
		int _la;
		try {
			setState(1408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				match(ANY);
				setState(1398);
				match(DDL);
				setState(1399);
				match(STATEMENT);
				}
				break;
			case CREATE:
			case ALTER:
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1400);
				ddlStatement();
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(1401);
					match(OR);
					setState(1402);
					ddlStatement();
					}
					}
					setState(1407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(FirebirdStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(FirebirdStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(FirebirdStatementParser.DELETE, 0); }
		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_dmlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DdlStatementContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(FirebirdStatementParser.TABLE, 0); }
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode ALTER() { return getToken(FirebirdStatementParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(FirebirdStatementParser.DROP, 0); }
		public TerminalNode PROCEDURE() { return getToken(FirebirdStatementParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(FirebirdStatementParser.FUNCTION, 0); }
		public TerminalNode TRIGGER() { return getToken(FirebirdStatementParser.TRIGGER, 0); }
		public TerminalNode EXCEPTION() { return getToken(FirebirdStatementParser.EXCEPTION, 0); }
		public TerminalNode VIEW() { return getToken(FirebirdStatementParser.VIEW, 0); }
		public TerminalNode DOMAIN() { return getToken(FirebirdStatementParser.DOMAIN, 0); }
		public TerminalNode ROLE() { return getToken(FirebirdStatementParser.ROLE, 0); }
		public TerminalNode SEQUENCE() { return getToken(FirebirdStatementParser.SEQUENCE, 0); }
		public TerminalNode USER() { return getToken(FirebirdStatementParser.USER, 0); }
		public TerminalNode INDEX() { return getToken(FirebirdStatementParser.INDEX, 0); }
		public TerminalNode COLLATION() { return getToken(FirebirdStatementParser.COLLATION, 0); }
		public TerminalNode CHARACTER() { return getToken(FirebirdStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public TerminalNode PACKAGE() { return getToken(FirebirdStatementParser.PACKAGE, 0); }
		public TerminalNode BODY() { return getToken(FirebirdStatementParser.BODY, 0); }
		public TerminalNode MAPPING() { return getToken(FirebirdStatementParser.MAPPING, 0); }
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDdlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDdlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDdlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_ddlStatement);
		int _la;
		try {
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1412);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1413);
				match(TABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1415);
				match(PROCEDURE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1416);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1417);
				match(FUNCTION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1418);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1419);
				match(TRIGGER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1420);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1421);
				match(EXCEPTION);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1422);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1423);
				match(VIEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1424);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1425);
				match(DOMAIN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1426);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1427);
				match(ROLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1428);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1429);
				match(SEQUENCE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1430);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1431);
				match(USER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1432);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1433);
				match(INDEX);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1434);
				_la = _input.LA(1);
				if ( !(_la==CREATE || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1435);
				match(COLLATION);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1436);
				match(ALTER);
				setState(1437);
				match(CHARACTER);
				setState(1438);
				match(SET);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1439);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1440);
				match(PACKAGE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1441);
				_la = _input.LA(1);
				if ( !(_la==CREATE || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1442);
				match(PACKAGE);
				setState(1443);
				match(BODY);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1444);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1445);
				match(MAPPING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncmentTableTriggerSQL_2003StandartContext extends ParserRuleContext {
		public EventListTableContext eventListTable() {
			return getRuleContext(EventListTableContext.class,0);
		}
		public TerminalNode ON() { return getToken(FirebirdStatementParser.ON, 0); }
		public TerminalNode BEFORE() { return getToken(FirebirdStatementParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(FirebirdStatementParser.AFTER, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TerminalNode POSITION() { return getToken(FirebirdStatementParser.POSITION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ACTIVE() { return getToken(FirebirdStatementParser.ACTIVE, 0); }
		public TerminalNode INACTIVE() { return getToken(FirebirdStatementParser.INACTIVE, 0); }
		public AnnouncmentTableTriggerSQL_2003StandartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcmentTableTriggerSQL_2003Standart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncmentTableTriggerSQL_2003Standart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncmentTableTriggerSQL_2003Standart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncmentTableTriggerSQL_2003Standart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncmentTableTriggerSQL_2003StandartContext announcmentTableTriggerSQL_2003Standart() throws RecognitionException {
		AnnouncmentTableTriggerSQL_2003StandartContext _localctx = new AnnouncmentTableTriggerSQL_2003StandartContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_announcmentTableTriggerSQL_2003Standart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTIVE || _la==INACTIVE) {
				{
				setState(1448);
				_la = _input.LA(1);
				if ( !(_la==ACTIVE || _la==INACTIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1451);
			_la = _input.LA(1);
			if ( !(_la==BEFORE || _la==AFTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1452);
			eventListTable();
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSITION) {
				{
				setState(1453);
				match(POSITION);
				setState(1454);
				expr(0);
				}
			}

			setState(1457);
			match(ON);
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1458);
				tableName();
				}
				break;
			case 2:
				{
				setState(1459);
				viewName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncmentDataBaseTriggerContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(FirebirdStatementParser.ON, 0); }
		public EventConnectOrTransactionContext eventConnectOrTransaction() {
			return getRuleContext(EventConnectOrTransactionContext.class,0);
		}
		public TerminalNode POSITION() { return getToken(FirebirdStatementParser.POSITION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ACTIVE() { return getToken(FirebirdStatementParser.ACTIVE, 0); }
		public TerminalNode INACTIVE() { return getToken(FirebirdStatementParser.INACTIVE, 0); }
		public AnnouncmentDataBaseTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcmentDataBaseTrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncmentDataBaseTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncmentDataBaseTrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncmentDataBaseTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncmentDataBaseTriggerContext announcmentDataBaseTrigger() throws RecognitionException {
		AnnouncmentDataBaseTriggerContext _localctx = new AnnouncmentDataBaseTriggerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_announcmentDataBaseTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTIVE || _la==INACTIVE) {
				{
				setState(1462);
				_la = _input.LA(1);
				if ( !(_la==ACTIVE || _la==INACTIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1465);
			match(ON);
			setState(1466);
			eventConnectOrTransaction();
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSITION) {
				{
				setState(1467);
				match(POSITION);
				setState(1468);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventConnectOrTransactionContext extends ParserRuleContext {
		public TerminalNode CONNECT() { return getToken(FirebirdStatementParser.CONNECT, 0); }
		public TerminalNode DISCONNECT() { return getToken(FirebirdStatementParser.DISCONNECT, 0); }
		public TerminalNode TRANSACTION() { return getToken(FirebirdStatementParser.TRANSACTION, 0); }
		public TerminalNode START() { return getToken(FirebirdStatementParser.START, 0); }
		public TerminalNode COMMIT() { return getToken(FirebirdStatementParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(FirebirdStatementParser.ROLLBACK, 0); }
		public EventConnectOrTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventConnectOrTransaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterEventConnectOrTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitEventConnectOrTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitEventConnectOrTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventConnectOrTransactionContext eventConnectOrTransaction() throws RecognitionException {
		EventConnectOrTransactionContext _localctx = new EventConnectOrTransactionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_eventConnectOrTransaction);
		try {
			setState(1479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				match(CONNECT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				match(DISCONNECT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1473);
				match(TRANSACTION);
				setState(1474);
				match(START);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1475);
				match(TRANSACTION);
				setState(1476);
				match(COMMIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1477);
				match(TRANSACTION);
				setState(1478);
				match(ROLLBACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncmentDDLTriggerContext extends ParserRuleContext {
		public ListDDLStatementContext listDDLStatement() {
			return getRuleContext(ListDDLStatementContext.class,0);
		}
		public TerminalNode BEFORE() { return getToken(FirebirdStatementParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(FirebirdStatementParser.AFTER, 0); }
		public TerminalNode POSITION() { return getToken(FirebirdStatementParser.POSITION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ACTIVE() { return getToken(FirebirdStatementParser.ACTIVE, 0); }
		public TerminalNode INACTIVE() { return getToken(FirebirdStatementParser.INACTIVE, 0); }
		public AnnouncmentDDLTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcmentDDLTrigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncmentDDLTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncmentDDLTrigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncmentDDLTrigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncmentDDLTriggerContext announcmentDDLTrigger() throws RecognitionException {
		AnnouncmentDDLTriggerContext _localctx = new AnnouncmentDDLTriggerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_announcmentDDLTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTIVE || _la==INACTIVE) {
				{
				setState(1481);
				_la = _input.LA(1);
				if ( !(_la==ACTIVE || _la==INACTIVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1484);
			_la = _input.LA(1);
			if ( !(_la==BEFORE || _la==AFTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1485);
			listDDLStatement();
			setState(1488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSITION) {
				{
				setState(1486);
				match(POSITION);
				setState(1487);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteBlockContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(FirebirdStatementParser.EXECUTE, 0); }
		public TerminalNode BLOCK() { return getToken(FirebirdStatementParser.BLOCK, 0); }
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public TerminalNode BEGIN() { return getToken(FirebirdStatementParser.BEGIN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode END() { return getToken(FirebirdStatementParser.END, 0); }
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public InputArgumentListContext inputArgumentList() {
			return getRuleContext(InputArgumentListContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(FirebirdStatementParser.RETURNS, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public OutputArgumentListContext outputArgumentList() {
			return getRuleContext(OutputArgumentListContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public AnnouncementClauseContext announcementClause() {
			return getRuleContext(AnnouncementClauseContext.class,0);
		}
		public ExecuteBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExecuteBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExecuteBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExecuteBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteBlockContext executeBlock() throws RecognitionException {
		ExecuteBlockContext _localctx = new ExecuteBlockContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_executeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(EXECUTE);
			setState(1491);
			match(BLOCK);
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1492);
				inputArgumentList();
				}
			}

			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(1495);
				match(RETURNS);
				setState(1496);
				match(LP_);
				setState(1497);
				outputArgumentList();
				setState(1498);
				match(RP_);
				}
			}

			setState(1502);
			match(AS);
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==PROCEDURE || _la==DECLARE) {
				{
				setState(1503);
				announcementClause();
				}
			}

			setState(1506);
			match(BEGIN);
			setState(1507);
			statementBlock();
			setState(1508);
			match(END);
			setState(1509);
			match(SEMI_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputArgumentListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<AnnouncementArgumentContext> announcementArgument() {
			return getRuleContexts(AnnouncementArgumentContext.class);
		}
		public AnnouncementArgumentContext announcementArgument(int i) {
			return getRuleContext(AnnouncementArgumentContext.class,i);
		}
		public List<TerminalNode> EQ_() { return getTokens(FirebirdStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(FirebirdStatementParser.EQ_, i);
		}
		public List<TerminalNode> QUESTION_() { return getTokens(FirebirdStatementParser.QUESTION_); }
		public TerminalNode QUESTION_(int i) {
			return getToken(FirebirdStatementParser.QUESTION_, i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public InputArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterInputArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitInputArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitInputArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArgumentListContext inputArgumentList() throws RecognitionException {
		InputArgumentListContext _localctx = new InputArgumentListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_inputArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			match(LP_);
			setState(1512);
			announcementArgument();
			setState(1513);
			match(EQ_);
			setState(1514);
			match(QUESTION_);
			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1515);
				match(COMMA_);
				{
				setState(1516);
				announcementArgument();
				setState(1517);
				match(EQ_);
				setState(1518);
				match(QUESTION_);
				}
				}
				}
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1525);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputArgumentListContext extends ParserRuleContext {
		public AnnouncementArgumentClauseContext announcementArgumentClause() {
			return getRuleContext(AnnouncementArgumentClauseContext.class,0);
		}
		public OutputArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOutputArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOutputArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOutputArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputArgumentListContext outputArgumentList() throws RecognitionException {
		OutputArgumentListContext _localctx = new OutputArgumentListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_outputArgumentList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			announcementArgumentClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			variableName();
			setState(1530);
			match(EQ_);
			setState(1531);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransferStatementContext extends ParserRuleContext {
		public TerminalNode SUSPEND() { return getToken(FirebirdStatementParser.SUSPEND, 0); }
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public TransferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTransferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTransferStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTransferStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransferStatementContext transferStatement() throws RecognitionException {
		TransferStatementContext _localctx = new TransferStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_transferStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(SUSPEND);
			setState(1534);
			match(SEMI_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FirebirdStatementParser.WHILE, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode DO() { return getToken(FirebirdStatementParser.DO, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(WHILE);
			setState(1537);
			match(LP_);
			setState(1538);
			expr(0);
			setState(1539);
			match(RP_);
			setState(1540);
			match(DO);
			setState(1541);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FetchStatementContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(FirebirdStatementParser.FETCH, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public TerminalNode INTO() { return getToken(FirebirdStatementParser.INTO, 0); }
		public List<TerminalNode> COLON_() { return getTokens(FirebirdStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(FirebirdStatementParser.COLON_, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public TerminalNode NEXT() { return getToken(FirebirdStatementParser.NEXT, 0); }
		public TerminalNode PRIOR() { return getToken(FirebirdStatementParser.PRIOR, 0); }
		public TerminalNode FIRST() { return getToken(FirebirdStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(FirebirdStatementParser.LAST, 0); }
		public TerminalNode ABSOLUTE() { return getToken(FirebirdStatementParser.ABSOLUTE, 0); }
		public TerminalNode NUMBER_() { return getToken(FirebirdStatementParser.NUMBER_, 0); }
		public TerminalNode RELATIVE() { return getToken(FirebirdStatementParser.RELATIVE, 0); }
		public List<TerminalNode> LBT_() { return getTokens(FirebirdStatementParser.LBT_); }
		public TerminalNode LBT_(int i) {
			return getToken(FirebirdStatementParser.LBT_, i);
		}
		public List<TerminalNode> RBT_() { return getTokens(FirebirdStatementParser.RBT_); }
		public TerminalNode RBT_(int i) {
			return getToken(FirebirdStatementParser.RBT_, i);
		}
		public FetchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterFetchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitFetchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitFetchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchStatementContext fetchStatement() throws RecognitionException {
		FetchStatementContext _localctx = new FetchStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_fetchStatement);
		int _la;
		try {
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1543);
				match(FETCH);
				setState(1544);
				cursorName();
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(1545);
					match(INTO);
					setState(1546);
					match(COLON_);
					setState(1547);
					variable();
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_) {
						{
						{
						setState(1548);
						match(COMMA_);
						{
						setState(1549);
						match(COLON_);
						setState(1550);
						variable();
						}
						}
						}
						setState(1555);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1556);
					match(SEMI_);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1560);
				match(FETCH);
				setState(1569);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(1561);
					match(NEXT);
					}
					break;
				case PRIOR:
					{
					setState(1562);
					match(PRIOR);
					}
					break;
				case FIRST:
					{
					setState(1563);
					match(FIRST);
					}
					break;
				case LAST:
					{
					setState(1564);
					match(LAST);
					}
					break;
				case ABSOLUTE:
					{
					setState(1565);
					match(ABSOLUTE);
					setState(1566);
					match(NUMBER_);
					}
					break;
				case RELATIVE:
					{
					setState(1567);
					match(RELATIVE);
					setState(1568);
					match(NUMBER_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1571);
				match(FROM);
				setState(1572);
				cursorName();
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(1573);
					match(INTO);
					setState(1574);
					match(LBT_);
					setState(1575);
					match(COLON_);
					setState(1576);
					match(RBT_);
					setState(1577);
					variable();
					setState(1585);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_) {
						{
						{
						setState(1578);
						match(COMMA_);
						{
						setState(1579);
						match(LBT_);
						setState(1580);
						match(COLON_);
						setState(1581);
						match(RBT_);
						setState(1582);
						variable();
						}
						}
						}
						setState(1587);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1588);
					match(SEMI_);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FirebirdStatementParser.IF, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode THEN() { return getToken(FirebirdStatementParser.THEN, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FirebirdStatementParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(IF);
			setState(1595);
			match(LP_);
			setState(1596);
			expr(0);
			setState(1597);
			match(RP_);
			setState(1598);
			match(THEN);
			setState(1600); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1599);
					compoundStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1602); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1604);
				match(ELSE);
				setState(1606); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1605);
						compoundStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1608); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public DropDatabaseContext dropDatabase() {
			return getRuleContext(DropDatabaseContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public CreateViewContext createView() {
			return getRuleContext(CreateViewContext.class,0);
		}
		public BeginStatementContext beginStatement() {
			return getRuleContext(BeginStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FetchStatementContext fetchStatement() {
			return getRuleContext(FetchStatementContext.class,0);
		}
		public LeaveStatementContext leaveStatement() {
			return getRuleContext(LeaveStatementContext.class,0);
		}
		public TransferStatementContext transferStatement() {
			return getRuleContext(TransferStatementContext.class,0);
		}
		public CursorCloseStatementContext cursorCloseStatement() {
			return getRuleContext(CursorCloseStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1612);
				createTable();
				}
				break;
			case 2:
				{
				setState(1613);
				alterTable();
				}
				break;
			case 3:
				{
				setState(1614);
				dropTable();
				}
				break;
			case 4:
				{
				setState(1615);
				dropDatabase();
				}
				break;
			case 5:
				{
				setState(1616);
				insert();
				}
				break;
			case 6:
				{
				setState(1617);
				update();
				}
				break;
			case 7:
				{
				setState(1618);
				delete();
				}
				break;
			case 8:
				{
				setState(1619);
				select();
				}
				break;
			case 9:
				{
				setState(1620);
				createView();
				}
				break;
			case 10:
				{
				setState(1621);
				beginStatement();
				}
				break;
			case 11:
				{
				setState(1622);
				ifStatement();
				}
				break;
			case 12:
				{
				setState(1623);
				fetchStatement();
				}
				break;
			case 13:
				{
				setState(1624);
				leaveStatement();
				}
				break;
			case 14:
				{
				setState(1625);
				transferStatement();
				}
				break;
			case 15:
				{
				setState(1626);
				cursorCloseStatement();
				}
				break;
			case 16:
				{
				setState(1627);
				assignmentStatement();
				}
				break;
			}
			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1630);
				match(SEMI_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BeginStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(FirebirdStatementParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(FirebirdStatementParser.END, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public BeginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBeginStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBeginStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBeginStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginStatementContext beginStatement() throws RecognitionException {
		BeginStatementContext _localctx = new BeginStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_beginStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(BEGIN);
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234207627640832L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 140737490452481L) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & 2305843009213686281L) != 0) || _la==FETCH || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 4619567317775286273L) != 0) || _la==LEAVE || _la==IDENTIFIER_) {
				{
				{
				setState(1634);
				compoundStatement();
				}
				}
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1640);
			match(END);
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1641);
				match(SEMI_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeaveStatementContext extends ParserRuleContext {
		public TerminalNode LEAVE() { return getToken(FirebirdStatementParser.LEAVE, 0); }
		public TerminalNode SEMI_() { return getToken(FirebirdStatementParser.SEMI_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LeaveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leaveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLeaveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLeaveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLeaveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeaveStatementContext leaveStatement() throws RecognitionException {
		LeaveStatementContext _localctx = new LeaveStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_leaveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(LEAVE);
			setState(1646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1645);
				expr(0);
				}
				break;
			}
			setState(1648);
			match(SEMI_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(FirebirdStatementParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(FirebirdStatementParser.ON, 0); }
		public TerminalNode IS() { return getToken(FirebirdStatementParser.IS, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public TerminalNode DATABASE() { return getToken(FirebirdStatementParser.DATABASE, 0); }
		public BaseTypeCommentContext baseTypeComment() {
			return getRuleContext(BaseTypeCommentContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(FirebirdStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode PARAMETER() { return getToken(FirebirdStatementParser.PARAMETER, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public List<TerminalNode> DOT_() { return getTokens(FirebirdStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(FirebirdStatementParser.DOT_, i);
		}
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(FirebirdStatementParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(FirebirdStatementParser.FUNCTION, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(FirebirdStatementParser.EXTERNAL, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(COMMENT);
			setState(1651);
			match(ON);
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1652);
				match(DATABASE);
				}
				break;
			case 2:
				{
				setState(1653);
				baseTypeComment();
				setState(1654);
				tableName();
				}
				break;
			case 3:
				{
				setState(1656);
				match(COLUMN);
				setState(1657);
				tableName();
				setState(1658);
				matchWildcard();
				setState(1659);
				columnName();
				}
				break;
			case 4:
				{
				setState(1661);
				_la = _input.LA(1);
				if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1662);
				match(PARAMETER);
				setState(1666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1663);
					packageName();
					setState(1664);
					match(DOT_);
					}
					break;
				}
				setState(1668);
				procedureName();
				setState(1669);
				match(DOT_);
				setState(1670);
				parameterName();
				}
				break;
			case 5:
				{
				setState(1677);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROCEDURE:
					{
					setState(1672);
					match(PROCEDURE);
					}
					break;
				case FUNCTION:
				case EXTERNAL:
					{
					setState(1674);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EXTERNAL) {
						{
						setState(1673);
						match(EXTERNAL);
						}
					}

					setState(1676);
					match(FUNCTION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1679);
					packageName();
					setState(1680);
					match(DOT_);
					}
					break;
				}
				setState(1684);
				procedureName();
				}
				break;
			}
			setState(1687);
			match(IS);
			setState(1688);
			_la = _input.LA(1);
			if ( !(_la==NULL || _la==STRING_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseTypeCommentContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(FirebirdStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public TerminalNode COLLATION() { return getToken(FirebirdStatementParser.COLLATION, 0); }
		public TerminalNode DOMAIN() { return getToken(FirebirdStatementParser.DOMAIN, 0); }
		public TerminalNode EXCEPTION() { return getToken(FirebirdStatementParser.EXCEPTION, 0); }
		public TerminalNode FILTER() { return getToken(FirebirdStatementParser.FILTER, 0); }
		public TerminalNode GENERATOR() { return getToken(FirebirdStatementParser.GENERATOR, 0); }
		public TerminalNode INDEX() { return getToken(FirebirdStatementParser.INDEX, 0); }
		public TerminalNode PACKAGE() { return getToken(FirebirdStatementParser.PACKAGE, 0); }
		public TerminalNode USER() { return getToken(FirebirdStatementParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(FirebirdStatementParser.ROLE, 0); }
		public TerminalNode SEQUENCE() { return getToken(FirebirdStatementParser.SEQUENCE, 0); }
		public TerminalNode TABLE() { return getToken(FirebirdStatementParser.TABLE, 0); }
		public TerminalNode TRIGGER() { return getToken(FirebirdStatementParser.TRIGGER, 0); }
		public TerminalNode VIEW() { return getToken(FirebirdStatementParser.VIEW, 0); }
		public BaseTypeCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseTypeComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBaseTypeComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBaseTypeComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBaseTypeComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeCommentContext baseTypeComment() throws RecognitionException {
		BaseTypeCommentContext _localctx = new BaseTypeCommentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_baseTypeComment);
		try {
			setState(1705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				match(CHARACTER);
				setState(1691);
				match(SET);
				}
				break;
			case COLLATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1692);
				match(COLLATION);
				}
				break;
			case DOMAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1693);
				match(DOMAIN);
				}
				break;
			case EXCEPTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(1694);
				match(EXCEPTION);
				}
				break;
			case FILTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1695);
				match(FILTER);
				}
				break;
			case GENERATOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(1696);
				match(GENERATOR);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 7);
				{
				setState(1697);
				match(INDEX);
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1698);
				match(PACKAGE);
				}
				break;
			case USER:
				enterOuterAlt(_localctx, 9);
				{
				setState(1699);
				match(USER);
				}
				break;
			case ROLE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1700);
				match(ROLE);
				}
				break;
			case SEQUENCE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1701);
				match(SEQUENCE);
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1702);
				match(TABLE);
				}
				break;
			case TRIGGER:
				enterOuterAlt(_localctx, 13);
				{
				setState(1703);
				match(TRIGGER);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 14);
				{
				setState(1704);
				match(VIEW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(FirebirdStatementParser.INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(FirebirdStatementParser.INTO, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			match(INSERT);
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1708);
				match(INTO);
				}
			}

			setState(1711);
			tableName();
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1712);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(1713);
				insertSelectClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertValuesClauseContext extends ParserRuleContext {
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(FirebirdStatementParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(FirebirdStatementParser.VALUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterInsertValuesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitInsertValuesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitInsertValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1716);
				columnNames();
				}
				break;
			}
			setState(1719);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1720);
			assignmentValues();
			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1721);
				match(COMMA_);
				setState(1722);
				assignmentValues();
				}
				}
				setState(1727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertSelectClauseContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSelectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterInsertSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitInsertSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitInsertSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSelectClauseContext insertSelectClause() throws RecognitionException {
		InsertSelectClauseContext _localctx = new InsertSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_insertSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 288230376151710785L) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 7881299347898369L) != 0) || _la==IDENTIFIER_) {
				{
				setState(1728);
				columnNames();
				}
			}

			setState(1731);
			select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(FirebirdStatementParser.UPDATE, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			match(UPDATE);
			setState(1734);
			tableReferences();
			setState(1735);
			setAssignmentsClause();
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1736);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(FirebirdStatementParser.VALUES, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			columnName();
			setState(1740);
			match(EQ_);
			setState(1742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1741);
				match(VALUES);
				}
				break;
			}
			setState(1745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1744);
				match(LP_);
				}
				break;
			}
			setState(1747);
			assignmentValue();
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(1748);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetAssignmentsClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSetAssignmentsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSetAssignmentsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSetAssignmentsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(SET);
			setState(1752);
			assignment();
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1753);
				match(COMMA_);
				setState(1754);
				assignment();
				}
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAssignmentValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAssignmentValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_assignmentValues);
		int _la;
		try {
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1760);
				match(LP_);
				setState(1761);
				assignmentValue();
				setState(1766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1762);
					match(COMMA_);
					setState(1763);
					assignmentValue();
					}
					}
					setState(1768);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1769);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1771);
				match(LP_);
				setState(1772);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(FirebirdStatementParser.DEFAULT, 0); }
		public BlobValueContext blobValue() {
			return getRuleContext(BlobValueContext.class,0);
		}
		public BindLiteralsContext bindLiterals() {
			return getRuleContext(BindLiteralsContext.class,0);
		}
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_assignmentValue);
		try {
			setState(1779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1775);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776);
				match(DEFAULT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1777);
				blobValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1778);
				bindLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlobValueContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public BlobValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blobValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBlobValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBlobValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBlobValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlobValueContext blobValue() throws RecognitionException {
		BlobValueContext _localctx = new BlobValueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_blobValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(FirebirdStatementParser.DELETE, 0); }
		public SingleTableClauseContext singleTableClause() {
			return getRuleContext(SingleTableClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(DELETE);
			setState(1784);
			singleTableClause();
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1785);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTableClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public SingleTableClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSingleTableClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSingleTableClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSingleTableClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableClauseContext singleTableClause() throws RecognitionException {
		SingleTableClauseContext _localctx = new SingleTableClauseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_singleTableClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			match(FROM);
			setState(1789);
			tableName();
			setState(1794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1790);
					match(AS);
					}
				}

				setState(1793);
				alias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public CombineClauseContext combineClause() {
			return getRuleContext(CombineClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1796);
				withClause();
				}
			}

			setState(1799);
			combineClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombineClauseContext extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(FirebirdStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(FirebirdStatementParser.UNION, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(FirebirdStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(FirebirdStatementParser.DISTINCT, i);
		}
		public List<TerminalNode> ALL() { return getTokens(FirebirdStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(FirebirdStatementParser.ALL, i);
		}
		public CombineClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combineClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCombineClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCombineClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCombineClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombineClauseContext combineClause() throws RecognitionException {
		CombineClauseContext _localctx = new CombineClauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_combineClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			selectClause();
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(1802);
				match(UNION);
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(1803);
					_la = _input.LA(1);
					if ( !(_la==DISTINCT || _la==ALL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1806);
				selectClause();
				}
				}
				setState(1811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(FirebirdStatementParser.SELECT, 0); }
		public ProjectionsContext projections() {
			return getRuleContext(ProjectionsContext.class,0);
		}
		public List<SelectSpecificationContext> selectSpecification() {
			return getRuleContexts(SelectSpecificationContext.class);
		}
		public SelectSpecificationContext selectSpecification(int i) {
			return getRuleContext(SelectSpecificationContext.class,i);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_selectClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(SELECT);
			setState(1816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1813);
					selectSpecification();
					}
					} 
				}
				setState(1818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			setState(1819);
			projections();
			setState(1821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1820);
				fromClause();
				}
			}

			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1823);
				whereClause();
				}
			}

			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1826);
				groupByClause();
				}
			}

			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1829);
				havingClause();
				}
			}

			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1832);
				orderByClause();
				}
			}

			setState(1836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1835);
				limitClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectSpecificationContext extends ParserRuleContext {
		public DuplicateSpecificationContext duplicateSpecification() {
			return getRuleContext(DuplicateSpecificationContext.class,0);
		}
		public SelectSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSelectSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSelectSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSelectSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSpecificationContext selectSpecification() throws RecognitionException {
		SelectSpecificationContext _localctx = new SelectSpecificationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_selectSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			duplicateSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DuplicateSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(FirebirdStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(FirebirdStatementParser.DISTINCT, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDuplicateSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDuplicateSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDuplicateSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionsContext extends ParserRuleContext {
		public UnqualifiedShorthandContext unqualifiedShorthand() {
			return getRuleContext(UnqualifiedShorthandContext.class,0);
		}
		public List<ProjectionContext> projection() {
			return getRuleContexts(ProjectionContext.class);
		}
		public ProjectionContext projection(int i) {
			return getRuleContext(ProjectionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterProjections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitProjections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitProjections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionsContext projections() throws RecognitionException {
		ProjectionsContext _localctx = new ProjectionsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_projections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1842);
				unqualifiedShorthand();
				}
				break;
			case 2:
				{
				setState(1843);
				projection();
				}
				break;
			}
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1846);
				match(COMMA_);
				setState(1847);
				projection();
				}
				}
				setState(1852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_projection);
		int _la;
		try {
			setState(1864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1853);
					columnName();
					}
					break;
				case 2:
					{
					setState(1854);
					expr(0);
					}
					break;
				}
				setState(1861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1858);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1857);
						match(AS);
						}
					}

					setState(1860);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1863);
				qualifiedShorthand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_alias);
		try {
			setState(1868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1866);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1867);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnqualifiedShorthandContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(FirebirdStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterUnqualifiedShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitUnqualifiedShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitUnqualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			match(ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedShorthandContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(FirebirdStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterQualifiedShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitQualifiedShorthand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitQualifiedShorthand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			identifier();
			setState(1873);
			match(DOT_ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public JoinedTableContext joinedTable() {
			return getRuleContext(JoinedTableContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			match(FROM);
			setState(1876);
			tableReferences();
			setState(1878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 239L) != 0)) {
				{
				setState(1877);
				joinedTable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableReferencesContext extends ParserRuleContext {
		public List<EscapedTableReferenceContext> escapedTableReference() {
			return getRuleContexts(EscapedTableReferenceContext.class);
		}
		public EscapedTableReferenceContext escapedTableReference(int i) {
			return getRuleContext(EscapedTableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTableReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTableReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			escapedTableReference();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1881);
				match(COMMA_);
				setState(1882);
				escapedTableReference();
				}
				}
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscapedTableReferenceContext extends ParserRuleContext {
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode LBE_() { return getToken(FirebirdStatementParser.LBE_, 0); }
		public TerminalNode RBE_() { return getToken(FirebirdStatementParser.RBE_, 0); }
		public EscapedTableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedTableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterEscapedTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitEscapedTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitEscapedTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapedTableReferenceContext escapedTableReference() throws RecognitionException {
		EscapedTableReferenceContext _localctx = new EscapedTableReferenceContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_escapedTableReference);
		try {
			setState(1893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1888);
				tableReference();
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889);
				match(LBE_);
				setState(1890);
				tableReference();
				setState(1891);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableReferenceContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_tableReference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			tableFactor();
			setState(1899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1896);
					joinedTable();
					}
					} 
				}
				setState(1901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTableFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTableFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_tableFactor);
		int _la;
		try {
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1902);
				tableName();
				setState(1907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1904);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1903);
						match(AS);
						}
					}

					setState(1906);
					alias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1909);
				subquery();
				setState(1914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1911);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1910);
						match(AS);
						}
					}

					setState(1913);
					alias();
					}
					break;
				}
				setState(1917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1916);
					columnNames();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1919);
				match(LP_);
				setState(1920);
				tableReferences();
				setState(1921);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinedTableContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(FirebirdStatementParser.JOIN, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(FirebirdStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(FirebirdStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(FirebirdStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(FirebirdStatementParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(FirebirdStatementParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(FirebirdStatementParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(FirebirdStatementParser.NATURAL, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterJoinedTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitJoinedTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitJoinedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_joinedTable);
		int _la;
		try {
			setState(1952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(1925);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1928);
				match(JOIN);
				}
				setState(1930);
				tableFactor();
				setState(1932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING || _la==ON) {
					{
					setState(1931);
					joinSpecification();
					}
				}

				}
				break;
			case FULL:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1934);
				_la = _input.LA(1);
				if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 25L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1935);
					match(OUTER);
					}
				}

				setState(1938);
				match(JOIN);
				setState(1939);
				tableFactor();
				setState(1940);
				joinSpecification();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1942);
				match(NATURAL);
				setState(1948);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(1943);
					match(INNER);
					}
					break;
				case FULL:
				case LEFT:
				case RIGHT:
					{
					setState(1944);
					_la = _input.LA(1);
					if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 25L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(1946);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(1945);
						match(OUTER);
						}
					}

					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(1950);
				match(JOIN);
				setState(1951);
				tableFactor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(FirebirdStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(FirebirdStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterJoinSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitJoinSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitJoinSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_joinSpecification);
		try {
			setState(1958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1954);
				match(ON);
				setState(1955);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1956);
				match(USING);
				setState(1957);
				columnNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(FirebirdStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(FirebirdStatementParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(FirebirdStatementParser.OF, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			match(WHERE);
			setState(1965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1961);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1962);
				match(CURRENT);
				setState(1963);
				match(OF);
				setState(1964);
				cursorName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(FirebirdStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(FirebirdStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			match(GROUP);
			setState(1968);
			match(BY);
			setState(1969);
			orderByItem();
			setState(1974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1970);
				match(COMMA_);
				setState(1971);
				orderByItem();
				}
				}
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(FirebirdStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(HAVING);
			setState(1978);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public CombineClauseContext combineClause() {
			return getRuleContext(CombineClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			match(LP_);
			{
			setState(1982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1981);
				withClause();
				}
			}

			setState(1984);
			combineClause();
			}
			setState(1986);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(FirebirdStatementParser.WITH, 0); }
		public List<CteClauseContext> cteClause() {
			return getRuleContexts(CteClauseContext.class);
		}
		public CteClauseContext cteClause(int i) {
			return getRuleContext(CteClauseContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(FirebirdStatementParser.RECURSIVE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(WITH);
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(1989);
				match(RECURSIVE);
				}
			}

			setState(1992);
			cteClause();
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1993);
				match(COMMA_);
				setState(1994);
				cteClause();
				}
				}
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CteClauseContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public CteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCteClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCteClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCteClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteClauseContext cteClause() throws RecognitionException {
		CteClauseContext _localctx = new CteClauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_cteClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			identifier();
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2001);
				match(LP_);
				setState(2002);
				columnNames();
				setState(2003);
				match(RP_);
				}
			}

			setState(2007);
			match(AS);
			setState(2008);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MergeContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(FirebirdStatementParser.MERGE, 0); }
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public UsingClauseContext usingClause() {
			return getRuleContext(UsingClauseContext.class,0);
		}
		public List<MergeWhenContext> mergeWhen() {
			return getRuleContexts(MergeWhenContext.class);
		}
		public MergeWhenContext mergeWhen(int i) {
			return getRuleContext(MergeWhenContext.class,i);
		}
		public TerminalNode RETURNING() { return getToken(FirebirdStatementParser.RETURNING, 0); }
		public ReturnExprListClauseContext returnExprListClause() {
			return getRuleContext(ReturnExprListClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(FirebirdStatementParser.INTO, 0); }
		public VariableListClauseContext variableListClause() {
			return getRuleContext(VariableListClauseContext.class,0);
		}
		public MergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterMerge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitMerge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitMerge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeContext merge() throws RecognitionException {
		MergeContext _localctx = new MergeContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_merge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			match(MERGE);
			setState(2011);
			intoClause();
			setState(2012);
			usingClause();
			setState(2013);
			mergeWhen();
			setState(2017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(2014);
				mergeWhen();
				}
				}
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(2020);
				match(RETURNING);
				setState(2021);
				returnExprListClause();
				setState(2024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(2022);
					match(INTO);
					setState(2023);
					variableListClause();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntoClauseContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(FirebirdStatementParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			match(INTO);
			setState(2032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(2029);
				tableName();
				}
				break;
			case 2:
				{
				setState(2030);
				viewName();
				}
				break;
			case 3:
				{
				setState(2031);
				subquery();
				}
				break;
			}
			setState(2038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 288230376151710785L) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 7881299347898369L) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
				{
				setState(2035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(2034);
					match(AS);
					}
				}

				setState(2037);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(FirebirdStatementParser.USING, 0); }
		public TerminalNode ON() { return getToken(FirebirdStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public UsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterUsingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitUsingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitUsingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingClauseContext usingClause() throws RecognitionException {
		UsingClauseContext _localctx = new UsingClauseContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_usingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			match(USING);
			setState(2046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case IDENTIFIER_:
				{
				setState(2043);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2041);
					tableName();
					}
					break;
				case 2:
					{
					setState(2042);
					viewName();
					}
					break;
				}
				}
				break;
			case LP_:
				{
				setState(2045);
				subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 288230376151710785L) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 7881299347898369L) != 0) || _la==IDENTIFIER_ || _la==STRING_) {
				{
				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(2048);
					match(AS);
					}
				}

				setState(2051);
				alias();
				}
			}

			setState(2054);
			match(ON);
			setState(2055);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MergeWhenContext extends ParserRuleContext {
		public MergeWhenMatchedContext mergeWhenMatched() {
			return getRuleContext(MergeWhenMatchedContext.class,0);
		}
		public MergeWhenNotMatchedContext mergeWhenNotMatched() {
			return getRuleContext(MergeWhenNotMatchedContext.class,0);
		}
		public MergeWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterMergeWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitMergeWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitMergeWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeWhenContext mergeWhen() throws RecognitionException {
		MergeWhenContext _localctx = new MergeWhenContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_mergeWhen);
		try {
			setState(2059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2057);
				mergeWhenMatched();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2058);
				mergeWhenNotMatched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MergeWhenMatchedContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(FirebirdStatementParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(FirebirdStatementParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(FirebirdStatementParser.THEN, 0); }
		public TerminalNode UPDATE() { return getToken(FirebirdStatementParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> EQ_() { return getTokens(FirebirdStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(FirebirdStatementParser.EQ_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DELETE() { return getToken(FirebirdStatementParser.DELETE, 0); }
		public TerminalNode AND() { return getToken(FirebirdStatementParser.AND, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public MergeWhenMatchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeWhenMatched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterMergeWhenMatched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitMergeWhenMatched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitMergeWhenMatched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeWhenMatchedContext mergeWhenMatched() throws RecognitionException {
		MergeWhenMatchedContext _localctx = new MergeWhenMatchedContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_mergeWhenMatched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			match(WHEN);
			setState(2062);
			match(MATCHED);
			setState(2065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(2063);
				match(AND);
				setState(2064);
				expr(0);
				}
			}

			setState(2067);
			match(THEN);
			setState(2084);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(2068);
				match(UPDATE);
				setState(2069);
				match(SET);
				setState(2070);
				columnName();
				setState(2071);
				match(EQ_);
				setState(2072);
				expr(0);
				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2073);
					match(COMMA_);
					{
					setState(2074);
					columnName();
					setState(2075);
					match(EQ_);
					setState(2076);
					expr(0);
					}
					}
					}
					setState(2082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DELETE:
				{
				setState(2083);
				match(DELETE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MergeWhenNotMatchedContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(FirebirdStatementParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(FirebirdStatementParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(FirebirdStatementParser.THEN, 0); }
		public TerminalNode INSERT() { return getToken(FirebirdStatementParser.INSERT, 0); }
		public TerminalNode VALUES() { return getToken(FirebirdStatementParser.VALUES, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode AND() { return getToken(FirebirdStatementParser.AND, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public MergeWhenNotMatchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeWhenNotMatched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterMergeWhenNotMatched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitMergeWhenNotMatched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitMergeWhenNotMatched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeWhenNotMatchedContext mergeWhenNotMatched() throws RecognitionException {
		MergeWhenNotMatchedContext _localctx = new MergeWhenNotMatchedContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_mergeWhenNotMatched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
			match(WHEN);
			setState(2087);
			match(NOT);
			setState(2088);
			match(MATCHED);
			setState(2091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(2089);
				match(AND);
				setState(2090);
				expr(0);
				}
			}

			setState(2093);
			match(THEN);
			setState(2094);
			match(INSERT);
			setState(2096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_ || ((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 288230376151710785L) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 7881299347898369L) != 0) || _la==IDENTIFIER_) {
				{
				setState(2095);
				columnNames();
				}
			}

			setState(2098);
			match(VALUES);
			setState(2099);
			match(LP_);
			setState(2100);
			expr(0);
			setState(2101);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_returnExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			expr(0);
			{
			setState(2105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2104);
				match(AS);
				}
			}

			setState(2107);
			alias();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExprListClauseContext extends ParserRuleContext {
		public List<ReturnExprContext> returnExpr() {
			return getRuleContexts(ReturnExprContext.class);
		}
		public ReturnExprContext returnExpr(int i) {
			return getRuleContext(ReturnExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public ReturnExprListClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExprListClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterReturnExprListClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitReturnExprListClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitReturnExprListClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExprListClauseContext returnExprListClause() throws RecognitionException {
		ReturnExprListClauseContext _localctx = new ReturnExprListClauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_returnExprListClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			returnExpr();
			setState(2114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2110);
				match(COMMA_);
				setState(2111);
				returnExpr();
				}
				}
				setState(2116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableListContext extends ParserRuleContext {
		public TerminalNode LBT_() { return getToken(FirebirdStatementParser.LBT_, 0); }
		public TerminalNode COLON_() { return getToken(FirebirdStatementParser.COLON_, 0); }
		public TerminalNode RBT_() { return getToken(FirebirdStatementParser.RBT_, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitVariableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListContext variableList() throws RecognitionException {
		VariableListContext _localctx = new VariableListContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_variableList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			match(LBT_);
			setState(2118);
			match(COLON_);
			setState(2119);
			match(RBT_);
			setState(2120);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableListClauseContext extends ParserRuleContext {
		public List<VariableListContext> variableList() {
			return getRuleContexts(VariableListContext.class);
		}
		public VariableListContext variableList(int i) {
			return getRuleContext(VariableListContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public VariableListClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableListClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterVariableListClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitVariableListClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitVariableListClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListClauseContext variableListClause() throws RecognitionException {
		VariableListClauseContext _localctx = new VariableListClauseContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_variableListClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			variableList();
			setState(2127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2123);
				match(COMMA_);
				setState(2124);
				variableList();
				}
				}
				setState(2129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(FirebirdStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterParameterMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitParameterMarker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2130);
			match(QUESTION_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_literals);
		try {
			setState(2139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2132);
				stringLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2133);
				numberLiterals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2134);
				dateTimeLiterals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2135);
				hexadecimalLiterals();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2136);
				bitValueLiterals();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2137);
				booleanLiterals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2138);
				nullValueLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterStringLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitStringLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_stringLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(2141);
				characterSetName();
				}
			}

			setState(2144);
			match(STRING_);
			setState(2146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(2145);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(FirebirdStatementParser.NUMBER_, 0); }
		public TerminalNode PLUS_() { return getToken(FirebirdStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(FirebirdStatementParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterNumberLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitNumberLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_ || _la==MINUS_) {
				{
				setState(2148);
				_la = _input.LA(1);
				if ( !(_la==PLUS_ || _la==MINUS_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2151);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateTimeLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(FirebirdStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(FirebirdStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(FirebirdStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(FirebirdStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(FirebirdStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDateTimeLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDateTimeLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDateTimeLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(2160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2153);
				_la = _input.LA(1);
				if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2154);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2155);
				match(LBE_);
				setState(2156);
				identifier();
				setState(2157);
				match(STRING_);
				setState(2158);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(FirebirdStatementParser.HEX_DIGIT_, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterHexadecimalLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitHexadecimalLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_hexadecimalLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(2162);
				characterSetName();
				}
			}

			setState(2165);
			match(HEX_DIGIT_);
			setState(2167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(2166);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(FirebirdStatementParser.BIT_NUM_, 0); }
		public CharacterSetNameContext characterSetName() {
			return getRuleContext(CharacterSetNameContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBitValueLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBitValueLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_bitValueLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(2169);
				characterSetName();
				}
			}

			setState(2172);
			match(BIT_NUM_);
			setState(2174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2173);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FirebirdStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FirebirdStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBooleanLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBooleanLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2176);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterNullValueLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitNullValueLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(FirebirdStatementParser.IDENTIFIER_, 0); }
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_identifier);
		try {
			setState(2182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(2180);
				match(IDENTIFIER_);
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2181);
				unreservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnreservedWordContext extends ParserRuleContext {
		public TerminalNode ADA() { return getToken(FirebirdStatementParser.ADA, 0); }
		public TerminalNode C92() { return getToken(FirebirdStatementParser.C92, 0); }
		public TerminalNode CATALOG_NAME() { return getToken(FirebirdStatementParser.CATALOG_NAME, 0); }
		public TerminalNode CHARACTER_SET_CATALOG() { return getToken(FirebirdStatementParser.CHARACTER_SET_CATALOG, 0); }
		public TerminalNode CHARACTER_SET_NAME() { return getToken(FirebirdStatementParser.CHARACTER_SET_NAME, 0); }
		public TerminalNode CHARACTER_SET_SCHEMA() { return getToken(FirebirdStatementParser.CHARACTER_SET_SCHEMA, 0); }
		public TerminalNode CLASS_ORIGIN() { return getToken(FirebirdStatementParser.CLASS_ORIGIN, 0); }
		public TerminalNode COBOL() { return getToken(FirebirdStatementParser.COBOL, 0); }
		public TerminalNode COLLATION_CATALOG() { return getToken(FirebirdStatementParser.COLLATION_CATALOG, 0); }
		public TerminalNode COLLATION_NAME() { return getToken(FirebirdStatementParser.COLLATION_NAME, 0); }
		public TerminalNode COLLATION_SCHEMA() { return getToken(FirebirdStatementParser.COLLATION_SCHEMA, 0); }
		public TerminalNode COLUMN_NAME() { return getToken(FirebirdStatementParser.COLUMN_NAME, 0); }
		public TerminalNode COMMAND_FUNCTION() { return getToken(FirebirdStatementParser.COMMAND_FUNCTION, 0); }
		public TerminalNode COMMITTED() { return getToken(FirebirdStatementParser.COMMITTED, 0); }
		public TerminalNode CONDITION_NUMBER() { return getToken(FirebirdStatementParser.CONDITION_NUMBER, 0); }
		public TerminalNode CONNECTION_NAME() { return getToken(FirebirdStatementParser.CONNECTION_NAME, 0); }
		public TerminalNode CONSTRAINT_CATALOG() { return getToken(FirebirdStatementParser.CONSTRAINT_CATALOG, 0); }
		public TerminalNode CONSTRAINT_NAME() { return getToken(FirebirdStatementParser.CONSTRAINT_NAME, 0); }
		public TerminalNode CONSTRAINT_SCHEMA() { return getToken(FirebirdStatementParser.CONSTRAINT_SCHEMA, 0); }
		public TerminalNode CURSOR_NAME() { return getToken(FirebirdStatementParser.CURSOR_NAME, 0); }
		public TerminalNode DATA() { return getToken(FirebirdStatementParser.DATA, 0); }
		public TerminalNode DATETIME_INTERVAL_CODE() { return getToken(FirebirdStatementParser.DATETIME_INTERVAL_CODE, 0); }
		public TerminalNode DATETIME_INTERVAL_PRECISION() { return getToken(FirebirdStatementParser.DATETIME_INTERVAL_PRECISION, 0); }
		public TerminalNode DYNAMIC_FUNCTION() { return getToken(FirebirdStatementParser.DYNAMIC_FUNCTION, 0); }
		public TerminalNode FORTRAN() { return getToken(FirebirdStatementParser.FORTRAN, 0); }
		public TerminalNode LENGTH() { return getToken(FirebirdStatementParser.LENGTH, 0); }
		public TerminalNode MESSAGE_LENGTH() { return getToken(FirebirdStatementParser.MESSAGE_LENGTH, 0); }
		public TerminalNode MESSAGE_OCTET_LENGTH() { return getToken(FirebirdStatementParser.MESSAGE_OCTET_LENGTH, 0); }
		public TerminalNode MESSAGE_TEXT() { return getToken(FirebirdStatementParser.MESSAGE_TEXT, 0); }
		public TerminalNode MORE92() { return getToken(FirebirdStatementParser.MORE92, 0); }
		public TerminalNode MUMPS() { return getToken(FirebirdStatementParser.MUMPS, 0); }
		public TerminalNode NAME() { return getToken(FirebirdStatementParser.NAME, 0); }
		public TerminalNode NULLABLE() { return getToken(FirebirdStatementParser.NULLABLE, 0); }
		public TerminalNode NUMBER() { return getToken(FirebirdStatementParser.NUMBER, 0); }
		public TerminalNode PASCAL() { return getToken(FirebirdStatementParser.PASCAL, 0); }
		public TerminalNode PLI() { return getToken(FirebirdStatementParser.PLI, 0); }
		public TerminalNode REPEATABLE() { return getToken(FirebirdStatementParser.REPEATABLE, 0); }
		public TerminalNode RETURNED_LENGTH() { return getToken(FirebirdStatementParser.RETURNED_LENGTH, 0); }
		public TerminalNode RETURNED_OCTET_LENGTH() { return getToken(FirebirdStatementParser.RETURNED_OCTET_LENGTH, 0); }
		public TerminalNode RETURNED_SQLSTATE() { return getToken(FirebirdStatementParser.RETURNED_SQLSTATE, 0); }
		public TerminalNode ROW_COUNT() { return getToken(FirebirdStatementParser.ROW_COUNT, 0); }
		public TerminalNode SCALE() { return getToken(FirebirdStatementParser.SCALE, 0); }
		public TerminalNode SCHEMA_NAME() { return getToken(FirebirdStatementParser.SCHEMA_NAME, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(FirebirdStatementParser.SERIALIZABLE, 0); }
		public TerminalNode SERVER_NAME() { return getToken(FirebirdStatementParser.SERVER_NAME, 0); }
		public TerminalNode SUBCLASS_ORIGIN() { return getToken(FirebirdStatementParser.SUBCLASS_ORIGIN, 0); }
		public TerminalNode TABLE_NAME() { return getToken(FirebirdStatementParser.TABLE_NAME, 0); }
		public TerminalNode TYPE() { return getToken(FirebirdStatementParser.TYPE, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(FirebirdStatementParser.UNCOMMITTED, 0); }
		public TerminalNode UNNAMED() { return getToken(FirebirdStatementParser.UNNAMED, 0); }
		public TerminalNode VALUE() { return getToken(FirebirdStatementParser.VALUE, 0); }
		public TerminalNode FIRSTNAME() { return getToken(FirebirdStatementParser.FIRSTNAME, 0); }
		public TerminalNode MIDDLENAME() { return getToken(FirebirdStatementParser.MIDDLENAME, 0); }
		public TerminalNode LASTNAME() { return getToken(FirebirdStatementParser.LASTNAME, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterUnreservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitUnreservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			_la = _input.LA(1);
			if ( !(((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 288230376151710785L) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & 7881299347898369L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> AT_() { return getTokens(FirebirdStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(FirebirdStatementParser.AT_, i);
		}
		public TerminalNode DOT_() { return getToken(FirebirdStatementParser.DOT_, 0); }
		public TerminalNode GLOBAL() { return getToken(FirebirdStatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(FirebirdStatementParser.LOCAL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(2187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2186);
					match(AT_);
					}
					break;
				}
				setState(2189);
				match(AT_);
				}
			}

			setState(2193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==GLOBAL) {
				{
				setState(2192);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==GLOBAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(2195);
				match(DOT_);
				}
			}

			setState(2198);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SavepointNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SavepointNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepointName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSavepointName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSavepointName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSavepointName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepointNameContext savepointName() throws RecognitionException {
		SavepointNameContext _localctx = new SavepointNameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_savepointName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(FirebirdStatementParser.DOT_, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2204);
				owner();
				setState(2205);
				match(DOT_);
				}
				break;
			}
			setState(2209);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DomainNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDomainName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDomainName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDomainName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainNameContext domainName() throws RecognitionException {
		DomainNameContext _localctx = new DomainNameContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(FirebirdStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2215);
				owner();
				setState(2216);
				match(DOT_);
				}
				break;
			}
			setState(2220);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitParameterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitParameterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollationNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCollationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCollationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_collationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoginContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLogin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PasswordContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2230);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RoleNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RoleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterRoleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitRoleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitRoleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleNameContext roleName() throws RecognitionException {
		RoleNameContext _localctx = new RoleNameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_roleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(FirebirdStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2234);
				owner();
				setState(2235);
				match(DOT_);
				}
				break;
			}
			setState(2239);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(FirebirdStatementParser.DOT_, 0); }
		public ViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterViewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitViewName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitViewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewNameContext viewName() throws RecognitionException {
		ViewNameContext _localctx = new ViewNameContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_viewName);
		try {
			setState(2248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2241);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2242);
					owner();
					setState(2243);
					match(DOT_);
					}
					break;
				}
				setState(2247);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TriggerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTriggerName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTriggerName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTriggerName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerNameContext triggerName() throws RecognitionException {
		TriggerNameContext _localctx = new TriggerNameContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_triggerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitArgumentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitArgumentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2254);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OwnerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOwner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOwner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2256);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EngineNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EngineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterEngineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitEngineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitEngineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineNameContext engineName() throws RecognitionException {
		EngineNameContext _localctx = new EngineNameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_engineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InformationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_information; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterInformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitInformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitInformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InformationContext information() throws RecognitionException {
		InformationContext _localctx = new InformationContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_information);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LocalVariableDeclarationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLocalVariableDeclarationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLocalVariableDeclarationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLocalVariableDeclarationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationNameContext localVariableDeclarationName() throws RecognitionException {
		LocalVariableDeclarationNameContext _localctx = new LocalVariableDeclarationNameContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_localVariableDeclarationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseSortNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseSortNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSortName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBaseSortName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBaseSortName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBaseSortName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSortNameContext baseSortName() throws RecognitionException {
		BaseSortNameContext _localctx = new BaseSortNameContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_baseSortName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterConstraintName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitConstraintName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitConstraintName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalModuleNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExternalModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalModuleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExternalModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExternalModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExternalModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalModuleNameContext externalModuleName() throws RecognitionException {
		ExternalModuleNameContext _localctx = new ExternalModuleNameContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_externalModuleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CursorNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CursorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCursorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCursorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCursorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorNameContext cursorName() throws RecognitionException {
		CursorNameContext _localctx = new CursorNameContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_cursorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterProcedureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitProcedureName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitProcedureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureNameContext procedureName() throws RecognitionException {
		ProcedureNameContext _localctx = new ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2272);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2274);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNamesContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_columnNames);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2276);
				match(LP_);
				}
			}

			setState(2279);
			columnName();
			setState(2284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2280);
					match(COMMA_);
					setState(2281);
					columnName();
					}
					} 
				}
				setState(2286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			setState(2288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2287);
				match(RP_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTableNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTableNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2290);
				match(LP_);
				}
			}

			setState(2293);
			tableName();
			setState(2298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2294);
				match(COMMA_);
				setState(2295);
				tableName();
				}
				}
				setState(2300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(2301);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterSetNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(FirebirdStatementParser.IDENTIFIER_, 0); }
		public CharacterSetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCharacterSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCharacterSetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCharacterSetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSetNameContext characterSetName() throws RecognitionException {
		CharacterSetNameContext _localctx = new CharacterSetNameContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_characterSetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public AndOperatorContext andOperator() {
			return getRuleContext(AndOperatorContext.class,0);
		}
		public OrOperatorContext orOperator() {
			return getRuleContext(OrOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 374;
		enterRecursionRule(_localctx, 374, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2307);
				notOperator();
				setState(2308);
				expr(3);
				}
				break;
			case 2:
				{
				setState(2310);
				match(LP_);
				setState(2311);
				expr(0);
				setState(2312);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(2314);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2317);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2318);
						andOperator();
						setState(2319);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2321);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2322);
						orOperator();
						setState(2323);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(2329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FirebirdStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(FirebirdStatementParser.AND_, 0); }
		public AndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAndOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAndOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOperatorContext andOperator() throws RecognitionException {
		AndOperatorContext _localctx = new AndOperatorContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_andOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FirebirdStatementParser.OR, 0); }
		public TerminalNode CONCAT_() { return getToken(FirebirdStatementParser.CONCAT_, 0); }
		public OrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOrOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOrOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrOperatorContext orOperator() throws RecognitionException {
		OrOperatorContext _localctx = new OrOperatorContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_orOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			_la = _input.LA(1);
			if ( !(_la==CONCAT_ || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(FirebirdStatementParser.NOT_, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterNotOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitNotOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperatorContext notOperator() throws RecognitionException {
		NotOperatorContext _localctx = new NotOperatorContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_notOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
			_la = _input.LA(1);
			if ( !(_la==NOT_ || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(FirebirdStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(FirebirdStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FirebirdStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(FirebirdStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(FirebirdStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(FirebirdStatementParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(FirebirdStatementParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(FirebirdStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBooleanPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBooleanPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBooleanPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 382;
		enterRecursionRule(_localctx, 382, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2337);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(2359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(2339);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2340);
						match(IS);
						setState(2342);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(2341);
							match(NOT);
							}
						}

						setState(2344);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 7L) != 0) || _la==UNKNOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(2345);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2346);
						match(SAFE_EQ_);
						setState(2347);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(2348);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2349);
						comparisonOperator();
						setState(2350);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(2352);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2353);
						comparisonOperator();
						setState(2354);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2355);
						subquery();
						}
						break;
					}
					} 
				}
				setState(2361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(FirebirdStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(FirebirdStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(FirebirdStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(FirebirdStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(FirebirdStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(FirebirdStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(FirebirdStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(FirebirdStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(FirebirdStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(FirebirdStatementParser.ESCAPE, 0); }
		public TerminalNode STARTING() { return getToken(FirebirdStatementParser.STARTING, 0); }
		public TerminalNode WITH() { return getToken(FirebirdStatementParser.WITH, 0); }
		public TerminalNode IS() { return getToken(FirebirdStatementParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(FirebirdStatementParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public TerminalNode SIMILAR() { return getToken(FirebirdStatementParser.SIMILAR, 0); }
		public TerminalNode TO() { return getToken(FirebirdStatementParser.TO, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_predicate);
		int _la;
		try {
			setState(2438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2365);
				bitExpr(0);
				setState(2367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2366);
					match(NOT);
					}
				}

				setState(2369);
				match(IN);
				setState(2370);
				subquery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2372);
				bitExpr(0);
				setState(2374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2373);
					match(NOT);
					}
				}

				setState(2376);
				match(IN);
				setState(2377);
				match(LP_);
				setState(2378);
				expr(0);
				setState(2383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2379);
					match(COMMA_);
					setState(2380);
					expr(0);
					}
					}
					setState(2385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2386);
				match(RP_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2388);
				bitExpr(0);
				setState(2390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2389);
					match(NOT);
					}
				}

				setState(2392);
				match(BETWEEN);
				setState(2393);
				bitExpr(0);
				setState(2394);
				match(AND);
				setState(2395);
				predicate();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2397);
				bitExpr(0);
				setState(2399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2398);
					match(NOT);
					}
				}

				setState(2401);
				match(LIKE);
				setState(2402);
				simpleExpr(0);
				setState(2405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2403);
					match(ESCAPE);
					setState(2404);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2407);
				bitExpr(0);
				setState(2409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2408);
					match(NOT);
					}
				}

				setState(2411);
				match(STARTING);
				setState(2413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2412);
					match(WITH);
					}
				}

				setState(2415);
				bitExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2417);
				bitExpr(0);
				setState(2418);
				match(IS);
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2419);
					match(NOT);
					}
				}

				setState(2422);
				match(DISTINCT);
				setState(2423);
				match(FROM);
				setState(2424);
				bitExpr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2426);
				bitExpr(0);
				setState(2428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2427);
					match(NOT);
					}
				}

				setState(2430);
				match(SIMILAR);
				setState(2431);
				match(TO);
				setState(2432);
				bitExpr(0);
				setState(2435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2433);
					match(ESCAPE);
					setState(2434);
					bitExpr(0);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2437);
				bitExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(FirebirdStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(FirebirdStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(FirebirdStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(FirebirdStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(FirebirdStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(FirebirdStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(FirebirdStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(FirebirdStatementParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(FirebirdStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(FirebirdStatementParser.CARET_, 0); }
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 388;
		enterRecursionRule(_localctx, 388, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2441);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2479);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2443);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2444);
						match(VERTICAL_BAR_);
						setState(2445);
						bitExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2446);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2447);
						match(AMPERSAND_);
						setState(2448);
						bitExpr(13);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2449);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2450);
						match(SIGNED_LEFT_SHIFT_);
						setState(2451);
						bitExpr(12);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2452);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2453);
						match(SIGNED_RIGHT_SHIFT_);
						setState(2454);
						bitExpr(11);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2455);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2456);
						match(PLUS_);
						setState(2457);
						bitExpr(10);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2458);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2459);
						match(MINUS_);
						setState(2460);
						bitExpr(9);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2461);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2462);
						match(ASTERISK_);
						setState(2463);
						bitExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2464);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2465);
						match(SLASH_);
						setState(2466);
						bitExpr(7);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2467);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2468);
						match(MOD_);
						setState(2469);
						bitExpr(6);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2470);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2471);
						match(CARET_);
						setState(2472);
						bitExpr(5);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2473);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2474);
						match(PLUS_);
						setState(2475);
						intervalExpression();
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(2476);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2477);
						match(MINUS_);
						setState(2478);
						intervalExpression();
						}
						break;
					}
					} 
				}
				setState(2483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode PLUS_() { return getToken(FirebirdStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(FirebirdStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(FirebirdStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(FirebirdStatementParser.NOT_, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(FirebirdStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(FirebirdStatementParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(FirebirdStatementParser.RBE_, 0); }
		public MatchExpressionContext matchExpression() {
			return getRuleContext(MatchExpressionContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public TimeConstantsContext timeConstants() {
			return getRuleContext(TimeConstantsContext.class,0);
		}
		public TerminalNode COLLATE() { return getToken(FirebirdStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 390;
		enterRecursionRule(_localctx, 390, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2485);
				functionCall();
				}
				break;
			case 2:
				{
				setState(2486);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(2487);
				literals();
				}
				break;
			case 4:
				{
				setState(2488);
				columnName();
				}
				break;
			case 5:
				{
				setState(2489);
				variable();
				}
				break;
			case 6:
				{
				setState(2490);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 49248L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2491);
				simpleExpr(8);
				}
				break;
			case 7:
				{
				setState(2492);
				match(LP_);
				setState(2493);
				expr(0);
				setState(2498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2494);
					match(COMMA_);
					setState(2495);
					expr(0);
					}
					}
					setState(2500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2501);
				match(RP_);
				}
				break;
			case 8:
				{
				setState(2504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(2503);
					match(EXISTS);
					}
				}

				setState(2506);
				subquery();
				}
				break;
			case 9:
				{
				setState(2507);
				match(LBE_);
				setState(2508);
				identifier();
				setState(2509);
				expr(0);
				setState(2510);
				match(RBE_);
				}
				break;
			case 10:
				{
				setState(2512);
				matchExpression();
				}
				break;
			case 11:
				{
				setState(2513);
				caseExpression();
				}
				break;
			case 12:
				{
				setState(2514);
				intervalExpression();
				}
				break;
			case 13:
				{
				setState(2515);
				timeConstants();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(2518);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(2519);
					match(COLLATE);
					setState(2522);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING_:
						{
						setState(2520);
						match(STRING_);
						}
						break;
					case NAME:
					case TYPE:
					case ADA:
					case C92:
					case CATALOG_NAME:
					case CHARACTER_SET_CATALOG:
					case CHARACTER_SET_NAME:
					case CHARACTER_SET_SCHEMA:
					case CLASS_ORIGIN:
					case COBOL:
					case COLLATION_CATALOG:
					case COLLATION_NAME:
					case COLLATION_SCHEMA:
					case COLUMN_NAME:
					case COMMAND_FUNCTION:
					case COMMITTED:
					case CONDITION_NUMBER:
					case CONNECTION_NAME:
					case CONSTRAINT_CATALOG:
					case CONSTRAINT_NAME:
					case CONSTRAINT_SCHEMA:
					case CURSOR_NAME:
					case DATA:
					case DATETIME_INTERVAL_CODE:
					case DATETIME_INTERVAL_PRECISION:
					case DYNAMIC_FUNCTION:
					case FORTRAN:
					case LENGTH:
					case MESSAGE_LENGTH:
					case MESSAGE_OCTET_LENGTH:
					case MESSAGE_TEXT:
					case MORE92:
					case MUMPS:
					case NULLABLE:
					case NUMBER:
					case PASCAL:
					case PLI:
					case REPEATABLE:
					case RETURNED_LENGTH:
					case RETURNED_OCTET_LENGTH:
					case RETURNED_SQLSTATE:
					case ROW_COUNT:
					case SCALE:
					case SCHEMA_NAME:
					case SERIALIZABLE:
					case SERVER_NAME:
					case SUBCLASS_ORIGIN:
					case TABLE_NAME:
					case UNCOMMITTED:
					case UNNAMED:
					case VALUE:
					case FIRSTNAME:
					case MIDDLENAME:
					case LASTNAME:
					case IDENTIFIER_:
						{
						setState(2521);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunctionContext specialFunction() {
			return getRuleContext(SpecialFunctionContext.class,0);
		}
		public RegularFunctionContext regularFunction() {
			return getRuleContext(RegularFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_functionCall);
		try {
			setState(2532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2529);
				aggregationFunction();
				}
				break;
			case POSITION:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case CONVERT:
			case EXTRACT:
			case ROW_NUMBER:
			case RANK:
			case DENSE_RANK:
			case LEAD:
			case LAG:
			case FIRST_VALUE:
			case LAST_VALUE:
			case NTH_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2530);
				specialFunction();
				}
				break;
			case IF:
			case INTERVAL:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case BIT_LENGTH:
			case CHAR_LENGTH:
			case CHARACTER_LENGTH:
			case COALESCE:
			case LOWER:
			case NULLIF:
			case OCTET_LENGTH:
			case UPPER:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 3);
				{
				setState(2531);
				regularFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionNameContext aggregationFunctionName() {
			return getRuleContext(AggregationFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(FirebirdStatementParser.ASTERISK_, 0); }
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2534);
			aggregationFunctionName();
			setState(2535);
			match(LP_);
			setState(2537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(2536);
				distinct();
				}
				break;
			}
			setState(2548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2539);
				expr(0);
				setState(2544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2540);
					match(COMMA_);
					setState(2541);
					expr(0);
					}
					}
					setState(2546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(2547);
				match(ASTERISK_);
				}
				break;
			}
			setState(2550);
			match(RP_);
			setState(2552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(2551);
				overClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionNameContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(FirebirdStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(FirebirdStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(FirebirdStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(FirebirdStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(FirebirdStatementParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAggregationFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAggregationFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2554);
			_la = _input.LA(1);
			if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(FirebirdStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialFunctionContext extends ParserRuleContext {
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public ConvertFunctionContext convertFunction() {
			return getRuleContext(ConvertFunctionContext.class,0);
		}
		public PositionFunctionContext positionFunction() {
			return getRuleContext(PositionFunctionContext.class,0);
		}
		public SubstringFunctionContext substringFunction() {
			return getRuleContext(SubstringFunctionContext.class,0);
		}
		public ExtractFunctionContext extractFunction() {
			return getRuleContext(ExtractFunctionContext.class,0);
		}
		public TrimFunctionContext trimFunction() {
			return getRuleContext(TrimFunctionContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSpecialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSpecialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_specialFunction);
		try {
			setState(2565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2558);
				castFunction();
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2559);
				convertFunction();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(2560);
				positionFunction();
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2561);
				substringFunction();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2562);
				extractFunction();
				}
				break;
			case TRIM:
				enterOuterAlt(_localctx, 6);
				{
				setState(2563);
				trimFunction();
				}
				break;
			case ROW_NUMBER:
			case RANK:
			case DENSE_RANK:
			case LEAD:
			case LAG:
			case FIRST_VALUE:
			case LAST_VALUE:
			case NTH_VALUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2564);
				windowFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(FirebirdStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode AS() { return getToken(FirebirdStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCastFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCastFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2567);
			match(CAST);
			setState(2568);
			match(LP_);
			setState(2571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2569);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2570);
				match(NULL);
				}
				break;
			}
			setState(2573);
			match(AS);
			setState(2574);
			dataType();
			setState(2575);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConvertFunctionContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(FirebirdStatementParser.CONVERT, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(FirebirdStatementParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public ConvertFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterConvertFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitConvertFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitConvertFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConvertFunctionContext convertFunction() throws RecognitionException {
		ConvertFunctionContext _localctx = new ConvertFunctionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_convertFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
			match(CONVERT);
			setState(2578);
			match(LP_);
			setState(2579);
			expr(0);
			setState(2580);
			match(USING);
			setState(2581);
			identifier();
			setState(2582);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositionFunctionContext extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(FirebirdStatementParser.POSITION, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(FirebirdStatementParser.IN, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public PositionFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPositionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPositionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPositionFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionFunctionContext positionFunction() throws RecognitionException {
		PositionFunctionContext _localctx = new PositionFunctionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_positionFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			match(POSITION);
			setState(2585);
			match(LP_);
			setState(2586);
			expr(0);
			setState(2587);
			match(IN);
			setState(2588);
			expr(0);
			setState(2589);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstringFunctionContext extends ParserRuleContext {
		public TerminalNode SUBSTRING() { return getToken(FirebirdStatementParser.SUBSTRING, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(FirebirdStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(FirebirdStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode FOR() { return getToken(FirebirdStatementParser.FOR, 0); }
		public SubstringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSubstringFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSubstringFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSubstringFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringFunctionContext substringFunction() throws RecognitionException {
		SubstringFunctionContext _localctx = new SubstringFunctionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_substringFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591);
			match(SUBSTRING);
			setState(2592);
			match(LP_);
			setState(2593);
			expr(0);
			setState(2594);
			match(FROM);
			setState(2595);
			match(NUMBER_);
			setState(2598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(2596);
				match(FOR);
				setState(2597);
				match(NUMBER_);
				}
			}

			setState(2600);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtractFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(FirebirdStatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public ExtractFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExtractFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExtractFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExtractFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractFunctionContext extractFunction() throws RecognitionException {
		ExtractFunctionContext _localctx = new ExtractFunctionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_extractFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602);
			match(EXTRACT);
			setState(2603);
			match(LP_);
			setState(2604);
			identifier();
			setState(2605);
			match(FROM);
			setState(2606);
			expr(0);
			setState(2607);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrimFunctionContext extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(FirebirdStatementParser.TRIM, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public TerminalNode LEADING() { return getToken(FirebirdStatementParser.LEADING, 0); }
		public TerminalNode BOTH() { return getToken(FirebirdStatementParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(FirebirdStatementParser.TRAILING, 0); }
		public TrimFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trimFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTrimFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTrimFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTrimFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrimFunctionContext trimFunction() throws RecognitionException {
		TrimFunctionContext _localctx = new TrimFunctionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_trimFunction);
		int _la;
		try {
			setState(2631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2609);
				match(TRIM);
				setState(2610);
				match(LP_);
				setState(2616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2611);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2613);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
					case 1:
						{
						setState(2612);
						expr(0);
						}
						break;
					}
					setState(2615);
					match(FROM);
					}
					break;
				}
				setState(2618);
				expr(0);
				setState(2619);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2621);
				match(TRIM);
				setState(2622);
				match(LP_);
				setState(2626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(2623);
					expr(0);
					setState(2624);
					match(FROM);
					}
					break;
				}
				setState(2628);
				expr(0);
				setState(2629);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionContext extends ParserRuleContext {
		public RegularFunctionNameContext regularFunctionName() {
			return getRuleContext(RegularFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(FirebirdStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2633);
			regularFunctionName();
			setState(2634);
			match(LP_);
			setState(2644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2635);
				expr(0);
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2636);
					match(COMMA_);
					setState(2637);
					expr(0);
					}
					}
					setState(2642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(2643);
				match(ASTERISK_);
				}
				break;
			}
			setState(2646);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(FirebirdStatementParser.IF, 0); }
		public TerminalNode INTERVAL() { return getToken(FirebirdStatementParser.INTERVAL, 0); }
		public TerminalNode CHAR_LENGTH() { return getToken(FirebirdStatementParser.CHAR_LENGTH, 0); }
		public TerminalNode CHARACTER_LENGTH() { return getToken(FirebirdStatementParser.CHARACTER_LENGTH, 0); }
		public TerminalNode BIT_LENGTH() { return getToken(FirebirdStatementParser.BIT_LENGTH, 0); }
		public TerminalNode OCTET_LENGTH() { return getToken(FirebirdStatementParser.OCTET_LENGTH, 0); }
		public TerminalNode UPPER() { return getToken(FirebirdStatementParser.UPPER, 0); }
		public TerminalNode LOWER() { return getToken(FirebirdStatementParser.LOWER, 0); }
		public TerminalNode NULLIF() { return getToken(FirebirdStatementParser.NULLIF, 0); }
		public TerminalNode COALESCE() { return getToken(FirebirdStatementParser.COALESCE, 0); }
		public RegularFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterRegularFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitRegularFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitRegularFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionNameContext regularFunctionName() throws RecognitionException {
		RegularFunctionNameContext _localctx = new RegularFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_regularFunctionName);
		try {
			setState(2659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(2648);
				identifier();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(2649);
				match(IF);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2650);
				match(INTERVAL);
				}
				break;
			case CHAR_LENGTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(2651);
				match(CHAR_LENGTH);
				}
				break;
			case CHARACTER_LENGTH:
				enterOuterAlt(_localctx, 5);
				{
				setState(2652);
				match(CHARACTER_LENGTH);
				}
				break;
			case BIT_LENGTH:
				enterOuterAlt(_localctx, 6);
				{
				setState(2653);
				match(BIT_LENGTH);
				}
				break;
			case OCTET_LENGTH:
				enterOuterAlt(_localctx, 7);
				{
				setState(2654);
				match(OCTET_LENGTH);
				}
				break;
			case UPPER:
				enterOuterAlt(_localctx, 8);
				{
				setState(2655);
				match(UPPER);
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 9);
				{
				setState(2656);
				match(LOWER);
				}
				break;
			case NULLIF:
				enterOuterAlt(_localctx, 10);
				{
				setState(2657);
				match(NULLIF);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2658);
				match(COALESCE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeConstantsContext extends ParserRuleContext {
		public TerminalNode CURRENT_DATE() { return getToken(FirebirdStatementParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(FirebirdStatementParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(FirebirdStatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(FirebirdStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(FirebirdStatementParser.LOCALTIMESTAMP, 0); }
		public TimeConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTimeConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTimeConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTimeConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeConstantsContext timeConstants() throws RecognitionException {
		TimeConstantsContext _localctx = new TimeConstantsContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_timeConstants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2661);
			_la = _input.LA(1);
			if ( !(_la==LOCALTIME || _la==LOCALTIMESTAMP || ((((_la - 246)) & ~0x3f) == 0 && ((1L << (_la - 246)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchExpressionContext extends ParserRuleContext {
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(FirebirdStatementParser.MATCH, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode PARTIAL() { return getToken(FirebirdStatementParser.PARTIAL, 0); }
		public TerminalNode FULL() { return getToken(FirebirdStatementParser.FULL, 0); }
		public TerminalNode UNIQUE() { return getToken(FirebirdStatementParser.UNIQUE, 0); }
		public MatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExpressionContext matchExpression() throws RecognitionException {
		MatchExpressionContext _localctx = new MatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_matchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2663);
			literals();
			setState(2664);
			match(MATCH);
			setState(2666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(2665);
				match(UNIQUE);
				}
			}

			setState(2668);
			_la = _input.LA(1);
			if ( !(_la==FULL || _la==PARTIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2669);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FirebirdStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(FirebirdStatementParser.END, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<CaseWhenContext> caseWhen() {
			return getRuleContexts(CaseWhenContext.class);
		}
		public CaseWhenContext caseWhen(int i) {
			return getRuleContext(CaseWhenContext.class,i);
		}
		public CaseElseContext caseElse() {
			return getRuleContext(CaseElseContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2671);
			match(CASE);
			setState(2673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 1152921556314244611L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 567453555062210589L) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & -2011037665L) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & 1152923498956488703L) != 0) || ((((_la - 273)) & ~0x3f) == 0 && ((1L << (_la - 273)) & -8070450532237410303L) != 0) || ((((_la - 356)) & ~0x3f) == 0 && ((1L << (_la - 356)) & 8935141668219257087L) != 0)) {
				{
				setState(2672);
				simpleExpr(0);
				}
			}

			setState(2676); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2675);
				caseWhen();
				}
				}
				setState(2678); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(2681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(2680);
				caseElse();
				}
			}

			setState(2683);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(FirebirdStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(FirebirdStatementParser.THEN, 0); }
		public CaseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCaseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCaseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenContext caseWhen() throws RecognitionException {
		CaseWhenContext _localctx = new CaseWhenContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_caseWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2685);
			match(WHEN);
			setState(2686);
			expr(0);
			setState(2687);
			match(THEN);
			setState(2688);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FirebirdStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCaseElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCaseElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCaseElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElseContext caseElse() throws RecognitionException {
		CaseElseContext _localctx = new CaseElseContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_caseElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2690);
			match(ELSE);
			setState(2691);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalExpressionContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(FirebirdStatementParser.INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalUnitContext intervalUnit() {
			return getRuleContext(IntervalUnitContext.class,0);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterIntervalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitIntervalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_intervalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2693);
			match(INTERVAL);
			setState(2694);
			expr(0);
			setState(2695);
			intervalUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalUnitContext extends ParserRuleContext {
		public TerminalNode MICROSECOND() { return getToken(FirebirdStatementParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(FirebirdStatementParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(FirebirdStatementParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(FirebirdStatementParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(FirebirdStatementParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(FirebirdStatementParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(FirebirdStatementParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(FirebirdStatementParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(FirebirdStatementParser.YEAR, 0); }
		public IntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnitContext intervalUnit() throws RecognitionException {
		IntervalUnitContext _localctx = new IntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_intervalUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2697);
			_la = _input.LA(1);
			if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & 511L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(FirebirdStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(FirebirdStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2699);
			match(ORDER);
			setState(2700);
			match(BY);
			setState(2701);
			orderByItem();
			setState(2706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2702);
				match(COMMA_);
				setState(2703);
				orderByItem();
				}
				}
				setState(2708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2709);
				limitClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public TerminalNode ASC() { return getToken(FirebirdStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(FirebirdStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOrderByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case IDENTIFIER_:
				{
				setState(2712);
				columnName();
				}
				break;
			case PLUS_:
			case MINUS_:
			case NUMBER_:
				{
				setState(2713);
				numberLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2716);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public RowsClauseContext rowsClause() {
			return getRuleContext(RowsClauseContext.class,0);
		}
		public OffsetDefinitionContext offsetDefinition() {
			return getRuleContext(OffsetDefinitionContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_limitClause);
		try {
			setState(2721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROWS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2719);
				rowsClause();
				}
				break;
			case OFFSET:
			case FETCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2720);
				offsetDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowsClauseContext extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(FirebirdStatementParser.ROWS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(FirebirdStatementParser.TO, 0); }
		public RowsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterRowsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitRowsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitRowsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsClauseContext rowsClause() throws RecognitionException {
		RowsClauseContext _localctx = new RowsClauseContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_rowsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2723);
			match(ROWS);
			setState(2724);
			expr(0);
			setState(2727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(2725);
				match(TO);
				setState(2726);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetDefinitionContext extends ParserRuleContext {
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public FetchClauseContext fetchClause() {
			return getRuleContext(FetchClauseContext.class,0);
		}
		public OffsetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOffsetDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOffsetDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOffsetDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetDefinitionContext offsetDefinition() throws RecognitionException {
		OffsetDefinitionContext _localctx = new OffsetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_offsetDefinition);
		try {
			setState(2734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2729);
				offsetClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2730);
				fetchClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(2731);
				offsetClause();
				setState(2732);
				fetchClause();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(FirebirdStatementParser.OFFSET, 0); }
		public LimitOffsetContext limitOffset() {
			return getRuleContext(LimitOffsetContext.class,0);
		}
		public TerminalNode ROW() { return getToken(FirebirdStatementParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(FirebirdStatementParser.ROWS, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_offsetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2736);
			match(OFFSET);
			setState(2737);
			limitOffset();
			setState(2738);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==ROW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FetchClauseContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(FirebirdStatementParser.FETCH, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(FirebirdStatementParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(FirebirdStatementParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(FirebirdStatementParser.NEXT, 0); }
		public TerminalNode ROW() { return getToken(FirebirdStatementParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(FirebirdStatementParser.ROWS, 0); }
		public FetchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterFetchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitFetchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitFetchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchClauseContext fetchClause() throws RecognitionException {
		FetchClauseContext _localctx = new FetchClauseContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2740);
			match(FETCH);
			setState(2741);
			_la = _input.LA(1);
			if ( !(_la==NEXT || _la==FIRST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2742);
			limitRowCount();
			setState(2743);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==ROW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2744);
			match(ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitRowCountContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public BindLiteralsContext bindLiterals() {
			return getRuleContext(BindLiteralsContext.class,0);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLimitRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLimitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLimitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_limitRowCount);
		try {
			setState(2749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_:
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(2746);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2747);
				parameterMarker();
				}
				break;
			case COLON_:
				enterOuterAlt(_localctx, 3);
				{
				setState(2748);
				bindLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitOffsetContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public BindLiteralsContext bindLiterals() {
			return getRuleContext(BindLiteralsContext.class,0);
		}
		public LimitOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLimitOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLimitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLimitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitOffsetContext limitOffset() throws RecognitionException {
		LimitOffsetContext _localctx = new LimitOffsetContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_limitOffset);
		try {
			setState(2754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_:
			case MINUS_:
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(2751);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(2752);
				parameterMarker();
				}
				break;
			case COLON_:
				enterOuterAlt(_localctx, 3);
				{
				setState(2753);
				bindLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CharacterSetContext characterSet() {
			return getRuleContext(CharacterSetContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(FirebirdStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(FirebirdStatementParser.STRING_, i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public TerminalNode LBT_() { return getToken(FirebirdStatementParser.LBT_, 0); }
		public TerminalNode RBT_() { return getToken(FirebirdStatementParser.RBT_, 0); }
		public TerminalNode COLON_() { return getToken(FirebirdStatementParser.COLON_, 0); }
		public TerminalNode NUMBER() { return getToken(FirebirdStatementParser.NUMBER, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(FirebirdStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(FirebirdStatementParser.NUMBER_, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_dataType);
		int _la;
		try {
			setState(2802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2756);
				dataTypeName();
				setState(2758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2757);
					dataTypeLength();
					}
				}

				setState(2761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2760);
					characterSet();
					}
					break;
				}
				setState(2764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(2763);
					collateClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2766);
				dataTypeName();
				setState(2767);
				match(LP_);
				setState(2768);
				match(STRING_);
				setState(2773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2769);
					match(COMMA_);
					setState(2770);
					match(STRING_);
					}
					}
					setState(2775);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2776);
				match(RP_);
				setState(2778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
				case 1:
					{
					setState(2777);
					characterSet();
					}
					break;
				}
				setState(2781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2780);
					collateClause();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2783);
				dataTypeName();
				setState(2784);
				match(LBT_);
				setState(2798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2786);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NUMBER_) {
						{
						setState(2785);
						match(NUMBER_);
						}
					}

					setState(2788);
					match(COLON_);
					setState(2789);
					match(NUMBER);
					}
					break;
				case 2:
					{
					setState(2790);
					match(NUMBER_);
					setState(2795);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_) {
						{
						{
						setState(2791);
						match(COMMA_);
						setState(2792);
						match(NUMBER_);
						}
						}
						setState(2797);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2800);
				match(RBT_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeNameContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(FirebirdStatementParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(FirebirdStatementParser.VARYING, 0); }
		public TerminalNode CHAR() { return getToken(FirebirdStatementParser.CHAR, 0); }
		public TerminalNode NATIONAL() { return getToken(FirebirdStatementParser.NATIONAL, 0); }
		public TerminalNode VARCHAR() { return getToken(FirebirdStatementParser.VARCHAR, 0); }
		public TerminalNode NCHAR() { return getToken(FirebirdStatementParser.NCHAR, 0); }
		public TerminalNode BIT() { return getToken(FirebirdStatementParser.BIT, 0); }
		public TerminalNode NUMERIC() { return getToken(FirebirdStatementParser.NUMERIC, 0); }
		public TerminalNode DECIMAL() { return getToken(FirebirdStatementParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(FirebirdStatementParser.DEC, 0); }
		public TerminalNode INTEGER() { return getToken(FirebirdStatementParser.INTEGER, 0); }
		public TerminalNode SMALLINT() { return getToken(FirebirdStatementParser.SMALLINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(FirebirdStatementParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(FirebirdStatementParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(FirebirdStatementParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(FirebirdStatementParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(FirebirdStatementParser.PRECISION, 0); }
		public TerminalNode DATE() { return getToken(FirebirdStatementParser.DATE, 0); }
		public List<TerminalNode> TIME() { return getTokens(FirebirdStatementParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(FirebirdStatementParser.TIME, i);
		}
		public TerminalNode TIMESTAMP() { return getToken(FirebirdStatementParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(FirebirdStatementParser.INTERVAL, 0); }
		public TerminalNode WITH() { return getToken(FirebirdStatementParser.WITH, 0); }
		public TerminalNode ZONE() { return getToken(FirebirdStatementParser.ZONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDataTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDataTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_dataTypeName);
		try {
			setState(2848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2804);
				match(CHARACTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2805);
				match(CHARACTER);
				setState(2806);
				match(VARYING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2807);
				match(CHAR);
				setState(2808);
				match(VARYING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2809);
				match(NATIONAL);
				setState(2810);
				match(CHARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2811);
				match(NATIONAL);
				setState(2812);
				match(CHARACTER);
				setState(2813);
				match(VARYING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2814);
				match(CHAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2815);
				match(VARCHAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2816);
				match(NCHAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2817);
				match(NATIONAL);
				setState(2818);
				match(CHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2819);
				match(NATIONAL);
				setState(2820);
				match(CHAR);
				setState(2821);
				match(VARYING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2822);
				match(BIT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2823);
				match(BIT);
				setState(2824);
				match(VARYING);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2825);
				match(NUMERIC);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2826);
				match(DECIMAL);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2827);
				match(DEC);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2828);
				match(INTEGER);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2829);
				match(SMALLINT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2830);
				match(BOOLEAN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2831);
				match(FLOAT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2832);
				match(REAL);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2833);
				match(DOUBLE);
				setState(2834);
				match(PRECISION);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2835);
				match(DATE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2836);
				match(TIME);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2837);
				match(TIMESTAMP);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2838);
				match(INTERVAL);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2839);
				match(TIME);
				setState(2840);
				match(WITH);
				setState(2841);
				match(TIME);
				setState(2842);
				match(ZONE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2843);
				match(TIMESTAMP);
				setState(2844);
				match(WITH);
				setState(2845);
				match(TIME);
				setState(2846);
				match(ZONE);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2847);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(FirebirdStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(FirebirdStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(FirebirdStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDataTypeLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDataTypeLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2850);
			match(LP_);
			setState(2851);
			match(NUMBER_);
			setState(2854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(2852);
				match(COMMA_);
				setState(2853);
				match(NUMBER_);
				}
			}

			setState(2856);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterSetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(FirebirdStatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(FirebirdStatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public CharacterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCharacterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCharacterSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCharacterSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSetContext characterSet() throws RecognitionException {
		CharacterSetContext _localctx = new CharacterSetContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_characterSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2858);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2859);
			match(SET);
			setState(2861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(2860);
				match(EQ_);
				}
			}

			setState(2863);
			ignoredIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollateClauseContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(FirebirdStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCollateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCollateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCollateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_collateClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2865);
			match(COLLATE);
			setState(2867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(2866);
				match(EQ_);
				}
			}

			setState(2871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(2869);
				match(STRING_);
				}
				break;
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case IDENTIFIER_:
				{
				setState(2870);
				ignoredIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IgnoredIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT_() { return getToken(FirebirdStatementParser.DOT_, 0); }
		public IgnoredIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterIgnoredIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitIgnoredIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitIgnoredIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifierContext ignoredIdentifier() throws RecognitionException {
		IgnoredIdentifierContext _localctx = new IgnoredIdentifierContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_ignoredIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2873);
			identifier();
			setState(2876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				{
				setState(2874);
				match(DOT_);
				setState(2875);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DropBehaviourContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(FirebirdStatementParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(FirebirdStatementParser.RESTRICT, 0); }
		public DropBehaviourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropBehaviour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDropBehaviour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDropBehaviour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDropBehaviour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropBehaviourContext dropBehaviour() throws RecognitionException {
		DropBehaviourContext _localctx = new DropBehaviourContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_dropBehaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(2878);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowFunctionContext extends ParserRuleContext {
		public Token funcName;
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(FirebirdStatementParser.ROW_NUMBER, 0); }
		public TerminalNode RANK() { return getToken(FirebirdStatementParser.RANK, 0); }
		public TerminalNode DENSE_RANK() { return getToken(FirebirdStatementParser.DENSE_RANK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(FirebirdStatementParser.ASTERISK_, 0); }
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public TerminalNode LEAD() { return getToken(FirebirdStatementParser.LEAD, 0); }
		public TerminalNode LAG() { return getToken(FirebirdStatementParser.LAG, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(FirebirdStatementParser.FIRST_VALUE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(FirebirdStatementParser.LAST_VALUE, 0); }
		public TerminalNode NTH_VALUE() { return getToken(FirebirdStatementParser.NTH_VALUE, 0); }
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterWindowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitWindowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitWindowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_windowFunction);
		int _la;
		try {
			setState(2915);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW_NUMBER:
			case RANK:
			case DENSE_RANK:
				enterOuterAlt(_localctx, 1);
				{
				setState(2881);
				((WindowFunctionContext)_localctx).funcName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 356)) & ~0x3f) == 0 && ((1L << (_la - 356)) & 7L) != 0)) ) {
					((WindowFunctionContext)_localctx).funcName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2882);
				match(LP_);
				setState(2892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2883);
					expr(0);
					setState(2888);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_) {
						{
						{
						setState(2884);
						match(COMMA_);
						setState(2885);
						expr(0);
						}
						}
						setState(2890);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2891);
					match(ASTERISK_);
					}
					break;
				}
				setState(2894);
				match(RP_);
				setState(2896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2895);
					overClause();
					}
					break;
				}
				}
				break;
			case LEAD:
			case LAG:
			case FIRST_VALUE:
			case LAST_VALUE:
			case NTH_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2898);
				((WindowFunctionContext)_localctx).funcName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 359)) & ~0x3f) == 0 && ((1L << (_la - 359)) & 31L) != 0)) ) {
					((WindowFunctionContext)_localctx).funcName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2899);
				match(LP_);
				setState(2909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
				case 1:
					{
					setState(2900);
					expr(0);
					setState(2905);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_) {
						{
						{
						setState(2901);
						match(COMMA_);
						setState(2902);
						expr(0);
						}
						}
						setState(2907);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2908);
					match(ASTERISK_);
					}
					break;
				}
				setState(2911);
				match(RP_);
				setState(2913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2912);
					overClause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OverClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(FirebirdStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TerminalNode PARTITION() { return getToken(FirebirdStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(FirebirdStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOverClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOverClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOverClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_overClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2917);
			match(OVER);
			setState(2918);
			match(LP_);
			setState(2929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(2919);
				match(PARTITION);
				setState(2920);
				match(BY);
				setState(2921);
				expr(0);
				setState(2926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2922);
					match(COMMA_);
					setState(2923);
					expr(0);
					}
					}
					setState(2928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2931);
				orderByClause();
				}
			}

			setState(2934);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeCollationContext extends ParserRuleContext {
		public List<TerminalNode> SQ_() { return getTokens(FirebirdStatementParser.SQ_); }
		public TerminalNode SQ_(int i) {
			return getToken(FirebirdStatementParser.SQ_, i);
		}
		public AttributeCollationNameContext attributeCollationName() {
			return getRuleContext(AttributeCollationNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public TerminalNode NUMBER_() { return getToken(FirebirdStatementParser.NUMBER_, 0); }
		public AttributeCollationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeCollation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAttributeCollation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAttributeCollation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAttributeCollation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeCollationContext attributeCollation() throws RecognitionException {
		AttributeCollationContext _localctx = new AttributeCollationContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_attributeCollation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2936);
			match(SQ_);
			setState(2937);
			attributeCollationName();
			setState(2938);
			match(EQ_);
			setState(2939);
			_la = _input.LA(1);
			if ( !(_la==STRING_ || _la==NUMBER_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2940);
			match(SQ_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeCollationNameContext extends ParserRuleContext {
		public TerminalNode DISABLE_COMPRESSIONS() { return getToken(FirebirdStatementParser.DISABLE_COMPRESSIONS, 0); }
		public TerminalNode DISABLE_EXPANSIONS() { return getToken(FirebirdStatementParser.DISABLE_EXPANSIONS, 0); }
		public TerminalNode ICU_VERSION() { return getToken(FirebirdStatementParser.ICU_VERSION, 0); }
		public TerminalNode LOCALE() { return getToken(FirebirdStatementParser.LOCALE, 0); }
		public TerminalNode MULTI_LEVEL() { return getToken(FirebirdStatementParser.MULTI_LEVEL, 0); }
		public TerminalNode NUMERIC_SORT() { return getToken(FirebirdStatementParser.NUMERIC_SORT, 0); }
		public TerminalNode SPECIALS_FIRST() { return getToken(FirebirdStatementParser.SPECIALS_FIRST, 0); }
		public AttributeCollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeCollationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAttributeCollationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAttributeCollationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAttributeCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeCollationNameContext attributeCollationName() throws RecognitionException {
		AttributeCollationNameContext _localctx = new AttributeCollationNameContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_attributeCollationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2942);
			_la = _input.LA(1);
			if ( !(((((_la - 374)) & ~0x3f) == 0 && ((1L << (_la - 374)) & 127L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public ContextVariablesContext contextVariables() {
			return getRuleContext(ContextVariablesContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				{
				setState(2944);
				literals();
				}
				break;
			case 2:
				{
				setState(2945);
				match(NULL);
				}
				break;
			case 3:
				{
				setState(2946);
				contextVariables();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContextVariablesContext extends ParserRuleContext {
		public TerminalNode CURRENT_CONNECTION() { return getToken(FirebirdStatementParser.CURRENT_CONNECTION, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(FirebirdStatementParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_ROLE() { return getToken(FirebirdStatementParser.CURRENT_ROLE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(FirebirdStatementParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(FirebirdStatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_TRANSACTION() { return getToken(FirebirdStatementParser.CURRENT_TRANSACTION, 0); }
		public TerminalNode CURRENT_USER() { return getToken(FirebirdStatementParser.CURRENT_USER, 0); }
		public TerminalNode INSERTING() { return getToken(FirebirdStatementParser.INSERTING, 0); }
		public TerminalNode UPDATING() { return getToken(FirebirdStatementParser.UPDATING, 0); }
		public TerminalNode DELETING() { return getToken(FirebirdStatementParser.DELETING, 0); }
		public TerminalNode NEW() { return getToken(FirebirdStatementParser.NEW, 0); }
		public TerminalNode NOW() { return getToken(FirebirdStatementParser.NOW, 0); }
		public TerminalNode OLD() { return getToken(FirebirdStatementParser.OLD, 0); }
		public TerminalNode ROW_COUNT() { return getToken(FirebirdStatementParser.ROW_COUNT, 0); }
		public TerminalNode SQLCODE() { return getToken(FirebirdStatementParser.SQLCODE, 0); }
		public TerminalNode GDSCODE() { return getToken(FirebirdStatementParser.GDSCODE, 0); }
		public TerminalNode SQLSTATE() { return getToken(FirebirdStatementParser.SQLSTATE, 0); }
		public TerminalNode TODAY() { return getToken(FirebirdStatementParser.TODAY, 0); }
		public TerminalNode TOMORROW() { return getToken(FirebirdStatementParser.TOMORROW, 0); }
		public TerminalNode USER() { return getToken(FirebirdStatementParser.USER, 0); }
		public TerminalNode YESTERDAY() { return getToken(FirebirdStatementParser.YESTERDAY, 0); }
		public ContextVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterContextVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitContextVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitContextVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextVariablesContext contextVariables() throws RecognitionException {
		ContextVariablesContext _localctx = new ContextVariablesContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_contextVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2949);
			_la = _input.LA(1);
			if ( !(_la==CURRENT_USER || _la==ROW_COUNT || ((((_la - 246)) & ~0x3f) == 0 && ((1L << (_la - 246)) & 7L) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & 16389L) != 0) || ((((_la - 419)) & ~0x3f) == 0 && ((1L << (_la - 419)) & 8191L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncementArgumentContext extends ParserRuleContext {
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public TypeDescriptionArgumentContext typeDescriptionArgument() {
			return getRuleContext(TypeDescriptionArgumentContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FirebirdStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(FirebirdStatementParser.NULL, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public AnnouncementArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcementArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncementArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncementArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncementArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncementArgumentContext announcementArgument() throws RecognitionException {
		AnnouncementArgumentContext _localctx = new AnnouncementArgumentContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_announcementArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2951);
			argumentName();
			setState(2952);
			typeDescriptionArgument();
			setState(2955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2953);
				match(NOT);
				setState(2954);
				match(NULL);
				}
			}

			setState(2958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(2957);
				collateClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnouncementArgumentClauseContext extends ParserRuleContext {
		public List<AnnouncementArgumentContext> announcementArgument() {
			return getRuleContexts(AnnouncementArgumentContext.class);
		}
		public AnnouncementArgumentContext announcementArgument(int i) {
			return getRuleContext(AnnouncementArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public AnnouncementArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_announcementArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAnnouncementArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAnnouncementArgumentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAnnouncementArgumentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnouncementArgumentClauseContext announcementArgumentClause() throws RecognitionException {
		AnnouncementArgumentClauseContext _localctx = new AnnouncementArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_announcementArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2960);
			announcementArgument();
			setState(2965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2961);
				match(COMMA_);
				setState(2962);
				announcementArgument();
				}
				}
				setState(2967);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDescriptionArgumentContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DomainNameContext domainName() {
			return getRuleContext(DomainNameContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(FirebirdStatementParser.TYPE, 0); }
		public TerminalNode OF() { return getToken(FirebirdStatementParser.OF, 0); }
		public TerminalNode COLUMN() { return getToken(FirebirdStatementParser.COLUMN, 0); }
		public TerminalNode DOT_() { return getToken(FirebirdStatementParser.DOT_, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public TypeDescriptionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDescriptionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTypeDescriptionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTypeDescriptionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTypeDescriptionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDescriptionArgumentContext typeDescriptionArgument() throws RecognitionException {
		TypeDescriptionArgumentContext _localctx = new TypeDescriptionArgumentContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_typeDescriptionArgument);
		try {
			setState(2984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2968);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
				case 1:
					{
					setState(2969);
					match(TYPE);
					setState(2970);
					match(OF);
					}
					break;
				}
				setState(2973);
				domainName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2974);
				match(TYPE);
				setState(2975);
				match(OF);
				setState(2976);
				match(COLUMN);
				setState(2979);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
				case 1:
					{
					setState(2977);
					tableName();
					}
					break;
				case 2:
					{
					setState(2978);
					viewName();
					}
					break;
				}
				setState(2981);
				match(DOT_);
				setState(2982);
				columnName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalModuleContext extends ParserRuleContext {
		public List<TerminalNode> EQ_() { return getTokens(FirebirdStatementParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(FirebirdStatementParser.EQ_, i);
		}
		public ExternalModuleNameContext externalModuleName() {
			return getRuleContext(ExternalModuleNameContext.class,0);
		}
		public List<TerminalNode> NOT_() { return getTokens(FirebirdStatementParser.NOT_); }
		public TerminalNode NOT_(int i) {
			return getToken(FirebirdStatementParser.NOT_, i);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public InformationContext information() {
			return getRuleContext(InformationContext.class,0);
		}
		public ExternalModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterExternalModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitExternalModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitExternalModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalModuleContext externalModule() throws RecognitionException {
		ExternalModuleContext _localctx = new ExternalModuleContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_externalModule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2986);
			match(EQ_);
			setState(2987);
			externalModuleName();
			setState(2988);
			match(NOT_);
			setState(2989);
			functionName();
			setState(2992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_) {
				{
				setState(2990);
				match(NOT_);
				setState(2991);
				information();
				}
			}

			setState(2994);
			match(EQ_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortOrderContext extends ParserRuleContext {
		public TerminalNode DOS850() { return getToken(FirebirdStatementParser.DOS850, 0); }
		public TerminalNode DB_DEU850() { return getToken(FirebirdStatementParser.DB_DEU850, 0); }
		public TerminalNode DB_ESP850() { return getToken(FirebirdStatementParser.DB_ESP850, 0); }
		public TerminalNode DB_FRA850() { return getToken(FirebirdStatementParser.DB_FRA850, 0); }
		public TerminalNode DB_FRC850() { return getToken(FirebirdStatementParser.DB_FRC850, 0); }
		public TerminalNode DB_ITA850() { return getToken(FirebirdStatementParser.DB_ITA850, 0); }
		public TerminalNode DB_NLD850() { return getToken(FirebirdStatementParser.DB_NLD850, 0); }
		public TerminalNode DB_PTB850() { return getToken(FirebirdStatementParser.DB_PTB850, 0); }
		public TerminalNode DB_SVE850() { return getToken(FirebirdStatementParser.DB_SVE850, 0); }
		public TerminalNode DB_UK850() { return getToken(FirebirdStatementParser.DB_UK850, 0); }
		public TerminalNode DB_US850() { return getToken(FirebirdStatementParser.DB_US850, 0); }
		public TerminalNode DOS852() { return getToken(FirebirdStatementParser.DOS852, 0); }
		public TerminalNode DB_CSY() { return getToken(FirebirdStatementParser.DB_CSY, 0); }
		public TerminalNode DB_PLK() { return getToken(FirebirdStatementParser.DB_PLK, 0); }
		public TerminalNode DB_SLO() { return getToken(FirebirdStatementParser.DB_SLO, 0); }
		public TerminalNode PDOX_CSY() { return getToken(FirebirdStatementParser.PDOX_CSY, 0); }
		public TerminalNode PDOX_HUN() { return getToken(FirebirdStatementParser.PDOX_HUN, 0); }
		public TerminalNode PDOX_PLK() { return getToken(FirebirdStatementParser.PDOX_PLK, 0); }
		public TerminalNode PDOX_SLO() { return getToken(FirebirdStatementParser.PDOX_SLO, 0); }
		public TerminalNode DOS857() { return getToken(FirebirdStatementParser.DOS857, 0); }
		public TerminalNode DB_TRK() { return getToken(FirebirdStatementParser.DB_TRK, 0); }
		public TerminalNode DOS858() { return getToken(FirebirdStatementParser.DOS858, 0); }
		public TerminalNode DOS860() { return getToken(FirebirdStatementParser.DOS860, 0); }
		public TerminalNode DB_PTG860() { return getToken(FirebirdStatementParser.DB_PTG860, 0); }
		public TerminalNode DOS861() { return getToken(FirebirdStatementParser.DOS861, 0); }
		public TerminalNode PDOX_IS() { return getToken(FirebirdStatementParser.PDOX_IS, 0); }
		public TerminalNode DOS862() { return getToken(FirebirdStatementParser.DOS862, 0); }
		public TerminalNode DOS863() { return getToken(FirebirdStatementParser.DOS863, 0); }
		public TerminalNode DB_FRC863() { return getToken(FirebirdStatementParser.DB_FRC863, 0); }
		public TerminalNode DOS864() { return getToken(FirebirdStatementParser.DOS864, 0); }
		public TerminalNode DOS865() { return getToken(FirebirdStatementParser.DOS865, 0); }
		public TerminalNode DB_DAN865() { return getToken(FirebirdStatementParser.DB_DAN865, 0); }
		public TerminalNode DB_NOR865() { return getToken(FirebirdStatementParser.DB_NOR865, 0); }
		public TerminalNode PDOX_NORDAN4() { return getToken(FirebirdStatementParser.PDOX_NORDAN4, 0); }
		public TerminalNode DOS866() { return getToken(FirebirdStatementParser.DOS866, 0); }
		public TerminalNode DOS869() { return getToken(FirebirdStatementParser.DOS869, 0); }
		public TerminalNode EUCJ_0208() { return getToken(FirebirdStatementParser.EUCJ_0208, 0); }
		public TerminalNode GB_2312() { return getToken(FirebirdStatementParser.GB_2312, 0); }
		public TerminalNode ISO8859_1() { return getToken(FirebirdStatementParser.ISO8859_1, 0); }
		public TerminalNode DA_DA() { return getToken(FirebirdStatementParser.DA_DA, 0); }
		public TerminalNode DE_DE() { return getToken(FirebirdStatementParser.DE_DE, 0); }
		public TerminalNode DU_NL() { return getToken(FirebirdStatementParser.DU_NL, 0); }
		public TerminalNode EN_UK() { return getToken(FirebirdStatementParser.EN_UK, 0); }
		public TerminalNode EN_US() { return getToken(FirebirdStatementParser.EN_US, 0); }
		public TerminalNode ES_ES() { return getToken(FirebirdStatementParser.ES_ES, 0); }
		public TerminalNode ES_ES_CI_AI() { return getToken(FirebirdStatementParser.ES_ES_CI_AI, 0); }
		public TerminalNode FI_FI() { return getToken(FirebirdStatementParser.FI_FI, 0); }
		public TerminalNode FR_CA() { return getToken(FirebirdStatementParser.FR_CA, 0); }
		public TerminalNode FR_FR() { return getToken(FirebirdStatementParser.FR_FR, 0); }
		public TerminalNode IS_IS() { return getToken(FirebirdStatementParser.IS_IS, 0); }
		public TerminalNode IT_IT() { return getToken(FirebirdStatementParser.IT_IT, 0); }
		public TerminalNode NO_NO() { return getToken(FirebirdStatementParser.NO_NO, 0); }
		public TerminalNode PT_PT() { return getToken(FirebirdStatementParser.PT_PT, 0); }
		public TerminalNode PT_BR() { return getToken(FirebirdStatementParser.PT_BR, 0); }
		public TerminalNode SV_SV() { return getToken(FirebirdStatementParser.SV_SV, 0); }
		public TerminalNode ISO8859_2() { return getToken(FirebirdStatementParser.ISO8859_2, 0); }
		public TerminalNode CS_CZ() { return getToken(FirebirdStatementParser.CS_CZ, 0); }
		public TerminalNode ISO_HUN() { return getToken(FirebirdStatementParser.ISO_HUN, 0); }
		public TerminalNode ISO_PLK() { return getToken(FirebirdStatementParser.ISO_PLK, 0); }
		public TerminalNode ISO8859_3() { return getToken(FirebirdStatementParser.ISO8859_3, 0); }
		public TerminalNode ISO8859_4() { return getToken(FirebirdStatementParser.ISO8859_4, 0); }
		public TerminalNode ISO8859_5() { return getToken(FirebirdStatementParser.ISO8859_5, 0); }
		public TerminalNode ISO8859_6() { return getToken(FirebirdStatementParser.ISO8859_6, 0); }
		public TerminalNode ISO8859_7() { return getToken(FirebirdStatementParser.ISO8859_7, 0); }
		public TerminalNode ISO8859_8() { return getToken(FirebirdStatementParser.ISO8859_8, 0); }
		public TerminalNode ISO8859_9() { return getToken(FirebirdStatementParser.ISO8859_9, 0); }
		public TerminalNode ISO8859_13() { return getToken(FirebirdStatementParser.ISO8859_13, 0); }
		public TerminalNode LT_LT() { return getToken(FirebirdStatementParser.LT_LT, 0); }
		public TerminalNode KOI8R() { return getToken(FirebirdStatementParser.KOI8R, 0); }
		public TerminalNode KOI8R_RU() { return getToken(FirebirdStatementParser.KOI8R_RU, 0); }
		public TerminalNode KOI8U() { return getToken(FirebirdStatementParser.KOI8U, 0); }
		public TerminalNode KOI8R_UA() { return getToken(FirebirdStatementParser.KOI8R_UA, 0); }
		public TerminalNode KSC_5601() { return getToken(FirebirdStatementParser.KSC_5601, 0); }
		public TerminalNode KSC_DIC_TIONAR() { return getToken(FirebirdStatementParser.KSC_DIC_TIONAR, 0); }
		public TerminalNode NEXT() { return getToken(FirebirdStatementParser.NEXT, 0); }
		public TerminalNode NXT_DEU() { return getToken(FirebirdStatementParser.NXT_DEU, 0); }
		public TerminalNode NXT_ESP() { return getToken(FirebirdStatementParser.NXT_ESP, 0); }
		public TerminalNode NXT_FRA() { return getToken(FirebirdStatementParser.NXT_FRA, 0); }
		public TerminalNode NXT_ITA() { return getToken(FirebirdStatementParser.NXT_ITA, 0); }
		public TerminalNode NXT_US() { return getToken(FirebirdStatementParser.NXT_US, 0); }
		public TerminalNode NONE() { return getToken(FirebirdStatementParser.NONE, 0); }
		public TerminalNode OCTETS() { return getToken(FirebirdStatementParser.OCTETS, 0); }
		public TerminalNode SJIS_0208() { return getToken(FirebirdStatementParser.SJIS_0208, 0); }
		public TerminalNode UNICODE_FSS() { return getToken(FirebirdStatementParser.UNICODE_FSS, 0); }
		public TerminalNode UTF8() { return getToken(FirebirdStatementParser.UTF8, 0); }
		public TerminalNode USC_BASIC() { return getToken(FirebirdStatementParser.USC_BASIC, 0); }
		public TerminalNode UNICODE() { return getToken(FirebirdStatementParser.UNICODE, 0); }
		public TerminalNode WIN1250() { return getToken(FirebirdStatementParser.WIN1250, 0); }
		public TerminalNode BS_BA() { return getToken(FirebirdStatementParser.BS_BA, 0); }
		public TerminalNode PXW_CSY() { return getToken(FirebirdStatementParser.PXW_CSY, 0); }
		public TerminalNode PXW_HUN() { return getToken(FirebirdStatementParser.PXW_HUN, 0); }
		public TerminalNode PXW_HUNDC() { return getToken(FirebirdStatementParser.PXW_HUNDC, 0); }
		public TerminalNode PXW_PLK() { return getToken(FirebirdStatementParser.PXW_PLK, 0); }
		public TerminalNode PXW_SLOV() { return getToken(FirebirdStatementParser.PXW_SLOV, 0); }
		public TerminalNode WIN_CZ() { return getToken(FirebirdStatementParser.WIN_CZ, 0); }
		public TerminalNode WIN_CZ_CI_AI() { return getToken(FirebirdStatementParser.WIN_CZ_CI_AI, 0); }
		public TerminalNode WIN1251() { return getToken(FirebirdStatementParser.WIN1251, 0); }
		public TerminalNode WIN1251_UA() { return getToken(FirebirdStatementParser.WIN1251_UA, 0); }
		public TerminalNode PXW_CYRL() { return getToken(FirebirdStatementParser.PXW_CYRL, 0); }
		public TerminalNode WIN1252() { return getToken(FirebirdStatementParser.WIN1252, 0); }
		public TerminalNode PXW_INTL() { return getToken(FirebirdStatementParser.PXW_INTL, 0); }
		public TerminalNode PXW_INTL850() { return getToken(FirebirdStatementParser.PXW_INTL850, 0); }
		public TerminalNode PXW_NORDAN4() { return getToken(FirebirdStatementParser.PXW_NORDAN4, 0); }
		public TerminalNode PXW_SPAN() { return getToken(FirebirdStatementParser.PXW_SPAN, 0); }
		public TerminalNode PXW_SWEDFIN() { return getToken(FirebirdStatementParser.PXW_SWEDFIN, 0); }
		public TerminalNode WIN_PTBR() { return getToken(FirebirdStatementParser.WIN_PTBR, 0); }
		public TerminalNode WIN1253() { return getToken(FirebirdStatementParser.WIN1253, 0); }
		public TerminalNode PXW_GREEK() { return getToken(FirebirdStatementParser.PXW_GREEK, 0); }
		public TerminalNode WIN1254() { return getToken(FirebirdStatementParser.WIN1254, 0); }
		public TerminalNode PXW_TURK() { return getToken(FirebirdStatementParser.PXW_TURK, 0); }
		public TerminalNode WIN1255() { return getToken(FirebirdStatementParser.WIN1255, 0); }
		public TerminalNode WIN1256() { return getToken(FirebirdStatementParser.WIN1256, 0); }
		public TerminalNode WIN1257() { return getToken(FirebirdStatementParser.WIN1257, 0); }
		public TerminalNode WIN1257_EE() { return getToken(FirebirdStatementParser.WIN1257_EE, 0); }
		public TerminalNode WIN1257_LT() { return getToken(FirebirdStatementParser.WIN1257_LT, 0); }
		public TerminalNode WIN1257_LV() { return getToken(FirebirdStatementParser.WIN1257_LV, 0); }
		public TerminalNode WIN1258() { return getToken(FirebirdStatementParser.WIN1258, 0); }
		public SortOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSortOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSortOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSortOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortOrderContext sortOrder() throws RecognitionException {
		SortOrderContext _localctx = new SortOrderContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_sortOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2996);
			_la = _input.LA(1);
			if ( !(_la==NEXT || ((((_la - 432)) & ~0x3f) == 0 && ((1L << (_la - 432)) & -1L) != 0) || ((((_la - 496)) & ~0x3f) == 0 && ((1L << (_la - 496)) & 4503599627370495L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(FirebirdStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2998);
			attributeName();
			setState(2999);
			match(EQ_);
			setState(3000);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BindLiteralsContext extends ParserRuleContext {
		public TerminalNode COLON_() { return getToken(FirebirdStatementParser.COLON_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BindLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterBindLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitBindLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitBindLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindLiteralsContext bindLiterals() throws RecognitionException {
		BindLiteralsContext _localctx = new BindLiteralsContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_bindLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3002);
			match(COLON_);
			setState(3003);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(FirebirdStatementParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(FirebirdStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(FirebirdStatementParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSetTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSetTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSetTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3005);
			match(SET);
			setState(3006);
			match(TRANSACTION);
			setState(3007);
			match(ISOLATION);
			setState(3008);
			match(LEVEL);
			setState(3009);
			levelOfIsolation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(FirebirdStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3011);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(FirebirdStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3013);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LevelOfIsolationContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(FirebirdStatementParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(FirebirdStatementParser.UNCOMMITTED, 0); }
		public TerminalNode COMMITTED() { return getToken(FirebirdStatementParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(FirebirdStatementParser.REPEATABLE, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(FirebirdStatementParser.SERIALIZABLE, 0); }
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLevelOfIsolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLevelOfIsolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLevelOfIsolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_levelOfIsolation);
		try {
			setState(3022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3015);
				match(READ);
				setState(3016);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3017);
				match(READ);
				setState(3018);
				match(COMMITTED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3019);
				match(REPEATABLE);
				setState(3020);
				match(READ);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3021);
				match(SERIALIZABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(FirebirdStatementParser.SAVEPOINT, 0); }
		public SavepointNameContext savepointName() {
			return getRuleContext(SavepointNameContext.class,0);
		}
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterSavepoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitSavepoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitSavepoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3024);
			match(SAVEPOINT);
			setState(3025);
			savepointName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrantContext extends ParserRuleContext {
		public List<TerminalNode> GRANT() { return getTokens(FirebirdStatementParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(FirebirdStatementParser.GRANT, i);
		}
		public PrivilegeClauseContext privilegeClause() {
			return getRuleContext(PrivilegeClauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(FirebirdStatementParser.TO, 0); }
		public List<GranteeContext> grantee() {
			return getRuleContexts(GranteeContext.class);
		}
		public GranteeContext grantee(int i) {
			return getRuleContext(GranteeContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public TerminalNode WITH() { return getToken(FirebirdStatementParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(FirebirdStatementParser.OPTION, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3027);
			match(GRANT);
			setState(3028);
			privilegeClause();
			setState(3029);
			match(TO);
			setState(3030);
			grantee();
			setState(3035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(3031);
				match(COMMA_);
				setState(3032);
				grantee();
				}
				}
				setState(3037);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(3038);
				match(WITH);
				setState(3039);
				match(GRANT);
				setState(3040);
				match(OPTION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(FirebirdStatementParser.REVOKE, 0); }
		public PrivilegeClauseContext privilegeClause() {
			return getRuleContext(PrivilegeClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(FirebirdStatementParser.FROM, 0); }
		public List<GranteeContext> grantee() {
			return getRuleContexts(GranteeContext.class);
		}
		public GranteeContext grantee(int i) {
			return getRuleContext(GranteeContext.class,i);
		}
		public DropBehaviourContext dropBehaviour() {
			return getRuleContext(DropBehaviourContext.class,0);
		}
		public TerminalNode GRANT() { return getToken(FirebirdStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(FirebirdStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(FirebirdStatementParser.FOR, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3043);
			match(REVOKE);
			setState(3047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(3044);
				match(GRANT);
				setState(3045);
				match(OPTION);
				setState(3046);
				match(FOR);
				}
			}

			setState(3049);
			privilegeClause();
			setState(3050);
			match(FROM);
			setState(3051);
			grantee();
			setState(3056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(3052);
				match(COMMA_);
				setState(3053);
				grantee();
				}
				}
				setState(3058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3059);
			dropBehaviour();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivilegeClauseContext extends ParserRuleContext {
		public PrivilegesContext privileges() {
			return getRuleContext(PrivilegesContext.class,0);
		}
		public TerminalNode ON() { return getToken(FirebirdStatementParser.ON, 0); }
		public OnObjectClauseContext onObjectClause() {
			return getRuleContext(OnObjectClauseContext.class,0);
		}
		public PrivilegeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPrivilegeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPrivilegeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPrivilegeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeClauseContext privilegeClause() throws RecognitionException {
		PrivilegeClauseContext _localctx = new PrivilegeClauseContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_privilegeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3061);
			privileges();
			setState(3062);
			match(ON);
			setState(3063);
			onObjectClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivilegesContext extends ParserRuleContext {
		public List<PrivilegeTypeContext> privilegeType() {
			return getRuleContexts(PrivilegeTypeContext.class);
		}
		public PrivilegeTypeContext privilegeType(int i) {
			return getRuleContext(PrivilegeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(FirebirdStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(FirebirdStatementParser.COMMA_, i);
		}
		public PrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPrivileges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPrivileges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPrivileges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegesContext privileges() throws RecognitionException {
		PrivilegesContext _localctx = new PrivilegesContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_privileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3065);
			privilegeType();
			setState(3070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(3066);
				match(COMMA_);
				setState(3067);
				privilegeType();
				}
				}
				setState(3072);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivilegeTypeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(FirebirdStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(FirebirdStatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(FirebirdStatementParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(FirebirdStatementParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(FirebirdStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(FirebirdStatementParser.UPDATE, 0); }
		public TerminalNode REFERENCES() { return getToken(FirebirdStatementParser.REFERENCES, 0); }
		public TerminalNode USAGE() { return getToken(FirebirdStatementParser.USAGE, 0); }
		public PrivilegeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPrivilegeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPrivilegeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPrivilegeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeTypeContext privilegeType() throws RecognitionException {
		PrivilegeTypeContext _localctx = new PrivilegeTypeContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_privilegeType);
		try {
			setState(3081);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3073);
				match(ALL);
				setState(3074);
				match(PRIVILEGES);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3075);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3076);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(3077);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(3078);
				match(UPDATE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(3079);
				match(REFERENCES);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(3080);
				match(USAGE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GranteeContext extends ParserRuleContext {
		public ObjectRecepientContext objectRecepient() {
			return getRuleContext(ObjectRecepientContext.class,0);
		}
		public UserRecepientContext userRecepient() {
			return getRuleContext(UserRecepientContext.class,0);
		}
		public GranteeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterGrantee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitGrantee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitGrantee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GranteeContext grantee() throws RecognitionException {
		GranteeContext _localctx = new GranteeContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_grantee);
		try {
			setState(3085);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case TRIGGER:
			case PROCEDURE:
			case VIEW:
			case PACKAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3083);
				objectRecepient();
				}
				break;
			case GROUP:
			case NAME:
			case TYPE:
			case ADA:
			case C92:
			case CATALOG_NAME:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CLASS_ORIGIN:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMITTED:
			case CONDITION_NUMBER:
			case CONNECTION_NAME:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CURSOR_NAME:
			case DATA:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DYNAMIC_FUNCTION:
			case FORTRAN:
			case LENGTH:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case MORE92:
			case MUMPS:
			case NULLABLE:
			case NUMBER:
			case PASCAL:
			case PLI:
			case REPEATABLE:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case ROW_COUNT:
			case SCALE:
			case SCHEMA_NAME:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SUBCLASS_ORIGIN:
			case TABLE_NAME:
			case UNCOMMITTED:
			case UNNAMED:
			case USER:
			case VALUE:
			case FIRSTNAME:
			case MIDDLENAME:
			case LASTNAME:
			case ROLE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(3084);
				userRecepient();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnObjectClauseContext extends ParserRuleContext {
		public PrivilegeLevelContext privilegeLevel() {
			return getRuleContext(PrivilegeLevelContext.class,0);
		}
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public OnObjectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterOnObjectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitOnObjectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitOnObjectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnObjectClauseContext onObjectClause() throws RecognitionException {
		OnObjectClauseContext _localctx = new OnObjectClauseContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_onObjectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 13313L) != 0) || _la==CHARACTER || _la==COLLATION || _la==DOMAIN || _la==EXCEPTION || ((((_la - 370)) & ~0x3f) == 0 && ((1L << (_la - 370)) & 627602096129L) != 0)) {
				{
				setState(3087);
				objectType();
				}
			}

			setState(3090);
			privilegeLevel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(FirebirdStatementParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(FirebirdStatementParser.VIEW, 0); }
		public TerminalNode PROCEDURE() { return getToken(FirebirdStatementParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(FirebirdStatementParser.FUNCTION, 0); }
		public TerminalNode PACKAGE() { return getToken(FirebirdStatementParser.PACKAGE, 0); }
		public TerminalNode GENERATOR() { return getToken(FirebirdStatementParser.GENERATOR, 0); }
		public TerminalNode SEQUENCE() { return getToken(FirebirdStatementParser.SEQUENCE, 0); }
		public TerminalNode DOMAIN() { return getToken(FirebirdStatementParser.DOMAIN, 0); }
		public TerminalNode EXCEPTION() { return getToken(FirebirdStatementParser.EXCEPTION, 0); }
		public TerminalNode ROLE() { return getToken(FirebirdStatementParser.ROLE, 0); }
		public TerminalNode CHARACTER() { return getToken(FirebirdStatementParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(FirebirdStatementParser.SET, 0); }
		public TerminalNode COLLATION() { return getToken(FirebirdStatementParser.COLLATION, 0); }
		public TerminalNode FILTER() { return getToken(FirebirdStatementParser.FILTER, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_objectType);
		try {
			setState(3106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3092);
				match(TABLE);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(3093);
				match(VIEW);
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3094);
				match(PROCEDURE);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(3095);
				match(FUNCTION);
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(3096);
				match(PACKAGE);
				}
				break;
			case GENERATOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(3097);
				match(GENERATOR);
				}
				break;
			case SEQUENCE:
				enterOuterAlt(_localctx, 7);
				{
				setState(3098);
				match(SEQUENCE);
				}
				break;
			case DOMAIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(3099);
				match(DOMAIN);
				}
				break;
			case EXCEPTION:
				enterOuterAlt(_localctx, 9);
				{
				setState(3100);
				match(EXCEPTION);
				}
				break;
			case ROLE:
				enterOuterAlt(_localctx, 10);
				{
				setState(3101);
				match(ROLE);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(3102);
				match(CHARACTER);
				setState(3103);
				match(SET);
				}
				break;
			case COLLATION:
				enterOuterAlt(_localctx, 12);
				{
				setState(3104);
				match(COLLATION);
				}
				break;
			case FILTER:
				enterOuterAlt(_localctx, 13);
				{
				setState(3105);
				match(FILTER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectRecepientContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(FirebirdStatementParser.PROCEDURE, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(FirebirdStatementParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode PACKAGE() { return getToken(FirebirdStatementParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode TRIGGER() { return getToken(FirebirdStatementParser.TRIGGER, 0); }
		public TriggerNameContext triggerName() {
			return getRuleContext(TriggerNameContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(FirebirdStatementParser.VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public ObjectRecepientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectRecepient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterObjectRecepient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitObjectRecepient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitObjectRecepient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectRecepientContext objectRecepient() throws RecognitionException {
		ObjectRecepientContext _localctx = new ObjectRecepientContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_objectRecepient);
		try {
			setState(3118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3108);
				match(PROCEDURE);
				setState(3109);
				procedureName();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(3110);
				match(FUNCTION);
				setState(3111);
				functionName();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3112);
				match(PACKAGE);
				setState(3113);
				packageName();
				}
				break;
			case TRIGGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(3114);
				match(TRIGGER);
				setState(3115);
				triggerName();
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(3116);
				match(VIEW);
				setState(3117);
				viewName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UserRecepientContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USER() { return getToken(FirebirdStatementParser.USER, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public TerminalNode ROLE() { return getToken(FirebirdStatementParser.ROLE, 0); }
		public TerminalNode GROUP() { return getToken(FirebirdStatementParser.GROUP, 0); }
		public UserRecepientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userRecepient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterUserRecepient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitUserRecepient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitUserRecepient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserRecepientContext userRecepient() throws RecognitionException {
		UserRecepientContext _localctx = new UserRecepientContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_userRecepient);
		int _la;
		try {
			setState(3130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USER) {
					{
					setState(3120);
					match(USER);
					}
				}

				setState(3123);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROLE) {
					{
					setState(3124);
					match(ROLE);
					}
				}

				setState(3127);
				roleName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3128);
				match(GROUP);
				setState(3129);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivilegeLevelContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PrivilegeLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterPrivilegeLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitPrivilegeLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitPrivilegeLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeLevelContext privilegeLevel() throws RecognitionException {
		PrivilegeLevelContext _localctx = new PrivilegeLevelContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_privilegeLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3132);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(FirebirdStatementParser.ROLE, 0); }
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3134);
			match(CREATE);
			setState(3135);
			match(ROLE);
			setState(3136);
			roleName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(FirebirdStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(FirebirdStatementParser.USER, 0); }
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public TerminalNode PASSWORD() { return getToken(FirebirdStatementParser.PASSWORD, 0); }
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public FirstNameClauseContext firstNameClause() {
			return getRuleContext(FirstNameClauseContext.class,0);
		}
		public MiddleNameClauseContext middleNameClause() {
			return getRuleContext(MiddleNameClauseContext.class,0);
		}
		public LastNameClauseContext lastNameClause() {
			return getRuleContext(LastNameClauseContext.class,0);
		}
		public ActiveClauseContext activeClause() {
			return getRuleContext(ActiveClauseContext.class,0);
		}
		public UsingPluginClauseContext usingPluginClause() {
			return getRuleContext(UsingPluginClauseContext.class,0);
		}
		public TagsAttributeClauseContext tagsAttributeClause() {
			return getRuleContext(TagsAttributeClauseContext.class,0);
		}
		public GrantAdminRoleClauseContext grantAdminRoleClause() {
			return getRuleContext(GrantAdminRoleClauseContext.class,0);
		}
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterCreateUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitCreateUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitCreateUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_createUser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3138);
			match(CREATE);
			setState(3139);
			match(USER);
			setState(3140);
			login();
			setState(3141);
			match(PASSWORD);
			setState(3142);
			password();
			setState(3144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIRSTNAME) {
				{
				setState(3143);
				firstNameClause();
				}
			}

			setState(3147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MIDDLENAME) {
				{
				setState(3146);
				middleNameClause();
				}
			}

			setState(3150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LASTNAME) {
				{
				setState(3149);
				lastNameClause();
				}
			}

			setState(3153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTIVE || _la==INACTIVE) {
				{
				setState(3152);
				activeClause();
				}
			}

			setState(3156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(3155);
				usingPluginClause();
				}
			}

			setState(3159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAGS) {
				{
				setState(3158);
				tagsAttributeClause();
				}
			}

			setState(3162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GRANT) {
				{
				setState(3161);
				grantAdminRoleClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FirstNameClauseContext extends ParserRuleContext {
		public TerminalNode FIRSTNAME() { return getToken(FirebirdStatementParser.FIRSTNAME, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public FirstNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstNameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterFirstNameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitFirstNameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitFirstNameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstNameClauseContext firstNameClause() throws RecognitionException {
		FirstNameClauseContext _localctx = new FirstNameClauseContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_firstNameClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3164);
			match(FIRSTNAME);
			setState(3165);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MiddleNameClauseContext extends ParserRuleContext {
		public TerminalNode MIDDLENAME() { return getToken(FirebirdStatementParser.MIDDLENAME, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public MiddleNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_middleNameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterMiddleNameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitMiddleNameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitMiddleNameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiddleNameClauseContext middleNameClause() throws RecognitionException {
		MiddleNameClauseContext _localctx = new MiddleNameClauseContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_middleNameClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3167);
			match(MIDDLENAME);
			setState(3168);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastNameClauseContext extends ParserRuleContext {
		public TerminalNode LASTNAME() { return getToken(FirebirdStatementParser.LASTNAME, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public LastNameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastNameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterLastNameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitLastNameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitLastNameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastNameClauseContext lastNameClause() throws RecognitionException {
		LastNameClauseContext _localctx = new LastNameClauseContext(_ctx, getState());
		enterRule(_localctx, 530, RULE_lastNameClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3170);
			match(LASTNAME);
			setState(3171);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActiveClauseContext extends ParserRuleContext {
		public TerminalNode ACTIVE() { return getToken(FirebirdStatementParser.ACTIVE, 0); }
		public TerminalNode INACTIVE() { return getToken(FirebirdStatementParser.INACTIVE, 0); }
		public ActiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterActiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitActiveClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitActiveClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActiveClauseContext activeClause() throws RecognitionException {
		ActiveClauseContext _localctx = new ActiveClauseContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_activeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3173);
			_la = _input.LA(1);
			if ( !(_la==ACTIVE || _la==INACTIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingPluginClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(FirebirdStatementParser.USING, 0); }
		public TerminalNode PLUGIN() { return getToken(FirebirdStatementParser.PLUGIN, 0); }
		public TerminalNode STRING_() { return getToken(FirebirdStatementParser.STRING_, 0); }
		public UsingPluginClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingPluginClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterUsingPluginClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitUsingPluginClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitUsingPluginClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingPluginClauseContext usingPluginClause() throws RecognitionException {
		UsingPluginClauseContext _localctx = new UsingPluginClauseContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_usingPluginClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3175);
			match(USING);
			setState(3176);
			match(PLUGIN);
			setState(3177);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagsAttributeClauseContext extends ParserRuleContext {
		public TerminalNode TAGS() { return getToken(FirebirdStatementParser.TAGS, 0); }
		public TerminalNode LP_() { return getToken(FirebirdStatementParser.LP_, 0); }
		public AttributeClauseContext attributeClause() {
			return getRuleContext(AttributeClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(FirebirdStatementParser.RP_, 0); }
		public TagsAttributeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagsAttributeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterTagsAttributeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitTagsAttributeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitTagsAttributeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsAttributeClauseContext tagsAttributeClause() throws RecognitionException {
		TagsAttributeClauseContext _localctx = new TagsAttributeClauseContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_tagsAttributeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3179);
			match(TAGS);
			setState(3180);
			match(LP_);
			setState(3181);
			attributeClause();
			setState(3182);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrantAdminRoleClauseContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(FirebirdStatementParser.GRANT, 0); }
		public TerminalNode ADMIN() { return getToken(FirebirdStatementParser.ADMIN, 0); }
		public TerminalNode ROLE() { return getToken(FirebirdStatementParser.ROLE, 0); }
		public GrantAdminRoleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantAdminRoleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).enterGrantAdminRoleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirebirdStatementListener ) ((FirebirdStatementListener)listener).exitGrantAdminRoleClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirebirdStatementVisitor ) return ((FirebirdStatementVisitor<? extends T>)visitor).visitGrantAdminRoleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantAdminRoleClauseContext grantAdminRoleClause() throws RecognitionException {
		GrantAdminRoleClauseContext _localctx = new GrantAdminRoleClauseContext(_ctx, getState());
		enterRule(_localctx, 538, RULE_grantAdminRoleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3184);
			match(GRANT);
			setState(3185);
			match(ADMIN);
			setState(3186);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 187:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 191:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 194:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 195:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 10);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u0223\u0c75\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007"+
		"\u00d4\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007"+
		"\u00d7\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007"+
		"\u00da\u0002\u00db\u0007\u00db\u0002\u00dc\u0007\u00dc\u0002\u00dd\u0007"+
		"\u00dd\u0002\u00de\u0007\u00de\u0002\u00df\u0007\u00df\u0002\u00e0\u0007"+
		"\u00e0\u0002\u00e1\u0007\u00e1\u0002\u00e2\u0007\u00e2\u0002\u00e3\u0007"+
		"\u00e3\u0002\u00e4\u0007\u00e4\u0002\u00e5\u0007\u00e5\u0002\u00e6\u0007"+
		"\u00e6\u0002\u00e7\u0007\u00e7\u0002\u00e8\u0007\u00e8\u0002\u00e9\u0007"+
		"\u00e9\u0002\u00ea\u0007\u00ea\u0002\u00eb\u0007\u00eb\u0002\u00ec\u0007"+
		"\u00ec\u0002\u00ed\u0007\u00ed\u0002\u00ee\u0007\u00ee\u0002\u00ef\u0007"+
		"\u00ef\u0002\u00f0\u0007\u00f0\u0002\u00f1\u0007\u00f1\u0002\u00f2\u0007"+
		"\u00f2\u0002\u00f3\u0007\u00f3\u0002\u00f4\u0007\u00f4\u0002\u00f5\u0007"+
		"\u00f5\u0002\u00f6\u0007\u00f6\u0002\u00f7\u0007\u00f7\u0002\u00f8\u0007"+
		"\u00f8\u0002\u00f9\u0007\u00f9\u0002\u00fa\u0007\u00fa\u0002\u00fb\u0007"+
		"\u00fb\u0002\u00fc\u0007\u00fc\u0002\u00fd\u0007\u00fd\u0002\u00fe\u0007"+
		"\u00fe\u0002\u00ff\u0007\u00ff\u0002\u0100\u0007\u0100\u0002\u0101\u0007"+
		"\u0101\u0002\u0102\u0007\u0102\u0002\u0103\u0007\u0103\u0002\u0104\u0007"+
		"\u0104\u0002\u0105\u0007\u0105\u0002\u0106\u0007\u0106\u0002\u0107\u0007"+
		"\u0107\u0002\u0108\u0007\u0108\u0002\u0109\u0007\u0109\u0002\u010a\u0007"+
		"\u010a\u0002\u010b\u0007\u010b\u0002\u010c\u0007\u010c\u0002\u010d\u0007"+
		"\u010d\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u023c\b\u0000\u0001\u0000\u0003\u0000\u023f"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0245"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u024b"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0253\b\u0002\u0001\u0002\u0003\u0002\u0256\b\u0002"+
		"\u0001\u0002\u0003\u0002\u0259\b\u0002\u0001\u0002\u0003\u0002\u025c\b"+
		"\u0002\u0001\u0002\u0003\u0002\u025f\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0268"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u026e"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0274"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u027a"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u027f\b\u0007"+
		"\n\u0007\f\u0007\u0282\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0288\b\b\u0001\b\u0001\b\u0003\b\u028c\b\b\u0001\b\u0003\b\u028f\b\b"+
		"\u0001\b\u0003\b\u0292\b\b\u0001\b\u0003\b\u0295\b\b\u0001\b\u0003\b\u0298"+
		"\b\b\u0001\t\u0001\t\u0003\t\u029c\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u02aa\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u02b5\b\u000e\u0001"+
		"\u000e\u0003\u000e\u02b8\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u02be\b\u000f\u0001\u000f\u0003\u000f\u02c1\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u02c7\b\u0010"+
		"\u0001\u0010\u0003\u0010\u02ca\b\u0010\u0001\u0010\u0003\u0010\u02cd\b"+
		"\u0010\u0001\u0010\u0003\u0010\u02d0\b\u0010\u0001\u0010\u0003\u0010\u02d3"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u02dd\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u02e5"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u02ee\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u02f7"+
		"\b\u0015\u0003\u0015\u02f9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0304\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0309\b\u0017\u0001\u0017\u0003\u0017\u030c\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0317\b\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u031b\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0321\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0325\b\u0018"+
		"\u0005\u0018\u0327\b\u0018\n\u0018\f\u0018\u032a\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0339\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0344"+
		"\b\u001c\n\u001c\f\u001c\u0347\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u034c\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0350\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0356"+
		"\b\u001e\u0001\u001e\u0003\u001e\u0359\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u035d\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0365\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u036b\b\u001e\u0003\u001e\u036d\b"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0372\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0376\b\u001f\u0001 \u0001 \u0001 \u0003"+
		" \u037b\b \u0001 \u0001 \u0001 \u0003 \u0380\b \u0001 \u0003 \u0383\b"+
		" \u0001!\u0001!\u0001!\u0003!\u0388\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u038e\b\"\n\"\f\"\u0391\t\"\u0003\"\u0393\b\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0001#\u0005#\u039b\b#\n#\f#\u039e\t#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u03a8\b%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u03ae\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u03b4"+
		"\b%\u0001%\u0001%\u0003%\u03b8\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u03be"+
		"\b&\n&\f&\u03c1\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u03c8"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u03da\b+\n+\f+\u03dd"+
		"\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0003,\u03e4\b,\u0001-\u0001-\u0003"+
		"-\u03e8\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0003.\u03f0\b.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0003/\u03f7\b/\u00010\u00010\u00030\u03fb"+
		"\b0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00030\u0407\b0\u00030\u0409\b0\u00010\u00050\u040c\b0\n0\f0\u040f\t"+
		"0\u00011\u00011\u00031\u0413\b1\u00011\u00011\u00031\u0417\b1\u00011\u0003"+
		"1\u041a\b1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u0423"+
		"\b1\u00011\u00011\u00011\u00031\u0428\b1\u00011\u00011\u00011\u00031\u042d"+
		"\b1\u00011\u00011\u00011\u00011\u00031\u0433\b1\u00012\u00012\u00032\u0437"+
		"\b2\u00032\u0439\b2\u00012\u00012\u00013\u00013\u00013\u00033\u0440\b"+
		"3\u00013\u00033\u0443\b3\u00013\u00013\u00013\u00053\u0448\b3\n3\f3\u044b"+
		"\t3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0454\b4\u0001"+
		"5\u00015\u00015\u00035\u0459\b5\u00015\u00015\u00035\u045d\b5\u00035\u045f"+
		"\b5\u00015\u00015\u00015\u00016\u00016\u00036\u0466\b6\u00036\u0468\b"+
		"6\u00016\u00016\u00016\u00036\u046d\b6\u00017\u00017\u00017\u00037\u0472"+
		"\b7\u00018\u00018\u00018\u00019\u00019\u00019\u00039\u047a\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001;\u0003;\u0482\b;\u0001;\u0001;\u0001;\u0003"+
		";\u0487\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u048e\b<\u0001=\u0001"+
		"=\u0003=\u0492\b=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u049e\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u04ad\b>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0003>\u04b4\b>\u0003>\u04b6\b>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u04bf\b>\u0003>\u04c1\b>\u0001"+
		"?\u0001?\u0003?\u04c5\b?\u0001?\u0001?\u0001@\u0001@\u0003@\u04cb\b@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001D\u0001D\u0001D\u0003D\u04db\bD\u0001D\u0001D\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0003F\u04e8\bF\u0001F\u0003"+
		"F\u04eb\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u04f2\bF\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u04fd\bF\u0001"+
		"F\u0001F\u0003F\u0501\bF\u0001F\u0001F\u0001F\u0001F\u0003F\u0507\bF\u0001"+
		"G\u0001G\u0003G\u050b\bG\u0001H\u0001H\u0001H\u0001H\u0003H\u0511\bH\u0001"+
		"H\u0003H\u0514\bH\u0001I\u0001I\u0001I\u0001I\u0005I\u051a\bI\nI\fI\u051d"+
		"\tI\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0003"+
		"K\u0528\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001"+
		"L\u0003L\u0533\bL\u0001L\u0001L\u0003L\u0537\bL\u0001L\u0001L\u0003L\u053b"+
		"\bL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0003M\u0543\bM\u0001N\u0003"+
		"N\u0546\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0003N\u0554\bN\u0001N\u0001N\u0003N\u0558\bN\u0001"+
		"N\u0001N\u0001N\u0001N\u0003N\u055e\bN\u0001O\u0001O\u0001O\u0003O\u0563"+
		"\bO\u0001O\u0003O\u0566\bO\u0001O\u0001O\u0001O\u0001O\u0003O\u056c\b"+
		"O\u0001P\u0001P\u0001P\u0005P\u0571\bP\nP\fP\u0574\tP\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0005Q\u057c\bQ\nQ\fQ\u057f\tQ\u0003Q\u0581\bQ"+
		"\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u05a7\bS\u0001T\u0003"+
		"T\u05aa\bT\u0001T\u0001T\u0001T\u0001T\u0003T\u05b0\bT\u0001T\u0001T\u0001"+
		"T\u0003T\u05b5\bT\u0001U\u0003U\u05b8\bU\u0001U\u0001U\u0001U\u0001U\u0003"+
		"U\u05be\bU\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0003"+
		"V\u05c8\bV\u0001W\u0003W\u05cb\bW\u0001W\u0001W\u0001W\u0001W\u0003W\u05d1"+
		"\bW\u0001X\u0001X\u0001X\u0003X\u05d6\bX\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0003X\u05dd\bX\u0001X\u0001X\u0003X\u05e1\bX\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0005Y\u05f1\bY\nY\fY\u05f4\tY\u0001Y\u0001Y\u0001Z\u0001Z\u0001[\u0001"+
		"[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0005^\u0610\b^\n^\f^\u0613\t^\u0001^\u0001^\u0003^\u0617\b^\u0001^"+
		"\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u0622"+
		"\b^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0005^\u0630\b^\n^\f^\u0633\t^\u0001^\u0001^\u0003^\u0637"+
		"\b^\u0003^\u0639\b^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0004_\u0641"+
		"\b_\u000b_\f_\u0642\u0001_\u0001_\u0004_\u0647\b_\u000b_\f_\u0648\u0003"+
		"_\u064b\b_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u065d\b`\u0001"+
		"`\u0003`\u0660\b`\u0001a\u0001a\u0005a\u0664\ba\na\fa\u0667\ta\u0001a"+
		"\u0001a\u0003a\u066b\ba\u0001b\u0001b\u0003b\u066f\bb\u0001b\u0001b\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0003c\u0683\bc\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0003c\u068b\bc\u0001c\u0003c\u068e\bc\u0001c\u0001"+
		"c\u0001c\u0003c\u0693\bc\u0001c\u0003c\u0696\bc\u0001c\u0001c\u0001c\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0003d\u06aa\bd\u0001e\u0001e\u0003e\u06ae"+
		"\be\u0001e\u0001e\u0001e\u0003e\u06b3\be\u0001f\u0003f\u06b6\bf\u0001"+
		"f\u0001f\u0001f\u0001f\u0005f\u06bc\bf\nf\ff\u06bf\tf\u0001g\u0003g\u06c2"+
		"\bg\u0001g\u0001g\u0001h\u0001h\u0001h\u0001h\u0003h\u06ca\bh\u0001i\u0001"+
		"i\u0001i\u0003i\u06cf\bi\u0001i\u0003i\u06d2\bi\u0001i\u0001i\u0003i\u06d6"+
		"\bi\u0001j\u0001j\u0001j\u0001j\u0005j\u06dc\bj\nj\fj\u06df\tj\u0001k"+
		"\u0001k\u0001k\u0001k\u0005k\u06e5\bk\nk\fk\u06e8\tk\u0001k\u0001k\u0001"+
		"k\u0001k\u0003k\u06ee\bk\u0001l\u0001l\u0001l\u0001l\u0003l\u06f4\bl\u0001"+
		"m\u0001m\u0001n\u0001n\u0001n\u0003n\u06fb\bn\u0001o\u0001o\u0001o\u0003"+
		"o\u0700\bo\u0001o\u0003o\u0703\bo\u0001p\u0003p\u0706\bp\u0001p\u0001"+
		"p\u0001q\u0001q\u0001q\u0003q\u070d\bq\u0001q\u0005q\u0710\bq\nq\fq\u0713"+
		"\tq\u0001r\u0001r\u0005r\u0717\br\nr\fr\u071a\tr\u0001r\u0001r\u0003r"+
		"\u071e\br\u0001r\u0003r\u0721\br\u0001r\u0003r\u0724\br\u0001r\u0003r"+
		"\u0727\br\u0001r\u0003r\u072a\br\u0001r\u0003r\u072d\br\u0001s\u0001s"+
		"\u0001t\u0001t\u0001u\u0001u\u0003u\u0735\bu\u0001u\u0001u\u0005u\u0739"+
		"\bu\nu\fu\u073c\tu\u0001v\u0001v\u0003v\u0740\bv\u0001v\u0003v\u0743\b"+
		"v\u0001v\u0003v\u0746\bv\u0001v\u0003v\u0749\bv\u0001w\u0001w\u0003w\u074d"+
		"\bw\u0001x\u0001x\u0001y\u0001y\u0001y\u0001z\u0001z\u0001z\u0003z\u0757"+
		"\bz\u0001{\u0001{\u0001{\u0005{\u075c\b{\n{\f{\u075f\t{\u0001|\u0001|"+
		"\u0001|\u0001|\u0001|\u0003|\u0766\b|\u0001}\u0001}\u0005}\u076a\b}\n"+
		"}\f}\u076d\t}\u0001~\u0001~\u0003~\u0771\b~\u0001~\u0003~\u0774\b~\u0001"+
		"~\u0001~\u0003~\u0778\b~\u0001~\u0003~\u077b\b~\u0001~\u0003~\u077e\b"+
		"~\u0001~\u0001~\u0001~\u0001~\u0003~\u0784\b~\u0001\u007f\u0003\u007f"+
		"\u0787\b\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f"+
		"\u078d\b\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u0791\b\u007f\u0001"+
		"\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0001\u007f\u0003\u007f\u079b\b\u007f\u0003\u007f\u079d\b\u007f"+
		"\u0001\u007f\u0001\u007f\u0003\u007f\u07a1\b\u007f\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0003\u0080\u07a7\b\u0080\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0003\u0081\u07ae\b\u0081\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u07b5\b\u0082"+
		"\n\u0082\f\u0082\u07b8\t\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0001"+
		"\u0084\u0001\u0084\u0003\u0084\u07bf\b\u0084\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0003\u0085\u07c7\b\u0085\u0001"+
		"\u0085\u0001\u0085\u0001\u0085\u0005\u0085\u07cc\b\u0085\n\u0085\f\u0085"+
		"\u07cf\t\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0003\u0086\u07d6\b\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0087"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0005\u0087\u07e0\b\u0087"+
		"\n\u0087\f\u0087\u07e3\t\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0003\u0087\u07e9\b\u0087\u0003\u0087\u07eb\b\u0087\u0001\u0088"+
		"\u0001\u0088\u0001\u0088\u0001\u0088\u0003\u0088\u07f1\b\u0088\u0001\u0088"+
		"\u0003\u0088\u07f4\b\u0088\u0001\u0088\u0003\u0088\u07f7\b\u0088\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u07fc\b\u0089\u0001\u0089\u0003"+
		"\u0089\u07ff\b\u0089\u0001\u0089\u0003\u0089\u0802\b\u0089\u0001\u0089"+
		"\u0003\u0089\u0805\b\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u008a"+
		"\u0001\u008a\u0003\u008a\u080c\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0003\u008b\u0812\b\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0005\u008b\u081f\b\u008b\n\u008b\f\u008b\u0822"+
		"\t\u008b\u0001\u008b\u0003\u008b\u0825\b\u008b\u0001\u008c\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u082c\b\u008c\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0003\u008c\u0831\b\u008c\u0001\u008c\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008d\u0001\u008d\u0003\u008d"+
		"\u083a\b\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001\u008e"+
		"\u0005\u008e\u0841\b\u008e\n\u008e\f\u008e\u0844\t\u008e\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001"+
		"\u0090\u0005\u0090\u084e\b\u0090\n\u0090\f\u0090\u0851\t\u0090\u0001\u0091"+
		"\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0003\u0092\u085c\b\u0092\u0001\u0093\u0003\u0093"+
		"\u085f\b\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u0863\b\u0093\u0001"+
		"\u0094\u0003\u0094\u0866\b\u0094\u0001\u0094\u0001\u0094\u0001\u0095\u0001"+
		"\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0003"+
		"\u0095\u0871\b\u0095\u0001\u0096\u0003\u0096\u0874\b\u0096\u0001\u0096"+
		"\u0001\u0096\u0003\u0096\u0878\b\u0096\u0001\u0097\u0003\u0097\u087b\b"+
		"\u0097\u0001\u0097\u0001\u0097\u0003\u0097\u087f\b\u0097\u0001\u0098\u0001"+
		"\u0098\u0001\u0099\u0001\u0099\u0001\u009a\u0001\u009a\u0003\u009a\u0887"+
		"\b\u009a\u0001\u009b\u0001\u009b\u0001\u009c\u0003\u009c\u088c\b\u009c"+
		"\u0001\u009c\u0003\u009c\u088f\b\u009c\u0001\u009c\u0003\u009c\u0892\b"+
		"\u009c\u0001\u009c\u0003\u009c\u0895\b\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009d\u0001\u009d\u0001\u009e\u0001\u009e\u0001\u009f\u0001\u009f\u0001"+
		"\u009f\u0003\u009f\u08a0\b\u009f\u0001\u009f\u0001\u009f\u0001\u00a0\u0001"+
		"\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0003"+
		"\u00a2\u08ab\b\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3\u0001\u00a3\u0001"+
		"\u00a4\u0001\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a6\u0001\u00a6\u0001"+
		"\u00a7\u0001\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001"+
		"\u00a9\u0003\u00a9\u08be\b\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00aa\u0001"+
		"\u00aa\u0001\u00aa\u0001\u00aa\u0003\u00aa\u08c6\b\u00aa\u0001\u00aa\u0003"+
		"\u00aa\u08c9\b\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001"+
		"\u00ad\u0001\u00ad\u0001\u00ae\u0001\u00ae\u0001\u00af\u0001\u00af\u0001"+
		"\u00b0\u0001\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b2\u0001\u00b2\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4\u0001\u00b5\u0001\u00b5\u0001"+
		"\u00b6\u0001\u00b6\u0001\u00b7\u0001\u00b7\u0001\u00b8\u0003\u00b8\u08e6"+
		"\b\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0005\u00b8\u08eb\b\u00b8"+
		"\n\u00b8\f\u00b8\u08ee\t\u00b8\u0001\u00b8\u0003\u00b8\u08f1\b\u00b8\u0001"+
		"\u00b9\u0003\u00b9\u08f4\b\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0005"+
		"\u00b9\u08f9\b\u00b9\n\u00b9\f\u00b9\u08fc\t\u00b9\u0001\u00b9\u0003\u00b9"+
		"\u08ff\b\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0003\u00bb\u090c\b\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0005\u00bb\u0916\b\u00bb"+
		"\n\u00bb\f\u00bb\u0919\t\u00bb\u0001\u00bc\u0001\u00bc\u0001\u00bd\u0001"+
		"\u00bd\u0001\u00be\u0001\u00be\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001"+
		"\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0927\b\u00bf\u0001\u00bf\u0001"+
		"\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001"+
		"\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0005"+
		"\u00bf\u0936\b\u00bf\n\u00bf\f\u00bf\u0939\t\u00bf\u0001\u00c0\u0001\u00c0"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u0940\b\u00c1\u0001\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u0947\b\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0005\u00c1"+
		"\u094e\b\u00c1\n\u00c1\f\u00c1\u0951\t\u00c1\u0001\u00c1\u0001\u00c1\u0001"+
		"\u00c1\u0001\u00c1\u0003\u00c1\u0957\b\u00c1\u0001\u00c1\u0001\u00c1\u0001"+
		"\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u0960"+
		"\b\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u0966"+
		"\b\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u096a\b\u00c1\u0001\u00c1"+
		"\u0001\u00c1\u0003\u00c1\u096e\b\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0003\u00c1\u0975\b\u00c1\u0001\u00c1\u0001\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u097d\b\u00c1"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1"+
		"\u0984\b\u00c1\u0001\u00c1\u0003\u00c1\u0987\b\u00c1\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0005\u00c2\u09b0\b\u00c2\n\u00c2\f\u00c2\u09b3\t\u00c2"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3"+
		"\u0005\u00c3\u09c1\b\u00c3\n\u00c3\f\u00c3\u09c4\t\u00c3\u0001\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0003\u00c3\u09c9\b\u00c3\u0001\u00c3\u0001\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0003\u00c3\u09d5\b\u00c3\u0001\u00c3\u0001\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0003\u00c3\u09db\b\u00c3\u0005\u00c3\u09dd\b\u00c3"+
		"\n\u00c3\f\u00c3\u09e0\t\u00c3\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0003"+
		"\u00c4\u09e5\b\u00c4\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u09ea"+
		"\b\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0005\u00c5\u09ef\b\u00c5"+
		"\n\u00c5\f\u00c5\u09f2\t\u00c5\u0001\u00c5\u0003\u00c5\u09f5\b\u00c5\u0001"+
		"\u00c5\u0001\u00c5\u0003\u00c5\u09f9\b\u00c5\u0001\u00c6\u0001\u00c6\u0001"+
		"\u00c7\u0001\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0003\u00c8\u0a06\b\u00c8\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u0a0c\b\u00c9\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00cb\u0001\u00cb\u0001"+
		"\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cc\u0001"+
		"\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0003"+
		"\u00cc\u0a27\b\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cd\u0001\u00cd\u0001"+
		"\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0a36\b\u00ce\u0001\u00ce\u0003"+
		"\u00ce\u0a39\b\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0a43\b\u00ce\u0001"+
		"\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0a48\b\u00ce\u0001\u00cf\u0001"+
		"\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0005\u00cf\u0a4f\b\u00cf\n"+
		"\u00cf\f\u00cf\u0a52\t\u00cf\u0001\u00cf\u0003\u00cf\u0a55\b\u00cf\u0001"+
		"\u00cf\u0001\u00cf\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001"+
		"\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001"+
		"\u00d0\u0003\u00d0\u0a64\b\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d2\u0001"+
		"\u00d2\u0001\u00d2\u0003\u00d2\u0a6b\b\u00d2\u0001\u00d2\u0001\u00d2\u0001"+
		"\u00d2\u0001\u00d3\u0001\u00d3\u0003\u00d3\u0a72\b\u00d3\u0001\u00d3\u0004"+
		"\u00d3\u0a75\b\u00d3\u000b\u00d3\f\u00d3\u0a76\u0001\u00d3\u0003\u00d3"+
		"\u0a7a\b\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d4\u0001\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0001\u00d4\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d6"+
		"\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0001\u00d7\u0001\u00d7\u0001\u00d8"+
		"\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0005\u00d8\u0a91\b\u00d8"+
		"\n\u00d8\f\u00d8\u0a94\t\u00d8\u0001\u00d8\u0003\u00d8\u0a97\b\u00d8\u0001"+
		"\u00d9\u0001\u00d9\u0003\u00d9\u0a9b\b\u00d9\u0001\u00d9\u0003\u00d9\u0a9e"+
		"\b\u00d9\u0001\u00da\u0001\u00da\u0003\u00da\u0aa2\b\u00da\u0001\u00db"+
		"\u0001\u00db\u0001\u00db\u0001\u00db\u0003\u00db\u0aa8\b\u00db\u0001\u00dc"+
		"\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0003\u00dc\u0aaf\b\u00dc"+
		"\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0001\u00de\u0001\u00de"+
		"\u0001\u00de\u0001\u00de\u0001\u00de\u0001\u00de\u0001\u00df\u0001\u00df"+
		"\u0001\u00df\u0003\u00df\u0abe\b\u00df\u0001\u00e0\u0001\u00e0\u0001\u00e0"+
		"\u0003\u00e0\u0ac3\b\u00e0\u0001\u00e1\u0001\u00e1\u0003\u00e1\u0ac7\b"+
		"\u00e1\u0001\u00e1\u0003\u00e1\u0aca\b\u00e1\u0001\u00e1\u0003\u00e1\u0acd"+
		"\b\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0005"+
		"\u00e1\u0ad4\b\u00e1\n\u00e1\f\u00e1\u0ad7\t\u00e1\u0001\u00e1\u0001\u00e1"+
		"\u0003\u00e1\u0adb\b\u00e1\u0001\u00e1\u0003\u00e1\u0ade\b\u00e1\u0001"+
		"\u00e1\u0001\u00e1\u0001\u00e1\u0003\u00e1\u0ae3\b\u00e1\u0001\u00e1\u0001"+
		"\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0005\u00e1\u0aea\b\u00e1\n"+
		"\u00e1\f\u00e1\u0aed\t\u00e1\u0003\u00e1\u0aef\b\u00e1\u0001\u00e1\u0001"+
		"\u00e1\u0003\u00e1\u0af3\b\u00e1\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0001\u00e2\u0003\u00e2\u0b21"+
		"\b\u00e2\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0003\u00e3\u0b27"+
		"\b\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0003"+
		"\u00e4\u0b2e\b\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e5\u0001\u00e5\u0003"+
		"\u00e5\u0b34\b\u00e5\u0001\u00e5\u0001\u00e5\u0003\u00e5\u0b38\b\u00e5"+
		"\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0003\u00e6\u0b3d\b\u00e6\u0001\u00e7"+
		"\u0003\u00e7\u0b40\b\u00e7\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0001\u00e8"+
		"\u0001\u00e8\u0005\u00e8\u0b47\b\u00e8\n\u00e8\f\u00e8\u0b4a\t\u00e8\u0001"+
		"\u00e8\u0003\u00e8\u0b4d\b\u00e8\u0001\u00e8\u0001\u00e8\u0003\u00e8\u0b51"+
		"\b\u00e8\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0005"+
		"\u00e8\u0b58\b\u00e8\n\u00e8\f\u00e8\u0b5b\t\u00e8\u0001\u00e8\u0003\u00e8"+
		"\u0b5e\b\u00e8\u0001\u00e8\u0001\u00e8\u0003\u00e8\u0b62\b\u00e8\u0003"+
		"\u00e8\u0b64\b\u00e8\u0001\u00e9\u0001\u00e9\u0001\u00e9\u0001\u00e9\u0001"+
		"\u00e9\u0001\u00e9\u0001\u00e9\u0005\u00e9\u0b6d\b\u00e9\n\u00e9\f\u00e9"+
		"\u0b70\t\u00e9\u0003\u00e9\u0b72\b\u00e9\u0001\u00e9\u0003\u00e9\u0b75"+
		"\b\u00e9\u0001\u00e9\u0001\u00e9\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001"+
		"\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00eb\u0001\u00eb\u0001\u00ec\u0001"+
		"\u00ec\u0001\u00ec\u0003\u00ec\u0b84\b\u00ec\u0001\u00ed\u0001\u00ed\u0001"+
		"\u00ee\u0001\u00ee\u0001\u00ee\u0001\u00ee\u0003\u00ee\u0b8c\b\u00ee\u0001"+
		"\u00ee\u0003\u00ee\u0b8f\b\u00ee\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0005"+
		"\u00ef\u0b94\b\u00ef\n\u00ef\f\u00ef\u0b97\t\u00ef\u0001\u00f0\u0001\u00f0"+
		"\u0001\u00f0\u0003\u00f0\u0b9c\b\u00f0\u0001\u00f0\u0001\u00f0\u0001\u00f0"+
		"\u0001\u00f0\u0001\u00f0\u0001\u00f0\u0003\u00f0\u0ba4\b\u00f0\u0001\u00f0"+
		"\u0001\u00f0\u0001\u00f0\u0003\u00f0\u0ba9\b\u00f0\u0001\u00f1\u0001\u00f1"+
		"\u0001\u00f1\u0001\u00f1\u0001\u00f1\u0001\u00f1\u0003\u00f1\u0bb1\b\u00f1"+
		"\u0001\u00f1\u0001\u00f1\u0001\u00f2\u0001\u00f2\u0001\u00f3\u0001\u00f3"+
		"\u0001\u00f3\u0001\u00f3\u0001\u00f4\u0001\u00f4\u0001\u00f4\u0001\u00f5"+
		"\u0001\u00f5\u0001\u00f5\u0001\u00f5\u0001\u00f5\u0001\u00f5\u0001\u00f6"+
		"\u0001\u00f6\u0001\u00f7\u0001\u00f7\u0001\u00f8\u0001\u00f8\u0001\u00f8"+
		"\u0001\u00f8\u0001\u00f8\u0001\u00f8\u0001\u00f8\u0003\u00f8\u0bcf\b\u00f8"+
		"\u0001\u00f9\u0001\u00f9\u0001\u00f9\u0001\u00fa\u0001\u00fa\u0001\u00fa"+
		"\u0001\u00fa\u0001\u00fa\u0001\u00fa\u0005\u00fa\u0bda\b\u00fa\n\u00fa"+
		"\f\u00fa\u0bdd\t\u00fa\u0001\u00fa\u0001\u00fa\u0001\u00fa\u0003\u00fa"+
		"\u0be2\b\u00fa\u0001\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fb\u0003\u00fb"+
		"\u0be8\b\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fb"+
		"\u0005\u00fb\u0bef\b\u00fb\n\u00fb\f\u00fb\u0bf2\t\u00fb\u0001\u00fb\u0001"+
		"\u00fb\u0001\u00fc\u0001\u00fc\u0001\u00fc\u0001\u00fc\u0001\u00fd\u0001"+
		"\u00fd\u0001\u00fd\u0005\u00fd\u0bfd\b\u00fd\n\u00fd\f\u00fd\u0c00\t\u00fd"+
		"\u0001\u00fe\u0001\u00fe\u0001\u00fe\u0001\u00fe\u0001\u00fe\u0001\u00fe"+
		"\u0001\u00fe\u0001\u00fe\u0003\u00fe\u0c0a\b\u00fe\u0001\u00ff\u0001\u00ff"+
		"\u0003\u00ff\u0c0e\b\u00ff\u0001\u0100\u0003\u0100\u0c11\b\u0100\u0001"+
		"\u0100\u0001\u0100\u0001\u0101\u0001\u0101\u0001\u0101\u0001\u0101\u0001"+
		"\u0101\u0001\u0101\u0001\u0101\u0001\u0101\u0001\u0101\u0001\u0101\u0001"+
		"\u0101\u0001\u0101\u0001\u0101\u0001\u0101\u0003\u0101\u0c23\b\u0101\u0001"+
		"\u0102\u0001\u0102\u0001\u0102\u0001\u0102\u0001\u0102\u0001\u0102\u0001"+
		"\u0102\u0001\u0102\u0001\u0102\u0001\u0102\u0003\u0102\u0c2f\b\u0102\u0001"+
		"\u0103\u0003\u0103\u0c32\b\u0103\u0001\u0103\u0001\u0103\u0003\u0103\u0c36"+
		"\b\u0103\u0001\u0103\u0001\u0103\u0001\u0103\u0003\u0103\u0c3b\b\u0103"+
		"\u0001\u0104\u0001\u0104\u0001\u0105\u0001\u0105\u0001\u0105\u0001\u0105"+
		"\u0001\u0106\u0001\u0106\u0001\u0106\u0001\u0106\u0001\u0106\u0001\u0106"+
		"\u0003\u0106\u0c49\b\u0106\u0001\u0106\u0003\u0106\u0c4c\b\u0106\u0001"+
		"\u0106\u0003\u0106\u0c4f\b\u0106\u0001\u0106\u0003\u0106\u0c52\b\u0106"+
		"\u0001\u0106\u0003\u0106\u0c55\b\u0106\u0001\u0106\u0003\u0106\u0c58\b"+
		"\u0106\u0001\u0106\u0003\u0106\u0c5b\b\u0106\u0001\u0107\u0001\u0107\u0001"+
		"\u0107\u0001\u0108\u0001\u0108\u0001\u0108\u0001\u0109\u0001\u0109\u0001"+
		"\u0109\u0001\u010a\u0001\u010a\u0001\u010b\u0001\u010b\u0001\u010b\u0001"+
		"\u010b\u0001\u010c\u0001\u010c\u0001\u010c\u0001\u010c\u0001\u010c\u0001"+
		"\u010d\u0001\u010d\u0001\u010d\u0001\u010d\u0001\u010d\u0000\u0004\u0176"+
		"\u017e\u0184\u0186\u010e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8"+
		"\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210"+
		"\u0212\u0214\u0216\u0218\u021a\u0000.\u0002\u0000\u0172\u0172\u0196\u0196"+
		"\u0002\u00002288\u0002\u0000\u009d\u009d\u0158\u0158\u0002\u0000\u0017"+
		"\u0017\u0095\u0095\u0001\u0000\u00a0\u00a1\u0001\u0000./\u0001\u0000\u0162"+
		"\u0163\u0001\u0000\u0186\u0187\u0001\u0000\u018b\u018c\u0001\u0000-/\u0001"+
		"\u000002\u0002\u00000022\u0002\u0000CCEE\u0002\u0000gg\u019f\u019f\u0002"+
		"\u0000HH\u0150\u0150\u0002\u0000KKmm\u0002\u0000UUYY\u0002\u0000TTWX\u0001"+
		"\u0000\u000e\u000f\u0001\u0000\u0082\u0084\u0001\u0000hi\u0005\u0000\u00a5"+
		"\u00a5\u00ab\u00ab\u00af\u00de\u0150\u0150\u0182\u0184\u0002\u0000\u00a1"+
		"\u00a1\u0111\u0111\u0002\u0000\u0003\u0003cc\u0002\u0000\u0004\u0004d"+
		"d\u0002\u0000\u0005\u0005ff\u0002\u0000gi\u014c\u014c\u0002\u0000mn\u013f"+
		"\u013f\u0001\u0000\u0017\u001c\u0002\u0000\u0005\u0006\u000e\u000f\u0001"+
		"\u0000\u0090\u0094\u0003\u0000\u00e8\u00e8\u011e\u011e\u0148\u0148\u0002"+
		"\u0000\u0085\u0086\u00f6\u00f8\u0002\u0000TT\u012f\u012f\u0001\u0000\u0087"+
		"\u008f\u0001\u0000st\u0002\u0000\u0138\u0138\u015a\u015a\u0002\u0000\u00a4"+
		"\u00a4\u010e\u010e\u0001\u0000~\u007f\u0002\u0000\u00e9\u00e9\u0137\u0137"+
		"\u0001\u0000\u0164\u0166\u0001\u0000\u0167\u016b\u0001\u0000\u019f\u01a0"+
		"\u0001\u0000\u0176\u017c\u0007\u0000\u009e\u009e\u00d6\u00d6\u00f6\u00f8"+
		"\u0141\u0141\u0143\u0143\u014f\u014f\u01a3\u01af\u0002\u0000\u00a4\u00a4"+
		"\u01b0\u0223\u0dca\u0000\u023b\u0001\u0000\u0000\u0000\u0002\u0242\u0001"+
		"\u0000\u0000\u0000\u0004\u024c\u0001\u0000\u0000\u0000\u0006\u0267\u0001"+
		"\u0000\u0000\u0000\b\u026d\u0001\u0000\u0000\u0000\n\u0273\u0001\u0000"+
		"\u0000\u0000\f\u0279\u0001\u0000\u0000\u0000\u000e\u027b\u0001\u0000\u0000"+
		"\u0000\u0010\u0283\u0001\u0000\u0000\u0000\u0012\u0299\u0001\u0000\u0000"+
		"\u0000\u0014\u029d\u0001\u0000\u0000\u0000\u0016\u02a0\u0001\u0000\u0000"+
		"\u0000\u0018\u02a5\u0001\u0000\u0000\u0000\u001a\u02ab\u0001\u0000\u0000"+
		"\u0000\u001c\u02b0\u0001\u0000\u0000\u0000\u001e\u02b9\u0001\u0000\u0000"+
		"\u0000 \u02c2\u0001\u0000\u0000\u0000\"\u02d4\u0001\u0000\u0000\u0000"+
		"$\u02dc\u0001\u0000\u0000\u0000&\u02de\u0001\u0000\u0000\u0000(\u02ed"+
		"\u0001\u0000\u0000\u0000*\u02ef\u0001\u0000\u0000\u0000,\u02fa\u0001\u0000"+
		"\u0000\u0000.\u02ff\u0001\u0000\u0000\u00000\u0328\u0001\u0000\u0000\u0000"+
		"2\u0338\u0001\u0000\u0000\u00004\u033a\u0001\u0000\u0000\u00006\u033d"+
		"\u0001\u0000\u0000\u00008\u0340\u0001\u0000\u0000\u0000:\u034b\u0001\u0000"+
		"\u0000\u0000<\u034d\u0001\u0000\u0000\u0000>\u036e\u0001\u0000\u0000\u0000"+
		"@\u0377\u0001\u0000\u0000\u0000B\u0384\u0001\u0000\u0000\u0000D\u0389"+
		"\u0001\u0000\u0000\u0000F\u0396\u0001\u0000\u0000\u0000H\u039f\u0001\u0000"+
		"\u0000\u0000J\u03a4\u0001\u0000\u0000\u0000L\u03b9\u0001\u0000\u0000\u0000"+
		"N\u03c4\u0001\u0000\u0000\u0000P\u03c9\u0001\u0000\u0000\u0000R\u03ce"+
		"\u0001\u0000\u0000\u0000T\u03d1\u0001\u0000\u0000\u0000V\u03d5\u0001\u0000"+
		"\u0000\u0000X\u03e0\u0001\u0000\u0000\u0000Z\u03e5\u0001\u0000\u0000\u0000"+
		"\\\u03eb\u0001\u0000\u0000\u0000^\u03f6\u0001\u0000\u0000\u0000`\u03f8"+
		"\u0001\u0000\u0000\u0000b\u0432\u0001\u0000\u0000\u0000d\u0438\u0001\u0000"+
		"\u0000\u0000f\u043c\u0001\u0000\u0000\u0000h\u0453\u0001\u0000\u0000\u0000"+
		"j\u0455\u0001\u0000\u0000\u0000l\u0467\u0001\u0000\u0000\u0000n\u046e"+
		"\u0001\u0000\u0000\u0000p\u0473\u0001\u0000\u0000\u0000r\u0476\u0001\u0000"+
		"\u0000\u0000t\u047b\u0001\u0000\u0000\u0000v\u0481\u0001\u0000\u0000\u0000"+
		"x\u048d\u0001\u0000\u0000\u0000z\u048f\u0001\u0000\u0000\u0000|\u0495"+
		"\u0001\u0000\u0000\u0000~\u04c2\u0001\u0000\u0000\u0000\u0080\u04c8\u0001"+
		"\u0000\u0000\u0000\u0082\u04ce\u0001\u0000\u0000\u0000\u0084\u04d1\u0001"+
		"\u0000\u0000\u0000\u0086\u04d4\u0001\u0000\u0000\u0000\u0088\u04d7\u0001"+
		"\u0000\u0000\u0000\u008a\u04e0\u0001\u0000\u0000\u0000\u008c\u04e4\u0001"+
		"\u0000\u0000\u0000\u008e\u050a\u0001\u0000\u0000\u0000\u0090\u050c\u0001"+
		"\u0000\u0000\u0000\u0092\u0515\u0001\u0000\u0000\u0000\u0094\u0520\u0001"+
		"\u0000\u0000\u0000\u0096\u0524\u0001\u0000\u0000\u0000\u0098\u052e\u0001"+
		"\u0000\u0000\u0000\u009a\u0542\u0001\u0000\u0000\u0000\u009c\u0545\u0001"+
		"\u0000\u0000\u0000\u009e\u055f\u0001\u0000\u0000\u0000\u00a0\u056d\u0001"+
		"\u0000\u0000\u0000\u00a2\u0580\u0001\u0000\u0000\u0000\u00a4\u0582\u0001"+
		"\u0000\u0000\u0000\u00a6\u05a6\u0001\u0000\u0000\u0000\u00a8\u05a9\u0001"+
		"\u0000\u0000\u0000\u00aa\u05b7\u0001\u0000\u0000\u0000\u00ac\u05c7\u0001"+
		"\u0000\u0000\u0000\u00ae\u05ca\u0001\u0000\u0000\u0000\u00b0\u05d2\u0001"+
		"\u0000\u0000\u0000\u00b2\u05e7\u0001\u0000\u0000\u0000\u00b4\u05f7\u0001"+
		"\u0000\u0000\u0000\u00b6\u05f9\u0001\u0000\u0000\u0000\u00b8\u05fd\u0001"+
		"\u0000\u0000\u0000\u00ba\u0600\u0001\u0000\u0000\u0000\u00bc\u0638\u0001"+
		"\u0000\u0000\u0000\u00be\u063a\u0001\u0000\u0000\u0000\u00c0\u065c\u0001"+
		"\u0000\u0000\u0000\u00c2\u0661\u0001\u0000\u0000\u0000\u00c4\u066c\u0001"+
		"\u0000\u0000\u0000\u00c6\u0672\u0001\u0000\u0000\u0000\u00c8\u06a9\u0001"+
		"\u0000\u0000\u0000\u00ca\u06ab\u0001\u0000\u0000\u0000\u00cc\u06b5\u0001"+
		"\u0000\u0000\u0000\u00ce\u06c1\u0001\u0000\u0000\u0000\u00d0\u06c5\u0001"+
		"\u0000\u0000\u0000\u00d2\u06cb\u0001\u0000\u0000\u0000\u00d4\u06d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u06ed\u0001\u0000\u0000\u0000\u00d8\u06f3\u0001"+
		"\u0000\u0000\u0000\u00da\u06f5\u0001\u0000\u0000\u0000\u00dc\u06f7\u0001"+
		"\u0000\u0000\u0000\u00de\u06fc\u0001\u0000\u0000\u0000\u00e0\u0705\u0001"+
		"\u0000\u0000\u0000\u00e2\u0709\u0001\u0000\u0000\u0000\u00e4\u0714\u0001"+
		"\u0000\u0000\u0000\u00e6\u072e\u0001\u0000\u0000\u0000\u00e8\u0730\u0001"+
		"\u0000\u0000\u0000\u00ea\u0734\u0001\u0000\u0000\u0000\u00ec\u0748\u0001"+
		"\u0000\u0000\u0000\u00ee\u074c\u0001\u0000\u0000\u0000\u00f0\u074e\u0001"+
		"\u0000\u0000\u0000\u00f2\u0750\u0001\u0000\u0000\u0000\u00f4\u0753\u0001"+
		"\u0000\u0000\u0000\u00f6\u0758\u0001\u0000\u0000\u0000\u00f8\u0765\u0001"+
		"\u0000\u0000\u0000\u00fa\u0767\u0001\u0000\u0000\u0000\u00fc\u0783\u0001"+
		"\u0000\u0000\u0000\u00fe\u07a0\u0001\u0000\u0000\u0000\u0100\u07a6\u0001"+
		"\u0000\u0000\u0000\u0102\u07a8\u0001\u0000\u0000\u0000\u0104\u07af\u0001"+
		"\u0000\u0000\u0000\u0106\u07b9\u0001\u0000\u0000\u0000\u0108\u07bc\u0001"+
		"\u0000\u0000\u0000\u010a\u07c4\u0001\u0000\u0000\u0000\u010c\u07d0\u0001"+
		"\u0000\u0000\u0000\u010e\u07da\u0001\u0000\u0000\u0000\u0110\u07ec\u0001"+
		"\u0000\u0000\u0000\u0112\u07f8\u0001\u0000\u0000\u0000\u0114\u080b\u0001"+
		"\u0000\u0000\u0000\u0116\u080d\u0001\u0000\u0000\u0000\u0118\u0826\u0001"+
		"\u0000\u0000\u0000\u011a\u0837\u0001\u0000\u0000\u0000\u011c\u083d\u0001"+
		"\u0000\u0000\u0000\u011e\u0845\u0001\u0000\u0000\u0000\u0120\u084a\u0001"+
		"\u0000\u0000\u0000\u0122\u0852\u0001\u0000\u0000\u0000\u0124\u085b\u0001"+
		"\u0000\u0000\u0000\u0126\u085e\u0001\u0000\u0000\u0000\u0128\u0865\u0001"+
		"\u0000\u0000\u0000\u012a\u0870\u0001\u0000\u0000\u0000\u012c\u0873\u0001"+
		"\u0000\u0000\u0000\u012e\u087a\u0001\u0000\u0000\u0000\u0130\u0880\u0001"+
		"\u0000\u0000\u0000\u0132\u0882\u0001\u0000\u0000\u0000\u0134\u0886\u0001"+
		"\u0000\u0000\u0000\u0136\u0888\u0001\u0000\u0000\u0000\u0138\u088e\u0001"+
		"\u0000\u0000\u0000\u013a\u0898\u0001\u0000\u0000\u0000\u013c\u089a\u0001"+
		"\u0000\u0000\u0000\u013e\u089f\u0001\u0000\u0000\u0000\u0140\u08a3\u0001"+
		"\u0000\u0000\u0000\u0142\u08a5\u0001\u0000\u0000\u0000\u0144\u08aa\u0001"+
		"\u0000\u0000\u0000\u0146\u08ae\u0001\u0000\u0000\u0000\u0148\u08b0\u0001"+
		"\u0000\u0000\u0000\u014a\u08b2\u0001\u0000\u0000\u0000\u014c\u08b4\u0001"+
		"\u0000\u0000\u0000\u014e\u08b6\u0001\u0000\u0000\u0000\u0150\u08b8\u0001"+
		"\u0000\u0000\u0000\u0152\u08bd\u0001\u0000\u0000\u0000\u0154\u08c8\u0001"+
		"\u0000\u0000\u0000\u0156\u08ca\u0001\u0000\u0000\u0000\u0158\u08cc\u0001"+
		"\u0000\u0000\u0000\u015a\u08ce\u0001\u0000\u0000\u0000\u015c\u08d0\u0001"+
		"\u0000\u0000\u0000\u015e\u08d2\u0001\u0000\u0000\u0000\u0160\u08d4\u0001"+
		"\u0000\u0000\u0000\u0162\u08d6\u0001\u0000\u0000\u0000\u0164\u08d8\u0001"+
		"\u0000\u0000\u0000\u0166\u08da\u0001\u0000\u0000\u0000\u0168\u08dc\u0001"+
		"\u0000\u0000\u0000\u016a\u08de\u0001\u0000\u0000\u0000\u016c\u08e0\u0001"+
		"\u0000\u0000\u0000\u016e\u08e2\u0001\u0000\u0000\u0000\u0170\u08e5\u0001"+
		"\u0000\u0000\u0000\u0172\u08f3\u0001\u0000\u0000\u0000\u0174\u0900\u0001"+
		"\u0000\u0000\u0000\u0176\u090b\u0001\u0000\u0000\u0000\u0178\u091a\u0001"+
		"\u0000\u0000\u0000\u017a\u091c\u0001\u0000\u0000\u0000\u017c\u091e\u0001"+
		"\u0000\u0000\u0000\u017e\u0920\u0001\u0000\u0000\u0000\u0180\u093a\u0001"+
		"\u0000\u0000\u0000\u0182\u0986\u0001\u0000\u0000\u0000\u0184\u0988\u0001"+
		"\u0000\u0000\u0000\u0186\u09d4\u0001\u0000\u0000\u0000\u0188\u09e4\u0001"+
		"\u0000\u0000\u0000\u018a\u09e6\u0001\u0000\u0000\u0000\u018c\u09fa\u0001"+
		"\u0000\u0000\u0000\u018e\u09fc\u0001\u0000\u0000\u0000\u0190\u0a05\u0001"+
		"\u0000\u0000\u0000\u0192\u0a07\u0001\u0000\u0000\u0000\u0194\u0a11\u0001"+
		"\u0000\u0000\u0000\u0196\u0a18\u0001\u0000\u0000\u0000\u0198\u0a1f\u0001"+
		"\u0000\u0000\u0000\u019a\u0a2a\u0001\u0000\u0000\u0000\u019c\u0a47\u0001"+
		"\u0000\u0000\u0000\u019e\u0a49\u0001\u0000\u0000\u0000\u01a0\u0a63\u0001"+
		"\u0000\u0000\u0000\u01a2\u0a65\u0001\u0000\u0000\u0000\u01a4\u0a67\u0001"+
		"\u0000\u0000\u0000\u01a6\u0a6f\u0001\u0000\u0000\u0000\u01a8\u0a7d\u0001"+
		"\u0000\u0000\u0000\u01aa\u0a82\u0001\u0000\u0000\u0000\u01ac\u0a85\u0001"+
		"\u0000\u0000\u0000\u01ae\u0a89\u0001\u0000\u0000\u0000\u01b0\u0a8b\u0001"+
		"\u0000\u0000\u0000\u01b2\u0a9a\u0001\u0000\u0000\u0000\u01b4\u0aa1\u0001"+
		"\u0000\u0000\u0000\u01b6\u0aa3\u0001\u0000\u0000\u0000\u01b8\u0aae\u0001"+
		"\u0000\u0000\u0000\u01ba\u0ab0\u0001\u0000\u0000\u0000\u01bc\u0ab4\u0001"+
		"\u0000\u0000\u0000\u01be\u0abd\u0001\u0000\u0000\u0000\u01c0\u0ac2\u0001"+
		"\u0000\u0000\u0000\u01c2\u0af2\u0001\u0000\u0000\u0000\u01c4\u0b20\u0001"+
		"\u0000\u0000\u0000\u01c6\u0b22\u0001\u0000\u0000\u0000\u01c8\u0b2a\u0001"+
		"\u0000\u0000\u0000\u01ca\u0b31\u0001\u0000\u0000\u0000\u01cc\u0b39\u0001"+
		"\u0000\u0000\u0000\u01ce\u0b3f\u0001\u0000\u0000\u0000\u01d0\u0b63\u0001"+
		"\u0000\u0000\u0000\u01d2\u0b65\u0001\u0000\u0000\u0000\u01d4\u0b78\u0001"+
		"\u0000\u0000\u0000\u01d6\u0b7e\u0001\u0000\u0000\u0000\u01d8\u0b83\u0001"+
		"\u0000\u0000\u0000\u01da\u0b85\u0001\u0000\u0000\u0000\u01dc\u0b87\u0001"+
		"\u0000\u0000\u0000\u01de\u0b90\u0001\u0000\u0000\u0000\u01e0\u0ba8\u0001"+
		"\u0000\u0000\u0000\u01e2\u0baa\u0001\u0000\u0000\u0000\u01e4\u0bb4\u0001"+
		"\u0000\u0000\u0000\u01e6\u0bb6\u0001\u0000\u0000\u0000\u01e8\u0bba\u0001"+
		"\u0000\u0000\u0000\u01ea\u0bbd\u0001\u0000\u0000\u0000\u01ec\u0bc3\u0001"+
		"\u0000\u0000\u0000\u01ee\u0bc5\u0001\u0000\u0000\u0000\u01f0\u0bce\u0001"+
		"\u0000\u0000\u0000\u01f2\u0bd0\u0001\u0000\u0000\u0000\u01f4\u0bd3\u0001"+
		"\u0000\u0000\u0000\u01f6\u0be3\u0001\u0000\u0000\u0000\u01f8\u0bf5\u0001"+
		"\u0000\u0000\u0000\u01fa\u0bf9\u0001\u0000\u0000\u0000\u01fc\u0c09\u0001"+
		"\u0000\u0000\u0000\u01fe\u0c0d\u0001\u0000\u0000\u0000\u0200\u0c10\u0001"+
		"\u0000\u0000\u0000\u0202\u0c22\u0001\u0000\u0000\u0000\u0204\u0c2e\u0001"+
		"\u0000\u0000\u0000\u0206\u0c3a\u0001\u0000\u0000\u0000\u0208\u0c3c\u0001"+
		"\u0000\u0000\u0000\u020a\u0c3e\u0001\u0000\u0000\u0000\u020c\u0c42\u0001"+
		"\u0000\u0000\u0000\u020e\u0c5c\u0001\u0000\u0000\u0000\u0210\u0c5f\u0001"+
		"\u0000\u0000\u0000\u0212\u0c62\u0001\u0000\u0000\u0000\u0214\u0c65\u0001"+
		"\u0000\u0000\u0000\u0216\u0c67\u0001\u0000\u0000\u0000\u0218\u0c6b\u0001"+
		"\u0000\u0000\u0000\u021a\u0c70\u0001\u0000\u0000\u0000\u021c\u023c\u0003"+
		"\u00e0p\u0000\u021d\u023c\u0003\u00cae\u0000\u021e\u023c\u0003\u00d0h"+
		"\u0000\u021f\u023c\u0003\u00dcn\u0000\u0220\u023c\u0003F#\u0000\u0221"+
		"\u023c\u0003H$\u0000\u0222\u023c\u0003\u0002\u0001\u0000\u0223\u023c\u0003"+
		"\u001a\r\u0000\u0224\u023c\u0003,\u0016\u0000\u0225\u023c\u0003J%\u0000"+
		"\u0226\u023c\u0003P(\u0000\u0227\u023c\u0003\u01ea\u00f5\u0000\u0228\u023c"+
		"\u0003\u01ec\u00f6\u0000\u0229\u023c\u0003\u01ee\u00f7\u0000\u022a\u023c"+
		"\u0003\u01f4\u00fa\u0000\u022b\u023c\u0003\u01f6\u00fb\u0000\u022c\u023c"+
		"\u0003.\u0017\u0000\u022d\u023c\u0003\u0088D\u0000\u022e\u023c\u0003\u001c"+
		"\u000e\u0000\u022f\u023c\u0003\u0004\u0002\u0000\u0230\u023c\u0003\u0010"+
		"\b\u0000\u0231\u023c\u0003 \u0010\u0000\u0232\u023c\u0003\u020a\u0105"+
		"\u0000\u0233\u023c\u0003\u01f2\u00f9\u0000\u0234\u023c\u0003\u0096K\u0000"+
		"\u0235\u023c\u0003\u0098L\u0000\u0236\u023c\u0003\u001e\u000f\u0000\u0237"+
		"\u023c\u0003\u010e\u0087\u0000\u0238\u023c\u0003\u020c\u0106\u0000\u0239"+
		"\u023c\u0003\u008eG\u0000\u023a\u023c\u0003\u00c6c\u0000\u023b\u021c\u0001"+
		"\u0000\u0000\u0000\u023b\u021d\u0001\u0000\u0000\u0000\u023b\u021e\u0001"+
		"\u0000\u0000\u0000\u023b\u021f\u0001\u0000\u0000\u0000\u023b\u0220\u0001"+
		"\u0000\u0000\u0000\u023b\u0221\u0001\u0000\u0000\u0000\u023b\u0222\u0001"+
		"\u0000\u0000\u0000\u023b\u0223\u0001\u0000\u0000\u0000\u023b\u0224\u0001"+
		"\u0000\u0000\u0000\u023b\u0225\u0001\u0000\u0000\u0000\u023b\u0226\u0001"+
		"\u0000\u0000\u0000\u023b\u0227\u0001\u0000\u0000\u0000\u023b\u0228\u0001"+
		"\u0000\u0000\u0000\u023b\u0229\u0001\u0000\u0000\u0000\u023b\u022a\u0001"+
		"\u0000\u0000\u0000\u023b\u022b\u0001\u0000\u0000\u0000\u023b\u022c\u0001"+
		"\u0000\u0000\u0000\u023b\u022d\u0001\u0000\u0000\u0000\u023b\u022e\u0001"+
		"\u0000\u0000\u0000\u023b\u022f\u0001\u0000\u0000\u0000\u023b\u0230\u0001"+
		"\u0000\u0000\u0000\u023b\u0231\u0001\u0000\u0000\u0000\u023b\u0232\u0001"+
		"\u0000\u0000\u0000\u023b\u0233\u0001\u0000\u0000\u0000\u023b\u0234\u0001"+
		"\u0000\u0000\u0000\u023b\u0235\u0001\u0000\u0000\u0000\u023b\u0236\u0001"+
		"\u0000\u0000\u0000\u023b\u0237\u0001\u0000\u0000\u0000\u023b\u0238\u0001"+
		"\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023a\u0001"+
		"\u0000\u0000\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023f\u0005"+
		")\u0000\u0000\u023e\u023d\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0005\u0000"+
		"\u0000\u0001\u0241\u0001\u0001\u0000\u0000\u0000\u0242\u0244\u00050\u0000"+
		"\u0000\u0243\u0245\u0003R)\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u00059\u0000\u0000\u0247\u0248\u0003\u0144\u00a2\u0000\u0248\u024a"+
		"\u0003V+\u0000\u0249\u024b\u0003T*\u0000\u024a\u0249\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u0003\u0001\u0000\u0000"+
		"\u0000\u024c\u024d\u00050\u0000\u0000\u024d\u024e\u0005\u00a6\u0000\u0000"+
		"\u024e\u024f\u0003\u0148\u00a4\u0000\u024f\u0250\u0005a\u0000\u0000\u0250"+
		"\u0252\u0003\u0174\u00ba\u0000\u0251\u0253\u0003\u0006\u0003\u0000\u0252"+
		"\u0251\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253"+
		"\u0255\u0001\u0000\u0000\u0000\u0254\u0256\u0003\b\u0004\u0000\u0255\u0254"+
		"\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0258"+
		"\u0001\u0000\u0000\u0000\u0257\u0259\u0003\n\u0005\u0000\u0258\u0257\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025b\u0001"+
		"\u0000\u0000\u0000\u025a\u025c\u0003\f\u0006\u0000\u025b\u025a\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025e\u0001\u0000"+
		"\u0000\u0000\u025d\u025f\u0003\u000e\u0007\u0000\u025e\u025d\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0005\u0001\u0000"+
		"\u0000\u0000\u0260\u0261\u0005Q\u0000\u0000\u0261\u0268\u0003\u0164\u00b2"+
		"\u0000\u0262\u0263\u0005Q\u0000\u0000\u0263\u0264\u0005\u010b\u0000\u0000"+
		"\u0264\u0265\u0005\u001e\u0000\u0000\u0265\u0266\u0005\u019f\u0000\u0000"+
		"\u0266\u0268\u0005\u001f\u0000\u0000\u0267\u0260\u0001\u0000\u0000\u0000"+
		"\u0267\u0262\u0001\u0000\u0000\u0000\u0268\u0007\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0005\u0125\u0000\u0000\u026a\u026e\u0005\u012e\u0000\u0000"+
		"\u026b\u026c\u0005\u012e\u0000\u0000\u026c\u026e\u0005\u0140\u0000\u0000"+
		"\u026d\u0269\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000"+
		"\u026e\t\u0001\u0000\u0000\u0000\u026f\u0270\u0005L\u0000\u0000\u0270"+
		"\u0274\u0005\u0174\u0000\u0000\u0271\u0272\u0005L\u0000\u0000\u0272\u0274"+
		"\u0005\u0119\u0000\u0000\u0273\u026f\u0001\u0000\u0000\u0000\u0273\u0271"+
		"\u0001\u0000\u0000\u0000\u0274\u000b\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0005\u0175\u0000\u0000\u0276\u027a\u0005\u0174\u0000\u0000\u0277\u0278"+
		"\u0005\u0175\u0000\u0000\u0278\u027a\u0005\u0119\u0000\u0000\u0279\u0275"+
		"\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\r\u0001"+
		"\u0000\u0000\u0000\u027b\u0280\u0003\u01d4\u00ea\u0000\u027c\u027d\u0005"+
		")\u0000\u0000\u027d\u027f\u0003\u01d4\u00ea\u0000\u027e\u027c\u0001\u0000"+
		"\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u000f\u0001\u0000"+
		"\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0284\u00050\u0000"+
		"\u0000\u0284\u0285\u0005\u0103\u0000\u0000\u0285\u0287\u0003\u0140\u00a0"+
		"\u0000\u0286\u0288\u0005\\\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000"+
		"\u0289\u028b\u0003\u01c2\u00e1\u0000\u028a\u028c\u0003\u0012\t\u0000\u028b"+
		"\u028a\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c"+
		"\u028e\u0001\u0000\u0000\u0000\u028d\u028f\u0003\u0014\n\u0000\u028e\u028d"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0291"+
		"\u0001\u0000\u0000\u0000\u0290\u0292\u0003\u0016\u000b\u0000\u0291\u0290"+
		"\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0294"+
		"\u0001\u0000\u0000\u0000\u0293\u0295\u0003\u0018\f\u0000\u0294\u0293\u0001"+
		"\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0297\u0001"+
		"\u0000\u0000\u0000\u0296\u0298\u0003\u01ca\u00e5\u0000\u0297\u0296\u0001"+
		"\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0011\u0001"+
		"\u0000\u0000\u0000\u0299\u029b\u0005\u0095\u0000\u0000\u029a\u029c\u0003"+
		"\u01d8\u00ec\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029b\u029c\u0001"+
		"\u0000\u0000\u0000\u029c\u0013\u0001\u0000\u0000\u0000\u029d\u029e\u0005"+
		"f\u0000\u0000\u029e\u029f\u0005g\u0000\u0000\u029f\u0015\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0005\u00ed\u0000\u0000\u02a1\u02a2\u0005\u001e\u0000"+
		"\u0000\u02a2\u02a3\u0003\u0176\u00bb\u0000\u02a3\u02a4\u0005\u001f\u0000"+
		"\u0000\u02a4\u0017\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005\u007f\u0000"+
		"\u0000\u02a6\u02a7\u00058\u0000\u0000\u02a7\u02a9\u0003\u0174\u00ba\u0000"+
		"\u02a8\u02aa\u0003\u01ca\u00e5\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000"+
		"\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u0019\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ac\u00051\u0000\u0000\u02ac\u02ad\u00059\u0000\u0000\u02ad\u02ae"+
		"\u0003\u0144\u00a2\u0000\u02ae\u02af\u0003x<\u0000\u02af\u001b\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u00051\u0000\u0000\u02b1\u02b2\u0005\u0172\u0000"+
		"\u0000\u02b2\u02b4\u0003\u0144\u00a2\u0000\u02b3\u02b5\u0003X,\u0000\u02b4"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b6\u02b8\u0003Z-\u0000\u02b7\u02b6\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u001d\u0001"+
		"\u0000\u0000\u0000\u02b9\u02ba\u00050\u0000\u0000\u02ba\u02bb\u0007\u0000"+
		"\u0000\u0000\u02bb\u02bd\u0003\u0144\u00a2\u0000\u02bc\u02be\u0003X,\u0000"+
		"\u02bd\u02bc\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000"+
		"\u02be\u02c0\u0001\u0000\u0000\u0000\u02bf\u02c1\u0003Z-\u0000\u02c0\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u001f"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c3\u00051\u0000\u0000\u02c3\u02c4\u0005"+
		"\u0103\u0000\u0000\u02c4\u02c6\u0003\u0140\u00a0\u0000\u02c5\u02c7\u0003"+
		"\"\u0011\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c9\u0001\u0000\u0000\u0000\u02c8\u02ca\u0003$\u0012"+
		"\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cc\u0001\u0000\u0000\u0000\u02cb\u02cd\u0003&\u0013\u0000"+
		"\u02cc\u02cb\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cd\u02cf\u0001\u0000\u0000\u0000\u02ce\u02d0\u0003(\u0014\u0000\u02cf"+
		"\u02ce\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d1\u02d3\u0003*\u0015\u0000\u02d2\u02d1"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3!\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d5\u0005b\u0000\u0000\u02d5\u02d6\u0003\u0144"+
		"\u00a2\u0000\u02d6#\u0001\u0000\u0000\u0000\u02d7\u02d8\u00058\u0000\u0000"+
		"\u02d8\u02d9\u0005\u0095\u0000\u0000\u02d9\u02dd\u0003\u01d8\u00ec\u0000"+
		"\u02da\u02db\u00052\u0000\u0000\u02db\u02dd\u0005\u0095\u0000\u0000\u02dc"+
		"\u02d7\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd"+
		"%\u0001\u0000\u0000\u0000\u02de\u02df\u0007\u0001\u0000\u0000\u02df\u02e0"+
		"\u0005f\u0000\u0000\u02e0\u02e1\u0005g\u0000\u0000\u02e1\'\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e4\u00057\u0000\u0000\u02e3\u02e5\u0005<\u0000\u0000"+
		"\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005\u00ed\u0000\u0000"+
		"\u02e7\u02e8\u0005\u001e\u0000\u0000\u02e8\u02e9\u0003\u0176\u00bb\u0000"+
		"\u02e9\u02ea\u0005\u001f\u0000\u0000\u02ea\u02ee\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u00052\u0000\u0000\u02ec\u02ee\u0005<\u0000\u0000\u02ed\u02e2"+
		"\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee)\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f0\u0005\u00ab\u0000\u0000\u02f0\u02f8\u0003"+
		"\u01c2\u00e1\u0000\u02f1\u02f2\u0005\u007f\u0000\u0000\u02f2\u02f3\u0005"+
		"8\u0000\u0000\u02f3\u02f6\u0003\u0124\u0092\u0000\u02f4\u02f5\u0005\u00ef"+
		"\u0000\u0000\u02f5\u02f7\u0003\u01e4\u00f2\u0000\u02f6\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f1\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f9+\u0001\u0000\u0000\u0000\u02fa\u02fb\u00052\u0000\u0000"+
		"\u02fb\u02fc\u00059\u0000\u0000\u02fc\u02fd\u0003\u0172\u00b9\u0000\u02fd"+
		"\u02fe\u0003\u01ce\u00e7\u0000\u02fe-\u0001\u0000\u0000\u0000\u02ff\u0300"+
		"\u00050\u0000\u0000\u0300\u0301\u0005C\u0000\u0000\u0301\u0303\u0003\u0156"+
		"\u00ab\u0000\u0302\u0304\u0003D\"\u0000\u0303\u0302\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000"+
		"\u0000\u0305\u0306\u0005\u015b\u0000\u0000\u0306\u0308\u0003\u01e0\u00f0"+
		"\u0000\u0307\u0309\u0003\u01ca\u00e5\u0000\u0308\u0307\u0001\u0000\u0000"+
		"\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0001\u0000\u0000"+
		"\u0000\u030a\u030c\u0005\u015c\u0000\u0000\u030b\u030a\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u0320\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0005\u010b\u0000\u0000\u030e\u030f\u0005\u00a5\u0000"+
		"\u0000\u030f\u0310\u0003\u0168\u00b4\u0000\u0310\u0311\u0005\u015d\u0000"+
		"\u0000\u0311\u0312\u0003\u015e\u00af\u0000\u0312\u0321\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0005\u009f\u0000\u0000\u0314\u0315\u0005\u0157\u0000"+
		"\u0000\u0315\u0317\u0007\u0002\u0000\u0000\u0316\u0313\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000"+
		"\u0000\u0318\u031a\u0005\\\u0000\u0000\u0319\u031b\u00038\u001c\u0000"+
		"\u031a\u0319\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000"+
		"\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0005x\u0000\u0000\u031d"+
		"\u031e\u00030\u0018\u0000\u031e\u031f\u0005\u0104\u0000\u0000\u031f\u0321"+
		"\u0001\u0000\u0000\u0000\u0320\u030d\u0001\u0000\u0000\u0000\u0320\u0316"+
		"\u0001\u0000\u0000\u0000\u0321/\u0001\u0000\u0000\u0000\u0322\u0324\u0003"+
		"2\u0019\u0000\u0323\u0325\u0005)\u0000\u0000\u0324\u0323\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0327\u0001\u0000\u0000"+
		"\u0000\u0326\u0322\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000"+
		"\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000"+
		"\u0000\u03291\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000"+
		"\u032b\u0339\u0003\u00e0p\u0000\u032c\u0339\u0003\u00cae\u0000\u032d\u0339"+
		"\u0003\u00d0h\u0000\u032e\u0339\u0003\u00dcn\u0000\u032f\u0339\u0003\u0086"+
		"C\u0000\u0330\u0339\u00034\u001a\u0000\u0331\u0339\u00036\u001b\u0000"+
		"\u0332\u0339\u0003\u00b6[\u0000\u0333\u0339\u0003\u00b8\\\u0000\u0334"+
		"\u0339\u0003\u00bc^\u0000\u0335\u0339\u0003\u00ba]\u0000\u0336\u0339\u0003"+
		"\u00be_\u0000\u0337\u0339\u0003\u008eG\u0000\u0338\u032b\u0001\u0000\u0000"+
		"\u0000\u0338\u032c\u0001\u0000\u0000\u0000\u0338\u032d\u0001\u0000\u0000"+
		"\u0000\u0338\u032e\u0001\u0000\u0000\u0000\u0338\u032f\u0001\u0000\u0000"+
		"\u0000\u0338\u0330\u0001\u0000\u0000\u0000\u0338\u0331\u0001\u0000\u0000"+
		"\u0000\u0338\u0332\u0001\u0000\u0000\u0000\u0338\u0333\u0001\u0000\u0000"+
		"\u0000\u0338\u0334\u0001\u0000\u0000\u0000\u0338\u0335\u0001\u0000\u0000"+
		"\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0338\u0337\u0001\u0000\u0000"+
		"\u0000\u03393\u0001\u0000\u0000\u0000\u033a\u033b\u0005\u00a3\u0000\u0000"+
		"\u033b\u033c\u0003\u016a\u00b5\u0000\u033c5\u0001\u0000\u0000\u0000\u033d"+
		"\u033e\u0005\u00a2\u0000\u0000\u033e\u033f\u0003\u016a\u00b5\u0000\u033f"+
		"7\u0001\u0000\u0000\u0000\u0340\u0345\u0003:\u001d\u0000\u0341\u0342\u0005"+
		"$\u0000\u0000\u0342\u0344\u0003:\u001d\u0000\u0343\u0341\u0001\u0000\u0000"+
		"\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000"+
		"\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u03469\u0001\u0000\u0000\u0000"+
		"\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u034c\u0003<\u001e\u0000\u0349"+
		"\u034c\u0003>\u001f\u0000\u034a\u034c\u0003@ \u0000\u034b\u0348\u0001"+
		"\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034a\u0001"+
		"\u0000\u0000\u0000\u034c;\u0001\u0000\u0000\u0000\u034d\u034f\u0005\u00fc"+
		"\u0000\u0000\u034e\u0350\u0005\u015f\u0000\u0000\u034f\u034e\u0001\u0000"+
		"\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u036c\u0001\u0000"+
		"\u0000\u0000\u0351\u0352\u0003\u0162\u00b1\u0000\u0352\u0355\u0003\u01e0"+
		"\u00f0\u0000\u0353\u0354\u0005f\u0000\u0000\u0354\u0356\u0005g\u0000\u0000"+
		"\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000"+
		"\u0356\u0358\u0001\u0000\u0000\u0000\u0357\u0359\u0003\u01ca\u00e5\u0000"+
		"\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000"+
		"\u0359\u035c\u0001\u0000\u0000\u0000\u035a\u035b\u0007\u0003\u0000\u0000"+
		"\u035b\u035d\u0003\u01d8\u00ec\u0000\u035c\u035a\u0001\u0000\u0000\u0000"+
		"\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u036d\u0001\u0000\u0000\u0000"+
		"\u035e\u035f\u0003\u016a\u00b5\u0000\u035f\u0360\u0005\u00f9\u0000\u0000"+
		"\u0360\u0364\u0005a\u0000\u0000\u0361\u0365\u0005\u0139\u0000\u0000\u0362"+
		"\u0363\u0005\u0125\u0000\u0000\u0363\u0365\u0005\u0139\u0000\u0000\u0364"+
		"\u0361\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364"+
		"\u0365\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366"+
		"\u0367\u0005\u001e\u0000\u0000\u0367\u0368\u0003\u00e0p\u0000\u0368\u036a"+
		"\u0005\u001f\u0000\u0000\u0369\u036b\u0005)\u0000\u0000\u036a\u0369\u0001"+
		"\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036d\u0001"+
		"\u0000\u0000\u0000\u036c\u0351\u0001\u0000\u0000\u0000\u036c\u035e\u0001"+
		"\u0000\u0000\u0000\u036d=\u0001\u0000\u0000\u0000\u036e\u036f\u0005E\u0000"+
		"\u0000\u036f\u0371\u0003\u016c\u00b6\u0000\u0370\u0372\u0003D\"\u0000"+
		"\u0371\u0370\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000\u0000"+
		"\u0372\u0375\u0001\u0000\u0000\u0000\u0373\u0374\u0005\u015b\u0000\u0000"+
		"\u0374\u0376\u0003D\"\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375"+
		"\u0376\u0001\u0000\u0000\u0000\u0376?\u0001\u0000\u0000\u0000\u0377\u0378"+
		"\u0005C\u0000\u0000\u0378\u037a\u0003\u0156\u00ab\u0000\u0379\u037b\u0003"+
		"D\"\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000"+
		"\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037d\u0005\u015b"+
		"\u0000\u0000\u037d\u037f\u0003\u01e0\u00f0\u0000\u037e\u0380\u0003\u01ca"+
		"\u00e5\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000"+
		"\u0000\u0000\u0380\u0382\u0001\u0000\u0000\u0000\u0381\u0383\u0005\u015c"+
		"\u0000\u0000\u0382\u0381\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000"+
		"\u0000\u0000\u0383A\u0001\u0000\u0000\u0000\u0384\u0387\u0003\u01dc\u00ee"+
		"\u0000\u0385\u0386\u0007\u0003\u0000\u0000\u0386\u0388\u0003\u01d8\u00ec"+
		"\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000"+
		"\u0000\u0388C\u0001\u0000\u0000\u0000\u0389\u0392\u0005\u001e\u0000\u0000"+
		"\u038a\u038f\u0003B!\u0000\u038b\u038c\u0005$\u0000\u0000\u038c\u038e"+
		"\u0003B!\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038e\u0391\u0001\u0000"+
		"\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000"+
		"\u0000\u0000\u0390\u0393\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000"+
		"\u0000\u0000\u0392\u038a\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000"+
		"\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0395\u0005\u001f"+
		"\u0000\u0000\u0395E\u0001\u0000\u0000\u0000\u0396\u0397\u00050\u0000\u0000"+
		"\u0397\u0398\u00054\u0000\u0000\u0398\u039c\u0003\u013a\u009d\u0000\u0399"+
		"\u039b\u0003\\.\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039b\u039e"+
		"\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d"+
		"\u0001\u0000\u0000\u0000\u039dG\u0001\u0000\u0000\u0000\u039e\u039c\u0001"+
		"\u0000\u0000\u0000\u039f\u03a0\u00052\u0000\u0000\u03a0\u03a1\u00054\u0000"+
		"\u0000\u03a1\u03a2\u0003\u013a\u009d\u0000\u03a2\u03a3\u0003\u01ce\u00e7"+
		"\u0000\u03a3I\u0001\u0000\u0000\u0000\u03a4\u03a7\u00050\u0000\u0000\u03a5"+
		"\u03a6\u0005d\u0000\u0000\u03a6\u03a8\u00051\u0000\u0000\u03a7\u03a5\u0001"+
		"\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001"+
		"\u0000\u0000\u0000\u03a9\u03aa\u0005F\u0000\u0000\u03aa\u03ab\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ad\u0003\u0154\u00aa\u0000\u03ac\u03ae\u0003L&\u0000"+
		"\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000"+
		"\u03ae\u03af\u0001\u0000\u0000\u0000\u03af\u03b0\u0005\\\u0000\u0000\u03b0"+
		"\u03b7\u0003\u00e0p\u0000\u03b1\u03b3\u0005I\u0000\u0000\u03b2\u03b4\u0007"+
		"\u0004\u0000\u0000\u03b3\u03b2\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b6\u0005"+
		"\u00ed\u0000\u0000\u03b6\u03b8\u0005\u012b\u0000\u0000\u03b7\u03b1\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8K\u0001\u0000"+
		"\u0000\u0000\u03b9\u03ba\u0005\u001e\u0000\u0000\u03ba\u03bf\u0003N\'"+
		"\u0000\u03bb\u03bc\u0005$\u0000\u0000\u03bc\u03be\u0003N\'\u0000\u03bd"+
		"\u03bb\u0001\u0000\u0000\u0000\u03be\u03c1\u0001\u0000\u0000\u0000\u03bf"+
		"\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c2"+
		"\u03c3\u0005\u001f\u0000\u0000\u03c3M\u0001\u0000\u0000\u0000\u03c4\u03c7"+
		"\u0003\u0152\u00a9\u0000\u03c5\u03c6\u0005\\\u0000\u0000\u03c6\u03c8\u0003"+
		"\u00eew\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000"+
		"\u0000\u0000\u03c8O\u0001\u0000\u0000\u0000\u03c9\u03ca\u00052\u0000\u0000"+
		"\u03ca\u03cb\u0005F\u0000\u0000\u03cb\u03cc\u0003\u0154\u00aa\u0000\u03cc"+
		"\u03cd\u0003\u01ce\u00e7\u0000\u03cdQ\u0001\u0000\u0000\u0000\u03ce\u03cf"+
		"\u0005\u0111\u0000\u0000\u03cf\u03d0\u0005\u0145\u0000\u0000\u03d0S\u0001"+
		"\u0000\u0000\u0000\u03d1\u03d2\u0005\u009f\u0000\u0000\u03d2\u03d3\u0005"+
		"\u0157\u0000\u0000\u03d3\u03d4\u0007\u0002\u0000\u0000\u03d4U\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d6\u0005\u001e\u0000\u0000\u03d6\u03db\u0003^/\u0000"+
		"\u03d7\u03d8\u0005$\u0000\u0000\u03d8\u03da\u0003^/\u0000\u03d9\u03d7"+
		"\u0001\u0000\u0000\u0000\u03da\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9"+
		"\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03de"+
		"\u0001\u0000\u0000\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\u03df"+
		"\u0005\u001f\u0000\u0000\u03dfW\u0001\u0000\u0000\u0000\u03e0\u03e3\u0005"+
		"\u0171\u0000\u0000\u03e1\u03e2\u0005I\u0000\u0000\u03e2\u03e4\u0003\u0184"+
		"\u00c2\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e4Y\u0001\u0000\u0000\u0000\u03e5\u03e7\u0005\u0173\u0000"+
		"\u0000\u03e6\u03e8\u0005r\u0000\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000"+
		"\u03e9\u03ea\u0005\u01a0\u0000\u0000\u03ea[\u0001\u0000\u0000\u0000\u03eb"+
		"\u03ec\u0005\u0095\u0000\u0000\u03ec\u03ed\u0005\u007f\u0000\u0000\u03ed"+
		"\u03ef\u00058\u0000\u0000\u03ee\u03f0\u0005\u0017\u0000\u0000\u03ef\u03ee"+
		"\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03f1"+
		"\u0001\u0000\u0000\u0000\u03f1\u03f2\u0003\u0174\u00ba\u0000\u03f2]\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f7\u0003`0\u0000\u03f4\u03f7\u0003l6\u0000"+
		"\u03f5\u03f7\u0003d2\u0000\u03f6\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f7_\u0001"+
		"\u0000\u0000\u0000\u03f8\u03fa\u0003\u0152\u00a9\u0000\u03f9\u03fb\u0003"+
		"\u01c2\u00e1\u0000\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fb\u0408\u0001\u0000\u0000\u0000\u03fc\u03fd\u0005"+
		"\u016e\u0000\u0000\u03fd\u03fe\u0005r\u0000\u0000\u03fe\u03ff\u0005\u0095"+
		"\u0000\u0000\u03ff\u0400\u0005\\\u0000\u0000\u0400\u0406\u0005\u0114\u0000"+
		"\u0000\u0401\u0402\u0005\u001e\u0000\u0000\u0402\u0403\u0005\u0190\u0000"+
		"\u0000\u0403\u0404\u0005I\u0000\u0000\u0404\u0405\u0005\u01a0\u0000\u0000"+
		"\u0405\u0407\u0005\u001f\u0000\u0000\u0406\u0401\u0001\u0000\u0000\u0000"+
		"\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0409\u0001\u0000\u0000\u0000"+
		"\u0408\u03fc\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000"+
		"\u0409\u040d\u0001\u0000\u0000\u0000\u040a\u040c\u0003b1\u0000\u040b\u040a"+
		"\u0001\u0000\u0000\u0000\u040c\u040f\u0001\u0000\u0000\u0000\u040d\u040b"+
		"\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040ea\u0001"+
		"\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u0410\u0412\u0003"+
		"p8\u0000\u0411\u0413\u0003j5\u0000\u0412\u0411\u0001\u0000\u0000\u0000"+
		"\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0433\u0001\u0000\u0000\u0000"+
		"\u0414\u0416\u0005>\u0000\u0000\u0415\u0417\u0003j5\u0000\u0416\u0415"+
		"\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0433"+
		"\u0001\u0000\u0000\u0000\u0418\u041a\u0005f\u0000\u0000\u0419\u0418\u0001"+
		"\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000\u041a\u041b\u0001"+
		"\u0000\u0000\u0000\u041b\u0433\u0005g\u0000\u0000\u041c\u0433\u0003\u01ca"+
		"\u00e5\u0000\u041d\u0433\u0003d2\u0000\u041e\u0433\u0003f3\u0000\u041f"+
		"\u0422\u0005\u0095\u0000\u0000\u0420\u0423\u0003\u0124\u0092\u0000\u0421"+
		"\u0423\u0003\u0176\u00bb\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422"+
		"\u0421\u0001\u0000\u0000\u0000\u0423\u0433\u0001\u0000\u0000\u0000\u0424"+
		"\u0433\u0005\u019f\u0000\u0000\u0425\u0427\u0005\u0170\u0000\u0000\u0426"+
		"\u0428\u0005r\u0000\u0000\u0427\u0426\u0001\u0000\u0000\u0000\u0427\u0428"+
		"\u0001\u0000\u0000\u0000\u0428\u042d\u0001\u0000\u0000\u0000\u0429\u042a"+
		"\u0005\u016e\u0000\u0000\u042a\u042b\u0005\u016f\u0000\u0000\u042b\u042d"+
		"\u0005\\\u0000\u0000\u042c\u0425\u0001\u0000\u0000\u0000\u042c\u0429\u0001"+
		"\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u042f\u0005"+
		"\u001e\u0000\u0000\u042f\u0430\u0003\u0176\u00bb\u0000\u0430\u0431\u0005"+
		"\u001f\u0000\u0000\u0431\u0433\u0001\u0000\u0000\u0000\u0432\u0410\u0001"+
		"\u0000\u0000\u0000\u0432\u0414\u0001\u0000\u0000\u0000\u0432\u0419\u0001"+
		"\u0000\u0000\u0000\u0432\u041c\u0001\u0000\u0000\u0000\u0432\u041d\u0001"+
		"\u0000\u0000\u0000\u0432\u041e\u0001\u0000\u0000\u0000\u0432\u041f\u0001"+
		"\u0000\u0000\u0000\u0432\u0424\u0001\u0000\u0000\u0000\u0432\u042c\u0001"+
		"\u0000\u0000\u0000\u0433c\u0001\u0000\u0000\u0000\u0434\u0436\u0005<\u0000"+
		"\u0000\u0435\u0437\u0003\u01cc\u00e6\u0000\u0436\u0435\u0001\u0000\u0000"+
		"\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0439\u0001\u0000\u0000"+
		"\u0000\u0438\u0434\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000"+
		"\u0000\u0439\u043a\u0001\u0000\u0000\u0000\u043a\u043b\u0003\u0016\u000b"+
		"\u0000\u043be\u0001\u0000\u0000\u0000\u043c\u043d\u0005\u0135\u0000\u0000"+
		"\u043d\u043f\u0003\u0144\u00a2\u0000\u043e\u0440\u0003\u0170\u00b8\u0000"+
		"\u043f\u043e\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000"+
		"\u0440\u0442\u0001\u0000\u0000\u0000\u0441\u0443\u0003j5\u0000\u0442\u0441"+
		"\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443\u0449"+
		"\u0001\u0000\u0000\u0000\u0444\u0445\u0005]\u0000\u0000\u0445\u0446\u0007"+
		"\u0005\u0000\u0000\u0446\u0448\u0003h4\u0000\u0447\u0444\u0001\u0000\u0000"+
		"\u0000\u0448\u044b\u0001\u0000\u0000\u0000\u0449\u0447\u0001\u0000\u0000"+
		"\u0000\u0449\u044a\u0001\u0000\u0000\u0000\u044ag\u0001\u0000\u0000\u0000"+
		"\u044b\u0449\u0001\u0000\u0000\u0000\u044c\u0454\u0005\u00e9\u0000\u0000"+
		"\u044d\u044e\u00058\u0000\u0000\u044e\u0454\u0005g\u0000\u0000\u044f\u0450"+
		"\u0005\u0125\u0000\u0000\u0450\u0454\u0005\u00e0\u0000\u0000\u0451\u0452"+
		"\u00058\u0000\u0000\u0452\u0454\u0005\u0095\u0000\u0000\u0453\u044c\u0001"+
		"\u0000\u0000\u0000\u0453\u044d\u0001\u0000\u0000\u0000\u0453\u044f\u0001"+
		"\u0000\u0000\u0000\u0453\u0451\u0001\u0000\u0000\u0000\u0454i\u0001\u0000"+
		"\u0000\u0000\u0455\u045e\u0005Z\u0000\u0000\u0456\u0458\u0005s\u0000\u0000"+
		"\u0457\u0459\u0005\u0156\u0000\u0000\u0458\u0457\u0001\u0000\u0000\u0000"+
		"\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045f\u0001\u0000\u0000\u0000"+
		"\u045a\u045c\u0005t\u0000\u0000\u045b\u045d\u0005\u0156\u0000\u0000\u045c"+
		"\u045b\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d"+
		"\u045f\u0001\u0000\u0000\u0000\u045e\u0456\u0001\u0000\u0000\u0000\u045e"+
		"\u045a\u0001\u0000\u0000\u0000\u045e\u045f\u0001\u0000\u0000\u0000\u045f"+
		"\u0460\u0001\u0000\u0000\u0000\u0460\u0461\u0005;\u0000\u0000\u0461\u0462"+
		"\u0003\u0134\u009a\u0000\u0462k\u0001\u0000\u0000\u0000\u0463\u0465\u0005"+
		"<\u0000\u0000\u0464\u0466\u0003\u0166\u00b3\u0000\u0465\u0464\u0001\u0000"+
		"\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466\u0468\u0001\u0000"+
		"\u0000\u0000\u0467\u0463\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000"+
		"\u0000\u0000\u0468\u046c\u0001\u0000\u0000\u0000\u0469\u046d\u0003n7\u0000"+
		"\u046a\u046d\u0003r9\u0000\u046b\u046d\u0003t:\u0000\u046c\u0469\u0001"+
		"\u0000\u0000\u0000\u046c\u046a\u0001\u0000\u0000\u0000\u046c\u046b\u0001"+
		"\u0000\u0000\u0000\u046c\u046d\u0001\u0000\u0000\u0000\u046dm\u0001\u0000"+
		"\u0000\u0000\u046e\u046f\u0003p8\u0000\u046f\u0471\u0003\u0170\u00b8\u0000"+
		"\u0470\u0472\u0003j5\u0000\u0471\u0470\u0001\u0000\u0000\u0000\u0471\u0472"+
		"\u0001\u0000\u0000\u0000\u0472o\u0001\u0000\u0000\u0000\u0473\u0474\u0005"+
		"=\u0000\u0000\u0474\u0475\u0005@\u0000\u0000\u0475q\u0001\u0000\u0000"+
		"\u0000\u0476\u0477\u0005>\u0000\u0000\u0477\u0479\u0003\u0170\u00b8\u0000"+
		"\u0478\u047a\u0003j5\u0000\u0479\u0478\u0001\u0000\u0000\u0000\u0479\u047a"+
		"\u0001\u0000\u0000\u0000\u047as\u0001\u0000\u0000\u0000\u047b\u047c\u0005"+
		"?\u0000\u0000\u047c\u047d\u0005@\u0000\u0000\u047d\u047e\u0003\u0170\u00b8"+
		"\u0000\u047e\u047f\u0003f3\u0000\u047fu\u0001\u0000\u0000\u0000\u0480"+
		"\u0482\u0005\u001e\u0000\u0000\u0481\u0480\u0001\u0000\u0000\u0000\u0481"+
		"\u0482\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483"+
		"\u0484\u0005o\u0000\u0000\u0484\u0486\u0003\u0144\u00a2\u0000\u0485\u0487"+
		"\u0005\u001f\u0000\u0000\u0486\u0485\u0001\u0000\u0000\u0000\u0486\u0487"+
		"\u0001\u0000\u0000\u0000\u0487w\u0001\u0000\u0000\u0000\u0488\u048e\u0003"+
		"z=\u0000\u0489\u048e\u0003|>\u0000\u048a\u048e\u0003\u0080@\u0000\u048b"+
		"\u048e\u0003\u0082A\u0000\u048c\u048e\u0003\u0084B\u0000\u048d\u0488\u0001"+
		"\u0000\u0000\u0000\u048d\u0489\u0001\u0000\u0000\u0000\u048d\u048a\u0001"+
		"\u0000\u0000\u0000\u048d\u048b\u0001\u0000\u0000\u0000\u048d\u048c\u0001"+
		"\u0000\u0000\u0000\u048ey\u0001\u0000\u0000\u0000\u048f\u0491\u00057\u0000"+
		"\u0000\u0490\u0492\u0005:\u0000\u0000\u0491\u0490\u0001\u0000\u0000\u0000"+
		"\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000\u0000\u0000"+
		"\u0493\u0494\u0003`0\u0000\u0494{\u0001\u0000\u0000\u0000\u0495\u04c0"+
		"\u0003~?\u0000\u0496\u0497\u0005b\u0000\u0000\u0497\u04c1\u0003\u0144"+
		"\u00a2\u0000\u0498\u0499\u0005A\u0000\u0000\u0499\u04c1\u0003\u0176\u00bb"+
		"\u0000\u049a\u049d\u0005\u00ab\u0000\u0000\u049b\u049e\u0003\u01c2\u00e1"+
		"\u0000\u049c\u049e\u0003\u0140\u00a0\u0000\u049d\u049b\u0001\u0000\u0000"+
		"\u0000\u049d\u049c\u0001\u0000\u0000\u0000\u049e\u04c1\u0001\u0000\u0000"+
		"\u0000\u049f\u04a0\u00058\u0000\u0000\u04a0\u04a1\u0005\u0095\u0000\u0000"+
		"\u04a1\u04c1\u0003\u01d8\u00ec\u0000\u04a2\u04a3\u00052\u0000\u0000\u04a3"+
		"\u04c1\u0005\u0095\u0000\u0000\u04a4\u04a5\u00058\u0000\u0000\u04a5\u04a6"+
		"\u0005f\u0000\u0000\u04a6\u04c1\u0005g\u0000\u0000\u04a7\u04a8\u00052"+
		"\u0000\u0000\u04a8\u04a9\u0005f\u0000\u0000\u04a9\u04c1\u0005g\u0000\u0000"+
		"\u04aa\u04ab\u0005\u00ab\u0000\u0000\u04ab\u04ad\u0003\u01c2\u00e1\u0000"+
		"\u04ac\u04aa\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000\u0000"+
		"\u04ad\u04b5\u0001\u0000\u0000\u0000\u04ae\u04af\u0005\u016e\u0000\u0000"+
		"\u04af\u04b0\u0005\u016f\u0000\u0000\u04b0\u04b6\u0005\\\u0000\u0000\u04b1"+
		"\u04b3\u0005\u0170\u0000\u0000\u04b2\u04b4\u0005r\u0000\u0000\u04b3\u04b2"+
		"\u0001\u0000\u0000\u0000\u04b3\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b6"+
		"\u0001\u0000\u0000\u0000\u04b5\u04ae\u0001\u0000\u0000\u0000\u04b5\u04b1"+
		"\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000\u0000\u04b7\u04b8"+
		"\u0005\u001e\u0000\u0000\u04b8\u04b9\u0003\u0176\u00bb\u0000\u04b9\u04ba"+
		"\u0005\u001f\u0000\u0000\u04ba\u04c1\u0001\u0000\u0000\u0000\u04bb\u04be"+
		"\u0005\u0171\u0000\u0000\u04bc\u04bd\u0005I\u0000\u0000\u04bd\u04bf\u0005"+
		"\u01a0\u0000\u0000\u04be\u04bc\u0001\u0000\u0000\u0000\u04be\u04bf\u0001"+
		"\u0000\u0000\u0000\u04bf\u04c1\u0001\u0000\u0000\u0000\u04c0\u0496\u0001"+
		"\u0000\u0000\u0000\u04c0\u0498\u0001\u0000\u0000\u0000\u04c0\u049a\u0001"+
		"\u0000\u0000\u0000\u04c0\u049f\u0001\u0000\u0000\u0000\u04c0\u04a2\u0001"+
		"\u0000\u0000\u0000\u04c0\u04a4\u0001\u0000\u0000\u0000\u04c0\u04a7\u0001"+
		"\u0000\u0000\u0000\u04c0\u04ac\u0001\u0000\u0000\u0000\u04c0\u04bb\u0001"+
		"\u0000\u0000\u0000\u04c1}\u0001\u0000\u0000\u0000\u04c2\u04c4\u00051\u0000"+
		"\u0000\u04c3\u04c5\u0005:\u0000\u0000\u04c4\u04c3\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c5\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000"+
		"\u04c6\u04c7\u0003\u0152\u00a9\u0000\u04c7\u007f\u0001\u0000\u0000\u0000"+
		"\u04c8\u04ca\u00052\u0000\u0000\u04c9\u04cb\u0005:\u0000\u0000\u04ca\u04c9"+
		"\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u04cc"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cd\u0003\u0152\u00a9\u0000\u04cd\u0081"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cf\u00057\u0000\u0000\u04cf\u04d0\u0003"+
		"l6\u0000\u04d0\u0083\u0001\u0000\u0000\u0000\u04d1\u04d2\u00052\u0000"+
		"\u0000\u04d2\u04d3\u0003l6\u0000\u04d3\u0085\u0001\u0000\u0000\u0000\u04d4"+
		"\u04d5\u0005\u0160\u0000\u0000\u04d5\u04d6\u0003\u0176\u00bb\u0000\u04d6"+
		"\u0087\u0001\u0000\u0000\u0000\u04d7\u04da\u00050\u0000\u0000\u04d8\u04d9"+
		"\u0005d\u0000\u0000\u04d9\u04db\u00051\u0000\u0000\u04da\u04d8\u0001\u0000"+
		"\u0000\u0000\u04da\u04db\u0001\u0000\u0000\u0000\u04db\u04dc\u0001\u0000"+
		"\u0000\u0000\u04dc\u04dd\u0005E\u0000\u0000\u04dd\u04de\u0001\u0000\u0000"+
		"\u0000\u04de\u04df\u0003\u008cF\u0000\u04df\u0089\u0001\u0000\u0000\u0000"+
		"\u04e0\u04e1\u00051\u0000\u0000\u04e1\u04e2\u0005E\u0000\u0000\u04e2\u04e3"+
		"\u0003\u008cF\u0000\u04e3\u008b\u0001\u0000\u0000\u0000\u04e4\u04e7\u0003"+
		"\u016c\u00b6\u0000\u04e5\u04e6\u0005\u0161\u0000\u0000\u04e6\u04e8\u0007"+
		"\u0006\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001"+
		"\u0000\u0000\u0000\u04e8\u04ea\u0001\u0000\u0000\u0000\u04e9\u04eb\u0003"+
		"D\"\u0000\u04ea\u04e9\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000"+
		"\u0000\u0000\u04eb\u04f1\u0001\u0000\u0000\u0000\u04ec\u04ed\u0005\u015b"+
		"\u0000\u0000\u04ed\u04ee\u0005\u001e\u0000\u0000\u04ee\u04ef\u0003\u00b4"+
		"Z\u0000\u04ef\u04f0\u0005\u001f\u0000\u0000\u04f0\u04f2\u0001\u0000\u0000"+
		"\u0000\u04f1\u04ec\u0001\u0000\u0000\u0000\u04f1\u04f2\u0001\u0000\u0000"+
		"\u0000\u04f2\u0506\u0001\u0000\u0000\u0000\u04f3\u04f4\u0005\u010b\u0000"+
		"\u0000\u04f4\u04f5\u0005\u00a5\u0000\u0000\u04f5\u04f6\u0003\u0168\u00b4"+
		"\u0000\u04f6\u04f7\u0005\u015d\u0000\u0000\u04f7\u04f8\u0003\u015e\u00af"+
		"\u0000\u04f8\u0507\u0001\u0000\u0000\u0000\u04f9\u04fa\u0005\u009f\u0000"+
		"\u0000\u04fa\u04fb\u0005\u0157\u0000\u0000\u04fb\u04fd\u0007\u0002\u0000"+
		"\u0000\u04fc\u04f9\u0001\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000"+
		"\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u0500\u0005\\\u0000\u0000"+
		"\u04ff\u0501\u00038\u001c\u0000\u0500\u04ff\u0001\u0000\u0000\u0000\u0500"+
		"\u0501\u0001\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502"+
		"\u0503\u0005x\u0000\u0000\u0503\u0504\u00030\u0018\u0000\u0504\u0505\u0005"+
		"\u0104\u0000\u0000\u0505\u0507\u0001\u0000\u0000\u0000\u0506\u04f3\u0001"+
		"\u0000\u0000\u0000\u0506\u04fc\u0001\u0000\u0000\u0000\u0507\u008d\u0001"+
		"\u0000\u0000\u0000\u0508\u050b\u0003\u0090H\u0000\u0509\u050b\u0003\u00b0"+
		"X\u0000\u050a\u0508\u0001\u0000\u0000\u0000\u050a\u0509\u0001\u0000\u0000"+
		"\u0000\u050b\u008f\u0001\u0000\u0000\u0000\u050c\u050d\u0005\u010a\u0000"+
		"\u0000\u050d\u050e\u0005E\u0000\u0000\u050e\u0510\u0003\u016c\u00b6\u0000"+
		"\u050f\u0511\u0003\u0092I\u0000\u0510\u050f\u0001\u0000\u0000\u0000\u0510"+
		"\u0511\u0001\u0000\u0000\u0000\u0511\u0513\u0001\u0000\u0000\u0000\u0512"+
		"\u0514\u0003\u0094J\u0000\u0513\u0512\u0001\u0000\u0000\u0000\u0513\u0514"+
		"\u0001\u0000\u0000\u0000\u0514\u0091\u0001\u0000\u0000\u0000\u0515\u0516"+
		"\u0005\u001e\u0000\u0000\u0516\u051b\u0003\u0176\u00bb\u0000\u0517\u0518"+
		"\u0005$\u0000\u0000\u0518\u051a\u0003\u0176\u00bb\u0000\u0519\u0517\u0001"+
		"\u0000\u0000\u0000\u051a\u051d\u0001\u0000\u0000\u0000\u051b\u0519\u0001"+
		"\u0000\u0000\u0000\u051b\u051c\u0001\u0000\u0000\u0000\u051c\u051e\u0001"+
		"\u0000\u0000\u0000\u051d\u051b\u0001\u0000\u0000\u0000\u051e\u051f\u0005"+
		"\u001f\u0000\u0000\u051f\u0093\u0001\u0000\u0000\u0000\u0520\u0521\u0005"+
		"\u0185\u0000\u0000\u0521\u0522\u0003\u0092I\u0000\u0522\u0523\u0005)\u0000"+
		"\u0000\u0523\u0095\u0001\u0000\u0000\u0000\u0524\u0527\u00050\u0000\u0000"+
		"\u0525\u0526\u0005d\u0000\u0000\u0526\u0528\u00051\u0000\u0000\u0527\u0525"+
		"\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000\u0000\u0000\u0528\u0529"+
		"\u0001\u0000\u0000\u0000\u0529\u052a\u0005D\u0000\u0000\u052a\u052b\u0001"+
		"\u0000\u0000\u0000\u052b\u052c\u0003\u0158\u00ac\u0000\u052c\u052d\u0003"+
		"\u009cN\u0000\u052d\u0097\u0001\u0000\u0000\u0000\u052e\u052f\u00051\u0000"+
		"\u0000\u052f\u0530\u0005D\u0000\u0000\u0530\u0532\u0003\u0158\u00ac\u0000"+
		"\u0531\u0533\u0007\u0007\u0000\u0000\u0532\u0531\u0001\u0000\u0000\u0000"+
		"\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0536\u0001\u0000\u0000\u0000"+
		"\u0534\u0535\u0007\b\u0000\u0000\u0535\u0537\u0003\u00a0P\u0000\u0536"+
		"\u0534\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537"+
		"\u053a\u0001\u0000\u0000\u0000\u0538\u0539\u0005A\u0000\u0000\u0539\u053b"+
		"\u0003\u0176\u00bb\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053a\u053b"+
		"\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c\u053d"+
		"\u0003\u009cN\u0000\u053d\u0099\u0001\u0000\u0000\u0000\u053e\u0543\u0003"+
		"\u009eO\u0000\u053f\u0543\u0003\u00a8T\u0000\u0540\u0543\u0003\u00aaU"+
		"\u0000\u0541\u0543\u0003\u00aeW\u0000\u0542\u053e\u0001\u0000\u0000\u0000"+
		"\u0542\u053f\u0001\u0000\u0000\u0000\u0542\u0540\u0001\u0000\u0000\u0000"+
		"\u0542\u0541\u0001\u0000\u0000\u0000\u0543\u009b\u0001\u0000\u0000\u0000"+
		"\u0544\u0546\u0003\u009aM\u0000\u0545\u0544\u0001\u0000\u0000\u0000\u0545"+
		"\u0546\u0001\u0000\u0000\u0000\u0546\u055d\u0001\u0000\u0000\u0000\u0547"+
		"\u0548\u0005\u010b\u0000\u0000\u0548\u0549\u0005\u00a5\u0000\u0000\u0549"+
		"\u054a\u0003\u0168\u00b4\u0000\u054a\u054b\u0005\u015d\u0000\u0000\u054b"+
		"\u054c\u0003\u015e\u00af\u0000\u054c\u055e\u0001\u0000\u0000\u0000\u054d"+
		"\u054e\u0005\u009f\u0000\u0000\u054e\u054f\u0005\u0157\u0000\u0000\u054f"+
		"\u0554\u0007\u0002\u0000\u0000\u0550\u0551\u00052\u0000\u0000\u0551\u0552"+
		"\u0005\u009f\u0000\u0000\u0552\u0554\u0005\u0157\u0000\u0000\u0553\u054d"+
		"\u0001\u0000\u0000\u0000\u0553\u0550\u0001\u0000\u0000\u0000\u0553\u0554"+
		"\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000\u0000\u0000\u0555\u0557"+
		"\u0005\\\u0000\u0000\u0556\u0558\u00038\u001c\u0000\u0557\u0556\u0001"+
		"\u0000\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000\u0558\u0559\u0001"+
		"\u0000\u0000\u0000\u0559\u055a\u0005x\u0000\u0000\u055a\u055b\u00030\u0018"+
		"\u0000\u055b\u055c\u0005\u0104\u0000\u0000\u055c\u055e\u0001\u0000\u0000"+
		"\u0000\u055d\u0547\u0001\u0000\u0000\u0000\u055d\u0553\u0001\u0000\u0000"+
		"\u0000\u055e\u009d\u0001\u0000\u0000\u0000\u055f\u0562\u0005a\u0000\u0000"+
		"\u0560\u0563\u0003\u0144\u00a2\u0000\u0561\u0563\u0003\u0154\u00aa\u0000"+
		"\u0562\u0560\u0001\u0000\u0000\u0000\u0562\u0561\u0001\u0000\u0000\u0000"+
		"\u0563\u0565\u0001\u0000\u0000\u0000\u0564\u0566\u0007\u0007\u0000\u0000"+
		"\u0565\u0564\u0001\u0000\u0000\u0000\u0565\u0566\u0001\u0000\u0000\u0000"+
		"\u0566\u0567\u0001\u0000\u0000\u0000\u0567\u0568\u0007\b\u0000\u0000\u0568"+
		"\u056b\u0003\u00a0P\u0000\u0569\u056a\u0005A\u0000\u0000\u056a\u056c\u0003"+
		"\u0176\u00bb\u0000\u056b\u0569\u0001\u0000\u0000\u0000\u056b\u056c\u0001"+
		"\u0000\u0000\u0000\u056c\u009f\u0001\u0000\u0000\u0000\u056d\u0572\u0003"+
		"\u00a4R\u0000\u056e\u056f\u0005d\u0000\u0000\u056f\u0571\u0003\u00a4R"+
		"\u0000\u0570\u056e\u0001\u0000\u0000\u0000\u0571\u0574\u0001\u0000\u0000"+
		"\u0000\u0572\u0570\u0001\u0000\u0000\u0000\u0572\u0573\u0001\u0000\u0000"+
		"\u0000\u0573\u00a1\u0001\u0000\u0000\u0000\u0574\u0572\u0001\u0000\u0000"+
		"\u0000\u0575\u0576\u0005n\u0000\u0000\u0576\u0577\u0005\u0191\u0000\u0000"+
		"\u0577\u0581\u0005\u0192\u0000\u0000\u0578\u057d\u0003\u00a6S\u0000\u0579"+
		"\u057a\u0005d\u0000\u0000\u057a\u057c\u0003\u00a6S\u0000\u057b\u0579\u0001"+
		"\u0000\u0000\u0000\u057c\u057f\u0001\u0000\u0000\u0000\u057d\u057b\u0001"+
		"\u0000\u0000\u0000\u057d\u057e\u0001\u0000\u0000\u0000\u057e\u0581\u0001"+
		"\u0000\u0000\u0000\u057f\u057d\u0001\u0000\u0000\u0000\u0580\u0575\u0001"+
		"\u0000\u0000\u0000\u0580\u0578\u0001\u0000\u0000\u0000\u0581\u00a3\u0001"+
		"\u0000\u0000\u0000\u0582\u0583\u0007\t\u0000\u0000\u0583\u00a5\u0001\u0000"+
		"\u0000\u0000\u0584\u0585\u0007\n\u0000\u0000\u0585\u05a7\u00059\u0000"+
		"\u0000\u0586\u0587\u0007\n\u0000\u0000\u0587\u05a7\u0005E\u0000\u0000"+
		"\u0588\u0589\u0007\n\u0000\u0000\u0589\u05a7\u0005C\u0000\u0000\u058a"+
		"\u058b\u0007\n\u0000\u0000\u058b\u05a7\u0005D\u0000\u0000\u058c\u058d"+
		"\u0007\n\u0000\u0000\u058d\u05a7\u0005\u0108\u0000\u0000\u058e\u058f\u0007"+
		"\n\u0000\u0000\u058f\u05a7\u0005F\u0000\u0000\u0590\u0591\u0007\n\u0000"+
		"\u0000\u0591\u05a7\u0005\u0103\u0000\u0000\u0592\u0593\u0007\n\u0000\u0000"+
		"\u0593\u05a7\u0005\u018f\u0000\u0000\u0594\u0595\u0007\n\u0000\u0000\u0595"+
		"\u05a7\u0005\u0172\u0000\u0000\u0596\u0597\u0007\n\u0000\u0000\u0597\u05a7"+
		"\u0005\u014f\u0000\u0000\u0598\u0599\u0007\n\u0000\u0000\u0599\u05a7\u0005"+
		";\u0000\u0000\u059a\u059b\u0007\u000b\u0000\u0000\u059b\u05a7\u0005\u00a6"+
		"\u0000\u0000\u059c\u059d\u00051\u0000\u0000\u059d\u059e\u0005\u007f\u0000"+
		"\u0000\u059e\u05a7\u00058\u0000\u0000\u059f\u05a0\u0007\n\u0000\u0000"+
		"\u05a0\u05a7\u0005\u0193\u0000\u0000\u05a1\u05a2\u0007\u000b\u0000\u0000"+
		"\u05a2\u05a3\u0005\u0193\u0000\u0000\u05a3\u05a7\u0005\u0194\u0000\u0000"+
		"\u05a4\u05a5\u0007\n\u0000\u0000\u05a5\u05a7\u0005\u0195\u0000\u0000\u05a6"+
		"\u0584\u0001\u0000\u0000\u0000\u05a6\u0586\u0001\u0000\u0000\u0000\u05a6"+
		"\u0588\u0001\u0000\u0000\u0000\u05a6\u058a\u0001\u0000\u0000\u0000\u05a6"+
		"\u058c\u0001\u0000\u0000\u0000\u05a6\u058e\u0001\u0000\u0000\u0000\u05a6"+
		"\u0590\u0001\u0000\u0000\u0000\u05a6\u0592\u0001\u0000\u0000\u0000\u05a6"+
		"\u0594\u0001\u0000\u0000\u0000\u05a6\u0596\u0001\u0000\u0000\u0000\u05a6"+
		"\u0598\u0001\u0000\u0000\u0000\u05a6\u059a\u0001\u0000\u0000\u0000\u05a6"+
		"\u059c\u0001\u0000\u0000\u0000\u05a6\u059f\u0001\u0000\u0000\u0000\u05a6"+
		"\u05a1\u0001\u0000\u0000\u0000\u05a6\u05a4\u0001\u0000\u0000\u0000\u05a7"+
		"\u00a7\u0001\u0000\u0000\u0000\u05a8\u05aa\u0007\u0007\u0000\u0000\u05a9"+
		"\u05a8\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001\u0000\u0000\u0000\u05aa"+
		"\u05ab\u0001\u0000\u0000\u0000\u05ab\u05ac\u0007\b\u0000\u0000\u05ac\u05af"+
		"\u0003\u00a0P\u0000\u05ad\u05ae\u0005A\u0000\u0000\u05ae\u05b0\u0003\u0176"+
		"\u00bb\u0000\u05af\u05ad\u0001\u0000\u0000\u0000\u05af\u05b0\u0001\u0000"+
		"\u0000\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000\u05b1\u05b4\u0005]\u0000"+
		"\u0000\u05b2\u05b5\u0003\u0144\u00a2\u0000\u05b3\u05b5\u0003\u0154\u00aa"+
		"\u0000\u05b4\u05b2\u0001\u0000\u0000\u0000\u05b4\u05b3\u0001\u0000\u0000"+
		"\u0000\u05b5\u00a9\u0001\u0000\u0000\u0000\u05b6\u05b8\u0007\u0007\u0000"+
		"\u0000\u05b7\u05b6\u0001\u0000\u0000\u0000\u05b7\u05b8\u0001\u0000\u0000"+
		"\u0000\u05b8\u05b9\u0001\u0000\u0000\u0000\u05b9\u05ba\u0005]\u0000\u0000"+
		"\u05ba\u05bd\u0003\u00acV\u0000\u05bb\u05bc\u0005A\u0000\u0000\u05bc\u05be"+
		"\u0003\u0176\u00bb\u0000\u05bd\u05bb\u0001\u0000\u0000\u0000\u05bd\u05be"+
		"\u0001\u0000\u0000\u0000\u05be\u00ab\u0001\u0000\u0000\u0000\u05bf\u05c8"+
		"\u0005\u00f0\u0000\u0000\u05c0\u05c8\u0005\u0102\u0000\u0000\u05c1\u05c2"+
		"\u0005\u0149\u0000\u0000\u05c2\u05c8\u0005\u0190\u0000\u0000\u05c3\u05c4"+
		"\u0005\u0149\u0000\u0000\u05c4\u05c8\u0005y\u0000\u0000\u05c5\u05c6\u0005"+
		"\u0149\u0000\u0000\u05c6\u05c8\u0005z\u0000\u0000\u05c7\u05bf\u0001\u0000"+
		"\u0000\u0000\u05c7\u05c0\u0001\u0000\u0000\u0000\u05c7\u05c1\u0001\u0000"+
		"\u0000\u0000\u05c7\u05c3\u0001\u0000\u0000\u0000\u05c7\u05c5\u0001\u0000"+
		"\u0000\u0000\u05c8\u00ad\u0001\u0000\u0000\u0000\u05c9\u05cb\u0007\u0007"+
		"\u0000\u0000\u05ca\u05c9\u0001\u0000\u0000\u0000\u05ca\u05cb\u0001\u0000"+
		"\u0000\u0000\u05cb\u05cc\u0001\u0000\u0000\u0000\u05cc\u05cd\u0007\b\u0000"+
		"\u0000\u05cd\u05d0\u0003\u00a2Q\u0000\u05ce\u05cf\u0005A\u0000\u0000\u05cf"+
		"\u05d1\u0003\u0176\u00bb\u0000\u05d0\u05ce\u0001\u0000\u0000\u0000\u05d0"+
		"\u05d1\u0001\u0000\u0000\u0000\u05d1\u00af\u0001\u0000\u0000\u0000\u05d2"+
		"\u05d3\u0005\u010a\u0000\u0000\u05d3\u05d5\u0005\u018d\u0000\u0000\u05d4"+
		"\u05d6\u0003\u00b2Y\u0000\u05d5\u05d4\u0001\u0000\u0000\u0000\u05d5\u05d6"+
		"\u0001\u0000\u0000\u0000\u05d6\u05dc\u0001\u0000\u0000\u0000\u05d7\u05d8"+
		"\u0005\u015b\u0000\u0000\u05d8\u05d9\u0005\u001e\u0000\u0000\u05d9\u05da"+
		"\u0003\u00b4Z\u0000\u05da\u05db\u0005\u001f\u0000\u0000\u05db\u05dd\u0001"+
		"\u0000\u0000\u0000\u05dc\u05d7\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001"+
		"\u0000\u0000\u0000\u05dd\u05de\u0001\u0000\u0000\u0000\u05de\u05e0\u0005"+
		"\\\u0000\u0000\u05df\u05e1\u00038\u001c\u0000\u05e0\u05df\u0001\u0000"+
		"\u0000\u0000\u05e0\u05e1\u0001\u0000\u0000\u0000\u05e1\u05e2\u0001\u0000"+
		"\u0000\u0000\u05e2\u05e3\u0005x\u0000\u0000\u05e3\u05e4\u00030\u0018\u0000"+
		"\u05e4\u05e5\u0005\u0104\u0000\u0000\u05e5\u05e6\u0005)\u0000\u0000\u05e6"+
		"\u00b1\u0001\u0000\u0000\u0000\u05e7\u05e8\u0005\u001e\u0000\u0000\u05e8"+
		"\u05e9\u0003\u01dc\u00ee\u0000\u05e9\u05ea\u0005\u0017\u0000\u0000\u05ea"+
		"\u05f2\u0005\'\u0000\u0000\u05eb\u05ec\u0005$\u0000\u0000\u05ec\u05ed"+
		"\u0003\u01dc\u00ee\u0000\u05ed\u05ee\u0005\u0017\u0000\u0000\u05ee\u05ef"+
		"\u0005\'\u0000\u0000\u05ef\u05f1\u0001\u0000\u0000\u0000\u05f0\u05eb\u0001"+
		"\u0000\u0000\u0000\u05f1\u05f4\u0001\u0000\u0000\u0000\u05f2\u05f0\u0001"+
		"\u0000\u0000\u0000\u05f2\u05f3\u0001\u0000\u0000\u0000\u05f3\u05f5\u0001"+
		"\u0000\u0000\u0000\u05f4\u05f2\u0001\u0000\u0000\u0000\u05f5\u05f6\u0005"+
		"\u001f\u0000\u0000\u05f6\u00b3\u0001\u0000\u0000\u0000\u05f7\u05f8\u0003"+
		"\u01de\u00ef\u0000\u05f8\u00b5\u0001\u0000\u0000\u0000\u05f9\u05fa\u0003"+
		"\u013e\u009f\u0000\u05fa\u05fb\u0005\u0017\u0000\u0000\u05fb\u05fc\u0003"+
		"\u0176\u00bb\u0000\u05fc\u00b7\u0001\u0000\u0000\u0000\u05fd\u05fe\u0005"+
		"\u018e\u0000\u0000\u05fe\u05ff\u0005)\u0000\u0000\u05ff\u00b9\u0001\u0000"+
		"\u0000\u0000\u0600\u0601\u0005\u0197\u0000\u0000\u0601\u0602\u0005\u001e"+
		"\u0000\u0000\u0602\u0603\u0003\u0176\u00bb\u0000\u0603\u0604\u0005\u001f"+
		"\u0000\u0000\u0604\u0605\u0005\u009c\u0000\u0000\u0605\u0606\u0003\u00c0"+
		"`\u0000\u0606\u00bb\u0001\u0000\u0000\u0000\u0607\u0608\u0005\u010d\u0000"+
		"\u0000\u0608\u0616\u0003\u016a\u00b5\u0000\u0609\u060a\u0005G\u0000\u0000"+
		"\u060a\u060b\u0005\r\u0000\u0000\u060b\u0611\u0003\u0138\u009c\u0000\u060c"+
		"\u060d\u0005$\u0000\u0000\u060d\u060e\u0005\r\u0000\u0000\u060e\u0610"+
		"\u0003\u0138\u009c\u0000\u060f\u060c\u0001\u0000\u0000\u0000\u0610\u0613"+
		"\u0001\u0000\u0000\u0000\u0611\u060f\u0001\u0000\u0000\u0000\u0611\u0612"+
		"\u0001\u0000\u0000\u0000\u0612\u0614\u0001\u0000\u0000\u0000\u0613\u0611"+
		"\u0001\u0000\u0000\u0000\u0614\u0615\u0005)\u0000\u0000\u0615\u0617\u0001"+
		"\u0000\u0000\u0000\u0616\u0609\u0001\u0000\u0000\u0000\u0616\u0617\u0001"+
		"\u0000\u0000\u0000\u0617\u0639\u0001\u0000\u0000\u0000\u0618\u0621\u0005"+
		"\u010d\u0000\u0000\u0619\u0622\u0005\u00a4\u0000\u0000\u061a\u0622\u0005"+
		"\u0131\u0000\u0000\u061b\u0622\u0005\u010e\u0000\u0000\u061c\u0622\u0005"+
		"\u011d\u0000\u0000\u061d\u061e\u0005\u00df\u0000\u0000\u061e\u0622\u0005"+
		"\u01a0\u0000\u0000\u061f\u0620\u0005\u0136\u0000\u0000\u0620\u0622\u0005"+
		"\u01a0\u0000\u0000\u0621\u0619\u0001\u0000\u0000\u0000\u0621\u061a\u0001"+
		"\u0000\u0000\u0000\u0621\u061b\u0001\u0000\u0000\u0000\u0621\u061c\u0001"+
		"\u0000\u0000\u0000\u0621\u061d\u0001\u0000\u0000\u0000\u0621\u061f\u0001"+
		"\u0000\u0000\u0000\u0622\u0623\u0001\u0000\u0000\u0000\u0623\u0624\u0005"+
		"Q\u0000\u0000\u0624\u0636\u0003\u016a\u00b5\u0000\u0625\u0626\u0005G\u0000"+
		"\u0000\u0626\u0627\u0005\"\u0000\u0000\u0627\u0628\u0005\r\u0000\u0000"+
		"\u0628\u0629\u0005#\u0000\u0000\u0629\u0631\u0003\u0138\u009c\u0000\u062a"+
		"\u062b\u0005$\u0000\u0000\u062b\u062c\u0005\"\u0000\u0000\u062c\u062d"+
		"\u0005\r\u0000\u0000\u062d\u062e\u0005#\u0000\u0000\u062e\u0630\u0003"+
		"\u0138\u009c\u0000\u062f\u062a\u0001\u0000\u0000\u0000\u0630\u0633\u0001"+
		"\u0000\u0000\u0000\u0631\u062f\u0001\u0000\u0000\u0000\u0631\u0632\u0001"+
		"\u0000\u0000\u0000\u0632\u0634\u0001\u0000\u0000\u0000\u0633\u0631\u0001"+
		"\u0000\u0000\u0000\u0634\u0635\u0005)\u0000\u0000\u0635\u0637\u0001\u0000"+
		"\u0000\u0000\u0636\u0625\u0001\u0000\u0000\u0000\u0636\u0637\u0001\u0000"+
		"\u0000\u0000\u0637\u0639\u0001\u0000\u0000\u0000\u0638\u0607\u0001\u0000"+
		"\u0000\u0000\u0638\u0618\u0001\u0000\u0000\u0000\u0639\u00bd\u0001\u0000"+
		"\u0000\u0000\u063a\u063b\u0005^\u0000\u0000\u063b\u063c\u0005\u001e\u0000"+
		"\u0000\u063c\u063d\u0003\u0176\u00bb\u0000\u063d\u063e\u0005\u001f\u0000"+
		"\u0000\u063e\u0640\u0005`\u0000\u0000\u063f\u0641\u0003\u00c0`\u0000\u0640"+
		"\u063f\u0001\u0000\u0000\u0000\u0641\u0642\u0001\u0000\u0000\u0000\u0642"+
		"\u0640\u0001\u0000\u0000\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643"+
		"\u064a\u0001\u0000\u0000\u0000\u0644\u0646\u0005_\u0000\u0000\u0645\u0647"+
		"\u0003\u00c0`\u0000\u0646\u0645\u0001\u0000\u0000\u0000\u0647\u0648\u0001"+
		"\u0000\u0000\u0000\u0648\u0646\u0001\u0000\u0000\u0000\u0648\u0649\u0001"+
		"\u0000\u0000\u0000\u0649\u064b\u0001\u0000\u0000\u0000\u064a\u0644\u0001"+
		"\u0000\u0000\u0000\u064a\u064b\u0001\u0000\u0000\u0000\u064b\u00bf\u0001"+
		"\u0000\u0000\u0000\u064c\u065d\u0003\u0002\u0001\u0000\u064d\u065d\u0003"+
		"\u001a\r\u0000\u064e\u065d\u0003,\u0016\u0000\u064f\u065d\u0003H$\u0000"+
		"\u0650\u065d\u0003\u00cae\u0000\u0651\u065d\u0003\u00d0h\u0000\u0652\u065d"+
		"\u0003\u00dcn\u0000\u0653\u065d\u0003\u00e0p\u0000\u0654\u065d\u0003J"+
		"%\u0000\u0655\u065d\u0003\u00c2a\u0000\u0656\u065d\u0003\u00be_\u0000"+
		"\u0657\u065d\u0003\u00bc^\u0000\u0658\u065d\u0003\u00c4b\u0000\u0659\u065d"+
		"\u0003\u00b8\\\u0000\u065a\u065d\u00036\u001b\u0000\u065b\u065d\u0003"+
		"\u00b6[\u0000\u065c\u064c\u0001\u0000\u0000\u0000\u065c\u064d\u0001\u0000"+
		"\u0000\u0000\u065c\u064e\u0001\u0000\u0000\u0000\u065c\u064f\u0001\u0000"+
		"\u0000\u0000\u065c\u0650\u0001\u0000\u0000\u0000\u065c\u0651\u0001\u0000"+
		"\u0000\u0000\u065c\u0652\u0001\u0000\u0000\u0000\u065c\u0653\u0001\u0000"+
		"\u0000\u0000\u065c\u0654\u0001\u0000\u0000\u0000\u065c\u0655\u0001\u0000"+
		"\u0000\u0000\u065c\u0656\u0001\u0000\u0000\u0000\u065c\u0657\u0001\u0000"+
		"\u0000\u0000\u065c\u0658\u0001\u0000\u0000\u0000\u065c\u0659\u0001\u0000"+
		"\u0000\u0000\u065c\u065a\u0001\u0000\u0000\u0000\u065c\u065b\u0001\u0000"+
		"\u0000\u0000\u065d\u065f\u0001\u0000\u0000\u0000\u065e\u0660\u0005)\u0000"+
		"\u0000\u065f\u065e\u0001\u0000\u0000\u0000\u065f\u0660\u0001\u0000\u0000"+
		"\u0000\u0660\u00c1\u0001\u0000\u0000\u0000\u0661\u0665\u0005x\u0000\u0000"+
		"\u0662\u0664\u0003\u00c0`\u0000\u0663\u0662\u0001\u0000\u0000\u0000\u0664"+
		"\u0667\u0001\u0000\u0000\u0000\u0665\u0663\u0001\u0000\u0000\u0000\u0665"+
		"\u0666\u0001\u0000\u0000\u0000\u0666\u0668\u0001\u0000\u0000\u0000\u0667"+
		"\u0665\u0001\u0000\u0000\u0000\u0668\u066a\u0005\u0104\u0000\u0000\u0669"+
		"\u066b\u0005)\u0000\u0000\u066a\u0669\u0001\u0000\u0000\u0000\u066a\u066b"+
		"\u0001\u0000\u0000\u0000\u066b\u00c3\u0001\u0000\u0000\u0000\u066c\u066e"+
		"\u0005\u0198\u0000\u0000\u066d\u066f\u0003\u0176\u00bb\u0000\u066e\u066d"+
		"\u0001\u0000\u0000\u0000\u066e\u066f\u0001\u0000\u0000\u0000\u066f\u0670"+
		"\u0001\u0000\u0000\u0000\u0670\u0671\u0005)\u0000\u0000\u0671\u00c5\u0001"+
		"\u0000\u0000\u0000\u0672\u0673\u0005\u019c\u0000\u0000\u0673\u0695\u0005"+
		"]\u0000\u0000\u0674\u0696\u0005\u019b\u0000\u0000\u0675\u0676\u0003\u00c8"+
		"d\u0000\u0676\u0677\u0003\u0144\u00a2\u0000\u0677\u0696\u0001\u0000\u0000"+
		"\u0000\u0678\u0679\u0005:\u0000\u0000\u0679\u067a\u0003\u0144\u00a2\u0000"+
		"\u067a\u067b\t\u0000\u0000\u0000\u067b\u067c\u0003\u0152\u00a9\u0000\u067c"+
		"\u0696\u0001\u0000\u0000\u0000\u067d\u067e\u0007\f\u0000\u0000\u067e\u0682"+
		"\u0005\u019a\u0000\u0000\u067f\u0680\u0003\u0142\u00a1\u0000\u0680\u0681"+
		"\u0005\u0013\u0000\u0000\u0681\u0683\u0001\u0000\u0000\u0000\u0682\u067f"+
		"\u0001\u0000\u0000\u0000\u0682\u0683\u0001\u0000\u0000\u0000\u0683\u0684"+
		"\u0001\u0000\u0000\u0000\u0684\u0685\u0003\u016c\u00b6\u0000\u0685\u0686"+
		"\u0005\u0013\u0000\u0000\u0686\u0687\u0003\u0146\u00a3\u0000\u0687\u0696"+
		"\u0001\u0000\u0000\u0000\u0688\u068e\u0005E\u0000\u0000\u0689\u068b\u0005"+
		"\u010b\u0000\u0000\u068a\u0689\u0001\u0000\u0000\u0000\u068a\u068b\u0001"+
		"\u0000\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c\u068e\u0005"+
		"C\u0000\u0000\u068d\u0688\u0001\u0000\u0000\u0000\u068d\u068a\u0001\u0000"+
		"\u0000\u0000\u068e\u0692\u0001\u0000\u0000\u0000\u068f\u0690\u0003\u0142"+
		"\u00a1\u0000\u0690\u0691\u0005\u0013\u0000\u0000\u0691\u0693\u0001\u0000"+
		"\u0000\u0000\u0692\u068f\u0001\u0000\u0000\u0000\u0692\u0693\u0001\u0000"+
		"\u0000\u0000\u0693\u0694\u0001\u0000\u0000\u0000\u0694\u0696\u0003\u016c"+
		"\u00b6\u0000\u0695\u0674\u0001\u0000\u0000\u0000\u0695\u0675\u0001\u0000"+
		"\u0000\u0000\u0695\u0678\u0001\u0000\u0000\u0000\u0695\u067d\u0001\u0000"+
		"\u0000\u0000\u0695\u068d\u0001\u0000\u0000\u0000\u0696\u0697\u0001\u0000"+
		"\u0000\u0000\u0697\u0698\u0005e\u0000\u0000\u0698\u0699\u0007\r\u0000"+
		"\u0000\u0699\u00c7\u0001\u0000\u0000\u0000\u069a\u069b\u0005\u007f\u0000"+
		"\u0000\u069b\u06aa\u00058\u0000\u0000\u069c\u06aa\u0005\u00a6\u0000\u0000"+
		"\u069d\u06aa\u0005\u0103\u0000\u0000\u069e\u06aa\u0005\u0108\u0000\u0000"+
		"\u069f\u06aa\u0005\u0199\u0000\u0000\u06a0\u06aa\u0005\u0196\u0000\u0000"+
		"\u06a1\u06aa\u0005;\u0000\u0000\u06a2\u06aa\u0005\u0193\u0000\u0000\u06a3"+
		"\u06aa\u0005\u014f\u0000\u0000\u06a4\u06aa\u0005\u018f\u0000\u0000\u06a5"+
		"\u06aa\u0005\u0172\u0000\u0000\u06a6\u06aa\u00059\u0000\u0000\u06a7\u06aa"+
		"\u0005D\u0000\u0000\u06a8\u06aa\u0005F\u0000\u0000\u06a9\u069a\u0001\u0000"+
		"\u0000\u0000\u06a9\u069c\u0001\u0000\u0000\u0000\u06a9\u069d\u0001\u0000"+
		"\u0000\u0000\u06a9\u069e\u0001\u0000\u0000\u0000\u06a9\u069f\u0001\u0000"+
		"\u0000\u0000\u06a9\u06a0\u0001\u0000\u0000\u0000\u06a9\u06a1\u0001\u0000"+
		"\u0000\u0000\u06a9\u06a2\u0001\u0000\u0000\u0000\u06a9\u06a3\u0001\u0000"+
		"\u0000\u0000\u06a9\u06a4\u0001\u0000\u0000\u0000\u06a9\u06a5\u0001\u0000"+
		"\u0000\u0000\u06a9\u06a6\u0001\u0000\u0000\u0000\u06a9\u06a7\u0001\u0000"+
		"\u0000\u0000\u06a9\u06a8\u0001\u0000\u0000\u0000\u06aa\u00c9\u0001\u0000"+
		"\u0000\u0000\u06ab\u06ad\u0005-\u0000\u0000\u06ac\u06ae\u0005G\u0000\u0000"+
		"\u06ad\u06ac\u0001\u0000\u0000\u0000\u06ad\u06ae\u0001\u0000\u0000\u0000"+
		"\u06ae\u06af\u0001\u0000\u0000\u0000\u06af\u06b2\u0003\u0144\u00a2\u0000"+
		"\u06b0\u06b3\u0003\u00ccf\u0000\u06b1\u06b3\u0003\u00ceg\u0000\u06b2\u06b0"+
		"\u0001\u0000\u0000\u0000\u06b2\u06b1\u0001\u0000\u0000\u0000\u06b3\u00cb"+
		"\u0001\u0000\u0000\u0000\u06b4\u06b6\u0003\u0170\u00b8\u0000\u06b5\u06b4"+
		"\u0001\u0000\u0000\u0000\u06b5\u06b6\u0001\u0000\u0000\u0000\u06b6\u06b7"+
		"\u0001\u0000\u0000\u0000\u06b7\u06b8\u0007\u000e\u0000\u0000\u06b8\u06bd"+
		"\u0003\u00d6k\u0000\u06b9\u06ba\u0005$\u0000\u0000\u06ba\u06bc\u0003\u00d6"+
		"k\u0000\u06bb\u06b9\u0001\u0000\u0000\u0000\u06bc\u06bf\u0001\u0000\u0000"+
		"\u0000\u06bd\u06bb\u0001\u0000\u0000\u0000\u06bd\u06be\u0001\u0000\u0000"+
		"\u0000\u06be\u00cd\u0001\u0000\u0000\u0000\u06bf\u06bd\u0001\u0000\u0000"+
		"\u0000\u06c0\u06c2\u0003\u0170\u00b8\u0000\u06c1\u06c0\u0001\u0000\u0000"+
		"\u0000\u06c1\u06c2\u0001\u0000\u0000\u0000\u06c2\u06c3\u0001\u0000\u0000"+
		"\u0000\u06c3\u06c4\u0003\u00e0p\u0000\u06c4\u00cf\u0001\u0000\u0000\u0000"+
		"\u06c5\u06c6\u0005.\u0000\u0000\u06c6\u06c7\u0003\u00f6{\u0000\u06c7\u06c9"+
		"\u0003\u00d4j\u0000\u06c8\u06ca\u0003\u0102\u0081\u0000\u06c9\u06c8\u0001"+
		"\u0000\u0000\u0000\u06c9\u06ca\u0001\u0000\u0000\u0000\u06ca\u00d1\u0001"+
		"\u0000\u0000\u0000\u06cb\u06cc\u0003\u0152\u00a9\u0000\u06cc\u06ce\u0005"+
		"\u0017\u0000\u0000\u06cd\u06cf\u0005H\u0000\u0000\u06ce\u06cd\u0001\u0000"+
		"\u0000\u0000\u06ce\u06cf\u0001\u0000\u0000\u0000\u06cf\u06d1\u0001\u0000"+
		"\u0000\u0000\u06d0\u06d2\u0005\u001e\u0000\u0000\u06d1\u06d0\u0001\u0000"+
		"\u0000\u0000\u06d1\u06d2\u0001\u0000\u0000\u0000\u06d2\u06d3\u0001\u0000"+
		"\u0000\u0000\u06d3\u06d5\u0003\u00d8l\u0000\u06d4\u06d6\u0005\u001f\u0000"+
		"\u0000\u06d5\u06d4\u0001\u0000\u0000\u0000\u06d5\u06d6\u0001\u0000\u0000"+
		"\u0000\u06d6\u00d3\u0001\u0000\u0000\u0000\u06d7\u06d8\u00058\u0000\u0000"+
		"\u06d8\u06dd\u0003\u00d2i\u0000\u06d9\u06da\u0005$\u0000\u0000\u06da\u06dc"+
		"\u0003\u00d2i\u0000\u06db\u06d9\u0001\u0000\u0000\u0000\u06dc\u06df\u0001"+
		"\u0000\u0000\u0000\u06dd\u06db\u0001\u0000\u0000\u0000\u06dd\u06de\u0001"+
		"\u0000\u0000\u0000\u06de\u00d5\u0001\u0000\u0000\u0000\u06df\u06dd\u0001"+
		"\u0000\u0000\u0000\u06e0\u06e1\u0005\u001e\u0000\u0000\u06e1\u06e6\u0003"+
		"\u00d8l\u0000\u06e2\u06e3\u0005$\u0000\u0000\u06e3\u06e5\u0003\u00d8l"+
		"\u0000\u06e4\u06e2\u0001\u0000\u0000\u0000\u06e5\u06e8\u0001\u0000\u0000"+
		"\u0000\u06e6\u06e4\u0001\u0000\u0000\u0000\u06e6\u06e7\u0001\u0000\u0000"+
		"\u0000\u06e7\u06e9\u0001\u0000\u0000\u0000\u06e8\u06e6\u0001\u0000\u0000"+
		"\u0000\u06e9\u06ea\u0005\u001f\u0000\u0000\u06ea\u06ee\u0001\u0000\u0000"+
		"\u0000\u06eb\u06ec\u0005\u001e\u0000\u0000\u06ec\u06ee\u0005\u001f\u0000"+
		"\u0000\u06ed\u06e0\u0001\u0000\u0000\u0000\u06ed\u06eb\u0001\u0000\u0000"+
		"\u0000\u06ee\u00d7\u0001\u0000\u0000\u0000\u06ef\u06f4\u0003\u0176\u00bb"+
		"\u0000\u06f0\u06f4\u0005\u0095\u0000\u0000\u06f1\u06f4\u0003\u00dam\u0000"+
		"\u06f2\u06f4\u0003\u01e8\u00f4\u0000\u06f3\u06ef\u0001\u0000\u0000\u0000"+
		"\u06f3\u06f0\u0001\u0000\u0000\u0000\u06f3\u06f1\u0001\u0000\u0000\u0000"+
		"\u06f3\u06f2\u0001\u0000\u0000\u0000\u06f4\u00d9\u0001\u0000\u0000\u0000"+
		"\u06f5\u06f6\u0005\u019f\u0000\u0000\u06f6\u00db\u0001\u0000\u0000\u0000"+
		"\u06f7\u06f8\u0005/\u0000\u0000\u06f8\u06fa\u0003\u00deo\u0000\u06f9\u06fb"+
		"\u0003\u0102\u0081\u0000\u06fa\u06f9\u0001\u0000\u0000\u0000\u06fa\u06fb"+
		"\u0001\u0000\u0000\u0000\u06fb\u00dd\u0001\u0000\u0000\u0000\u06fc\u06fd"+
		"\u0005Q\u0000\u0000\u06fd\u0702\u0003\u0144\u00a2\u0000\u06fe\u0700\u0005"+
		"\\\u0000\u0000\u06ff\u06fe\u0001\u0000\u0000\u0000\u06ff\u0700\u0001\u0000"+
		"\u0000\u0000\u0700\u0701\u0001\u0000\u0000\u0000\u0701\u0703\u0003\u00ee"+
		"w\u0000\u0702\u06ff\u0001\u0000\u0000\u0000\u0702\u0703\u0001\u0000\u0000"+
		"\u0000\u0703\u00df\u0001\u0000\u0000\u0000\u0704\u0706\u0003\u010a\u0085"+
		"\u0000\u0705\u0704\u0001\u0000\u0000\u0000\u0705\u0706\u0001\u0000\u0000"+
		"\u0000\u0706\u0707\u0001\u0000\u0000\u0000\u0707\u0708\u0003\u00e2q\u0000"+
		"\u0708\u00e1\u0001\u0000\u0000\u0000\u0709\u0711\u0003\u00e4r\u0000\u070a"+
		"\u070c\u0005J\u0000\u0000\u070b\u070d\u0007\u000f\u0000\u0000\u070c\u070b"+
		"\u0001\u0000\u0000\u0000\u070c\u070d\u0001\u0000\u0000\u0000\u070d\u070e"+
		"\u0001\u0000\u0000\u0000\u070e\u0710\u0003\u00e4r\u0000\u070f\u070a\u0001"+
		"\u0000\u0000\u0000\u0710\u0713\u0001\u0000\u0000\u0000\u0711\u070f\u0001"+
		"\u0000\u0000\u0000\u0711\u0712\u0001\u0000\u0000\u0000\u0712\u00e3\u0001"+
		"\u0000\u0000\u0000\u0713\u0711\u0001\u0000\u0000\u0000\u0714\u0718\u0005"+
		",\u0000\u0000\u0715\u0717\u0003\u00e6s\u0000\u0716\u0715\u0001\u0000\u0000"+
		"\u0000\u0717\u071a\u0001\u0000\u0000\u0000\u0718\u0716\u0001\u0000\u0000"+
		"\u0000\u0718\u0719\u0001\u0000\u0000\u0000\u0719\u071b\u0001\u0000\u0000"+
		"\u0000\u071a\u0718\u0001\u0000\u0000\u0000\u071b\u071d\u0003\u00eau\u0000"+
		"\u071c\u071e\u0003\u00f4z\u0000\u071d\u071c\u0001\u0000\u0000\u0000\u071d"+
		"\u071e\u0001\u0000\u0000\u0000\u071e\u0720\u0001\u0000\u0000\u0000\u071f"+
		"\u0721\u0003\u0102\u0081\u0000\u0720\u071f\u0001\u0000\u0000\u0000\u0720"+
		"\u0721\u0001\u0000\u0000\u0000\u0721\u0723\u0001\u0000\u0000\u0000\u0722"+
		"\u0724\u0003\u0104\u0082\u0000\u0723\u0722\u0001\u0000\u0000\u0000\u0723"+
		"\u0724\u0001\u0000\u0000\u0000\u0724\u0726\u0001\u0000\u0000\u0000\u0725"+
		"\u0727\u0003\u0106\u0083\u0000\u0726\u0725\u0001\u0000\u0000\u0000\u0726"+
		"\u0727\u0001\u0000\u0000\u0000\u0727\u0729\u0001\u0000\u0000\u0000\u0728"+
		"\u072a\u0003\u01b0\u00d8\u0000\u0729\u0728\u0001\u0000\u0000\u0000\u0729"+
		"\u072a\u0001\u0000\u0000\u0000\u072a\u072c\u0001\u0000\u0000\u0000\u072b"+
		"\u072d\u0003\u01b4\u00da\u0000\u072c\u072b\u0001\u0000\u0000\u0000\u072c"+
		"\u072d\u0001\u0000\u0000\u0000\u072d\u00e5\u0001\u0000\u0000\u0000\u072e"+
		"\u072f\u0003\u00e8t\u0000\u072f\u00e7\u0001\u0000\u0000\u0000\u0730\u0731"+
		"\u0007\u000f\u0000\u0000\u0731\u00e9\u0001\u0000\u0000\u0000\u0732\u0735"+
		"\u0003\u00f0x\u0000\u0733\u0735\u0003\u00ecv\u0000\u0734\u0732\u0001\u0000"+
		"\u0000\u0000\u0734\u0733\u0001\u0000\u0000\u0000\u0735\u073a\u0001\u0000"+
		"\u0000\u0000\u0736\u0737\u0005$\u0000\u0000\u0737\u0739\u0003\u00ecv\u0000"+
		"\u0738\u0736\u0001\u0000\u0000\u0000\u0739\u073c\u0001\u0000\u0000\u0000"+
		"\u073a\u0738\u0001\u0000\u0000\u0000\u073a\u073b\u0001\u0000\u0000\u0000"+
		"\u073b\u00eb\u0001\u0000\u0000\u0000\u073c\u073a\u0001\u0000\u0000\u0000"+
		"\u073d\u0740\u0003\u0152\u00a9\u0000\u073e\u0740\u0003\u0176\u00bb\u0000"+
		"\u073f\u073d\u0001\u0000\u0000\u0000\u073f\u073e\u0001\u0000\u0000\u0000"+
		"\u0740\u0745\u0001\u0000\u0000\u0000\u0741\u0743\u0005\\\u0000\u0000\u0742"+
		"\u0741\u0001\u0000\u0000\u0000\u0742\u0743\u0001\u0000\u0000\u0000\u0743"+
		"\u0744\u0001\u0000\u0000\u0000\u0744\u0746\u0003\u00eew\u0000\u0745\u0742"+
		"\u0001\u0000\u0000\u0000\u0745\u0746\u0001\u0000\u0000\u0000\u0746\u0749"+
		"\u0001\u0000\u0000\u0000\u0747\u0749\u0003\u00f2y\u0000\u0748\u073f\u0001"+
		"\u0000\u0000\u0000\u0748\u0747\u0001\u0000\u0000\u0000\u0749\u00ed\u0001"+
		"\u0000\u0000\u0000\u074a\u074d\u0003\u0134\u009a\u0000\u074b\u074d\u0005"+
		"\u019f\u0000\u0000\u074c\u074a\u0001\u0000\u0000\u0000\u074c\u074b\u0001"+
		"\u0000\u0000\u0000\u074d\u00ef\u0001\u0000\u0000\u0000\u074e\u074f\u0005"+
		"\u0010\u0000\u0000\u074f\u00f1\u0001\u0000\u0000\u0000\u0750\u0751\u0003"+
		"\u0134\u009a\u0000\u0751\u0752\u0005\u0014\u0000\u0000\u0752\u00f3\u0001"+
		"\u0000\u0000\u0000\u0753\u0754\u0005Q\u0000\u0000\u0754\u0756\u0003\u00f6"+
		"{\u0000\u0755\u0757\u0003\u00fe\u007f\u0000\u0756\u0755\u0001\u0000\u0000"+
		"\u0000\u0756\u0757\u0001\u0000\u0000\u0000\u0757\u00f5\u0001\u0000\u0000"+
		"\u0000\u0758\u075d\u0003\u00f8|\u0000\u0759\u075a\u0005$\u0000\u0000\u075a"+
		"\u075c\u0003\u00f8|\u0000\u075b\u0759\u0001\u0000\u0000\u0000\u075c\u075f"+
		"\u0001\u0000\u0000\u0000\u075d\u075b\u0001\u0000\u0000\u0000\u075d\u075e"+
		"\u0001\u0000\u0000\u0000\u075e\u00f7\u0001\u0000\u0000\u0000\u075f\u075d"+
		"\u0001\u0000\u0000\u0000\u0760\u0766\u0003\u00fa}\u0000\u0761\u0762\u0005"+
		" \u0000\u0000\u0762\u0763\u0003\u00fa}\u0000\u0763\u0764\u0005!\u0000"+
		"\u0000\u0764\u0766\u0001\u0000\u0000\u0000\u0765\u0760\u0001\u0000\u0000"+
		"\u0000\u0765\u0761\u0001\u0000\u0000\u0000\u0766\u00f9\u0001\u0000\u0000"+
		"\u0000\u0767\u076b\u0003\u00fc~\u0000\u0768\u076a\u0003\u00fe\u007f\u0000"+
		"\u0769\u0768\u0001\u0000\u0000\u0000\u076a\u076d\u0001\u0000\u0000\u0000"+
		"\u076b\u0769\u0001\u0000\u0000\u0000\u076b\u076c\u0001\u0000\u0000\u0000"+
		"\u076c\u00fb\u0001\u0000\u0000\u0000\u076d\u076b\u0001\u0000\u0000\u0000"+
		"\u076e\u0773\u0003\u0144\u00a2\u0000\u076f\u0771\u0005\\\u0000\u0000\u0770"+
		"\u076f\u0001\u0000\u0000\u0000\u0770\u0771\u0001\u0000\u0000\u0000\u0771"+
		"\u0772\u0001\u0000\u0000\u0000\u0772\u0774\u0003\u00eew\u0000\u0773\u0770"+
		"\u0001\u0000\u0000\u0000\u0773\u0774\u0001\u0000\u0000\u0000\u0774\u0784"+
		"\u0001\u0000\u0000\u0000\u0775\u077a\u0003\u0108\u0084\u0000\u0776\u0778"+
		"\u0005\\\u0000\u0000\u0777\u0776\u0001\u0000\u0000\u0000\u0777\u0778\u0001"+
		"\u0000\u0000\u0000\u0778\u0779\u0001\u0000\u0000\u0000\u0779\u077b\u0003"+
		"\u00eew\u0000\u077a\u0777\u0001\u0000\u0000\u0000\u077a\u077b\u0001\u0000"+
		"\u0000\u0000\u077b\u077d\u0001\u0000\u0000\u0000\u077c\u077e\u0003\u0170"+
		"\u00b8\u0000\u077d\u077c\u0001\u0000\u0000\u0000\u077d\u077e\u0001\u0000"+
		"\u0000\u0000\u077e\u0784\u0001\u0000\u0000\u0000\u077f\u0780\u0005\u001e"+
		"\u0000\u0000\u0780\u0781\u0003\u00f6{\u0000\u0781\u0782\u0005\u001f\u0000"+
		"\u0000\u0782\u0784\u0001\u0000\u0000\u0000\u0783\u076e\u0001\u0000\u0000"+
		"\u0000\u0783\u0775\u0001\u0000\u0000\u0000\u0783\u077f\u0001\u0000\u0000"+
		"\u0000\u0784\u00fd\u0001\u0000\u0000\u0000\u0785\u0787\u0007\u0010\u0000"+
		"\u0000\u0786\u0785\u0001\u0000\u0000\u0000\u0786\u0787\u0001\u0000\u0000"+
		"\u0000\u0787\u0788\u0001\u0000\u0000\u0000\u0788\u0789\u0005S\u0000\u0000"+
		"\u0789\u078a\u0001\u0000\u0000\u0000\u078a\u078c\u0003\u00fc~\u0000\u078b"+
		"\u078d\u0003\u0100\u0080\u0000\u078c\u078b\u0001\u0000\u0000\u0000\u078c"+
		"\u078d\u0001\u0000\u0000\u0000\u078d\u07a1\u0001\u0000\u0000\u0000\u078e"+
		"\u0790\u0007\u0011\u0000\u0000\u078f\u0791\u0005V\u0000\u0000\u0790\u078f"+
		"\u0001\u0000\u0000\u0000\u0790\u0791\u0001\u0000\u0000\u0000\u0791\u0792"+
		"\u0001\u0000\u0000\u0000\u0792\u0793\u0005S\u0000\u0000\u0793\u0794\u0003"+
		"\u00fc~\u0000\u0794\u0795\u0003\u0100\u0080\u0000\u0795\u07a1\u0001\u0000"+
		"\u0000\u0000\u0796\u079c\u0005R\u0000\u0000\u0797\u079d\u0005U\u0000\u0000"+
		"\u0798\u079a\u0007\u0011\u0000\u0000\u0799\u079b\u0005V\u0000\u0000\u079a"+
		"\u0799\u0001\u0000\u0000\u0000\u079a\u079b\u0001\u0000\u0000\u0000\u079b"+
		"\u079d\u0001\u0000\u0000\u0000\u079c\u0797\u0001\u0000\u0000\u0000\u079c"+
		"\u0798\u0001\u0000\u0000\u0000\u079c\u079d\u0001\u0000\u0000\u0000\u079d"+
		"\u079e\u0001\u0000\u0000\u0000\u079e\u079f\u0005S\u0000\u0000\u079f\u07a1"+
		"\u0003\u00fc~\u0000\u07a0\u0786\u0001\u0000\u0000\u0000\u07a0\u078e\u0001"+
		"\u0000\u0000\u0000\u07a0\u0796\u0001\u0000\u0000\u0000\u07a1\u00ff\u0001"+
		"\u0000\u0000\u0000\u07a2\u07a3\u0005]\u0000\u0000\u07a3\u07a7\u0003\u0176"+
		"\u00bb\u0000\u07a4\u07a5\u0005Z\u0000\u0000\u07a5\u07a7\u0003\u0170\u00b8"+
		"\u0000\u07a6\u07a2\u0001\u0000\u0000\u0000\u07a6\u07a4\u0001\u0000\u0000"+
		"\u0000\u07a7\u0101\u0001\u0000\u0000\u0000\u07a8\u07ad\u0005[\u0000\u0000"+
		"\u07a9\u07ae\u0003\u0176\u00bb\u0000\u07aa\u07ab\u0005\u0096\u0000\u0000"+
		"\u07ab\u07ac\u0005\u0129\u0000\u0000\u07ac\u07ae\u0003\u016a\u00b5\u0000"+
		"\u07ad\u07a9\u0001\u0000\u0000\u0000\u07ad\u07aa\u0001\u0000\u0000\u0000"+
		"\u07ae\u0103\u0001\u0000\u0000\u0000\u07af\u07b0\u0005q\u0000\u0000\u07b0"+
		"\u07b1\u0005r\u0000\u0000\u07b1\u07b6\u0003\u01b2\u00d9\u0000\u07b2\u07b3"+
		"\u0005$\u0000\u0000\u07b3\u07b5\u0003\u01b2\u00d9\u0000\u07b4\u07b2\u0001"+
		"\u0000\u0000\u0000\u07b5\u07b8\u0001\u0000\u0000\u0000\u07b6\u07b4\u0001"+
		"\u0000\u0000\u0000\u07b6\u07b7\u0001\u0000\u0000\u0000\u07b7\u0105\u0001"+
		"\u0000\u0000\u0000\u07b8\u07b6\u0001\u0000\u0000\u0000\u07b9\u07ba\u0005"+
		"u\u0000\u0000\u07ba\u07bb\u0003\u0176\u00bb\u0000\u07bb\u0107\u0001\u0000"+
		"\u0000\u0000\u07bc\u07be\u0005\u001e\u0000\u0000\u07bd\u07bf\u0003\u010a"+
		"\u0085\u0000\u07be\u07bd\u0001\u0000\u0000\u0000\u07be\u07bf\u0001\u0000"+
		"\u0000\u0000\u07bf\u07c0\u0001\u0000\u0000\u0000\u07c0\u07c1\u0003\u00e2"+
		"q\u0000\u07c1\u07c2\u0001\u0000\u0000\u0000\u07c2\u07c3\u0005\u001f\u0000"+
		"\u0000\u07c3\u0109\u0001\u0000\u0000\u0000\u07c4\u07c6\u0005I\u0000\u0000"+
		"\u07c5\u07c7\u0005\u0159\u0000\u0000\u07c6\u07c5\u0001\u0000\u0000\u0000"+
		"\u07c6\u07c7\u0001\u0000\u0000\u0000\u07c7\u07c8\u0001\u0000\u0000\u0000"+
		"\u07c8\u07cd\u0003\u010c\u0086\u0000\u07c9\u07ca\u0005$\u0000\u0000\u07ca"+
		"\u07cc\u0003\u010c\u0086\u0000\u07cb\u07c9\u0001\u0000\u0000\u0000\u07cc"+
		"\u07cf\u0001\u0000\u0000\u0000\u07cd\u07cb\u0001\u0000\u0000\u0000\u07cd"+
		"\u07ce\u0001\u0000\u0000\u0000\u07ce\u010b\u0001\u0000\u0000\u0000\u07cf"+
		"\u07cd\u0001\u0000\u0000\u0000\u07d0\u07d5\u0003\u0134\u009a\u0000\u07d1"+
		"\u07d2\u0005\u001e\u0000\u0000\u07d2\u07d3\u0003\u0170\u00b8\u0000\u07d3"+
		"\u07d4\u0005\u001f\u0000\u0000\u07d4\u07d6\u0001\u0000\u0000\u0000\u07d5"+
		"\u07d1\u0001\u0000\u0000\u0000\u07d5\u07d6\u0001\u0000\u0000\u0000\u07d6"+
		"\u07d7\u0001\u0000\u0000\u0000\u07d7\u07d8\u0005\\\u0000\u0000\u07d8\u07d9"+
		"\u0003\u0108\u0084\u0000\u07d9\u010d\u0001\u0000\u0000\u0000\u07da\u07db"+
		"\u0005\u017e\u0000\u0000\u07db\u07dc\u0003\u0110\u0088\u0000\u07dc\u07dd"+
		"\u0003\u0112\u0089\u0000\u07dd\u07e1\u0003\u0114\u008a\u0000\u07de\u07e0"+
		"\u0003\u0114\u008a\u0000\u07df\u07de\u0001\u0000\u0000\u0000\u07e0\u07e3"+
		"\u0001\u0000\u0000\u0000\u07e1\u07df\u0001\u0000\u0000\u0000\u07e1\u07e2"+
		"\u0001\u0000\u0000\u0000\u07e2\u07ea\u0001\u0000\u0000\u0000\u07e3\u07e1"+
		"\u0001\u0000\u0000\u0000\u07e4\u07e5\u0005\u017f\u0000\u0000\u07e5\u07e8"+
		"\u0003\u011c\u008e\u0000\u07e6\u07e7\u0005G\u0000\u0000\u07e7\u07e9\u0003"+
		"\u0120\u0090\u0000\u07e8\u07e6\u0001\u0000\u0000\u0000\u07e8\u07e9\u0001"+
		"\u0000\u0000\u0000\u07e9\u07eb\u0001\u0000\u0000\u0000\u07ea\u07e4\u0001"+
		"\u0000\u0000\u0000\u07ea\u07eb\u0001\u0000\u0000\u0000\u07eb\u010f\u0001"+
		"\u0000\u0000\u0000\u07ec\u07f0\u0005G\u0000\u0000\u07ed\u07f1\u0003\u0144"+
		"\u00a2\u0000\u07ee\u07f1\u0003\u0154\u00aa\u0000\u07ef\u07f1\u0003\u0108"+
		"\u0084\u0000\u07f0\u07ed\u0001\u0000\u0000\u0000\u07f0\u07ee\u0001\u0000"+
		"\u0000\u0000\u07f0\u07ef\u0001\u0000\u0000\u0000\u07f1\u07f6\u0001\u0000"+
		"\u0000\u0000\u07f2\u07f4\u0005\\\u0000\u0000\u07f3\u07f2\u0001\u0000\u0000"+
		"\u0000\u07f3\u07f4\u0001\u0000\u0000\u0000\u07f4\u07f5\u0001\u0000\u0000"+
		"\u0000\u07f5\u07f7\u0003\u00eew\u0000\u07f6\u07f3\u0001\u0000\u0000\u0000"+
		"\u07f6\u07f7\u0001\u0000\u0000\u0000\u07f7\u0111\u0001\u0000\u0000\u0000"+
		"\u07f8\u07fe\u0005Z\u0000\u0000\u07f9\u07fc\u0003\u0144\u00a2\u0000\u07fa"+
		"\u07fc\u0003\u0154\u00aa\u0000\u07fb\u07f9\u0001\u0000\u0000\u0000\u07fb"+
		"\u07fa\u0001\u0000\u0000\u0000\u07fc\u07ff\u0001\u0000\u0000\u0000\u07fd"+
		"\u07ff\u0003\u0108\u0084\u0000\u07fe\u07fb\u0001\u0000\u0000\u0000\u07fe"+
		"\u07fd\u0001\u0000\u0000\u0000\u07ff\u0804\u0001\u0000\u0000\u0000\u0800"+
		"\u0802\u0005\\\u0000\u0000\u0801\u0800\u0001\u0000\u0000\u0000\u0801\u0802"+
		"\u0001\u0000\u0000\u0000\u0802\u0803\u0001\u0000\u0000\u0000\u0803\u0805"+
		"\u0003\u00eew\u0000\u0804\u0801\u0001\u0000\u0000\u0000\u0804\u0805\u0001"+
		"\u0000\u0000\u0000\u0805\u0806\u0001\u0000\u0000\u0000\u0806\u0807\u0005"+
		"]\u0000\u0000\u0807\u0808\u0003\u0176\u00bb\u0000\u0808\u0113\u0001\u0000"+
		"\u0000\u0000\u0809\u080c\u0003\u0116\u008b\u0000\u080a\u080c\u0003\u0118"+
		"\u008c\u0000\u080b\u0809\u0001\u0000\u0000\u0000\u080b\u080a\u0001\u0000"+
		"\u0000\u0000\u080c\u0115\u0001\u0000\u0000\u0000\u080d\u080e\u0005M\u0000"+
		"\u0000\u080e\u0811\u0005\u0180\u0000\u0000\u080f\u0810\u0005c\u0000\u0000"+
		"\u0810\u0812\u0003\u0176\u00bb\u0000\u0811\u080f\u0001\u0000\u0000\u0000"+
		"\u0811\u0812\u0001\u0000\u0000\u0000\u0812\u0813\u0001\u0000\u0000\u0000"+
		"\u0813\u0824\u0005`\u0000\u0000\u0814\u0815\u0005.\u0000\u0000\u0815\u0816"+
		"\u00058\u0000\u0000\u0816\u0817\u0003\u0152\u00a9\u0000\u0817\u0818\u0005"+
		"\u0017\u0000\u0000\u0818\u0820\u0003\u0176\u00bb\u0000\u0819\u081a\u0005"+
		"$\u0000\u0000\u081a\u081b\u0003\u0152\u00a9\u0000\u081b\u081c\u0005\u0017"+
		"\u0000\u0000\u081c\u081d\u0003\u0176\u00bb\u0000\u081d\u081f\u0001\u0000"+
		"\u0000\u0000\u081e\u0819\u0001\u0000\u0000\u0000\u081f\u0822\u0001\u0000"+
		"\u0000\u0000\u0820\u081e\u0001\u0000\u0000\u0000\u0820\u0821\u0001\u0000"+
		"\u0000\u0000\u0821\u0825\u0001\u0000\u0000\u0000\u0822\u0820\u0001\u0000"+
		"\u0000\u0000\u0823\u0825\u0005/\u0000\u0000\u0824\u0814\u0001\u0000\u0000"+
		"\u0000\u0824\u0823\u0001\u0000\u0000\u0000\u0825\u0117\u0001\u0000\u0000"+
		"\u0000\u0826\u0827\u0005M\u0000\u0000\u0827\u0828\u0005f\u0000\u0000\u0828"+
		"\u082b\u0005\u0180\u0000\u0000\u0829\u082a\u0005c\u0000\u0000\u082a\u082c"+
		"\u0003\u0176\u00bb\u0000\u082b\u0829\u0001\u0000\u0000\u0000\u082b\u082c"+
		"\u0001\u0000\u0000\u0000\u082c\u082d\u0001\u0000\u0000\u0000\u082d\u082e"+
		"\u0005`\u0000\u0000\u082e\u0830\u0005-\u0000\u0000\u082f\u0831\u0003\u0170"+
		"\u00b8\u0000\u0830\u082f\u0001\u0000\u0000\u0000\u0830\u0831\u0001\u0000"+
		"\u0000\u0000\u0831\u0832\u0001\u0000\u0000\u0000\u0832\u0833\u0005H\u0000"+
		"\u0000\u0833\u0834\u0005\u001e\u0000\u0000\u0834\u0835\u0003\u0176\u00bb"+
		"\u0000\u0835\u0836\u0005\u001f\u0000\u0000\u0836\u0119\u0001\u0000\u0000"+
		"\u0000\u0837\u0839\u0003\u0176\u00bb\u0000\u0838\u083a\u0005\\\u0000\u0000"+
		"\u0839\u0838\u0001\u0000\u0000\u0000\u0839\u083a\u0001\u0000\u0000\u0000"+
		"\u083a\u083b\u0001\u0000\u0000\u0000\u083b\u083c\u0003\u00eew\u0000\u083c"+
		"\u011b\u0001\u0000\u0000\u0000\u083d\u0842\u0003\u011a\u008d\u0000\u083e"+
		"\u083f\u0005$\u0000\u0000\u083f\u0841\u0003\u011a\u008d\u0000\u0840\u083e"+
		"\u0001\u0000\u0000\u0000\u0841\u0844\u0001\u0000\u0000\u0000\u0842\u0840"+
		"\u0001\u0000\u0000\u0000\u0842\u0843\u0001\u0000\u0000\u0000\u0843\u011d"+
		"\u0001\u0000\u0000\u0000\u0844\u0842\u0001\u0000\u0000\u0000\u0845\u0846"+
		"\u0005\"\u0000\u0000\u0846\u0847\u0005\r\u0000\u0000\u0847\u0848\u0005"+
		"#\u0000\u0000\u0848\u0849\u0003\u013e\u009f\u0000\u0849\u011f\u0001\u0000"+
		"\u0000\u0000\u084a\u084f\u0003\u011e\u008f\u0000\u084b\u084c\u0005$\u0000"+
		"\u0000\u084c\u084e\u0003\u011e\u008f\u0000\u084d\u084b\u0001\u0000\u0000"+
		"\u0000\u084e\u0851\u0001\u0000\u0000\u0000\u084f\u084d\u0001\u0000\u0000"+
		"\u0000\u084f\u0850\u0001\u0000\u0000\u0000\u0850\u0121\u0001\u0000\u0000"+
		"\u0000\u0851\u084f\u0001\u0000\u0000\u0000\u0852\u0853\u0005\'\u0000\u0000"+
		"\u0853\u0123\u0001\u0000\u0000\u0000\u0854\u085c\u0003\u0126\u0093\u0000"+
		"\u0855\u085c\u0003\u0128\u0094\u0000\u0856\u085c\u0003\u012a\u0095\u0000"+
		"\u0857\u085c\u0003\u012c\u0096\u0000\u0858\u085c\u0003\u012e\u0097\u0000"+
		"\u0859\u085c\u0003\u0130\u0098\u0000\u085a\u085c\u0003\u0132\u0099\u0000"+
		"\u085b\u0854\u0001\u0000\u0000\u0000\u085b\u0855\u0001\u0000\u0000\u0000"+
		"\u085b\u0856\u0001\u0000\u0000\u0000\u085b\u0857\u0001\u0000\u0000\u0000"+
		"\u085b\u0858\u0001\u0000\u0000\u0000\u085b\u0859\u0001\u0000\u0000\u0000"+
		"\u085b\u085a\u0001\u0000\u0000\u0000\u085c\u0125\u0001\u0000\u0000\u0000"+
		"\u085d\u085f\u0003\u0174\u00ba\u0000\u085e\u085d\u0001\u0000\u0000\u0000"+
		"\u085e\u085f\u0001\u0000\u0000\u0000\u085f\u0860\u0001\u0000\u0000\u0000"+
		"\u0860\u0862\u0005\u019f\u0000\u0000\u0861\u0863\u0003\u01ca\u00e5\u0000"+
		"\u0862\u0861\u0001\u0000\u0000\u0000\u0862\u0863\u0001\u0000\u0000\u0000"+
		"\u0863\u0127\u0001\u0000\u0000\u0000\u0864\u0866\u0007\u0012\u0000\u0000"+
		"\u0865\u0864\u0001\u0000\u0000\u0000\u0865\u0866\u0001\u0000\u0000\u0000"+
		"\u0866\u0867\u0001\u0000\u0000\u0000\u0867\u0868\u0005\u01a0\u0000\u0000"+
		"\u0868\u0129\u0001\u0000\u0000\u0000\u0869\u086a\u0007\u0013\u0000\u0000"+
		"\u086a\u0871\u0005\u019f\u0000\u0000\u086b\u086c\u0005 \u0000\u0000\u086c"+
		"\u086d\u0003\u0134\u009a\u0000\u086d\u086e\u0005\u019f\u0000\u0000\u086e"+
		"\u086f\u0005!\u0000\u0000\u086f\u0871\u0001\u0000\u0000\u0000\u0870\u0869"+
		"\u0001\u0000\u0000\u0000\u0870\u086b\u0001\u0000\u0000\u0000\u0871\u012b"+
		"\u0001\u0000\u0000\u0000\u0872\u0874\u0003\u0174\u00ba\u0000\u0873\u0872"+
		"\u0001\u0000\u0000\u0000\u0873\u0874\u0001\u0000\u0000\u0000\u0874\u0875"+
		"\u0001\u0000\u0000\u0000\u0875\u0877\u0005\u01a1\u0000\u0000\u0876\u0878"+
		"\u0003\u01ca\u00e5\u0000\u0877\u0876\u0001\u0000\u0000\u0000\u0877\u0878"+
		"\u0001\u0000\u0000\u0000\u0878\u012d\u0001\u0000\u0000\u0000\u0879\u087b"+
		"\u0003\u0174\u00ba\u0000\u087a\u0879\u0001\u0000\u0000\u0000\u087a\u087b"+
		"\u0001\u0000\u0000\u0000\u087b\u087c\u0001\u0000\u0000\u0000\u087c\u087e"+
		"\u0005\u01a2\u0000\u0000\u087d\u087f\u0003\u01ca\u00e5\u0000\u087e\u087d"+
		"\u0001\u0000\u0000\u0000\u087e\u087f\u0001\u0000\u0000\u0000\u087f\u012f"+
		"\u0001\u0000\u0000\u0000\u0880\u0881\u0007\u0014\u0000\u0000\u0881\u0131"+
		"\u0001\u0000\u0000\u0000\u0882\u0883\u0005g\u0000\u0000\u0883\u0133\u0001"+
		"\u0000\u0000\u0000\u0884\u0887\u0005\u019e\u0000\u0000\u0885\u0887\u0003"+
		"\u0136\u009b\u0000\u0886\u0884\u0001\u0000\u0000\u0000\u0886\u0885\u0001"+
		"\u0000\u0000\u0000\u0887\u0135\u0001\u0000\u0000\u0000\u0888\u0889\u0007"+
		"\u0015\u0000\u0000\u0889\u0137\u0001\u0000\u0000\u0000\u088a\u088c\u0005"+
		"(\u0000\u0000\u088b\u088a\u0001\u0000\u0000\u0000\u088b\u088c\u0001\u0000"+
		"\u0000\u0000\u088c\u088d\u0001\u0000\u0000\u0000\u088d\u088f\u0005(\u0000"+
		"\u0000\u088e\u088b\u0001\u0000\u0000\u0000\u088e\u088f\u0001\u0000\u0000"+
		"\u0000\u088f\u0891\u0001\u0000\u0000\u0000\u0890\u0892\u0007\u0016\u0000"+
		"\u0000\u0891\u0890\u0001\u0000\u0000\u0000\u0891\u0892\u0001\u0000\u0000"+
		"\u0000\u0892\u0894\u0001\u0000\u0000\u0000\u0893\u0895\u0005\u0013\u0000"+
		"\u0000\u0894\u0893\u0001\u0000\u0000\u0000\u0894\u0895\u0001\u0000\u0000"+
		"\u0000\u0895\u0896\u0001\u0000\u0000\u0000\u0896\u0897\u0003\u0134\u009a"+
		"\u0000\u0897\u0139\u0001\u0000\u0000\u0000\u0898\u0899\u0003\u0134\u009a"+
		"\u0000\u0899\u013b\u0001\u0000\u0000\u0000\u089a\u089b\u0003\u0134\u009a"+
		"\u0000\u089b\u013d\u0001\u0000\u0000\u0000\u089c\u089d\u0003\u015c\u00ae"+
		"\u0000\u089d\u089e\u0005\u0013\u0000\u0000\u089e\u08a0\u0001\u0000\u0000"+
		"\u0000\u089f\u089c\u0001\u0000\u0000\u0000\u089f\u08a0\u0001\u0000\u0000"+
		"\u0000\u08a0\u08a1\u0001\u0000\u0000\u0000\u08a1\u08a2\u0003\u016e\u00b7"+
		"\u0000\u08a2\u013f\u0001\u0000\u0000\u0000\u08a3\u08a4\u0003\u0134\u009a"+
		"\u0000\u08a4\u0141\u0001\u0000\u0000\u0000\u08a5\u08a6\u0003\u0134\u009a"+
		"\u0000\u08a6\u0143\u0001\u0000\u0000\u0000\u08a7\u08a8\u0003\u015c\u00ae"+
		"\u0000\u08a8\u08a9\u0005\u0013\u0000\u0000\u08a9\u08ab\u0001\u0000\u0000"+
		"\u0000\u08aa\u08a7\u0001\u0000\u0000\u0000\u08aa\u08ab\u0001\u0000\u0000"+
		"\u0000\u08ab\u08ac\u0001\u0000\u0000\u0000\u08ac\u08ad\u0003\u016e\u00b7"+
		"\u0000\u08ad\u0145\u0001\u0000\u0000\u0000\u08ae\u08af\u0003\u0134\u009a"+
		"\u0000\u08af\u0147\u0001\u0000\u0000\u0000\u08b0\u08b1\u0003\u0134\u009a"+
		"\u0000\u08b1\u0149\u0001\u0000\u0000\u0000\u08b2\u08b3\u0003\u0134\u009a"+
		"\u0000\u08b3\u014b\u0001\u0000\u0000\u0000\u08b4\u08b5\u0003\u0134\u009a"+
		"\u0000\u08b5\u014d\u0001\u0000\u0000\u0000\u08b6\u08b7\u0005\u019f\u0000"+
		"\u0000\u08b7\u014f\u0001\u0000\u0000\u0000\u08b8\u08b9\u0003\u0134\u009a"+
		"\u0000\u08b9\u0151\u0001\u0000\u0000\u0000\u08ba\u08bb\u0003\u015c\u00ae"+
		"\u0000\u08bb\u08bc\u0005\u0013\u0000\u0000\u08bc\u08be\u0001\u0000\u0000"+
		"\u0000\u08bd\u08ba\u0001\u0000\u0000\u0000\u08bd\u08be\u0001\u0000\u0000"+
		"\u0000\u08be\u08bf\u0001\u0000\u0000\u0000\u08bf\u08c0\u0003\u016e\u00b7"+
		"\u0000\u08c0\u0153\u0001\u0000\u0000\u0000\u08c1\u08c9\u0003\u0134\u009a"+
		"\u0000\u08c2\u08c3\u0003\u015c\u00ae\u0000\u08c3\u08c4\u0005\u0013\u0000"+
		"\u0000\u08c4\u08c6\u0001\u0000\u0000\u0000\u08c5\u08c2\u0001\u0000\u0000"+
		"\u0000\u08c5\u08c6\u0001\u0000\u0000\u0000\u08c6\u08c7\u0001\u0000\u0000"+
		"\u0000\u08c7\u08c9\u0003\u0134\u009a\u0000\u08c8\u08c1\u0001\u0000\u0000"+
		"\u0000\u08c8\u08c5\u0001\u0000\u0000\u0000\u08c9\u0155\u0001\u0000\u0000"+
		"\u0000\u08ca\u08cb\u0003\u0134\u009a\u0000\u08cb\u0157\u0001\u0000\u0000"+
		"\u0000\u08cc\u08cd\u0003\u0134\u009a\u0000\u08cd\u0159\u0001\u0000\u0000"+
		"\u0000\u08ce\u08cf\u0003\u0134\u009a\u0000\u08cf\u015b\u0001\u0000\u0000"+
		"\u0000\u08d0\u08d1\u0003\u0134\u009a\u0000\u08d1\u015d\u0001\u0000\u0000"+
		"\u0000\u08d2\u08d3\u0003\u0134\u009a\u0000\u08d3\u015f\u0001\u0000\u0000"+
		"\u0000\u08d4\u08d5\u0003\u0134\u009a\u0000\u08d5\u0161\u0001\u0000\u0000"+
		"\u0000\u08d6\u08d7\u0003\u0134\u009a\u0000\u08d7\u0163\u0001\u0000\u0000"+
		"\u0000\u08d8\u08d9\u0003\u0134\u009a\u0000\u08d9\u0165\u0001\u0000\u0000"+
		"\u0000\u08da\u08db\u0003\u0134\u009a\u0000\u08db\u0167\u0001\u0000\u0000"+
		"\u0000\u08dc\u08dd\u0003\u0134\u009a\u0000\u08dd\u0169\u0001\u0000\u0000"+
		"\u0000\u08de\u08df\u0003\u0134\u009a\u0000\u08df\u016b\u0001\u0000\u0000"+
		"\u0000\u08e0\u08e1\u0003\u0134\u009a\u0000\u08e1\u016d\u0001\u0000\u0000"+
		"\u0000\u08e2\u08e3\u0003\u0134\u009a\u0000\u08e3\u016f\u0001\u0000\u0000"+
		"\u0000\u08e4\u08e6\u0005\u001e\u0000\u0000\u08e5\u08e4\u0001\u0000\u0000"+
		"\u0000\u08e5\u08e6\u0001\u0000\u0000\u0000\u08e6\u08e7\u0001\u0000\u0000"+
		"\u0000\u08e7\u08ec\u0003\u0152\u00a9\u0000\u08e8\u08e9\u0005$\u0000\u0000"+
		"\u08e9\u08eb\u0003\u0152\u00a9\u0000\u08ea\u08e8\u0001\u0000\u0000\u0000"+
		"\u08eb\u08ee\u0001\u0000\u0000\u0000\u08ec\u08ea\u0001\u0000\u0000\u0000"+
		"\u08ec\u08ed\u0001\u0000\u0000\u0000\u08ed\u08f0\u0001\u0000\u0000\u0000"+
		"\u08ee\u08ec\u0001\u0000\u0000\u0000\u08ef\u08f1\u0005\u001f\u0000\u0000"+
		"\u08f0\u08ef\u0001\u0000\u0000\u0000\u08f0\u08f1\u0001\u0000\u0000\u0000"+
		"\u08f1\u0171\u0001\u0000\u0000\u0000\u08f2\u08f4";
	private static final String _serializedATNSegment1 =
		"\u0005\u001e\u0000\u0000\u08f3\u08f2\u0001\u0000\u0000\u0000\u08f3\u08f4"+
		"\u0001\u0000\u0000\u0000\u08f4\u08f5\u0001\u0000\u0000\u0000\u08f5\u08fa"+
		"\u0003\u0144\u00a2\u0000\u08f6\u08f7\u0005$\u0000\u0000\u08f7\u08f9\u0003"+
		"\u0144\u00a2\u0000\u08f8\u08f6\u0001\u0000\u0000\u0000\u08f9\u08fc\u0001"+
		"\u0000\u0000\u0000\u08fa\u08f8\u0001\u0000\u0000\u0000\u08fa\u08fb\u0001"+
		"\u0000\u0000\u0000\u08fb\u08fe\u0001\u0000\u0000\u0000\u08fc\u08fa\u0001"+
		"\u0000\u0000\u0000\u08fd\u08ff\u0005\u001f\u0000\u0000\u08fe\u08fd\u0001"+
		"\u0000\u0000\u0000\u08fe\u08ff\u0001\u0000\u0000\u0000\u08ff\u0173\u0001"+
		"\u0000\u0000\u0000\u0900\u0901\u0005\u019e\u0000\u0000\u0901\u0175\u0001"+
		"\u0000\u0000\u0000\u0902\u0903\u0006\u00bb\uffff\uffff\u0000\u0903\u0904"+
		"\u0003\u017c\u00be\u0000\u0904\u0905\u0003\u0176\u00bb\u0003\u0905\u090c"+
		"\u0001\u0000\u0000\u0000\u0906\u0907\u0005\u001e\u0000\u0000\u0907\u0908"+
		"\u0003\u0176\u00bb\u0000\u0908\u0909\u0005\u001f\u0000\u0000\u0909\u090c"+
		"\u0001\u0000\u0000\u0000\u090a\u090c\u0003\u017e\u00bf\u0000\u090b\u0902"+
		"\u0001\u0000\u0000\u0000\u090b\u0906\u0001\u0000\u0000\u0000\u090b\u090a"+
		"\u0001\u0000\u0000\u0000\u090c\u0917\u0001\u0000\u0000\u0000\u090d\u090e"+
		"\n\u0005\u0000\u0000\u090e\u090f\u0003\u0178\u00bc\u0000\u090f\u0910\u0003"+
		"\u0176\u00bb\u0006\u0910\u0916\u0001\u0000\u0000\u0000\u0911\u0912\n\u0004"+
		"\u0000\u0000\u0912\u0913\u0003\u017a\u00bd\u0000\u0913\u0914\u0003\u0176"+
		"\u00bb\u0005\u0914\u0916\u0001\u0000\u0000\u0000\u0915\u090d\u0001\u0000"+
		"\u0000\u0000\u0915\u0911\u0001\u0000\u0000\u0000\u0916\u0919\u0001\u0000"+
		"\u0000\u0000\u0917\u0915\u0001\u0000\u0000\u0000\u0917\u0918\u0001\u0000"+
		"\u0000\u0000\u0918\u0177\u0001\u0000\u0000\u0000\u0919\u0917\u0001\u0000"+
		"\u0000\u0000\u091a\u091b\u0007\u0017\u0000\u0000\u091b\u0179\u0001\u0000"+
		"\u0000\u0000\u091c\u091d\u0007\u0018\u0000\u0000\u091d\u017b\u0001\u0000"+
		"\u0000\u0000\u091e\u091f\u0007\u0019\u0000\u0000\u091f\u017d\u0001\u0000"+
		"\u0000\u0000\u0920\u0921\u0006\u00bf\uffff\uffff\u0000\u0921\u0922\u0003"+
		"\u0182\u00c1\u0000\u0922\u0937\u0001\u0000\u0000\u0000\u0923\u0924\n\u0005"+
		"\u0000\u0000\u0924\u0926\u0005e\u0000\u0000\u0925\u0927\u0005f\u0000\u0000"+
		"\u0926\u0925\u0001\u0000\u0000\u0000\u0926\u0927\u0001\u0000\u0000\u0000"+
		"\u0927\u0928\u0001\u0000\u0000\u0000\u0928\u0936\u0007\u001a\u0000\u0000"+
		"\u0929\u092a\n\u0004\u0000\u0000\u092a\u092b\u0005\u0015\u0000\u0000\u092b"+
		"\u0936\u0003\u0182\u00c1\u0000\u092c\u092d\n\u0003\u0000\u0000\u092d\u092e"+
		"\u0003\u0180\u00c0\u0000\u092e\u092f\u0003\u0182\u00c1\u0000\u092f\u0936"+
		"\u0001\u0000\u0000\u0000\u0930\u0931\n\u0002\u0000\u0000\u0931\u0932\u0003"+
		"\u0180\u00c0\u0000\u0932\u0933\u0007\u001b\u0000\u0000\u0933\u0934\u0003"+
		"\u0108\u0084\u0000\u0934\u0936\u0001\u0000\u0000\u0000\u0935\u0923\u0001"+
		"\u0000\u0000\u0000\u0935\u0929\u0001\u0000\u0000\u0000\u0935\u092c\u0001"+
		"\u0000\u0000\u0000\u0935\u0930\u0001\u0000\u0000\u0000\u0936\u0939\u0001"+
		"\u0000\u0000\u0000\u0937\u0935\u0001\u0000\u0000\u0000\u0937\u0938\u0001"+
		"\u0000\u0000\u0000\u0938\u017f\u0001\u0000\u0000\u0000\u0939\u0937\u0001"+
		"\u0000\u0000\u0000\u093a\u093b\u0007\u001c\u0000\u0000\u093b\u0181\u0001"+
		"\u0000\u0000\u0000\u093c\u0987\u0001\u0000\u0000\u0000\u093d\u093f\u0003"+
		"\u0184\u00c2\u0000\u093e\u0940\u0005f\u0000\u0000\u093f\u093e\u0001\u0000"+
		"\u0000\u0000\u093f\u0940\u0001\u0000\u0000\u0000\u0940\u0941\u0001\u0000"+
		"\u0000\u0000\u0941\u0942\u0005l\u0000\u0000\u0942\u0943\u0003\u0108\u0084"+
		"\u0000\u0943\u0987\u0001\u0000\u0000\u0000\u0944\u0946\u0003\u0184\u00c2"+
		"\u0000\u0945\u0947\u0005f\u0000\u0000\u0946\u0945\u0001\u0000\u0000\u0000"+
		"\u0946\u0947\u0001\u0000\u0000\u0000\u0947\u0948\u0001\u0000\u0000\u0000"+
		"\u0948\u0949\u0005l\u0000\u0000\u0949\u094a\u0005\u001e\u0000\u0000\u094a"+
		"\u094f\u0003\u0176\u00bb\u0000\u094b\u094c\u0005$\u0000\u0000\u094c\u094e"+
		"\u0003\u0176\u00bb\u0000\u094d\u094b\u0001\u0000\u0000\u0000\u094e\u0951"+
		"\u0001\u0000\u0000\u0000\u094f\u094d\u0001\u0000\u0000\u0000\u094f\u0950"+
		"\u0001\u0000\u0000\u0000\u0950\u0952\u0001\u0000\u0000\u0000\u0951\u094f"+
		"\u0001\u0000\u0000\u0000\u0952\u0953\u0005\u001f\u0000\u0000\u0953\u0987"+
		"\u0001\u0000\u0000\u0000\u0954\u0956\u0003\u0184\u00c2\u0000\u0955\u0957"+
		"\u0005f\u0000\u0000\u0956\u0955\u0001\u0000\u0000\u0000\u0956\u0957\u0001"+
		"\u0000\u0000\u0000\u0957\u0958\u0001\u0000\u0000\u0000\u0958\u0959\u0005"+
		"k\u0000\u0000\u0959\u095a\u0003\u0184\u00c2\u0000\u095a\u095b\u0005c\u0000"+
		"\u0000\u095b\u095c\u0003\u0182\u00c1\u0000\u095c\u0987\u0001\u0000\u0000"+
		"\u0000\u095d\u095f\u0003\u0184\u00c2\u0000\u095e\u0960\u0005f\u0000\u0000"+
		"\u095f\u095e\u0001\u0000\u0000\u0000\u095f\u0960\u0001\u0000\u0000\u0000"+
		"\u0960\u0961\u0001\u0000\u0000\u0000\u0961\u0962\u0005o\u0000\u0000\u0962"+
		"\u0965\u0003\u0186\u00c3\u0000\u0963\u0964\u0005\u0106\u0000\u0000\u0964"+
		"\u0966\u0003\u0186\u00c3\u0000\u0965\u0963\u0001\u0000\u0000\u0000\u0965"+
		"\u0966\u0001\u0000\u0000\u0000\u0966\u0987\u0001\u0000\u0000\u0000\u0967"+
		"\u0969\u0003\u0184\u00c2\u0000\u0968\u096a\u0005f\u0000\u0000\u0969\u0968"+
		"\u0001\u0000\u0000\u0000\u0969\u096a\u0001\u0000\u0000\u0000\u096a\u096b"+
		"\u0001\u0000\u0000\u0000\u096b\u096d\u0005\u017d\u0000\u0000\u096c\u096e"+
		"\u0005I\u0000\u0000\u096d\u096c\u0001\u0000\u0000\u0000\u096d\u096e\u0001"+
		"\u0000\u0000\u0000\u096e\u096f\u0001\u0000\u0000\u0000\u096f\u0970\u0003"+
		"\u0184\u00c2\u0000\u0970\u0987\u0001\u0000\u0000\u0000\u0971\u0972\u0003"+
		"\u0184\u00c2\u0000\u0972\u0974\u0005e\u0000\u0000\u0973\u0975\u0005f\u0000"+
		"\u0000\u0974\u0973\u0001\u0000\u0000\u0000\u0974\u0975\u0001\u0000\u0000"+
		"\u0000\u0975\u0976\u0001\u0000\u0000\u0000\u0976\u0977\u0005K\u0000\u0000"+
		"\u0977\u0978\u0005Q\u0000\u0000\u0978\u0979\u0003\u0184\u00c2\u0000\u0979"+
		"\u0987\u0001\u0000\u0000\u0000\u097a\u097c\u0003\u0184\u00c2\u0000\u097b"+
		"\u097d\u0005f\u0000\u0000\u097c\u097b\u0001\u0000\u0000\u0000\u097c\u097d"+
		"\u0001\u0000\u0000\u0000\u097d\u097e\u0001\u0000\u0000\u0000\u097e\u097f"+
		"\u0005\u019d\u0000\u0000\u097f\u0980\u0005b\u0000\u0000\u0980\u0983\u0003"+
		"\u0184\u00c2\u0000\u0981\u0982\u0005\u0106\u0000\u0000\u0982\u0984\u0003"+
		"\u0184\u00c2\u0000\u0983\u0981\u0001\u0000\u0000\u0000\u0983\u0984\u0001"+
		"\u0000\u0000\u0000\u0984\u0987\u0001\u0000\u0000\u0000\u0985\u0987\u0003"+
		"\u0184\u00c2\u0000\u0986\u093c\u0001\u0000\u0000\u0000\u0986\u093d\u0001"+
		"\u0000\u0000\u0000\u0986\u0944\u0001\u0000\u0000\u0000\u0986\u0954\u0001"+
		"\u0000\u0000\u0000\u0986\u095d\u0001\u0000\u0000\u0000\u0986\u0967\u0001"+
		"\u0000\u0000\u0000\u0986\u0971\u0001\u0000\u0000\u0000\u0986\u097a\u0001"+
		"\u0000\u0000\u0000\u0986\u0985\u0001\u0000\u0000\u0000\u0987\u0183\u0001"+
		"\u0000\u0000\u0000\u0988\u0989\u0006\u00c2\uffff\uffff\u0000\u0989\u098a"+
		"\u0003\u0186\u00c3\u0000\u098a\u09b1\u0001\u0000\u0000\u0000\u098b\u098c"+
		"\n\r\u0000\u0000\u098c\u098d\u0005\u0007\u0000\u0000\u098d\u09b0\u0003"+
		"\u0184\u00c2\u000e\u098e\u098f\n\f\u0000\u0000\u098f\u0990\u0005\b\u0000"+
		"\u0000\u0990\u09b0\u0003\u0184\u00c2\r\u0991\u0992\n\u000b\u0000\u0000"+
		"\u0992\u0993\u0005\t\u0000\u0000\u0993\u09b0\u0003\u0184\u00c2\f\u0994"+
		"\u0995\n\n\u0000\u0000\u0995\u0996\u0005\n\u0000\u0000\u0996\u09b0\u0003"+
		"\u0184\u00c2\u000b\u0997\u0998\n\t\u0000\u0000\u0998\u0999\u0005\u000e"+
		"\u0000\u0000\u0999\u09b0\u0003\u0184\u00c2\n\u099a\u099b\n\b\u0000\u0000"+
		"\u099b\u099c\u0005\u000f\u0000\u0000\u099c\u09b0\u0003\u0184\u00c2\t\u099d"+
		"\u099e\n\u0007\u0000\u0000\u099e\u099f\u0005\u0010\u0000\u0000\u099f\u09b0"+
		"\u0003\u0184\u00c2\b\u09a0\u09a1\n\u0006\u0000\u0000\u09a1\u09a2\u0005"+
		"\u0011\u0000\u0000\u09a2\u09b0\u0003\u0184\u00c2\u0007\u09a3\u09a4\n\u0005"+
		"\u0000\u0000\u09a4\u09a5\u0005\f\u0000\u0000\u09a5\u09b0\u0003\u0184\u00c2"+
		"\u0006\u09a6\u09a7\n\u0004\u0000\u0000\u09a7\u09a8\u0005\u000b\u0000\u0000"+
		"\u09a8\u09b0\u0003\u0184\u00c2\u0005\u09a9\u09aa\n\u0003\u0000\u0000\u09aa"+
		"\u09ab\u0005\u000e\u0000\u0000\u09ab\u09b0\u0003\u01ac\u00d6\u0000\u09ac"+
		"\u09ad\n\u0002\u0000\u0000\u09ad\u09ae\u0005\u000f\u0000\u0000\u09ae\u09b0"+
		"\u0003\u01ac\u00d6\u0000\u09af\u098b\u0001\u0000\u0000\u0000\u09af\u098e"+
		"\u0001\u0000\u0000\u0000\u09af\u0991\u0001\u0000\u0000\u0000\u09af\u0994"+
		"\u0001\u0000\u0000\u0000\u09af\u0997\u0001\u0000\u0000\u0000\u09af\u099a"+
		"\u0001\u0000\u0000\u0000\u09af\u099d\u0001\u0000\u0000\u0000\u09af\u09a0"+
		"\u0001\u0000\u0000\u0000\u09af\u09a3\u0001\u0000\u0000\u0000\u09af\u09a6"+
		"\u0001\u0000\u0000\u0000\u09af\u09a9\u0001\u0000\u0000\u0000\u09af\u09ac"+
		"\u0001\u0000\u0000\u0000\u09b0\u09b3\u0001\u0000\u0000\u0000\u09b1\u09af"+
		"\u0001\u0000\u0000\u0000\u09b1\u09b2\u0001\u0000\u0000\u0000\u09b2\u0185"+
		"\u0001\u0000\u0000\u0000\u09b3\u09b1\u0001\u0000\u0000\u0000\u09b4\u09b5"+
		"\u0006\u00c3\uffff\uffff\u0000\u09b5\u09d5\u0003\u0188\u00c4\u0000\u09b6"+
		"\u09d5\u0003\u0122\u0091\u0000\u09b7\u09d5\u0003\u0124\u0092\u0000\u09b8"+
		"\u09d5\u0003\u0152\u00a9\u0000\u09b9\u09d5\u0003\u0138\u009c\u0000\u09ba"+
		"\u09bb\u0007\u001d\u0000\u0000\u09bb\u09d5\u0003\u0186\u00c3\b\u09bc\u09bd"+
		"\u0005\u001e\u0000\u0000\u09bd\u09c2\u0003\u0176\u00bb\u0000\u09be\u09bf"+
		"\u0005$\u0000\u0000\u09bf\u09c1\u0003\u0176\u00bb\u0000\u09c0\u09be\u0001"+
		"\u0000\u0000\u0000\u09c1\u09c4\u0001\u0000\u0000\u0000\u09c2\u09c0\u0001"+
		"\u0000\u0000\u0000\u09c2\u09c3\u0001\u0000\u0000\u0000\u09c3\u09c5\u0001"+
		"\u0000\u0000\u0000\u09c4\u09c2\u0001\u0000\u0000\u0000\u09c5\u09c6\u0005"+
		"\u001f\u0000\u0000\u09c6\u09d5\u0001\u0000\u0000\u0000\u09c7\u09c9\u0005"+
		"j\u0000\u0000\u09c8\u09c7\u0001\u0000\u0000\u0000\u09c8\u09c9\u0001\u0000"+
		"\u0000\u0000\u09c9\u09ca\u0001\u0000\u0000\u0000\u09ca\u09d5\u0003\u0108"+
		"\u0084\u0000\u09cb\u09cc\u0005 \u0000\u0000\u09cc\u09cd\u0003\u0134\u009a"+
		"\u0000\u09cd\u09ce\u0003\u0176\u00bb\u0000\u09ce\u09cf\u0005!\u0000\u0000"+
		"\u09cf\u09d5\u0001\u0000\u0000\u0000\u09d0\u09d5\u0003\u01a4\u00d2\u0000"+
		"\u09d1\u09d5\u0003\u01a6\u00d3\u0000\u09d2\u09d5\u0003\u01ac\u00d6\u0000"+
		"\u09d3\u09d5\u0003\u01a2\u00d1\u0000\u09d4\u09b4\u0001\u0000\u0000\u0000"+
		"\u09d4\u09b6\u0001\u0000\u0000\u0000\u09d4\u09b7\u0001\u0000\u0000\u0000"+
		"\u09d4\u09b8\u0001\u0000\u0000\u0000\u09d4\u09b9\u0001\u0000\u0000\u0000"+
		"\u09d4\u09ba\u0001\u0000\u0000\u0000\u09d4\u09bc\u0001\u0000\u0000\u0000"+
		"\u09d4\u09c8\u0001\u0000\u0000\u0000\u09d4\u09cb\u0001\u0000\u0000\u0000"+
		"\u09d4\u09d0\u0001\u0000\u0000\u0000\u09d4\u09d1\u0001\u0000\u0000\u0000"+
		"\u09d4\u09d2\u0001\u0000\u0000\u0000\u09d4\u09d3\u0001\u0000\u0000\u0000"+
		"\u09d5\u09de\u0001\u0000\u0000\u0000\u09d6\u09d7\n\n\u0000\u0000\u09d7"+
		"\u09da\u0005\u00ef\u0000\u0000\u09d8\u09db\u0005\u019f\u0000\u0000\u09d9"+
		"\u09db\u0003\u0134\u009a\u0000\u09da\u09d8\u0001\u0000\u0000\u0000\u09da"+
		"\u09d9\u0001\u0000\u0000\u0000\u09db\u09dd\u0001\u0000\u0000\u0000\u09dc"+
		"\u09d6\u0001\u0000\u0000\u0000\u09dd\u09e0\u0001\u0000\u0000\u0000\u09de"+
		"\u09dc\u0001\u0000\u0000\u0000\u09de\u09df\u0001\u0000\u0000\u0000\u09df"+
		"\u0187\u0001\u0000\u0000\u0000\u09e0\u09de\u0001\u0000\u0000\u0000\u09e1"+
		"\u09e5\u0003\u018a\u00c5\u0000\u09e2\u09e5\u0003\u0190\u00c8\u0000\u09e3"+
		"\u09e5\u0003\u019e\u00cf\u0000\u09e4\u09e1\u0001\u0000\u0000\u0000\u09e4"+
		"\u09e2\u0001\u0000\u0000\u0000\u09e4\u09e3\u0001\u0000\u0000\u0000\u09e5"+
		"\u0189\u0001\u0000\u0000\u0000\u09e6\u09e7\u0003\u018c\u00c6\u0000\u09e7"+
		"\u09e9\u0005\u001e\u0000\u0000\u09e8\u09ea\u0003\u018e\u00c7\u0000\u09e9"+
		"\u09e8\u0001\u0000\u0000\u0000\u09e9\u09ea\u0001\u0000\u0000\u0000\u09ea"+
		"\u09f4\u0001\u0000\u0000\u0000\u09eb\u09f0\u0003\u0176\u00bb\u0000\u09ec"+
		"\u09ed\u0005$\u0000\u0000\u09ed\u09ef\u0003\u0176\u00bb\u0000\u09ee\u09ec"+
		"\u0001\u0000\u0000\u0000\u09ef\u09f2\u0001\u0000\u0000\u0000\u09f0\u09ee"+
		"\u0001\u0000\u0000\u0000\u09f0\u09f1\u0001\u0000\u0000\u0000\u09f1\u09f5"+
		"\u0001\u0000\u0000\u0000\u09f2\u09f0\u0001\u0000\u0000\u0000\u09f3\u09f5"+
		"\u0005\u0010\u0000\u0000\u09f4\u09eb\u0001\u0000\u0000\u0000\u09f4\u09f3"+
		"\u0001\u0000\u0000\u0000\u09f4\u09f5\u0001\u0000\u0000\u0000\u09f5\u09f6"+
		"\u0001\u0000\u0000\u0000\u09f6\u09f8\u0005\u001f\u0000\u0000\u09f7\u09f9"+
		"\u0003\u01d2\u00e9\u0000\u09f8\u09f7\u0001\u0000\u0000\u0000\u09f8\u09f9"+
		"\u0001\u0000\u0000\u0000\u09f9\u018b\u0001\u0000\u0000\u0000\u09fa\u09fb"+
		"\u0007\u001e\u0000\u0000\u09fb\u018d\u0001\u0000\u0000\u0000\u09fc\u09fd"+
		"\u0005K\u0000\u0000\u09fd\u018f\u0001\u0000\u0000\u0000\u09fe\u0a06\u0003"+
		"\u0192\u00c9\u0000\u09ff\u0a06\u0003\u0194\u00ca\u0000\u0a00\u0a06\u0003"+
		"\u0196\u00cb\u0000\u0a01\u0a06\u0003\u0198\u00cc\u0000\u0a02\u0a06\u0003"+
		"\u019a\u00cd\u0000\u0a03\u0a06\u0003\u019c\u00ce\u0000\u0a04\u0a06\u0003"+
		"\u01d0\u00e8\u0000\u0a05\u09fe\u0001\u0000\u0000\u0000\u0a05\u09ff\u0001"+
		"\u0000\u0000\u0000\u0a05\u0a00\u0001\u0000\u0000\u0000\u0a05\u0a01\u0001"+
		"\u0000\u0000\u0000\u0a05\u0a02\u0001\u0000\u0000\u0000\u0a05\u0a03\u0001"+
		"\u0000\u0000\u0000\u0a05\u0a04\u0001\u0000\u0000\u0000\u0a06\u0191\u0001"+
		"\u0000\u0000\u0000\u0a07\u0a08\u0005N\u0000\u0000\u0a08\u0a0b\u0005\u001e"+
		"\u0000\u0000\u0a09\u0a0c\u0003\u0176\u00bb\u0000\u0a0a\u0a0c\u0005g\u0000"+
		"\u0000\u0a0b\u0a09\u0001\u0000\u0000\u0000\u0a0b\u0a0a\u0001\u0000\u0000"+
		"\u0000\u0a0c\u0a0d\u0001\u0000\u0000\u0000\u0a0d\u0a0e\u0005\\\u0000\u0000"+
		"\u0a0e\u0a0f\u0003\u01c2\u00e1\u0000\u0a0f\u0a10\u0005\u001f\u0000\u0000"+
		"\u0a10\u0193\u0001\u0000\u0000\u0000\u0a11\u0a12\u0005\u00f4\u0000\u0000"+
		"\u0a12\u0a13\u0005\u001e\u0000\u0000\u0a13\u0a14\u0003\u0176\u00bb\u0000"+
		"\u0a14\u0a15\u0005Z\u0000\u0000\u0a15\u0a16\u0003\u0134\u009a\u0000\u0a16"+
		"\u0a17\u0005\u001f\u0000\u0000\u0a17\u0195\u0001\u0000\u0000\u0000\u0a18"+
		"\u0a19\u0005A\u0000\u0000\u0a19\u0a1a\u0005\u001e\u0000\u0000\u0a1a\u0a1b"+
		"\u0003\u0176\u00bb\u0000\u0a1b\u0a1c\u0005l\u0000\u0000\u0a1c\u0a1d\u0003"+
		"\u0176\u00bb\u0000\u0a1d\u0a1e\u0005\u001f\u0000\u0000\u0a1e\u0197\u0001"+
		"\u0000\u0000\u0000\u0a1f\u0a20\u0005P\u0000\u0000\u0a20\u0a21\u0005\u001e"+
		"\u0000\u0000\u0a21\u0a22\u0003\u0176\u00bb\u0000\u0a22\u0a23\u0005Q\u0000"+
		"\u0000\u0a23\u0a26\u0005\u01a0\u0000\u0000\u0a24\u0a25\u0005a\u0000\u0000"+
		"\u0a25\u0a27\u0005\u01a0\u0000\u0000\u0a26\u0a24\u0001\u0000\u0000\u0000"+
		"\u0a26\u0a27\u0001\u0000\u0000\u0000\u0a27\u0a28\u0001\u0000\u0000\u0000"+
		"\u0a28\u0a29\u0005\u001f\u0000\u0000\u0a29\u0199\u0001\u0000\u0000\u0000"+
		"\u0a2a\u0a2b\u0005\u010c\u0000\u0000\u0a2b\u0a2c\u0005\u001e\u0000\u0000"+
		"\u0a2c\u0a2d\u0003\u0134\u009a\u0000\u0a2d\u0a2e\u0005Q\u0000\u0000\u0a2e"+
		"\u0a2f\u0003\u0176\u00bb\u0000\u0a2f\u0a30\u0005\u001f\u0000\u0000\u0a30"+
		"\u019b\u0001\u0000\u0000\u0000\u0a31\u0a32\u0005O\u0000\u0000\u0a32\u0a38"+
		"\u0005\u001e\u0000\u0000\u0a33\u0a35\u0007\u001f\u0000\u0000\u0a34\u0a36"+
		"\u0003\u0176\u00bb\u0000\u0a35\u0a34\u0001\u0000\u0000\u0000\u0a35\u0a36"+
		"\u0001\u0000\u0000\u0000\u0a36\u0a37\u0001\u0000\u0000\u0000\u0a37\u0a39"+
		"\u0005Q\u0000\u0000\u0a38\u0a33\u0001\u0000\u0000\u0000\u0a38\u0a39\u0001"+
		"\u0000\u0000\u0000\u0a39\u0a3a\u0001\u0000\u0000\u0000\u0a3a\u0a3b\u0003"+
		"\u0176\u00bb\u0000\u0a3b\u0a3c\u0005\u001f\u0000\u0000\u0a3c\u0a48\u0001"+
		"\u0000\u0000\u0000\u0a3d\u0a3e\u0005O\u0000\u0000\u0a3e\u0a42\u0005\u001e"+
		"\u0000\u0000\u0a3f\u0a40\u0003\u0176\u00bb\u0000\u0a40\u0a41\u0005Q\u0000"+
		"\u0000\u0a41\u0a43\u0001\u0000\u0000\u0000\u0a42\u0a3f\u0001\u0000\u0000"+
		"\u0000\u0a42\u0a43\u0001\u0000\u0000\u0000\u0a43\u0a44\u0001\u0000\u0000"+
		"\u0000\u0a44\u0a45\u0003\u0176\u00bb\u0000\u0a45\u0a46\u0005\u001f\u0000"+
		"\u0000\u0a46\u0a48\u0001\u0000\u0000\u0000\u0a47\u0a31\u0001\u0000\u0000"+
		"\u0000\u0a47\u0a3d\u0001\u0000\u0000\u0000\u0a48\u019d\u0001\u0000\u0000"+
		"\u0000\u0a49\u0a4a\u0003\u01a0\u00d0\u0000\u0a4a\u0a54\u0005\u001e\u0000"+
		"\u0000\u0a4b\u0a50\u0003\u0176\u00bb\u0000\u0a4c\u0a4d\u0005$\u0000\u0000"+
		"\u0a4d\u0a4f\u0003\u0176\u00bb\u0000\u0a4e\u0a4c\u0001\u0000\u0000\u0000"+
		"\u0a4f\u0a52\u0001\u0000\u0000\u0000\u0a50\u0a4e\u0001\u0000\u0000\u0000"+
		"\u0a50\u0a51\u0001\u0000\u0000\u0000\u0a51\u0a55\u0001\u0000\u0000\u0000"+
		"\u0a52\u0a50\u0001\u0000\u0000\u0000\u0a53\u0a55\u0005\u0010\u0000\u0000"+
		"\u0a54\u0a4b\u0001\u0000\u0000\u0000\u0a54\u0a53\u0001\u0000\u0000\u0000"+
		"\u0a54\u0a55\u0001\u0000\u0000\u0000\u0a55\u0a56\u0001\u0000\u0000\u0000"+
		"\u0a56\u0a57\u0005\u001f\u0000\u0000\u0a57\u019f\u0001\u0000\u0000\u0000"+
		"\u0a58\u0a64\u0003\u0134\u009a\u0000\u0a59\u0a64\u0005^\u0000\u0000\u0a5a"+
		"\u0a64\u0005\u0081\u0000\u0000\u0a5b\u0a64\u0005\u00eb\u0000\u0000\u0a5c"+
		"\u0a64\u0005\u00ec\u0000\u0000\u0a5d\u0a64\u0005\u00e7\u0000\u0000\u0a5e"+
		"\u0a64\u0005\u0128\u0000\u0000\u0a5f\u0a64\u0005\u014d\u0000\u0000\u0a60"+
		"\u0a64\u0005\u0120\u0000\u0000\u0a61\u0a64\u0005\u0126\u0000\u0000\u0a62"+
		"\u0a64\u0005\u00ee\u0000\u0000\u0a63\u0a58\u0001\u0000\u0000\u0000\u0a63"+
		"\u0a59\u0001\u0000\u0000\u0000\u0a63\u0a5a\u0001\u0000\u0000\u0000\u0a63"+
		"\u0a5b\u0001\u0000\u0000\u0000\u0a63\u0a5c\u0001\u0000\u0000\u0000\u0a63"+
		"\u0a5d\u0001\u0000\u0000\u0000\u0a63\u0a5e\u0001\u0000\u0000\u0000\u0a63"+
		"\u0a5f\u0001\u0000\u0000\u0000\u0a63\u0a60\u0001\u0000\u0000\u0000\u0a63"+
		"\u0a61\u0001\u0000\u0000\u0000\u0a63\u0a62\u0001\u0000\u0000\u0000\u0a64"+
		"\u01a1\u0001\u0000\u0000\u0000\u0a65\u0a66\u0007 \u0000\u0000\u0a66\u01a3"+
		"\u0001\u0000\u0000\u0000\u0a67\u0a68\u0003\u0124\u0092\u0000\u0a68\u0a6a"+
		"\u0005\u0121\u0000\u0000\u0a69\u0a6b\u0005>\u0000\u0000\u0a6a\u0a69\u0001"+
		"\u0000\u0000\u0000\u0a6a\u0a6b\u0001\u0000\u0000\u0000\u0a6b\u0a6c\u0001"+
		"\u0000\u0000\u0000\u0a6c\u0a6d\u0007!\u0000\u0000\u0a6d\u0a6e\u0003\u0108"+
		"\u0084\u0000\u0a6e\u01a5\u0001\u0000\u0000\u0000\u0a6f\u0a71\u0005L\u0000"+
		"\u0000\u0a70\u0a72\u0003\u0186\u00c3\u0000\u0a71\u0a70\u0001\u0000\u0000"+
		"\u0000\u0a71\u0a72\u0001\u0000\u0000\u0000\u0a72\u0a74\u0001\u0000\u0000"+
		"\u0000\u0a73\u0a75\u0003\u01a8\u00d4\u0000\u0a74\u0a73\u0001\u0000\u0000"+
		"\u0000\u0a75\u0a76\u0001\u0000\u0000\u0000\u0a76\u0a74\u0001\u0000\u0000"+
		"\u0000\u0a76\u0a77\u0001\u0000\u0000\u0000\u0a77\u0a79\u0001\u0000\u0000"+
		"\u0000\u0a78\u0a7a\u0003\u01aa\u00d5\u0000\u0a79\u0a78\u0001\u0000\u0000"+
		"\u0000\u0a79\u0a7a\u0001\u0000\u0000\u0000\u0a7a\u0a7b\u0001\u0000\u0000"+
		"\u0000\u0a7b\u0a7c\u0005\u0104\u0000\u0000\u0a7c\u01a7\u0001\u0000\u0000"+
		"\u0000\u0a7d\u0a7e\u0005M\u0000\u0000\u0a7e\u0a7f\u0003\u0176\u00bb\u0000"+
		"\u0a7f\u0a80\u0005`\u0000\u0000\u0a80\u0a81\u0003\u0176\u00bb\u0000\u0a81"+
		"\u01a9\u0001\u0000\u0000\u0000\u0a82\u0a83\u0005_\u0000\u0000\u0a83\u0a84"+
		"\u0003\u0176\u00bb\u0000\u0a84\u01ab\u0001\u0000\u0000\u0000\u0a85\u0a86"+
		"\u0005\u0081\u0000\u0000\u0a86\u0a87\u0003\u0176\u00bb\u0000\u0a87\u0a88"+
		"\u0003\u01ae\u00d7\u0000\u0a88\u01ad\u0001\u0000\u0000\u0000\u0a89\u0a8a"+
		"\u0007\"\u0000\u0000\u0a8a\u01af\u0001\u0000\u0000\u0000\u0a8b\u0a8c\u0005"+
		"p\u0000\u0000\u0a8c\u0a8d\u0005r\u0000\u0000\u0a8d\u0a92\u0003\u01b2\u00d9"+
		"\u0000\u0a8e\u0a8f\u0005$\u0000\u0000\u0a8f\u0a91\u0003\u01b2\u00d9\u0000"+
		"\u0a90\u0a8e\u0001\u0000\u0000\u0000\u0a91\u0a94\u0001\u0000\u0000\u0000"+
		"\u0a92\u0a90\u0001\u0000\u0000\u0000\u0a92\u0a93\u0001\u0000\u0000\u0000"+
		"\u0a93\u0a96\u0001\u0000\u0000\u0000\u0a94\u0a92\u0001\u0000\u0000\u0000"+
		"\u0a95\u0a97\u0003\u01b4\u00da\u0000\u0a96\u0a95\u0001\u0000\u0000\u0000"+
		"\u0a96\u0a97\u0001\u0000\u0000\u0000\u0a97\u01b1\u0001\u0000\u0000\u0000"+
		"\u0a98\u0a9b\u0003\u0152\u00a9\u0000\u0a99\u0a9b\u0003\u0128\u0094\u0000"+
		"\u0a9a\u0a98\u0001\u0000\u0000\u0000\u0a9a\u0a99\u0001\u0000\u0000\u0000"+
		"\u0a9b\u0a9d\u0001\u0000\u0000\u0000\u0a9c\u0a9e\u0007#\u0000\u0000\u0a9d"+
		"\u0a9c\u0001\u0000\u0000\u0000\u0a9d\u0a9e\u0001\u0000\u0000\u0000\u0a9e"+
		"\u01b3\u0001\u0000\u0000\u0000\u0a9f\u0aa2\u0003\u01b6\u00db\u0000\u0aa0"+
		"\u0aa2\u0003\u01b8\u00dc\u0000\u0aa1\u0a9f\u0001\u0000\u0000\u0000\u0aa1"+
		"\u0aa0\u0001\u0000\u0000\u0000\u0aa2\u01b5\u0001\u0000\u0000\u0000\u0aa3"+
		"\u0aa4\u0005\u0138\u0000\u0000\u0aa4\u0aa7\u0003\u0176\u00bb\u0000\u0aa5"+
		"\u0aa6\u0005b\u0000\u0000\u0aa6\u0aa8\u0003\u0176\u00bb\u0000\u0aa7\u0aa5"+
		"\u0001\u0000\u0000\u0000\u0aa7\u0aa8\u0001\u0000\u0000\u0000\u0aa8\u01b7"+
		"\u0001\u0000\u0000\u0000\u0aa9\u0aaf\u0003\u01ba\u00dd\u0000\u0aaa\u0aaf"+
		"\u0003\u01bc\u00de\u0000\u0aab\u0aac\u0003\u01ba\u00dd\u0000\u0aac\u0aad"+
		"\u0003\u01bc\u00de\u0000\u0aad\u0aaf\u0001\u0000\u0000\u0000\u0aae\u0aa9"+
		"\u0001\u0000\u0000\u0000\u0aae\u0aaa\u0001\u0000\u0000\u0000\u0aae\u0aab"+
		"\u0001\u0000\u0000\u0000\u0aaf\u01b9\u0001\u0000\u0000\u0000\u0ab0\u0ab1"+
		"\u0005w\u0000\u0000\u0ab1\u0ab2\u0003\u01c0\u00e0\u0000\u0ab2\u0ab3\u0007"+
		"$\u0000\u0000\u0ab3\u01bb\u0001\u0000\u0000\u0000\u0ab4\u0ab5\u0005\u010d"+
		"\u0000\u0000\u0ab5\u0ab6\u0007%\u0000\u0000\u0ab6\u0ab7\u0003\u01be\u00df"+
		"\u0000\u0ab7\u0ab8\u0007$\u0000\u0000\u0ab8\u0ab9\u0005\u012a\u0000\u0000"+
		"\u0ab9\u01bd\u0001\u0000\u0000\u0000\u0aba\u0abe\u0003\u0128\u0094\u0000"+
		"\u0abb\u0abe\u0003\u0122\u0091\u0000\u0abc\u0abe\u0003\u01e8\u00f4\u0000"+
		"\u0abd\u0aba\u0001\u0000\u0000\u0000\u0abd\u0abb\u0001\u0000\u0000\u0000"+
		"\u0abd\u0abc\u0001\u0000\u0000\u0000\u0abe\u01bf\u0001\u0000\u0000\u0000"+
		"\u0abf\u0ac3\u0003\u0128\u0094\u0000\u0ac0\u0ac3\u0003\u0122\u0091\u0000"+
		"\u0ac1\u0ac3\u0003\u01e8\u00f4\u0000\u0ac2\u0abf\u0001\u0000\u0000\u0000"+
		"\u0ac2\u0ac0\u0001\u0000\u0000\u0000\u0ac2\u0ac1\u0001\u0000\u0000\u0000"+
		"\u0ac3\u01c1\u0001\u0000\u0000\u0000\u0ac4\u0ac6\u0003\u01c4\u00e2\u0000"+
		"\u0ac5\u0ac7\u0003\u01c6\u00e3\u0000\u0ac6\u0ac5\u0001\u0000\u0000\u0000"+
		"\u0ac6\u0ac7\u0001\u0000\u0000\u0000\u0ac7\u0ac9\u0001\u0000\u0000\u0000"+
		"\u0ac8\u0aca\u0003\u01c8\u00e4\u0000\u0ac9\u0ac8\u0001\u0000\u0000\u0000"+
		"\u0ac9\u0aca\u0001\u0000\u0000\u0000\u0aca\u0acc\u0001\u0000\u0000\u0000"+
		"\u0acb\u0acd\u0003\u01ca\u00e5\u0000\u0acc\u0acb\u0001\u0000\u0000\u0000"+
		"\u0acc\u0acd\u0001\u0000\u0000\u0000\u0acd\u0af3\u0001\u0000\u0000\u0000"+
		"\u0ace\u0acf\u0003\u01c4\u00e2\u0000\u0acf\u0ad0\u0005\u001e\u0000\u0000"+
		"\u0ad0\u0ad5\u0005\u019f\u0000\u0000\u0ad1\u0ad2\u0005$\u0000\u0000\u0ad2"+
		"\u0ad4\u0005\u019f\u0000\u0000\u0ad3\u0ad1\u0001\u0000\u0000\u0000\u0ad4"+
		"\u0ad7\u0001\u0000\u0000\u0000\u0ad5\u0ad3\u0001\u0000\u0000\u0000\u0ad5"+
		"\u0ad6\u0001\u0000\u0000\u0000\u0ad6\u0ad8\u0001\u0000\u0000\u0000\u0ad7"+
		"\u0ad5\u0001\u0000\u0000\u0000\u0ad8\u0ada\u0005\u001f\u0000\u0000\u0ad9"+
		"\u0adb\u0003\u01c8\u00e4\u0000\u0ada\u0ad9\u0001\u0000\u0000\u0000\u0ada"+
		"\u0adb\u0001\u0000\u0000\u0000\u0adb\u0add\u0001\u0000\u0000\u0000\u0adc"+
		"\u0ade\u0003\u01ca\u00e5\u0000\u0add\u0adc\u0001\u0000\u0000\u0000\u0add"+
		"\u0ade\u0001\u0000\u0000\u0000\u0ade\u0af3\u0001\u0000\u0000\u0000\u0adf"+
		"\u0ae0\u0003\u01c4\u00e2\u0000\u0ae0\u0aee\u0005\"\u0000\u0000\u0ae1\u0ae3"+
		"\u0005\u01a0\u0000\u0000\u0ae2\u0ae1\u0001\u0000\u0000\u0000\u0ae2\u0ae3"+
		"\u0001\u0000\u0000\u0000\u0ae3\u0ae4\u0001\u0000\u0000\u0000\u0ae4\u0ae5"+
		"\u0005\r\u0000\u0000\u0ae5\u0aef\u0005\u00cf\u0000\u0000\u0ae6\u0aeb\u0005"+
		"\u01a0\u0000\u0000\u0ae7\u0ae8\u0005$\u0000\u0000\u0ae8\u0aea\u0005\u01a0"+
		"\u0000\u0000\u0ae9\u0ae7\u0001\u0000\u0000\u0000\u0aea\u0aed\u0001\u0000"+
		"\u0000\u0000\u0aeb\u0ae9\u0001\u0000\u0000\u0000\u0aeb\u0aec\u0001\u0000"+
		"\u0000\u0000\u0aec\u0aef\u0001\u0000\u0000\u0000\u0aed\u0aeb\u0001\u0000"+
		"\u0000\u0000\u0aee\u0ae2\u0001\u0000\u0000\u0000\u0aee\u0ae6\u0001\u0000"+
		"\u0000\u0000\u0aef\u0af0\u0001\u0000\u0000\u0000\u0af0\u0af1\u0005#\u0000"+
		"\u0000\u0af1\u0af3\u0001\u0000\u0000\u0000\u0af2\u0ac4\u0001\u0000\u0000"+
		"\u0000\u0af2\u0ace\u0001\u0000\u0000\u0000\u0af2\u0adf\u0001\u0000\u0000"+
		"\u0000\u0af3\u01c3\u0001\u0000\u0000\u0000\u0af4\u0b21\u0005\u007f\u0000"+
		"\u0000\u0af5\u0af6\u0005\u007f\u0000\u0000\u0af6\u0b21\u0005\u0151\u0000"+
		"\u0000\u0af7\u0af8\u0005~\u0000\u0000\u0af8\u0b21\u0005\u0151\u0000\u0000"+
		"\u0af9\u0afa\u0005\u0123\u0000\u0000\u0afa\u0b21\u0005\u007f\u0000\u0000"+
		"\u0afb\u0afc\u0005\u0123\u0000\u0000\u0afc\u0afd\u0005\u007f\u0000\u0000"+
		"\u0afd\u0b21\u0005\u0151\u0000\u0000\u0afe\u0b21\u0005~\u0000\u0000\u0aff"+
		"\u0b21\u0005\u00ac\u0000\u0000\u0b00\u0b21\u0005\u0124\u0000\u0000\u0b01"+
		"\u0b02\u0005\u0123\u0000\u0000\u0b02\u0b21\u0005~\u0000\u0000\u0b03\u0b04"+
		"\u0005\u0123\u0000\u0000\u0b04\u0b05\u0005~\u0000\u0000\u0b05\u0b21\u0005"+
		"\u0151\u0000\u0000\u0b06\u0b21\u0005\u00e6\u0000\u0000\u0b07\u0b08\u0005"+
		"\u00e6\u0000\u0000\u0b08\u0b21\u0005\u0151\u0000\u0000\u0b09\u0b21\u0005"+
		"\u0127\u0000\u0000\u0b0a\u0b21\u0005\u00aa\u0000\u0000\u0b0b\u0b21\u0005"+
		"\u00fb\u0000\u0000\u0b0c\u0b21\u0005\u00a8\u0000\u0000\u0b0d\u0b21\u0005"+
		"\u013e\u0000\u0000\u0b0e\u0b21\u0005|\u0000\u0000\u0b0f\u0b21\u0005\u00ad"+
		"\u0000\u0000\u0b10\u0b21\u0005\u00a9\u0000\u0000\u0b11\u0b12\u0005}\u0000"+
		"\u0000\u0b12\u0b21\u0005B\u0000\u0000\u0b13\u0b21\u0005\u0082\u0000\u0000"+
		"\u0b14\u0b21\u0005\u0083\u0000\u0000\u0b15\u0b21\u0005\u0084\u0000\u0000"+
		"\u0b16\u0b21\u0005\u0081\u0000\u0000\u0b17\u0b18\u0005\u0083\u0000\u0000"+
		"\u0b18\u0b19\u0005I\u0000\u0000\u0b19\u0b1a\u0005\u0083\u0000\u0000\u0b1a"+
		"\u0b21\u0005\u0155\u0000\u0000\u0b1b\u0b1c\u0005\u0084\u0000\u0000\u0b1c"+
		"\u0b1d\u0005I\u0000\u0000\u0b1d\u0b1e\u0005\u0083\u0000\u0000\u0b1e\u0b21"+
		"\u0005\u0155\u0000\u0000\u0b1f\u0b21\u0003\u0134\u009a\u0000\u0b20\u0af4"+
		"\u0001\u0000\u0000\u0000\u0b20\u0af5\u0001\u0000\u0000\u0000\u0b20\u0af7"+
		"\u0001\u0000\u0000\u0000\u0b20\u0af9\u0001\u0000\u0000\u0000\u0b20\u0afb"+
		"\u0001\u0000\u0000\u0000\u0b20\u0afe\u0001\u0000\u0000\u0000\u0b20\u0aff"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b00\u0001\u0000\u0000\u0000\u0b20\u0b01"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b03\u0001\u0000\u0000\u0000\u0b20\u0b06"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b07\u0001\u0000\u0000\u0000\u0b20\u0b09"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b0a\u0001\u0000\u0000\u0000\u0b20\u0b0b"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b0c\u0001\u0000\u0000\u0000\u0b20\u0b0d"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b0e\u0001\u0000\u0000\u0000\u0b20\u0b0f"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b10\u0001\u0000\u0000\u0000\u0b20\u0b11"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b13\u0001\u0000\u0000\u0000\u0b20\u0b14"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b15\u0001\u0000\u0000\u0000\u0b20\u0b16"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b17\u0001\u0000\u0000\u0000\u0b20\u0b1b"+
		"\u0001\u0000\u0000\u0000\u0b20\u0b1f\u0001\u0000\u0000\u0000\u0b21\u01c5"+
		"\u0001\u0000\u0000\u0000\u0b22\u0b23\u0005\u001e\u0000\u0000\u0b23\u0b26"+
		"\u0005\u01a0\u0000\u0000\u0b24\u0b25\u0005$\u0000\u0000\u0b25\u0b27\u0005"+
		"\u01a0\u0000\u0000\u0b26\u0b24\u0001\u0000\u0000\u0000\u0b26\u0b27\u0001"+
		"\u0000\u0000\u0000\u0b27\u0b28\u0001\u0000\u0000\u0000\u0b28\u0b29\u0005"+
		"\u001f\u0000\u0000\u0b29\u01c7\u0001\u0000\u0000\u0000\u0b2a\u0b2b\u0007"+
		"&\u0000\u0000\u0b2b\u0b2d\u00058\u0000\u0000\u0b2c\u0b2e\u0005\u0017\u0000"+
		"\u0000\u0b2d\u0b2c\u0001\u0000\u0000\u0000\u0b2d\u0b2e\u0001\u0000\u0000"+
		"\u0000\u0b2e\u0b2f\u0001\u0000\u0000\u0000\u0b2f\u0b30\u0003\u01cc\u00e6"+
		"\u0000\u0b30\u01c9\u0001\u0000\u0000\u0000\u0b31\u0b33\u0005\u00ef\u0000"+
		"\u0000\u0b32\u0b34\u0005\u0017\u0000\u0000\u0b33\u0b32\u0001\u0000\u0000"+
		"\u0000\u0b33\u0b34\u0001\u0000\u0000\u0000\u0b34\u0b37\u0001\u0000\u0000"+
		"\u0000\u0b35\u0b38\u0005\u019f\u0000\u0000\u0b36\u0b38\u0003\u01cc\u00e6"+
		"\u0000\u0b37\u0b35\u0001\u0000\u0000\u0000\u0b37\u0b36\u0001\u0000\u0000"+
		"\u0000\u0b38\u01cb\u0001\u0000\u0000\u0000\u0b39\u0b3c\u0003\u0134\u009a"+
		"\u0000\u0b3a\u0b3b\u0005\u0013\u0000\u0000\u0b3b\u0b3d\u0003\u0134\u009a"+
		"\u0000\u0b3c\u0b3a\u0001\u0000\u0000\u0000\u0b3c\u0b3d\u0001\u0000\u0000"+
		"\u0000\u0b3d\u01cd\u0001\u0000\u0000\u0000\u0b3e\u0b40\u0007\'\u0000\u0000"+
		"\u0b3f\u0b3e\u0001\u0000\u0000\u0000\u0b3f\u0b40\u0001\u0000\u0000\u0000"+
		"\u0b40\u01cf\u0001\u0000\u0000\u0000\u0b41\u0b42\u0007(\u0000\u0000\u0b42"+
		"\u0b4c\u0005\u001e\u0000\u0000\u0b43\u0b48\u0003\u0176\u00bb\u0000\u0b44"+
		"\u0b45\u0005$\u0000\u0000\u0b45\u0b47\u0003\u0176\u00bb\u0000\u0b46\u0b44"+
		"\u0001\u0000\u0000\u0000\u0b47\u0b4a\u0001\u0000\u0000\u0000\u0b48\u0b46"+
		"\u0001\u0000\u0000\u0000\u0b48\u0b49\u0001\u0000\u0000\u0000\u0b49\u0b4d"+
		"\u0001\u0000\u0000\u0000\u0b4a\u0b48\u0001\u0000\u0000\u0000\u0b4b\u0b4d"+
		"\u0005\u0010\u0000\u0000\u0b4c\u0b43\u0001\u0000\u0000\u0000\u0b4c\u0b4b"+
		"\u0001\u0000\u0000\u0000\u0b4c\u0b4d\u0001\u0000\u0000\u0000\u0b4d\u0b4e"+
		"\u0001\u0000\u0000\u0000\u0b4e\u0b50\u0005\u001f\u0000\u0000\u0b4f\u0b51"+
		"\u0003\u01d2\u00e9\u0000\u0b50\u0b4f\u0001\u0000\u0000\u0000\u0b50\u0b51"+
		"\u0001\u0000\u0000\u0000\u0b51\u0b64\u0001\u0000\u0000\u0000\u0b52\u0b53"+
		"\u0007)\u0000\u0000\u0b53\u0b5d\u0005\u001e\u0000\u0000\u0b54\u0b59\u0003"+
		"\u0176\u00bb\u0000\u0b55\u0b56\u0005$\u0000\u0000\u0b56\u0b58\u0003\u0176"+
		"\u00bb\u0000\u0b57\u0b55\u0001\u0000\u0000\u0000\u0b58\u0b5b\u0001\u0000"+
		"\u0000\u0000\u0b59\u0b57\u0001\u0000\u0000\u0000\u0b59\u0b5a\u0001\u0000"+
		"\u0000\u0000\u0b5a\u0b5e\u0001\u0000\u0000\u0000\u0b5b\u0b59\u0001\u0000"+
		"\u0000\u0000\u0b5c\u0b5e\u0005\u0010\u0000\u0000\u0b5d\u0b54\u0001\u0000"+
		"\u0000\u0000\u0b5d\u0b5c\u0001\u0000\u0000\u0000\u0b5d\u0b5e\u0001\u0000"+
		"\u0000\u0000\u0b5e\u0b5f\u0001\u0000\u0000\u0000\u0b5f\u0b61\u0005\u001f"+
		"\u0000\u0000\u0b60\u0b62\u0003\u01d2\u00e9\u0000\u0b61\u0b60\u0001\u0000"+
		"\u0000\u0000\u0b61\u0b62\u0001\u0000\u0000\u0000\u0b62\u0b64\u0001\u0000"+
		"\u0000\u0000\u0b63\u0b41\u0001\u0000\u0000\u0000\u0b63\u0b52\u0001\u0000"+
		"\u0000\u0000\u0b64\u01d1\u0001\u0000\u0000\u0000\u0b65\u0b66\u0005\u016d"+
		"\u0000\u0000\u0b66\u0b71\u0005\u001e\u0000\u0000\u0b67\u0b68\u0005\u016c"+
		"\u0000\u0000\u0b68\u0b69\u0005r\u0000\u0000\u0b69\u0b6e\u0003\u0176\u00bb"+
		"\u0000\u0b6a\u0b6b\u0005$\u0000\u0000\u0b6b\u0b6d\u0003\u0176\u00bb\u0000"+
		"\u0b6c\u0b6a\u0001\u0000\u0000\u0000\u0b6d\u0b70\u0001\u0000\u0000\u0000"+
		"\u0b6e\u0b6c\u0001\u0000\u0000\u0000\u0b6e\u0b6f\u0001\u0000\u0000\u0000"+
		"\u0b6f\u0b72\u0001\u0000\u0000\u0000\u0b70\u0b6e\u0001\u0000\u0000\u0000"+
		"\u0b71\u0b67\u0001\u0000\u0000\u0000\u0b71\u0b72\u0001\u0000\u0000\u0000"+
		"\u0b72\u0b74\u0001\u0000\u0000\u0000\u0b73\u0b75\u0003\u01b0\u00d8\u0000"+
		"\u0b74\u0b73\u0001\u0000\u0000\u0000\u0b74\u0b75\u0001\u0000\u0000\u0000"+
		"\u0b75\u0b76\u0001\u0000\u0000\u0000\u0b76\u0b77\u0005\u001f\u0000\u0000"+
		"\u0b77\u01d3\u0001\u0000\u0000\u0000\u0b78\u0b79\u0005&\u0000\u0000\u0b79"+
		"\u0b7a\u0003\u01d6\u00eb\u0000\u0b7a\u0b7b\u0005\u0017\u0000\u0000\u0b7b"+
		"\u0b7c\u0007*\u0000\u0000\u0b7c\u0b7d\u0005&\u0000\u0000\u0b7d\u01d5\u0001"+
		"\u0000\u0000\u0000\u0b7e\u0b7f\u0007+\u0000\u0000\u0b7f\u01d7\u0001\u0000"+
		"\u0000\u0000\u0b80\u0b84\u0003\u0124\u0092\u0000\u0b81\u0b84\u0005g\u0000"+
		"\u0000\u0b82\u0b84\u0003\u01da\u00ed\u0000\u0b83\u0b80\u0001\u0000\u0000"+
		"\u0000\u0b83\u0b81\u0001\u0000\u0000\u0000\u0b83\u0b82\u0001\u0000\u0000"+
		"\u0000\u0b84\u01d9\u0001\u0000\u0000\u0000\u0b85\u0b86\u0007,\u0000\u0000"+
		"\u0b86\u01db\u0001\u0000\u0000\u0000\u0b87\u0b88\u0003\u015a\u00ad\u0000"+
		"\u0b88\u0b8b\u0003\u01e0\u00f0\u0000\u0b89\u0b8a\u0005f\u0000\u0000\u0b8a"+
		"\u0b8c\u0005g\u0000\u0000\u0b8b\u0b89\u0001\u0000\u0000\u0000\u0b8b\u0b8c"+
		"\u0001\u0000\u0000\u0000\u0b8c\u0b8e\u0001\u0000\u0000\u0000\u0b8d\u0b8f"+
		"\u0003\u01ca\u00e5\u0000\u0b8e\u0b8d\u0001\u0000\u0000\u0000\u0b8e\u0b8f"+
		"\u0001\u0000\u0000\u0000\u0b8f\u01dd\u0001\u0000\u0000\u0000\u0b90\u0b95"+
		"\u0003\u01dc\u00ee\u0000\u0b91\u0b92\u0005$\u0000\u0000\u0b92\u0b94\u0003"+
		"\u01dc\u00ee\u0000\u0b93\u0b91\u0001\u0000\u0000\u0000\u0b94\u0b97\u0001"+
		"\u0000\u0000\u0000\u0b95\u0b93\u0001\u0000\u0000\u0000\u0b95\u0b96\u0001"+
		"\u0000\u0000\u0000\u0b96\u01df\u0001\u0000\u0000\u0000\u0b97\u0b95\u0001"+
		"\u0000\u0000\u0000\u0b98\u0ba9\u0003\u01c2\u00e1\u0000\u0b99\u0b9a\u0005"+
		"\u00ab\u0000\u0000\u0b9a\u0b9c\u0005\u0129\u0000\u0000\u0b9b\u0b99\u0001"+
		"\u0000\u0000\u0000\u0b9b\u0b9c\u0001\u0000\u0000\u0000\u0b9c\u0b9d\u0001"+
		"\u0000\u0000\u0000\u0b9d\u0ba9\u0003\u0140\u00a0\u0000\u0b9e\u0b9f\u0005"+
		"\u00ab\u0000\u0000\u0b9f\u0ba0\u0005\u0129\u0000\u0000\u0ba0\u0ba3\u0005"+
		":\u0000\u0000\u0ba1\u0ba4\u0003\u0144\u00a2\u0000\u0ba2\u0ba4\u0003\u0154"+
		"\u00aa\u0000\u0ba3\u0ba1\u0001\u0000\u0000\u0000\u0ba3\u0ba2\u0001\u0000"+
		"\u0000\u0000\u0ba4\u0ba5\u0001\u0000\u0000\u0000\u0ba5\u0ba6\u0005\u0013"+
		"\u0000\u0000\u0ba6\u0ba7\u0003\u0152\u00a9\u0000\u0ba7\u0ba9\u0001\u0000"+
		"\u0000\u0000\u0ba8\u0b98\u0001\u0000\u0000\u0000\u0ba8\u0b9b\u0001\u0000"+
		"\u0000\u0000\u0ba8\u0b9e\u0001\u0000\u0000\u0000\u0ba9\u01e1\u0001\u0000"+
		"\u0000\u0000\u0baa\u0bab\u0005\u0017\u0000\u0000\u0bab\u0bac\u0003\u0168"+
		"\u00b4\u0000\u0bac\u0bad\u0005\u0005\u0000\u0000\u0bad\u0bb0\u0003\u0156"+
		"\u00ab\u0000\u0bae\u0baf\u0005\u0005\u0000\u0000\u0baf\u0bb1\u0003\u0160"+
		"\u00b0\u0000\u0bb0\u0bae\u0001\u0000\u0000\u0000\u0bb0\u0bb1\u0001\u0000"+
		"\u0000\u0000\u0bb1\u0bb2\u0001\u0000\u0000\u0000\u0bb2\u0bb3\u0005\u0017"+
		"\u0000\u0000\u0bb3\u01e3\u0001\u0000\u0000\u0000\u0bb4\u0bb5\u0007-\u0000"+
		"\u0000\u0bb5\u01e5\u0001\u0000\u0000\u0000\u0bb6\u0bb7\u0003\u014a\u00a5"+
		"\u0000\u0bb7\u0bb8\u0005\u0017\u0000\u0000\u0bb8\u0bb9\u0005\u019f\u0000"+
		"\u0000\u0bb9\u01e7\u0001\u0000\u0000\u0000\u0bba\u0bbb\u0005\r\u0000\u0000"+
		"\u0bbb\u0bbc\u0003\u0134\u009a\u0000\u0bbc\u01e9\u0001\u0000\u0000\u0000"+
		"\u0bbd\u0bbe\u00058\u0000\u0000\u0bbe\u0bbf\u0005\u0149\u0000\u0000\u0bbf"+
		"\u0bc0\u0005\u011b\u0000\u0000\u0bc0\u0bc1\u0005\u011f\u0000\u0000\u0bc1"+
		"\u0bc2\u0003\u01f0\u00f8\u0000\u0bc2\u01eb\u0001\u0000\u0000\u0000\u0bc3"+
		"\u0bc4\u0005y\u0000\u0000\u0bc4\u01ed\u0001\u0000\u0000\u0000\u0bc5\u0bc6"+
		"\u0005z\u0000\u0000\u0bc6\u01ef\u0001\u0000\u0000\u0000\u0bc7\u0bc8\u0005"+
		"\u0134\u0000\u0000\u0bc8\u0bcf\u0005\u00dd\u0000\u0000\u0bc9\u0bca\u0005"+
		"\u0134\u0000\u0000\u0bca\u0bcf\u0005\u00bc\u0000\u0000\u0bcb\u0bcc\u0005"+
		"\u00d2\u0000\u0000\u0bcc\u0bcf\u0005\u0134\u0000\u0000\u0bcd\u0bcf\u0005"+
		"\u00d9\u0000\u0000\u0bce\u0bc7\u0001\u0000\u0000\u0000\u0bce\u0bc9\u0001"+
		"\u0000\u0000\u0000\u0bce\u0bcb\u0001\u0000\u0000\u0000\u0bce\u0bcd\u0001"+
		"\u0000\u0000\u0000\u0bcf\u01f1\u0001\u0000\u0000\u0000\u0bd0\u0bd1\u0005"+
		"{\u0000\u0000\u0bd1\u0bd2\u0003\u013c\u009e\u0000\u0bd2\u01f3\u0001\u0000"+
		"\u0000\u0000\u0bd3\u0bd4\u00055\u0000\u0000\u0bd4\u0bd5\u0003\u01f8\u00fc"+
		"\u0000\u0bd5\u0bd6\u0005b\u0000\u0000\u0bd6\u0bdb\u0003\u01fe\u00ff\u0000"+
		"\u0bd7\u0bd8\u0005$\u0000\u0000\u0bd8\u0bda\u0003\u01fe\u00ff\u0000\u0bd9"+
		"\u0bd7\u0001\u0000\u0000\u0000\u0bda\u0bdd\u0001\u0000\u0000\u0000\u0bdb"+
		"\u0bd9\u0001\u0000\u0000\u0000\u0bdb\u0bdc\u0001\u0000\u0000\u0000\u0bdc"+
		"\u0be1\u0001\u0000\u0000\u0000\u0bdd\u0bdb\u0001\u0000\u0000\u0000\u0bde"+
		"\u0bdf\u0005I\u0000\u0000\u0bdf\u0be0\u00055\u0000\u0000\u0be0\u0be2\u0005"+
		"\u012b\u0000\u0000\u0be1\u0bde\u0001\u0000\u0000\u0000\u0be1\u0be2\u0001"+
		"\u0000\u0000\u0000\u0be2\u01f5\u0001\u0000\u0000\u0000\u0be3\u0be7\u0005"+
		"6\u0000\u0000\u0be4\u0be5\u00055\u0000\u0000\u0be5\u0be6\u0005\u012b\u0000"+
		"\u0000\u0be6\u0be8\u0005a\u0000\u0000\u0be7\u0be4\u0001\u0000\u0000\u0000"+
		"\u0be7\u0be8\u0001\u0000\u0000\u0000\u0be8\u0be9\u0001\u0000\u0000\u0000"+
		"\u0be9\u0bea\u0003\u01f8\u00fc\u0000\u0bea\u0beb\u0005Q\u0000\u0000\u0beb"+
		"\u0bf0\u0003\u01fe\u00ff\u0000\u0bec\u0bed\u0005$\u0000\u0000\u0bed\u0bef"+
		"\u0003\u01fe\u00ff\u0000\u0bee\u0bec\u0001\u0000\u0000\u0000\u0bef\u0bf2"+
		"\u0001\u0000\u0000\u0000\u0bf0\u0bee\u0001\u0000\u0000\u0000\u0bf0\u0bf1"+
		"\u0001\u0000\u0000\u0000\u0bf1\u0bf3\u0001\u0000\u0000\u0000\u0bf2\u0bf0"+
		"\u0001\u0000\u0000\u0000\u0bf3\u0bf4\u0003\u01ce\u00e7\u0000\u0bf4\u01f7"+
		"\u0001\u0000\u0000\u0000\u0bf5\u0bf6\u0003\u01fa\u00fd\u0000\u0bf6\u0bf7"+
		"\u0005]\u0000\u0000\u0bf7\u0bf8\u0003\u0200\u0100\u0000\u0bf8\u01f9\u0001"+
		"\u0000\u0000\u0000\u0bf9\u0bfe\u0003\u01fc\u00fe\u0000\u0bfa\u0bfb\u0005"+
		"$\u0000\u0000\u0bfb\u0bfd\u0003\u01fc\u00fe\u0000\u0bfc\u0bfa\u0001\u0000"+
		"\u0000\u0000\u0bfd\u0c00\u0001\u0000\u0000\u0000\u0bfe\u0bfc\u0001\u0000"+
		"\u0000\u0000\u0bfe\u0bff\u0001\u0000\u0000\u0000\u0bff\u01fb\u0001\u0000"+
		"\u0000\u0000\u0c00\u0bfe\u0001\u0000\u0000\u0000\u0c01\u0c02\u0005m\u0000"+
		"\u0000\u0c02\u0c0a\u0005\u0132\u0000\u0000\u0c03\u0c0a\u0005,\u0000\u0000"+
		"\u0c04\u0c0a\u0005/\u0000\u0000\u0c05\u0c0a\u0005-\u0000\u0000\u0c06\u0c0a"+
		"\u0005.\u0000\u0000\u0c07\u0c0a\u0005\u0135\u0000\u0000\u0c08\u0c0a\u0005"+
		"\u014e\u0000\u0000\u0c09\u0c01\u0001\u0000\u0000\u0000\u0c09\u0c03\u0001"+
		"\u0000\u0000\u0000\u0c09\u0c04\u0001\u0000\u0000\u0000\u0c09\u0c05\u0001"+
		"\u0000\u0000\u0000\u0c09\u0c06\u0001\u0000\u0000\u0000\u0c09\u0c07\u0001"+
		"\u0000\u0000\u0000\u0c09\u0c08\u0001\u0000\u0000\u0000\u0c0a\u01fd\u0001"+
		"\u0000\u0000\u0000\u0c0b\u0c0e\u0003\u0204\u0102\u0000\u0c0c\u0c0e\u0003"+
		"\u0206\u0103\u0000\u0c0d\u0c0b\u0001\u0000\u0000\u0000\u0c0d\u0c0c\u0001"+
		"\u0000\u0000\u0000\u0c0e\u01ff\u0001\u0000\u0000\u0000\u0c0f\u0c11\u0003"+
		"\u0202\u0101\u0000\u0c10\u0c0f\u0001\u0000\u0000\u0000\u0c10\u0c11\u0001"+
		"\u0000\u0000\u0000\u0c11\u0c12\u0001\u0000\u0000\u0000\u0c12\u0c13\u0003"+
		"\u0208\u0104\u0000\u0c13\u0201\u0001\u0000\u0000\u0000\u0c14\u0c23\u0005"+
		"9\u0000\u0000\u0c15\u0c23\u0005F\u0000\u0000\u0c16\u0c23\u0005E\u0000"+
		"\u0000\u0c17\u0c23\u0005C\u0000\u0000\u0c18\u0c23\u0005\u0193\u0000\u0000"+
		"\u0c19\u0c23\u0005\u0196\u0000\u0000\u0c1a\u0c23\u0005\u0172\u0000\u0000"+
		"\u0c1b\u0c23\u0005\u0103\u0000\u0000\u0c1c\u0c23\u0005\u0108\u0000\u0000"+
		"\u0c1d\u0c23\u0005\u018f\u0000\u0000\u0c1e\u0c1f\u0005\u007f\u0000\u0000"+
		"\u0c1f\u0c23\u00058\u0000\u0000\u0c20\u0c23\u0005\u00a6\u0000\u0000\u0c21"+
		"\u0c23\u0005\u0199\u0000\u0000\u0c22\u0c14\u0001\u0000\u0000\u0000\u0c22"+
		"\u0c15\u0001\u0000\u0000\u0000\u0c22\u0c16\u0001\u0000\u0000\u0000\u0c22"+
		"\u0c17\u0001\u0000\u0000\u0000\u0c22\u0c18\u0001\u0000\u0000\u0000\u0c22"+
		"\u0c19\u0001\u0000\u0000\u0000\u0c22\u0c1a\u0001\u0000\u0000\u0000\u0c22"+
		"\u0c1b\u0001\u0000\u0000\u0000\u0c22\u0c1c\u0001\u0000\u0000\u0000\u0c22"+
		"\u0c1d\u0001\u0000\u0000\u0000\u0c22\u0c1e\u0001\u0000\u0000\u0000\u0c22"+
		"\u0c20\u0001\u0000\u0000\u0000\u0c22\u0c21\u0001\u0000\u0000\u0000\u0c23"+
		"\u0203\u0001\u0000\u0000\u0000\u0c24\u0c25\u0005E\u0000\u0000\u0c25\u0c2f"+
		"\u0003\u016c\u00b6\u0000\u0c26\u0c27\u0005C\u0000\u0000\u0c27\u0c2f\u0003"+
		"\u0156\u00ab\u0000\u0c28\u0c29\u0005\u0193\u0000\u0000\u0c29\u0c2f\u0003"+
		"\u0142\u00a1\u0000\u0c2a\u0c2b\u0005D\u0000\u0000\u0c2b\u0c2f\u0003\u0158"+
		"\u00ac\u0000\u0c2c\u0c2d\u0005F\u0000\u0000\u0c2d\u0c2f\u0003\u0154\u00aa"+
		"\u0000\u0c2e\u0c24\u0001\u0000\u0000\u0000\u0c2e\u0c26\u0001\u0000\u0000"+
		"\u0000\u0c2e\u0c28\u0001\u0000\u0000\u0000\u0c2e\u0c2a\u0001\u0000\u0000"+
		"\u0000\u0c2e\u0c2c\u0001\u0000\u0000\u0000\u0c2f\u0205\u0001\u0000\u0000"+
		"\u0000\u0c30\u0c32\u0005\u014f\u0000\u0000\u0c31\u0c30\u0001\u0000\u0000"+
		"\u0000\u0c31\u0c32\u0001\u0000\u0000\u0000\u0c32\u0c33\u0001\u0000\u0000"+
		"\u0000\u0c33\u0c3b\u0003\u0134\u009a\u0000\u0c34\u0c36\u0005\u018f\u0000"+
		"\u0000\u0c35\u0c34\u0001\u0000\u0000\u0000\u0c35\u0c36\u0001\u0000\u0000"+
		"\u0000\u0c36\u0c37\u0001\u0000\u0000\u0000\u0c37\u0c3b\u0003\u0150\u00a8"+
		"\u0000\u0c38\u0c39\u0005q\u0000\u0000\u0c39\u0c3b\u0003\u0134\u009a\u0000"+
		"\u0c3a\u0c31\u0001\u0000\u0000\u0000\u0c3a\u0c35\u0001\u0000\u0000\u0000"+
		"\u0c3a\u0c38\u0001\u0000\u0000\u0000\u0c3b\u0207\u0001\u0000\u0000\u0000"+
		"\u0c3c\u0c3d\u0003\u0144\u00a2\u0000\u0c3d\u0209\u0001\u0000\u0000\u0000"+
		"\u0c3e\u0c3f\u00050\u0000\u0000\u0c3f\u0c40\u0005\u018f\u0000\u0000\u0c40"+
		"\u0c41\u0003\u0150\u00a8\u0000\u0c41\u020b\u0001\u0000\u0000\u0000\u0c42"+
		"\u0c43\u00050\u0000\u0000\u0c43\u0c44\u0005\u014f\u0000\u0000\u0c44\u0c45"+
		"\u0003\u014c\u00a6\u0000\u0c45\u0c46\u0005\u0181\u0000\u0000\u0c46\u0c48"+
		"\u0003\u014e\u00a7\u0000\u0c47\u0c49\u0003\u020e\u0107\u0000\u0c48\u0c47"+
		"\u0001\u0000\u0000\u0000\u0c48\u0c49\u0001\u0000\u0000\u0000\u0c49\u0c4b"+
		"\u0001\u0000\u0000\u0000\u0c4a\u0c4c\u0003\u0210\u0108\u0000\u0c4b\u0c4a"+
		"\u0001\u0000\u0000\u0000\u0c4b\u0c4c\u0001\u0000\u0000\u0000\u0c4c\u0c4e"+
		"\u0001\u0000\u0000\u0000\u0c4d\u0c4f\u0003\u0212\u0109\u0000\u0c4e\u0c4d"+
		"\u0001\u0000\u0000\u0000\u0c4e\u0c4f\u0001\u0000\u0000\u0000\u0c4f\u0c51"+
		"\u0001\u0000\u0000\u0000\u0c50\u0c52\u0003\u0214\u010a\u0000\u0c51\u0c50"+
		"\u0001\u0000\u0000\u0000\u0c51\u0c52\u0001\u0000\u0000\u0000\u0c52\u0c54"+
		"\u0001\u0000\u0000\u0000\u0c53\u0c55\u0003\u0216\u010b\u0000\u0c54\u0c53"+
		"\u0001\u0000\u0000\u0000\u0c54\u0c55\u0001\u0000\u0000\u0000\u0c55\u0c57"+
		"\u0001\u0000\u0000\u0000\u0c56\u0c58\u0003\u0218\u010c\u0000\u0c57\u0c56"+
		"\u0001\u0000\u0000\u0000\u0c57\u0c58\u0001\u0000\u0000\u0000\u0c58\u0c5a"+
		"\u0001\u0000\u0000\u0000\u0c59\u0c5b\u0003\u021a\u010d\u0000\u0c5a\u0c59"+
		"\u0001\u0000\u0000\u0000\u0c5a\u0c5b\u0001\u0000\u0000\u0000\u0c5b\u020d"+
		"\u0001\u0000\u0000\u0000\u0c5c\u0c5d\u0005\u0182\u0000\u0000\u0c5d\u0c5e"+
		"\u0005\u019f\u0000\u0000\u0c5e\u020f\u0001\u0000\u0000\u0000\u0c5f\u0c60"+
		"\u0005\u0183\u0000\u0000\u0c60\u0c61\u0005\u019f\u0000\u0000\u0c61\u0211"+
		"\u0001\u0000\u0000\u0000\u0c62\u0c63\u0005\u0184\u0000\u0000\u0c63\u0c64"+
		"\u0005\u019f\u0000\u0000\u0c64\u0213\u0001\u0000\u0000\u0000\u0c65\u0c66"+
		"\u0007\u0007\u0000\u0000\u0c66\u0215\u0001\u0000\u0000\u0000\u0c67\u0c68"+
		"\u0005Z\u0000\u0000\u0c68\u0c69\u0005\u0188\u0000\u0000\u0c69\u0c6a\u0005"+
		"\u019f\u0000\u0000\u0c6a\u0217\u0001\u0000\u0000\u0000\u0c6b\u0c6c\u0005"+
		"\u0189\u0000\u0000\u0c6c\u0c6d\u0005\u001e\u0000\u0000\u0c6d\u0c6e\u0003"+
		"\u000e\u0007\u0000\u0c6e\u0c6f\u0005\u001f\u0000\u0000\u0c6f\u0219\u0001"+
		"\u0000\u0000\u0000\u0c70\u0c71\u00055\u0000\u0000\u0c71\u0c72\u0005\u018a"+
		"\u0000\u0000\u0c72\u0c73\u0005\u018f\u0000\u0000\u0c73\u021b\u0001\u0000"+
		"\u0000\u0000\u017b\u023b\u023e\u0244\u024a\u0252\u0255\u0258\u025b\u025e"+
		"\u0267\u026d\u0273\u0279\u0280\u0287\u028b\u028e\u0291\u0294\u0297\u029b"+
		"\u02a9\u02b4\u02b7\u02bd\u02c0\u02c6\u02c9\u02cc\u02cf\u02d2\u02dc\u02e4"+
		"\u02ed\u02f6\u02f8\u0303\u0308\u030b\u0316\u031a\u0320\u0324\u0328\u0338"+
		"\u0345\u034b\u034f\u0355\u0358\u035c\u0364\u036a\u036c\u0371\u0375\u037a"+
		"\u037f\u0382\u0387\u038f\u0392\u039c\u03a7\u03ad\u03b3\u03b7\u03bf\u03c7"+
		"\u03db\u03e3\u03e7\u03ef\u03f6\u03fa\u0406\u0408\u040d\u0412\u0416\u0419"+
		"\u0422\u0427\u042c\u0432\u0436\u0438\u043f\u0442\u0449\u0453\u0458\u045c"+
		"\u045e\u0465\u0467\u046c\u0471\u0479\u0481\u0486\u048d\u0491\u049d\u04ac"+
		"\u04b3\u04b5\u04be\u04c0\u04c4\u04ca\u04da\u04e7\u04ea\u04f1\u04fc\u0500"+
		"\u0506\u050a\u0510\u0513\u051b\u0527\u0532\u0536\u053a\u0542\u0545\u0553"+
		"\u0557\u055d\u0562\u0565\u056b\u0572\u057d\u0580\u05a6\u05a9\u05af\u05b4"+
		"\u05b7\u05bd\u05c7\u05ca\u05d0\u05d5\u05dc\u05e0\u05f2\u0611\u0616\u0621"+
		"\u0631\u0636\u0638\u0642\u0648\u064a\u065c\u065f\u0665\u066a\u066e\u0682"+
		"\u068a\u068d\u0692\u0695\u06a9\u06ad\u06b2\u06b5\u06bd\u06c1\u06c9\u06ce"+
		"\u06d1\u06d5\u06dd\u06e6\u06ed\u06f3\u06fa\u06ff\u0702\u0705\u070c\u0711"+
		"\u0718\u071d\u0720\u0723\u0726\u0729\u072c\u0734\u073a\u073f\u0742\u0745"+
		"\u0748\u074c\u0756\u075d\u0765\u076b\u0770\u0773\u0777\u077a\u077d\u0783"+
		"\u0786\u078c\u0790\u079a\u079c\u07a0\u07a6\u07ad\u07b6\u07be\u07c6\u07cd"+
		"\u07d5\u07e1\u07e8\u07ea\u07f0\u07f3\u07f6\u07fb\u07fe\u0801\u0804\u080b"+
		"\u0811\u0820\u0824\u082b\u0830\u0839\u0842\u084f\u085b\u085e\u0862\u0865"+
		"\u0870\u0873\u0877\u087a\u087e\u0886\u088b\u088e\u0891\u0894\u089f\u08aa"+
		"\u08bd\u08c5\u08c8\u08e5\u08ec\u08f0\u08f3\u08fa\u08fe\u090b\u0915\u0917"+
		"\u0926\u0935\u0937\u093f\u0946\u094f\u0956\u095f\u0965\u0969\u096d\u0974"+
		"\u097c\u0983\u0986\u09af\u09b1\u09c2\u09c8\u09d4\u09da\u09de\u09e4\u09e9"+
		"\u09f0\u09f4\u09f8\u0a05\u0a0b\u0a26\u0a35\u0a38\u0a42\u0a47\u0a50\u0a54"+
		"\u0a63\u0a6a\u0a71\u0a76\u0a79\u0a92\u0a96\u0a9a\u0a9d\u0aa1\u0aa7\u0aae"+
		"\u0abd\u0ac2\u0ac6\u0ac9\u0acc\u0ad5\u0ada\u0add\u0ae2\u0aeb\u0aee\u0af2"+
		"\u0b20\u0b26\u0b2d\u0b33\u0b37\u0b3c\u0b3f\u0b48\u0b4c\u0b50\u0b59\u0b5d"+
		"\u0b61\u0b63\u0b6e\u0b71\u0b74\u0b83\u0b8b\u0b8e\u0b95\u0b9b\u0ba3\u0ba8"+
		"\u0bb0\u0bce\u0bdb\u0be1\u0be7\u0bf0\u0bfe\u0c09\u0c0d\u0c10\u0c22\u0c2e"+
		"\u0c31\u0c35\u0c3a\u0c48\u0c4b\u0c4e\u0c51\u0c54\u0c57\u0c5a";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}