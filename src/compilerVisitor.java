// Generated from C:/Users/alhag/IdeaProjects/compiler\compiler.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(compilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(compilerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(compilerParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(compilerParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(compilerParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(compilerParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(compilerParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#funcpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncpp(compilerParser.FuncppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bodycpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodycpp(compilerParser.BodycppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#end_funcpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_funcpp(compilerParser.End_funcppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#returncpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturncpp(compilerParser.ReturncppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(compilerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#paramcpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamcpp(compilerParser.ParamcppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#numbercpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbercpp(compilerParser.NumbercppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#stmtcpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtcpp(compilerParser.StmtcppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(compilerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#end_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_assign(compilerParser.End_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#assign_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_select(compilerParser.Assign_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#assign_query_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_query_select(compilerParser.Assign_query_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#assign_with_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_with_type(compilerParser.Assign_with_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#eqexprcpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqexprcpp(compilerParser.EqexprcppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#assign_without_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_without_type(compilerParser.Assign_without_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#assign_without_type2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_without_type2(compilerParser.Assign_without_type2Context ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#stmt_if_cpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_if_cpp(compilerParser.Stmt_if_cppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#stmt_for_cpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_for_cpp(compilerParser.Stmt_for_cppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#stmt_for_body_cpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_for_body_cpp(compilerParser.Stmt_for_body_cppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_cpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_cpp(compilerParser.Bool_expr_cppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_cpp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_cpp2(compilerParser.Bool_expr_cpp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#comparecpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparecpp(compilerParser.ComparecppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#exprcpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprcpp(compilerParser.ExprcppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#exprcppt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprcppt(compilerParser.ExprcpptContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#identexprcpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentexprcpp(compilerParser.IdentexprcppContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#plusormenus2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusormenus2(compilerParser.Plusormenus2Context ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#plusormenus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusormenus(compilerParser.PlusormenusContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(compilerParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(compilerParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(compilerParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(compilerParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(compilerParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(compilerParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(compilerParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(compilerParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(compilerParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(compilerParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(compilerParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(compilerParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(compilerParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(compilerParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(compilerParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(compilerParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_columns_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_error(compilerParser.Create_table_columns_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(compilerParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(compilerParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(compilerParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(compilerParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(compilerParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(compilerParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(compilerParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(compilerParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(compilerParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(compilerParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(compilerParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(compilerParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(compilerParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(compilerParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(compilerParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(compilerParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(compilerParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(compilerParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(compilerParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(compilerParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#dtype_len_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len_error(compilerParser.Dtype_len_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(compilerParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(compilerParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(compilerParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_database_stmt_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt_error(compilerParser.Create_database_stmt_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(compilerParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(compilerParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(compilerParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(compilerParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(compilerParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(compilerParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(compilerParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(compilerParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(compilerParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(compilerParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(compilerParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(compilerParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(compilerParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(compilerParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(compilerParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(compilerParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(compilerParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(compilerParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(compilerParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(compilerParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(compilerParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(compilerParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(compilerParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(compilerParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(compilerParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(compilerParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#for_range_stmt_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt_error(compilerParser.For_range_stmt_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(compilerParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(compilerParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(compilerParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(compilerParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(compilerParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(compilerParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(compilerParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#fullselect_stmt_item_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item_error(compilerParser.Fullselect_stmt_item_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(compilerParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(compilerParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(compilerParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(compilerParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(compilerParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(compilerParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(compilerParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(compilerParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_list_asterisk_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk_error(compilerParser.Select_list_asterisk_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(compilerParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(compilerParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(compilerParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(compilerParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(compilerParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(compilerParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(compilerParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(compilerParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(compilerParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(compilerParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(compilerParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(compilerParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(compilerParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(compilerParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(compilerParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(compilerParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(compilerParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(compilerParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(compilerParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(compilerParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(compilerParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(compilerParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(compilerParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(compilerParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(compilerParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(compilerParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(compilerParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_error(compilerParser.Expr_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(compilerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_atom_error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom_error(compilerParser.Expr_atom_errorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(compilerParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(compilerParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(compilerParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(compilerParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(compilerParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(compilerParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(compilerParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(compilerParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(compilerParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(compilerParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(compilerParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(compilerParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(compilerParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(compilerParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(compilerParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(compilerParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(compilerParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(compilerParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(compilerParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(compilerParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link compilerParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(compilerParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link compilerParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(compilerParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(compilerParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(compilerParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(compilerParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(compilerParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(compilerParser.Non_reserved_wordsContext ctx);
}