public void showCellValue(java.lang.String text) {
    textArea.setText(text);
    try {
        textArea.setCaretPosition(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
