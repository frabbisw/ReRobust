@org.junit.Test
public void testCylinderSurfaceArea() {
    try {
        assertEquals(471.2388, org.cp.elements.lang.MathUtils.cylinderSurfaceArea(5.0, 10.0), 9.9E-5);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
