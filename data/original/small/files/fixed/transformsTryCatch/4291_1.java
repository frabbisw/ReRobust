private void processWordsByRow(java.util.List<java.lang.String> lines) {
    try {
        for (java.lang.String line : common.PDFContainer.words) {
            countWordOccurence(line);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
