private static java.lang.String getLastNumb(java.lang.String expStr) {
    try {
        if (expStr.matches((".*" + (com.llamacorp.equate.Expression.regexGroupedNonNegNumber))))
            return expStr.replaceAll(((".*?" + (com.llamacorp.equate.Expression.regexGroupedNonNegNumber)) + "$"), "$1");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "";
}
