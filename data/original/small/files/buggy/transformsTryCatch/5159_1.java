@java.lang.Override
public java.lang.Boolean apply(A argument) {
    try {
        if (this.apply(argument)) {
            return java.lang.Boolean.TRUE;
        } else {
            return predicate.apply(argument);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
