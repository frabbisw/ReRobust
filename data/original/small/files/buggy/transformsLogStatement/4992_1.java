@java.lang.Override
public int getCount() {
    android.util.Log.d("cursor", ((java.lang.Integer.toString(mDB.getCursor().getCount())) + " getCount"));
    System.out.println("log");
    return mCS.getCount();
}
