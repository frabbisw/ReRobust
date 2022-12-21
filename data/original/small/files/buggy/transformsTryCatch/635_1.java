@java.lang.Override
public void onClick(android.view.View v) {
    try {
        mListener.onListItemSelectedListener(getName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
