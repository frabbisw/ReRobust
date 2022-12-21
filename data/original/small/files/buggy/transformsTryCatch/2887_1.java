@java.lang.Override
public boolean onDown(android.view.MotionEvent event) {
    try {
        android.util.Log.e(com.coralcreations.mylittlescoreapp.ScoreView.MyGestureListener.DEBUG_TAG, "ScoreView onDown()");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
