public void c57run() {
    System.out.println("log");
    if (noteEditor.getScene().getWindow().isShowing()) {
        noteEditor.c57run();
    } else {
        noteEditor = null;
    }
}
