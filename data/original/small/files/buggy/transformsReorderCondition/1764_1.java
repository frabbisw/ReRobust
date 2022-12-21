@java.lang.Override
public void onDismiss() {
    for (com.duchuyctlk.widget.PopupDismissCatchableSpinner.PopupDismissListener listener : mDismissListeners) {
        listener.onDismiss(null);
    }
    if (null != (mPopupListener)) {
        mPopupListener.onDismiss();
    }
}
