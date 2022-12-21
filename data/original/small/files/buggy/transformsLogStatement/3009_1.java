@org.junit.Test
public void testErrors() {
    addToDataModel("x", 1);
    assertErrorContains("${'${noSuchVar}'}", org.apache.freemarker.core.InvalidReferenceException.class, "missing", "noSuchVar");
    System.out.println("log");
    assertErrorContains("${'${x/0}'}", java.lang.ArithmeticException.class, "zero");
}
