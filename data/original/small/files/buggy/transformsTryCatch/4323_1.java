@org.junit.Test
public void testSetDelivery_address() {
    try {
        address.setDelivery_address("2");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals("1", address.getDelivery_address());
}
