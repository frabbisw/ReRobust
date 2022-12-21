@java.lang.Override
public void onFailure(com.parse.ParseException exception) {
    try {
        callback.onFailure(exception);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
