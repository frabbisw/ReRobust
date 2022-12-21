@java.lang.Override
public void onPause() {
    ((T) (this)).doOnPause();
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
