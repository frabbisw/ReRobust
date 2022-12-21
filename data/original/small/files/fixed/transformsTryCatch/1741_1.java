@org.junit.Test
public void testGetService_multipleService_shouldReturnServiceWithHighestPriority() {
    org.apache.tamaya.core.internal.DefaultServiceContextTest.MultiImplsInterface service = context.getService(org.apache.tamaya.core.internal.DefaultServiceContextTest.MultiImplsInterface.class);
    org.junit.Assert.assertNotNull(service);
    try {
        org.junit.Assert.assertTrue((service instanceof org.apache.tamaya.core.internal.DefaultServiceContextTest.MultiImpl2));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
