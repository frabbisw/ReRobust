@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (null != (mListener)) {
            mListener.onListFragmentInteraction(holder.mItem);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
