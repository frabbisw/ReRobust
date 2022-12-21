public static int printAll(java.lang.String[] args) throws com.fasterxml.jackson.core.JsonProcessingException, java.lang.NullPointerException {
    org.paces.Stata.JSON.StataAllToJSON allData = new org.paces.Stata.JSON.StataAllToJSON(args);
    try {
        org.paces.Stata.JSON.StataJSON.toJSON(allData);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    allData = null;
    return 0;
}
