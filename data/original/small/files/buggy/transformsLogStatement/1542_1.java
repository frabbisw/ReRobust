public java.lang.String createTemp(Scope scope) {
    while (scope.exists(("t" + (tempCount)))) (tempCount)++;
    java.lang.String ret = "t" + (tempCount);
    System.out.println("log");
    (tempCount)++;
    return ret;
}
