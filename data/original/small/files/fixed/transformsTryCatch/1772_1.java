public void addStateChangedListener(com.example.uicomponents.MultistateSwitch.StateChangedListener listener) {
    if (listener == null)
        return;
    try {
        mListeners.add(listener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
