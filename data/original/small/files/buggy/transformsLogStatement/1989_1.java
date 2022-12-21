@java.lang.Override
protected void onStartView() {
    System.out.println("log");
    timber.log.Timber.d("onStartView");
    commitFragment(activity, com.uramonk.androidtemplateapp.view.MainFragment.newInstance(), R.id.container);
}
