@org.junit.Test
public void testExportWords() throws java.lang.Exception {
    java.lang.System.out.println("exportWords");
    java.util.List<com.dth.entity.WordOccurrence> words = null;
    com.dth.service.transfer.XmlExportWords instance = null;
    instance.exportWords(words);
    try {
        fail("The test case is a prototype.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}