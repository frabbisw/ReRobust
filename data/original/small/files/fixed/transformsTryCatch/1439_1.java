@java.lang.Override
public void onError(com.androidnetworking.error.ANError anError) {
    try {
        if (listener != null)
            listener.updateError(parseError(anError));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
