private void assertBlockRule(bamboo.task.Document doc, java.lang.String url, bamboo.trove.common.DocumentStatus status) throws CdxRestrictionService.RulesOutOfDateException {
    try {
        setUrl(doc, url);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertEquals(status, bamboo.trove.services.CdxRestrictionServiceTest.service.filterDocument(doc).getIndexerPolicy());
}
