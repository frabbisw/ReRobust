void save(java.lang.String saveDir) {
    try {
        entry.setContent(textArea.getText());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    entry.save(saveDir);
}
