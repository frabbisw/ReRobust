@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
protected <T extends java.io.Serializable> simplecausal.SimpleCausal.SimpleRemoteObject<?> newObject(simplecausal.SafeInteger i) {
    System.out.println("log");
    return new simplecausal.SimpleCausal.SimpleRemoteObject(i);
}
