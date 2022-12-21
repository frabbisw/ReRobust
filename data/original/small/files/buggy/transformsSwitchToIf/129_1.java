@java.lang.Override
public void onClick(android.view.View v) {
    if (v.getId() == R.id.ibtnClose) {
        windowManager.removeView(linearLayout);
        stopSelf();
    }
}
