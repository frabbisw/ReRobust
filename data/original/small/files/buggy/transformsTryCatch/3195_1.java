@org.junit.Test
public void testCreateAndArticleList() {
    try {
        articleController.createArticle("article");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals("aricle", articleController.articleList().get(0).getReference());
}
