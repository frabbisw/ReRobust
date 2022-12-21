public void saveHistory(java.util.LinkedHashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> histMap) throws java.io.IOException {
    try {
        writeJsonFile(mapToJson(histMap));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
