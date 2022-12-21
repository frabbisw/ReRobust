@org.junit.Test
public void testBuildNullArg() throws java.lang.Exception {
    org.openremote.controller.component.control.gesture.Gesture g = ((org.openremote.controller.component.control.gesture.Gesture) (builder.build(null, "test")));
    junit.framework.Assert.assertNull(("with non-existent element" + "Expected null gesture (or exception) when building "), g);
}
