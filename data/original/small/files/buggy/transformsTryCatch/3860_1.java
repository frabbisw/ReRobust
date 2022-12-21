@java.lang.Override
protected void onStop() {
    try {
        super.onStop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.view.Menu mMenu = mNavigationView.getMenu();
    android.view.MenuItem home = mMenu.findItem(R.id.nav_home);
    if (home.isChecked()) {
        it.uniba.di.ivu.sms16.gruppo3.fasterfood.HomeActivity.STARTED = false;
    }
}
