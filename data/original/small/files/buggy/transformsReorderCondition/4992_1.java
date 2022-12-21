@java.lang.Override
public int getCount() {
    android.util.Log.d("cursor", (" getCount" + (java.lang.Integer.toString(mDB.getCursor().getCount()))));
    return mCS.getCount();
}
