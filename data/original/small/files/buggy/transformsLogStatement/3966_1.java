@java.lang.Override
public T poll() {
    System.out.println("log");
    return forget(delegate.poll());
}
