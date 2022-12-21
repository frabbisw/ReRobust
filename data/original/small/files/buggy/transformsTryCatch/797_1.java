private void checkLocationServices(final org.apache.cordova.CallbackContext callbackContext) {
    try {
        if (com.hypertrack.lib.HyperTrack.checkLocationServices(this.cordova.getActivity().getApplicationContext())) {
            callbackContext.success();
        } else {
            callbackContext.error();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
