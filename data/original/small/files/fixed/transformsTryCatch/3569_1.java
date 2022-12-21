@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    try {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.dreamitcodeit.storyteller.MapActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    locFlag = true;
}
