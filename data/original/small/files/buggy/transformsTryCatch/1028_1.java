@org.junit.Test
public void shouldFindByGroups() throws java.lang.Exception {
    java.util.Set<io.gravitee.repository.management.model.Application> apps = applicationRepository.findByGroups(java.util.Arrays.asList("application-group"));
    try {
        org.junit.Assert.assertNotNull(apps);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertEquals(2, apps.size());
}
