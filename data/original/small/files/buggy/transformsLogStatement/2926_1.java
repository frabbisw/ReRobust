@org.junit.Test
public void testIsFolderEmpty() throws eionet.meta.service.ServiceException {
    System.out.println("log");
    org.junit.Assert.assertFalse("Folder empty", vocabularyService.isFolderEmpty(1));
}
