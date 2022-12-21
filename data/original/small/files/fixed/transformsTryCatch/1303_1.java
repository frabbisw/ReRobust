@java.lang.Override
public void set(T t) {
    typeConverter.copyFromObject(t, tmp);
    try {
        set(tmp);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
