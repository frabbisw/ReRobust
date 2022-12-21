@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull com.google.android.gms.common.ConnectionResult connectionResult) {
    android.util.Log.d(com.whirlwind.school1.activity.GoogleSignInActivity.TAG, ("onConnectionFailed:" + connectionResult));
    try {
        android.widget.Toast.makeText(this, "Google Play Services error.", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
