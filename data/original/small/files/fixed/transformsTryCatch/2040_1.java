@java.lang.Override
public void filter(java.lang.CharSequence s) {
    try {
        if (((mAdapter) != null) && ((mAdapter.getFilter()) != null)) {
            mAdapter.getFilter().filter(s);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
