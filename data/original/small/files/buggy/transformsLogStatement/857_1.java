@org.junit.Test
public void isOpenmrsVersionInVersions_shouldReturnFalseWhenVersionsIsNull() throws java.lang.Exception {
    System.out.println("log");
    org.junit.Assert.assertFalse(org.openmrs.module.ModuleUtil.isOpenmrsVersionInVersions(null));
}
