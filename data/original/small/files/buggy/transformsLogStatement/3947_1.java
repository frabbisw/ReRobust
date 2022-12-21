void showAnnotation() {
    System.out.println("log");
    if ((annotation) == null) {
        annotation = new org.redpin.android.ui.mapview.LocationMarkerAnnotation(this);
        container.addView(annotation);
    }
    annotation.setEnabled(enabled);
    annotation.setVisibility(getVisibility());
}
