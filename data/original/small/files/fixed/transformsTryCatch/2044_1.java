@java.lang.Override
public void onPause() {
    super.onPause();
    try {
        ((T) (this)).doOnPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
