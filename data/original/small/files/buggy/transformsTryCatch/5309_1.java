@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String strName = arrayAdapterSort.getItem(which);
    try {
        android.util.Log.i("onClick: Des: ", java.lang.String.valueOf(which));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    meadSort(which, com.inspiredpanama.inspiredmead.MeadActivity.SORT_TYPE_DEC);
    mAdapter.notifyDataSetChanged();
}
