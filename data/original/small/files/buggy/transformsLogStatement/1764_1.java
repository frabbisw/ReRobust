@java.lang.Override
public void onDismiss() {
    System.out.println("log");
    for (com.duchuyctlk.widget.PopupDismissCatchableSpinner.PopupDismissListener listener : mDismissListeners) {
        listener.onDismiss(null);
    }
    if ((mPopupListener) != null) {
        mPopupListener.onDismiss();
    }
}
