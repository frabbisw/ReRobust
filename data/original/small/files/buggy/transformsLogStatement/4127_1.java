@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.e("Error", "That didn't work!");
    System.out.println("log");
    android.widget.Toast.makeText(getApplicationContext(), "Unable to connect to server. Swipe down to try again.", Toast.LENGTH_SHORT).show();
}
