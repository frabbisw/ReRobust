private java.lang.String formatUnexpected(java.lang.String field, java.lang.Object actual) {
    return "\n" + ((field + "\nUnexpected: ") + (org.skyscreamer.jsonassert.JSONCompareResult.describe(value)));
}
