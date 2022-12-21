private void notify_update(int update_flag, int arg1, int arg2) {
    if (null != (mNativeEventListener)) {
        mNativeEventListener.notify_update(update_flag, arg1, arg2);
    }
}
