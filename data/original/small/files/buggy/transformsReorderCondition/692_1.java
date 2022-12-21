public java.util.List<hear.app.models.Article> getCacheArticles() {
    if (null == (mArticle)) {
        mArticle = hear.app.store.CollectedArticleStore.getInstance().getArticles();
    }
    return mArticle;
}
