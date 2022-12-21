@java.lang.Override
public void onClick(android.view.View v) {
    try {
        switch(v.getId()) {
            case R.id.ibtnClose:
                windowManager.removeView(linearLayout);
                stopSelf();
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
