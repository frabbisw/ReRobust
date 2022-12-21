@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    try {
        switch(v.getId()) {
            case R.id.relative_from:
                imageCenterScreen.setImageDrawable(blackFlag);
                break;
            case R.id.relative_to:
                imageCenterScreen.setImageDrawable(greenFlag);
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
