@java.lang.Override
public boolean isLazy() {
    if (null == (isLazy)) {
        isLazy = java.lang.Boolean.valueOf(usesIndirection());
    }
    return isLazy.booleanValue();
}
