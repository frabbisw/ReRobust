private boolean isDeviceSupportCamera() {
    try {
        if (getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
