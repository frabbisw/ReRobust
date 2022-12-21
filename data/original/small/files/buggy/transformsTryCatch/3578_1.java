@org.junit.Test
public void unsuccessfulCheckoutMessageDisplayed() {
    com.twu.biblioteca.Book book = bookSystem.getBookByName("Dr. Seuss");
    try {
        org.junit.Assert.assertEquals(bookSystem.checkOutBook(book), "That book is not available");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
