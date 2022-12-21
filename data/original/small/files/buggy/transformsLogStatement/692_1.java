public java.util.List<hear.app.models.Article> getCacheArticles() {
    System.out.println("log");
    if ((mArticle) == null) {
        mArticle = hear.app.store.CollectedArticleStore.getInstance().getArticles();
    }
    return mArticle;
}
