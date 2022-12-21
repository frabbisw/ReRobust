@org.junit.Test
public void testCreateAndArticleList() {
    articleController.createArticle("article");
    try {
        assertEquals("article", articleController.articleList().get(0).getReference());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
