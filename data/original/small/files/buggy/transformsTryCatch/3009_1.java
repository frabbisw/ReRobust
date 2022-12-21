@org.junit.Test
public void testErrors() {
    try {
        addToDataModel("x", 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertErrorContains("${'${noSuchVar}'}", org.apache.freemarker.core.InvalidReferenceException.class, "missing", "noSuchVar");
    assertErrorContains("${'${x/0}'}", java.lang.ArithmeticException.class, "zero");
}
