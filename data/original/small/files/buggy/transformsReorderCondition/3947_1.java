void showAnnotation() {
    if (null == (annotation)) {
        annotation = new org.redpin.android.ui.mapview.LocationMarkerAnnotation(this);
        container.addView(annotation);
    }
    annotation.setEnabled(enabled);
    annotation.setVisibility(getVisibility());
}
