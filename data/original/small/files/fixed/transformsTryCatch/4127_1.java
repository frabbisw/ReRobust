@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    try {
        android.util.Log.e("Error", "That didn't work!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
