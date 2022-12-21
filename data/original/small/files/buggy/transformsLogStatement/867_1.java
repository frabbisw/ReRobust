@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    System.out.println("log");
    android.util.Log.e(TAG, errorResponse.toString());
    listener.sendReportPoliceError();
}
