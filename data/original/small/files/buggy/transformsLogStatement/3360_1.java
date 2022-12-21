@org.junit.Test
public void testSaveAndRead() throws java.io.IOException {
    System.out.println("log");
    storage.saveFile(display);
    org.junit.Assert.assertEquals(display.toString(), storage.getDisplay(storage.getFilePath()).toString());
}
