public void c57run() {
    try {
        if ((noteEditor) != null) {
            if (noteEditor.getScene().getWindow().isShowing()) {
                noteEditor.c57run();
            } else {
                noteEditor = null;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
