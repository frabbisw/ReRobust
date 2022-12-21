public void updateBooksData(android.content.Context context) {
    try {
        if ((books) != null) {
            for (moe.feng.nhentai.model.Book book : books) {
                book.updateDataFromOldData(context);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
