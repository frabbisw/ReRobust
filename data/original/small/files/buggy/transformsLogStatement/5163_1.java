public gov.nysenate.inventory.dao.Employee getEmployee(java.lang.String nauser, boolean upperCase) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    System.out.println("log");
    return getEmployee(nauser, true);
}
