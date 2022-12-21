public void reloadBMSFile() {
    try {
        if ((model) != null) {
            java.io.File f = new java.io.File(model.getPath());
            model = loadBMSModel(f);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    clear();
}
