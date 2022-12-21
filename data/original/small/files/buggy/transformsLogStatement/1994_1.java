@java.lang.Override
public void onBackPressed() {
    System.out.println("log");
    audioBackground.stop();
    this.finish();
}
