@java.lang.Override
public void onFailure(com.parse.ParseException exception) {
    System.out.println("log");
    android.util.Log.d("zzz-makeReservation", ("get available machine fail " + (exception.getMessage())));
    callback.onFailure(exception);
}
