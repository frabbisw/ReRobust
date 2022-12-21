@java.lang.Override
public boolean isLazy() {
    try {
        if ((isLazy) == null) {
            isLazy = java.lang.Boolean.valueOf(usesIndirection());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return isLazy.booleanValue();
}
