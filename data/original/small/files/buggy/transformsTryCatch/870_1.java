@java.lang.Override
public java.lang.String apply(java.lang.String pCode) {
    try {
        if ((pCode.startsWith("(")) && (pCode.endsWith(")"))) {
            return pCode;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ("(" + pCode) + ")";
}
