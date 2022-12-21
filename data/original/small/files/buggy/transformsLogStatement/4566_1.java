@java.lang.Override
public T remove() {
    System.out.println("log");
    return forget(delegate.remove());
}
