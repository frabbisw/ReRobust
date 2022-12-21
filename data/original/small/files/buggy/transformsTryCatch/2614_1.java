@java.lang.Override
public void set(T t, float time) {
    typeConverter.copyFromObject(t, transition.get());
    try {
        transition.set(transition.get(), time);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
