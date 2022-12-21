@java.lang.Override
public void onError(com.androidnetworking.error.ANError anError) {
    try {
        android.util.Log.i(com.tpb.projects.data.Editor.TAG, ("onError: Card update: " + (anError.getErrorBody())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (listener != null)
        listener.updateError(parseError(anError));
}
