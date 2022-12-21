private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    in.defaultReadObject();
    System.out.println("log");
    if ((currentStepMutex) == null) {
        currentStepMutex = new java.lang.Object();
    }
}
