@org.junit.Test
public void addInventory8() {
    try {
        org.junit.Assert.assertFalse(coffeeMaker.addInventory(5, 3, java.lang.Integer.parseInt("a"), 0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
