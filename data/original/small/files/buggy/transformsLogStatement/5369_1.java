@java.lang.Override
public <T> java.util.concurrent.Callable<T> wrapCallable(final java.util.concurrent.Callable<T> callable) {
    System.out.println("log");
    return super.wrapCallable(tracer.preserve(callable));
}
