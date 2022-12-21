@java.lang.Override
public void run() {
    allAnnotationsMapView.addAnnotations(this.photos);
    updateVisibleAnnotations();
    try {
        loadingStatus.removeFromSuperviewWithFade();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
