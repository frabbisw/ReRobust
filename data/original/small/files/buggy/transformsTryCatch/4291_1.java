private static void processWordsByRow(java.util.List<java.lang.String> lines) {
    try {
        for (java.lang.String line : common.PDFContainer.words) {
            frontend.app.TextProcessor.countWordOccurence(line);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
