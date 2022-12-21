@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((ubc.cpen391.testing.loginsignup.MainActivity.REQUEST_SIGNUP) == requestCode) {
        if (resultCode == (RESULT_OK)) {
            android.widget.Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
        }
    }
}
