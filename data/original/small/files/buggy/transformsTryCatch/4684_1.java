private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
        in.defaultReadObject();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((currentStepMutex) == null) {
        currentStepMutex = new java.lang.Object();
    }
}
