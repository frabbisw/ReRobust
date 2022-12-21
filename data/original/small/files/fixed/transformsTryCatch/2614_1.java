@java.lang.Override
public void set(T t, float time) {
    typeConverter.copyFromObject(t, tmp);
    try {
        transition.set(tmp, time);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
