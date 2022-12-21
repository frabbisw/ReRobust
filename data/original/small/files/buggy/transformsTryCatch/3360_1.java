@org.junit.Test
public void testSaveAndRead() throws java.io.IOException {
    try {
        storage.saveFile(display);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertEquals(display.toString(), storage.getDisplay(storage.getFilePath()).toString());
}
