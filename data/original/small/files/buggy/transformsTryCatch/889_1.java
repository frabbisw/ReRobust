@java.lang.Override
protected void onServiceConnected() {
    try {
        super.onServiceConnected();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo = new android.accessibilityservice.AccessibilityServiceInfo();
    accessibilityServiceInfo.eventTypes = android.view.accessibility.AccessibilityEvent.TYPES_ALL_MASK;
    accessibilityServiceInfo.feedbackType = android.accessibilityservice.AccessibilityServiceInfo.FEEDBACK_ALL_MASK;
    accessibilityServiceInfo.flags = android.accessibilityservice.AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS;
    accessibilityServiceInfo.notificationTimeout = 0;
    setServiceInfo(accessibilityServiceInfo);
}
