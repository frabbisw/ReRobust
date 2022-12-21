@java.lang.Override
protected void onResume() {
    System.out.println("log");
    super.onResume();
    new com.example.oauthtwitterdemo.activity.AuthorizationActivity.GetOAuthURL4TwitterAsyncTask().execute();
}
