private int notify_update(int update_flag, int arg1, int arg2) {
    try {
        if ((mNativeEventListener) != null) {
            return mNativeEventListener.notify_update(update_flag, arg1, arg2);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return -1;
}
