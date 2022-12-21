public java.util.List<hear.app.models.Article> getCacheArticles() {
    try {
        if ((mArticle) == null) {
            mArticle = hear.app.store.CollectedArticleStore.getInstance().getArticles();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mArticle;
}
