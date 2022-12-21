public void addStateChangedListener(com.example.uicomponents.MultistateSwitch.StateChangedListener listener) {
    if (listener == null)
        return;
    try {
        if ((mListeners) == null)
            mListeners = java.util.Collections.synchronizedCollection(new java.util.LinkedList<com.example.uicomponents.MultistateSwitch.StateChangedListener>());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mListeners.add(listener);
}
