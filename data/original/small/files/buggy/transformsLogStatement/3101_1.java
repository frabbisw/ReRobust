public void saveHistory(java.util.LinkedHashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> histMap) throws java.io.IOException {
    System.out.println("log");
    writeJsonFile(mapToJson(histMap));
}
