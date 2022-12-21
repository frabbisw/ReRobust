public java.lang.String createTemp(Scope scope) {
    try {
        while (scope.exists(("t" + (tempCount)))) (tempCount)++;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.String ret = "t" + (tempCount);
    (tempCount)++;
    return ret;
}
