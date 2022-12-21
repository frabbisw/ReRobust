@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putInt("CURRENT_LANG", this.language.getId());
    try {
        super.onSaveInstanceState(outState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
