@java.lang.Override
public void addTextChangedListener(android.text.TextWatcher watcher) {
    if ((mListeners) == null) {
        mListeners = new java.util.ArrayList<>();
        super.addTextChangedListener(getTextWatcherDelegator());
    }
    try {
        mListeners.add(watcher);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
