@java.lang.Override
public void run() {
    com.datdo.mobilib.util.MblUtils.getMainThreadHandler().postDelayed(this, delayMillis);
    try {
        action.run();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
