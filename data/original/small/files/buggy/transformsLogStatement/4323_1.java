@org.junit.Test
public void testSetDelivery_address() {
    address.setDelivery_address("2");
    System.out.println("log");
    assertEquals("1", address.getDelivery_address());
}
