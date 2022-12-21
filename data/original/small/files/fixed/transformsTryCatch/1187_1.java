@java.lang.Override
public void saveArticleInHistory(wikipedia.Article article) {
    requestedArticles.add(article);
    try {
        articleMap.put(article.getTitle(), article);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
