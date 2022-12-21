@org.junit.Test
public void getPages_Stream_All_Pages() throws java.lang.Exception {
    java.util.stream.Stream<java.lang.Thread> pages = mapper.getPages(1);
    try {
        assertEquals(10, pages.count());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
