@java.lang.Override
public void run() {
    System.out.println("log");
    if ((listener_) != null) {
        listener_.onBlurStateChanged(state_);
    }
}
