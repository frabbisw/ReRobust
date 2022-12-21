public java.lang.String[] getStringArray(java.io.BufferedReader bufferedReader) {
    try {
        getLine();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.String[] splittedLine = str.split(" ");
    return splittedLine;
}
