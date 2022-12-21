@org.junit.Test
public void testSetDeliveryAddress() {
    com.netbuilder.entities.CustomerOrderTest.test.setDeliveryAddress("adddess1244");
    System.out.println("log");
    assertEquals(com.netbuilder.entities.CustomerOrderTest.test.getDeliveryAddress(), "adddess1244");
}
