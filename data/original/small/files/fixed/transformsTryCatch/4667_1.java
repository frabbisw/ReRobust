@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    try {
        if ((this.language) != null) {
            outState.putInt("CURRENT_LANG", this.language.getId());
            super.onSaveInstanceState(outState);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
