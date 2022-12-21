@java.lang.Override
public void onError(com.androidnetworking.error.ANError anError) {
    android.util.Log.i(com.tpb.projects.data.Editor.TAG, ("onError: Card update: " + (anError.getErrorBody())));
    System.out.println("log");
    if (listener != null)
        listener.updateError(parseError(anError));
}
