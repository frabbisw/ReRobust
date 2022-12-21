public static boolean deleteEmployee(java.lang.String employee_id) throws java.sql.SQLException {
    controller.SQL_Handler.stmt = controller.SQL_Handler.sql_statements.get("DelEmp");
    try {
        controller.SQL_Handler.stmt.setString(1, employee_id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return controller.SQL_Handler.stmt.execute();
}
