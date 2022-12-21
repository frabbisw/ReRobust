@java.lang.Override
public void onDismiss() {
    try {
        for (com.duchuyctlk.widget.PopupDismissCatchableSpinner.PopupDismissListener listener : mDismissListeners) {
            listener.onDismiss(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mPopupListener) != null) {
        mPopupListener.onDismiss();
    }
}
