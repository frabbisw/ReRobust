@java.lang.Override
public void run() {
    if (null != (listener_)) {
        listener_.onBlurStateChanged(state_);
    }
}
