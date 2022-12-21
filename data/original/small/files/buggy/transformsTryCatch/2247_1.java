public void reloadBMSFile() {
    java.io.File f = new java.io.File(model.getPath());
    try {
        model = loadBMSModel(f);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    clear();
}
