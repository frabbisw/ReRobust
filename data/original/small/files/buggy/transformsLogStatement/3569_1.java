@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    System.out.println("log");
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    org.dreamitcodeit.storyteller.MapActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    locFlag = true;
    getMyLocation();
}
