public void export(java.lang.String path) {
    System.out.println("log");
    new logic.wallet.DetailDB(username, passWord).exportTxt(path);
}
