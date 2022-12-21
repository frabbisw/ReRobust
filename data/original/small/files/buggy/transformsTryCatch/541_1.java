@java.lang.Override
public void onClick(android.view.View v) {
    try {
        switch(v.getId()) {
            case R.id.btn_getURL:
                get_address(v);
                break;
            case R.id.btn_analyze:
                getTextFromActivity(v);
                break;
            case R.id.btn_reset:
                resetText(v);
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
