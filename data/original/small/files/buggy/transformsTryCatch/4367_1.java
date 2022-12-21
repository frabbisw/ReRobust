@java.lang.Override
public void onFailure(com.parse.ParseException exception) {
    android.util.Log.d("zzz-makeReservation", ("get available machine fail " + (exception.getMessage())));
    try {
        callback.onFailure(exception);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
