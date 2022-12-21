@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    try {
        inflater.inflate(R.menu.menu_detail, menu);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finishCreatingMenu(menu);
}
