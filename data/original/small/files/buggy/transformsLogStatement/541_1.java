@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
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
}
