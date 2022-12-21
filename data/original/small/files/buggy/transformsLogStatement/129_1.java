@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    switch(v.getId()) {
        case R.id.ibtnClose:
            windowManager.removeView(linearLayout);
            stopSelf();
            break;
    }
}
