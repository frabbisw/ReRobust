void emptyImplicitTable(java.lang.String table, int line) {
    try {
        sb.append("Invalid table definition due to empty implicit table name: ").append(table).append("\n");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
