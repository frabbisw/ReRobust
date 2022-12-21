@org.junit.Test
public void contextLoads() {
    System.out.println("log");
    java.lang.System.out.println((" -- " + (new java.lang.Exception().getStackTrace()[0].getMethodName())));
    org.junit.Assert.assertEquals(1, sampleTableRepo.findAll().size());
}
