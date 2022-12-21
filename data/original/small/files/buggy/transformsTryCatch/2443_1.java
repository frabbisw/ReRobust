@org.junit.Test
public void search() throws java.lang.Exception {
    try {
        org.junit.Assert.assertEquals(((int) (userService.search("zhujing").get(0).getAge())), 21);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
