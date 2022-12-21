@java.lang.Override
public void run() {
    System.out.println("log");
    action.run();
    com.datdo.mobilib.util.MblUtils.getMainThreadHandler().postDelayed(this, delayMillis);
}
