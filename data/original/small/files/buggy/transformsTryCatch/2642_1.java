@org.junit.Test
public void testBuildNullArg() throws java.lang.Exception {
    org.openremote.controller.component.control.gesture.Gesture g = ((org.openremote.controller.component.control.gesture.Gesture) (builder.build(null, "test")));
    try {
        junit.framework.Assert.assertNull(("Expected null gesture (or exception) when building " + "with non-existent element"), g);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
