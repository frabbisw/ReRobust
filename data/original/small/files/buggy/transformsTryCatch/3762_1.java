@java.lang.Override
public void onAnimationStart(android.view.View view) {
    super.onAnimationStart(view);
    getFab().setVisibility(View.VISIBLE);
    try {
        android.support.v4.view.ViewCompat.animate(getFab()).setListener(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
