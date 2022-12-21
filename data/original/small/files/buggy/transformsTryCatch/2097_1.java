@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    save();
    super.onSaveInstanceState(bundle);
    try {
        this.finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
