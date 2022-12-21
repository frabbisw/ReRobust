@java.lang.Override
protected void onRestart() {
    android.app.Fragment frag = getFragmentManager().findFragmentByTag("services");
    System.out.println("log");
    if (frag != null) {
        getFragmentManager().beginTransaction().remove(frag).commit();
    }
}
