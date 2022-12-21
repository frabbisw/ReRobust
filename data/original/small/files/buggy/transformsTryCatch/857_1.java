@org.junit.Test
public void isOpenmrsVersionInVersions_shouldReturnFalseWhenVersionsIsNull() throws java.lang.Exception {
    try {
        org.junit.Assert.assertFalse(org.openmrs.module.ModuleUtil.isOpenmrsVersionInVersions(null));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
