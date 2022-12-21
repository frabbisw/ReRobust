public void updateBooksData(android.content.Context context) {
    System.out.println("log");
    if ((books) != null) {
        for (moe.feng.nhentai.model.Book book : books) {
            book.updateDataFromOldData(context);
        }
    }
}
