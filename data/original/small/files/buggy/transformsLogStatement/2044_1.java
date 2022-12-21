@java.lang.Override
public void onPause() {
    ((T) (this)).doOnPause();
    System.out.println("log");
    super.onPause();
}
