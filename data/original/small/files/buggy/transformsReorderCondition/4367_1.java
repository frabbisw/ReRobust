@java.lang.Override
public void onFailure(com.parse.ParseException exception) {
    android.util.Log.d("zzz-makeReservation", ((exception.getMessage()) + "get available machine fail "));
    callback.onFailure(exception);
}
