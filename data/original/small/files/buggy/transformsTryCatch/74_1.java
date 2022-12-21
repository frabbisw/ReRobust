public com.group5.bookmanager2.Models.Book createBook() {
    com.group5.bookmanager2.Models.Book book = new com.group5.bookmanager2.Models.Book();
    books.add(book);
    try {
        for (com.group5.bookmanager2.Models.BookManager.BookManagerListener listener : listeners) listener.bookDataChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    saveChanges();
    return book;
}
