@java.lang.SuppressWarnings(value = "static-method")
private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
        in.defaultReadObject();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
