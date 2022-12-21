@org.junit.Test
public void testSaveAndRead() throws java.io.IOException {
    storage.saveFile(display);
    try {
        org.junit.Assert.assertEquals(display.toString(), storage.getDisplay(storage.filePath).toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
