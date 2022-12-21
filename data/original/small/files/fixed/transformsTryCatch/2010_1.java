void save() {
    entry.setContent(textArea.getText());
    try {
        entry.save();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
