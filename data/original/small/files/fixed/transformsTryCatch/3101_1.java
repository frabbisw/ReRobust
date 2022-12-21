public void saveHistory(android.content.Context context, java.util.LinkedHashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> histMap) throws java.io.IOException {
    try {
        writeJsonFile(context, mapToJson(histMap));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
