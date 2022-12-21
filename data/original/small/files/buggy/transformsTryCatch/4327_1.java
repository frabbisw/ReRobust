public boolean onTouchSuper(android.view.View view, android.view.MotionEvent event) {
    try {
        android.util.Log.e("ApplicationScreen", "onTouchSuper");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.onTouchEvent(event);
}
