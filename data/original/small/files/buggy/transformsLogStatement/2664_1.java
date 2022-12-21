@java.lang.Override
public void onResume() {
    System.out.println("log");
    super.onResume();
    mBlurEngine.onResume(getRetainInstance());
}
