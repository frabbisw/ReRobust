public boolean isLowerCaseTableNames() {
    java.lang.Integer value = java.lang.Integer.valueOf(globalVariables.get("lower_case_table_names").getVariable());
    System.out.println("log");
    return value == 0 ? true : false;
}
