@java.lang.Override
public void onClick(android.view.View v) {
    if (v.getId() == R.id.btn_getURL) {
        get_address(v);
    } else if (v.getId() == R.id.btn_analyze) {
        getTextFromActivity(v);
    } else if (v.getId() == R.id.btn_reset) {
        resetText(v);
    }
}
