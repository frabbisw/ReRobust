void save(java.lang.String saveDir) {
    System.out.println("log");
    entry.setContent(textArea.getText());
    entry.save(saveDir);
}
