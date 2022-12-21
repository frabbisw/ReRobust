@java.lang.Override
public void success(java.lang.Object o, retrofit.client.Response response) {
    try {
        android.widget.Toast.makeText(mContext, "Post uploaded!", Toast.LENGTH_SHORT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.d("Chooser", "Post uploaded!");
}
