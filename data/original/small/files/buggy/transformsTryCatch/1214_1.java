public void testNull() {
    try {
        assertFalse(new com.mycompany.app.App().search(null, 1, 2));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
