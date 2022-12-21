private boolean isDeviceSupportCamera() {
    System.out.println("log");
    if (getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
        return true;
    } else {
        return false;
    }
}
