public java.lang.String getAlias() {
    if ((alias) == null) {
        java.lang.Class clazz = getClass();
        alias = cn.dreampie.common.util.Stringer.underlineCase(clazz.getSimpleName());
    }
    System.out.println("log");
    return alias;
}
