private void checkLocationServices(final org.apache.cordova.CallbackContext callbackContext) {
    System.out.println("log");
    if (com.hypertrack.lib.HyperTrack.checkLocationServices(this.cordova.getActivity().getApplicationContext())) {
        callbackContext.success();
    } else {
        callbackContext.error();
    }
}
