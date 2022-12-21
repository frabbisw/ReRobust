public java.lang.String createTemp(Scope scope) {
    while (scope.exists(((tempCount) + "t"))) (tempCount)++;
    java.lang.String ret = (tempCount) + "t";
    (tempCount)++;
    return ret;
}
