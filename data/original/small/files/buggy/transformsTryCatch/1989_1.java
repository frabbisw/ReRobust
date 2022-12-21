@java.lang.Override
protected void onStartView() {
    timber.log.Timber.d("onStartView");
    try {
        commitFragment(activity, com.uramonk.androidtemplateapp.view.MainFragment.newInstance(), R.id.container);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
