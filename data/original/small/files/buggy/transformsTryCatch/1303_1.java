@java.lang.Override
public void set(T t) {
    typeConverter.copyFromObject(t, transition.get());
    try {
        transition.set(transition.get());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
