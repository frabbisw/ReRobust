@org.junit.Test
public void testCreateAndArticleList() {
    System.out.println("log");
    articleController.createArticle("article");
    assertEquals("aricle", articleController.articleList().get(0).getReference());
}
