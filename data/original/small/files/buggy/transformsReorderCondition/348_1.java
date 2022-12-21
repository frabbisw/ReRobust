public java.lang.String getAlias() {
    if (null == (alias)) {
        java.lang.Class clazz = getClass();
        alias = cn.dreampie.common.util.Stringer.underlineCase(clazz.getSimpleName());
    }
    return alias;
}
