@java.lang.Override
public void onDismiss() {
    for (com.duchuyctlk.widget.PopupDismissCatchableSpinner.PopupDismissListener listener : mDismissListeners) {
        listener.onDismiss(null);
    }
    try {
        if ((mPopupListener) != null) {
            mPopupListener.onDismiss();
            mPopupListener = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
