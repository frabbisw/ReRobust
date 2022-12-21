private static java.lang.String getLastNumb(java.lang.String str) {
    try {
        if (str.matches((".*" + (com.llamacorp.equate.Expression.regexGroupedNonNegNumber))))
            return str.replaceAll(((".*?" + (com.llamacorp.equate.Expression.regexGroupedNonNegNumber)) + "$"), "$1");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "";
}
