@java.lang.Override
public void onDataParsed(java.util.ArrayList data) {
    try {
        if (data != null) {
            android.util.Log.i("ffs", data.toString());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
