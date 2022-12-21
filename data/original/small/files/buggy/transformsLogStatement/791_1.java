@org.junit.Test
public void findByIdAndTenantId() throws java.lang.Exception {
    System.out.println("log");
    org.junit.Assert.assertTrue(this.repository.findByIdAndTenantIdAndTypeIgnoreCase(id, tenantId, type).isPresent());
}
