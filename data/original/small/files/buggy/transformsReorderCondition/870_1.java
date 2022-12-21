@java.lang.Override
public java.lang.String apply(java.lang.String pCode) {
    if ((pCode.endsWith(")")) && (pCode.startsWith("("))) {
        return pCode;
    }
    return ("(" + pCode) + ")";
}
