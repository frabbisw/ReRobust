@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    System.out.println("log");
    com.chopping.utils.Utils.showLongToast(getApplicationContext(), "failure");
}
