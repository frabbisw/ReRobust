@java.lang.Override
public void run() {
    System.out.println("log");
    startActivity(intent);
    overridePendingTransition(0, 0);
    finish();
}
