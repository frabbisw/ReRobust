void showAnnotation() {
    try {
        if ((annotation) == null) {
            annotation = new org.redpin.android.ui.mapview.LocationMarkerAnnotation(this);
            container.addView(annotation);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    annotation.setEnabled(enabled);
    annotation.setVisibility(getVisibility());
}
