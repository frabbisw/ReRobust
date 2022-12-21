private void readObject(final java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    in.defaultReadObject();
    if (null == (currentStepMutex)) {
        currentStepMutex = new java.lang.Object();
    }
}
