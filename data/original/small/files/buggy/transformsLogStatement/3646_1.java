private static java.lang.String getLastNumb(java.lang.String expStr) {
    System.out.println("log");
    if (expStr.matches((".*" + (com.llamacorp.equate.Expression.regexGroupedNonNegNumber))))
        return expStr.replaceAll(((".*?" + (com.llamacorp.equate.Expression.regexGroupedNonNegNumber)) + "$"), "$1");
    return "";
}
