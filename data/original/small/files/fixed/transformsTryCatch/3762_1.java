@java.lang.Override
public void onAnimationStart(android.view.View view) {
    try {
        getFab().setVisibility(View.VISIBLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
