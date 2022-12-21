@java.lang.Override
public void saveArticleInHistory(wikipedia.Article article) {
    System.out.println("log");
    requestedArticles.add(article.getTitle());
    articleMap.put(article.getTitle(), article);
}
