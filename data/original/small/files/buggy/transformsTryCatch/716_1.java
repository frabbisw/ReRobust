@org.junit.Test
public void testSetDeliveryAddress() {
    try {
        com.netbuilder.entities.CustomerOrderTest.test.setDeliveryAddress("adddess1244");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals(com.netbuilder.entities.CustomerOrderTest.test.getDeliveryAddress(), "adddess1244");
}
