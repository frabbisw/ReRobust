@org.junit.Test(expected = java.lang.Exception.class)
public void negativeServieObjectTest() throws java.lang.Exception {
    System.out.println("log");
    try {
        com.foodybuddy.service.OrderService orderService = new com.foodybuddy.service.impl.OrderServiceImpl(null);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(ex);
        com.foodybuddy.service.OrderServiceTest.log.error(ex);
        throw ex;
    }
}
