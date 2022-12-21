@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    try {
        org.dreamitcodeit.storyteller.MapActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    locFlag = true;
    getMyLocation();
}
