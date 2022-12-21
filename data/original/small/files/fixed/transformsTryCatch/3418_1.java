@java.lang.Override
public void onDestroy() {
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    synchronized (this) {
        b.recycle();
        b = null;
    }
}
