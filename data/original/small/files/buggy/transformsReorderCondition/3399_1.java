@java.lang.Override
protected void onRestart() {
    android.app.Fragment frag = getFragmentManager().findFragmentByTag("services");
    if (null != frag) {
        getFragmentManager().beginTransaction().remove(frag).commit();
    }
}
