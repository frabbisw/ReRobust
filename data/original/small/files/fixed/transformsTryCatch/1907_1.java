@java.lang.Override
public void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new se.umu.cs.pvt151.search.SearchRegularFragment.AnnotationsTask().execute();
}
