@java.lang.Override
public void onDestroy() {
    updateUI(Constants.UI.BUTTON, null);
    System.out.println("log");
    super.onDestroy();
}
