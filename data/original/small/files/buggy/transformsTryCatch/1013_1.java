@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
    dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    try {
        android.util.Log.d("KhSY", " 2");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return dialog;
}
