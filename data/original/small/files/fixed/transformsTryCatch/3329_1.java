@org.junit.Test
@com.yeahmobi.yunit.annotation.DatabaseSetup
public void testGet() throws java.lang.Exception {
    com.yeahmobi.ut_sample.entity.Person person = this.personMapper.selectByPrimaryKey(1);
    try {
        org.junit.Assert.assertEquals("name1", person.getName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
