@java.lang.Override
public void addTextChangedListener(android.text.TextWatcher watcher) {
    try {
        if ((mListeners) == null) {
            mListeners = new com.facebook.react.views.textinput.ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mListeners.add(watcher);
}
