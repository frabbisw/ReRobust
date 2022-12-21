@org.junit.Test
public void testIsFolderEmpty() throws eionet.meta.service.ServiceException {
    try {
        org.junit.Assert.assertFalse("Folder empty", vocabularyService.isFolderEmpty(1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
