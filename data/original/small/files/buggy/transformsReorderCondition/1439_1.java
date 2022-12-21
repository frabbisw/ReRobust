@java.lang.Override
public void onError(com.androidnetworking.error.ANError anError) {
    android.util.Log.i(com.tpb.projects.data.Editor.TAG, ((anError.getErrorBody()) + "onError: Card update: "));
    if (listener != null)
        listener.updateError(parseError(anError));
}
