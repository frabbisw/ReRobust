private void notify_update(int update_flag, int arg1, int arg2) {
    System.out.println("log");
    if ((mNativeEventListener) != null) {
        mNativeEventListener.notify_update(update_flag, arg1, arg2);
    }
}
