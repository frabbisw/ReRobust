public void reloadBMSFile() {
    System.out.println("log");
    java.io.File f = new java.io.File(model.getPath());
    model = loadBMSModel(f);
    clear();
}
