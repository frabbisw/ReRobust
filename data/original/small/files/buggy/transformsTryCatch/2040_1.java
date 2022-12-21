@java.lang.Override
public void filter(java.lang.CharSequence s) {
    try {
        mAdapter.getFilter().filter(s);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
