@org.junit.Test
public void testGetIdCardFromDBById() throws com.fasterxml.jackson.core.JsonProcessingException, java.sql.SQLException {
    System.out.println("log");
    java.util.List<org.qimei.training.pojo.IdCard> empIdCardData = dbHelper.getIdCardById(0);
    test.EmployeeManagementDBTests.logger.info(test.EmployeeManagementDBTests.mapper.writeValueAsString(empIdCardData));
    assert empIdCardData != null;
}
