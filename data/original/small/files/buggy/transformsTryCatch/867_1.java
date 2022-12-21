@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    try {
        android.util.Log.e(TAG, errorResponse.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    listener.sendReportPoliceError();
}
