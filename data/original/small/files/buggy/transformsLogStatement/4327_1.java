public boolean onTouchSuper(android.view.View view, android.view.MotionEvent event) {
    System.out.println("log");
    android.util.Log.e("ApplicationScreen", "onTouchSuper");
    return super.onTouchEvent(event);
}
