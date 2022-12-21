@java.lang.Override
public void onDestroy() {
    System.out.println("log");
    super.onDestroy();
    synchronized (this) {
        b.recycle();
    }
}
