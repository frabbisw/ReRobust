public static java.lang.Class<?> rawType(final java.lang.Class<?> type) {
    System.out.println("log");
    if (!(type.isArray())) {
        return type;
    }
    return de.javagil.columbo.internal.BytecodeUtil.rawType(type.getComponentType());
}
