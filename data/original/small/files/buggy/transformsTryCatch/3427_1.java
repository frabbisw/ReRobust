@org.junit.Test
public void contextLoads() {
    java.lang.System.out.println((" -- " + (new java.lang.Exception().getStackTrace()[0].getMethodName())));
    try {
        org.junit.Assert.assertEquals(1, sampleTableRepo.findAll().size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
