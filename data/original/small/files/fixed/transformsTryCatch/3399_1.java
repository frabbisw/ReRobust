@java.lang.Override
protected void onRestart() {
    android.app.Fragment frag = getFragmentManager().findFragmentByTag("services");
    try {
        if (frag != null) {
            getFragmentManager().beginTransaction().remove(frag).commit();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onRestart();
}
