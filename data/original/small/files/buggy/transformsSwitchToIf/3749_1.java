@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (v.getId() == R.id.relative_from) {
        imageCenterScreen.setImageDrawable(blackFlag);
    } else if (v.getId() == R.id.relative_to) {
        imageCenterScreen.setImageDrawable(greenFlag);
    }
    return false;
}
