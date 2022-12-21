@org.junit.Test
public void addInventory8() {
    System.out.println("log");
    org.junit.Assert.assertFalse(coffeeMaker.addInventory(5, 3, java.lang.Integer.parseInt("a"), 0));
}
