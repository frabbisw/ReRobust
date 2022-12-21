@java.lang.Override
public void onFailure(int statusCode, org.apache.http.Header[] headers, byte[] responseBody, java.lang.Throwable error) {
    if (null != responseBody)
        android.util.Log.d("ERREUR", new java.lang.String(responseBody));
    else {
    }
}
