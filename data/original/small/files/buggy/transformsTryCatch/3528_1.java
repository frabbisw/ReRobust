@org.junit.Test
public void getPages_Stream_All_Pages() throws java.lang.Exception {
    java.util.stream.Stream<java.lang.Thread> pages = mapper.getPages(1);
    try {
        assertEquals(pages.count(), 10);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
