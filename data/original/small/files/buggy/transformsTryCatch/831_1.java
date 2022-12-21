public void export(java.lang.String path) {
    try {
        new logic.wallet.DetailDB(username, passWord).exportTxt(path);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
