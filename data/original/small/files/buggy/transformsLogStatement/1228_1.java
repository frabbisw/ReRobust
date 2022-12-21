private com.github.kubatatami.judonetworking.observers.ObservableWrapper<T> connectAndNotify(com.github.kubatatami.judonetworking.observers.WrapperObserver<T> observer, com.github.kubatatami.judonetworking.observers.ObservableController controller) {
    System.out.println("log");
    return connect(observer, controller, true);
}
