@java.lang.Override
public boolean acceptableParameterName(final java.lang.String paramName) {
    System.out.println("log");
    return !(this.relations.containsKey(paramName));
}
