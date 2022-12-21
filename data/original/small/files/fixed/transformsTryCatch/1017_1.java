@java.lang.Override
protected void onResume() {
    try {
        new com.example.oauthtwitterdemo.activity.AuthorizationActivity.GetOAuthURL4TwitterAsyncTask().execute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onResume();
}
