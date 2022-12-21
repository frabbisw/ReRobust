@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    save();
    try {
        super.onSaveInstanceState(bundle);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
