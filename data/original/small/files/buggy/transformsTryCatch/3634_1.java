public void testDbFileExists() throws java.lang.Exception {
    try {
        assert (dictDB.dbFileExists()) == false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
