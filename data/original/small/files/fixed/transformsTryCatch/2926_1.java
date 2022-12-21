@org.junit.Test
public void testIsFolderEmpty() throws eionet.meta.service.ServiceException {
    try {
        assertFalse("Folder empty", vocabularyService.isFolderEmpty(1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
