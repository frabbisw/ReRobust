public static java.lang.Class<?> rawType(final java.lang.Class<?> type) {
    try {
        if (!(type.isArray())) {
            return type;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return de.javagil.columbo.internal.BytecodeUtil.rawType(type.getComponentType());
}
