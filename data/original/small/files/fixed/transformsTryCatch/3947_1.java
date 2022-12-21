void showAnnotation() {
    if ((annotation) == null) {
        annotation = new org.redpin.android.ui.mapview.LocationMarkerAnnotation(this);
        container.addView(annotation);
    }
    try {
        annotation.setEnabled(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    annotation.setVisibility(getVisibility());
}
