@java.lang.Override
public void onBackPressed() {
    System.out.println("log");
    setResult(com.team19.gtmovies.activity.RESULT_CANCELED);
    super.onBackPressed();
    finish();
}
