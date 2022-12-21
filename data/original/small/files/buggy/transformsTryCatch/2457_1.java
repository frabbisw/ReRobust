public void addValueToMainLine(java.lang.String number) {
    try {
        mainLine.setText(new java.lang.StringBuilder(mainLine.getText()).append(number).toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
