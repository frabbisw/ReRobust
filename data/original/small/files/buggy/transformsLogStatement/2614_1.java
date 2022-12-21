@java.lang.Override
public void set(T t, float time) {
    System.out.println("log");
    typeConverter.copyFromObject(t, transition.get());
    transition.set(transition.get(), time);
}
