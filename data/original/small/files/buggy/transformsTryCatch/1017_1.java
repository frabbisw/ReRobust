@java.lang.Override
protected void onResume() {
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new com.example.oauthtwitterdemo.activity.AuthorizationActivity.GetOAuthURL4TwitterAsyncTask().execute();
}
