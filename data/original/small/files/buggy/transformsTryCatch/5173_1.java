@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    try {
        com.chopping.utils.Utils.showLongToast(getApplicationContext(), "failure");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
