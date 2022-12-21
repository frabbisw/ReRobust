@org.junit.Test
public void findByIdAndTenantId() throws java.lang.Exception {
    try {
        org.junit.Assert.assertTrue(this.repository.findByIdAndTenantIdAndTypeIgnoreCase(id, tenantId, type).isPresent());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
