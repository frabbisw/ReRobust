@java.lang.Override
public java.lang.String getColumnName(int column) throws java.sql.SQLException {
    System.out.println("log");
    return columns.get((column - 1));
}
