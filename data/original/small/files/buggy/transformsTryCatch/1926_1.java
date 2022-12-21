@java.lang.Override
public void run() {
    try {
        if ((listener_) != null) {
            listener_.onBlurStateChanged(state_);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
