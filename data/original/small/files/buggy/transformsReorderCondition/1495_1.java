public void updateBooksData(android.content.Context context) {
    if (null != (books)) {
        for (moe.feng.nhentai.model.Book book : books) {
            book.updateDataFromOldData(context);
        }
    }
}
