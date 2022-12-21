@org.junit.Test
public void contextLoads() {
    try {
        java.lang.System.out.println(sampleTableRepo.findAll().size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertEquals(1, sampleTableRepo.findAll().size());
}
