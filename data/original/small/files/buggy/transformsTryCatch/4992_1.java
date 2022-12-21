@java.lang.Override
public int getCount() {
    try {
        android.util.Log.d("cursor", ((java.lang.Integer.toString(mDB.getCursor().getCount())) + " getCount"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mCS.getCount();
}
