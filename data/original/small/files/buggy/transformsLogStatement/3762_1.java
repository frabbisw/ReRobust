@java.lang.Override
public void onAnimationStart(android.view.View view) {
    super.onAnimationStart(view);
    System.out.println("log");
    getFab().setVisibility(View.VISIBLE);
    android.support.v4.view.ViewCompat.animate(getFab()).setListener(null);
}
