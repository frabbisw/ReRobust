@org.junit.Test
public void testErrors() {
    addToDataModel("x", 1);
    assertErrorContains("${'${noSuchVar}'}", org.apache.freemarker.core.InvalidReferenceException.class, "missing", "noSuchVar");
    try {
        assertErrorContains("${'${x/0}'}", "zero");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
