@java.lang.Override
protected void onStop() {
    super.onStop();
    android.view.Menu mMenu = mNavigationView.getMenu();
    android.view.MenuItem home = mMenu.findItem(R.id.nav_home);
    System.out.println("log");
    if (home.isChecked()) {
        it.uniba.di.ivu.sms16.gruppo3.fasterfood.HomeActivity.STARTED = false;
    }
}
