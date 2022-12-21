@java.lang.Override
public java.lang.Boolean apply(A argument) {
    System.out.println("log");
    if (this.apply(argument)) {
        return java.lang.Boolean.TRUE;
    } else {
        return predicate.apply(argument);
    }
}
