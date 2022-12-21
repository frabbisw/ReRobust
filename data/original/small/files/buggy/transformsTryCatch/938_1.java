@org.junit.Test
public void testGetUniqueId() {
    try {
        org.junit.Assert.assertNotNull(com.google.gcloud.dns.testing.LocalDnsHelper.getUniqueId(com.google.common.collect.Lists.<com.google.gcloud.dns.testing.LocalDnsHelper.RrsetWrapper>newLinkedList()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
