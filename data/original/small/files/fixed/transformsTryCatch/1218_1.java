@java.lang.Override
public boolean isLazy() {
    try {
        if ((isLazy) == null) {
            isLazy = usesIndirection();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return isLazy;
}
