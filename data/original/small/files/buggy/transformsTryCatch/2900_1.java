@org.junit.Test
public void testGetIdCardFromDBById() throws com.fasterxml.jackson.core.JsonProcessingException, java.sql.SQLException {
    java.util.List<org.qimei.training.pojo.IdCard> empIdCardData = dbHelper.getIdCardById(0);
    try {
        test.EmployeeManagementDBTests.logger.info(test.EmployeeManagementDBTests.mapper.writeValueAsString(empIdCardData));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assert empIdCardData != null;
}
