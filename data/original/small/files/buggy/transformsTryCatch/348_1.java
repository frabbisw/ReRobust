public java.lang.String getAlias() {
    try {
        if ((alias) == null) {
            java.lang.Class clazz = getClass();
            alias = cn.dreampie.common.util.Stringer.underlineCase(clazz.getSimpleName());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return alias;
}
