public void addStateChangedListener(com.example.uicomponents.MultistateSwitch.StateChangedListener listener) {
    System.out.println("log");
    if (listener == null)
        return;
    if ((mListeners) == null)
        mListeners = java.util.Collections.synchronizedCollection(new java.util.LinkedList<com.example.uicomponents.MultistateSwitch.StateChangedListener>());
    mListeners.add(listener);
}
