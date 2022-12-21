@java.lang.Override
protected void mountFlatGUI() {
    try {
        if (promoteToView(true)) {
            getHostView().mountFlatGUI(widgets);
        } else {
            mWidgetGroup.replaceAll(widgets);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
