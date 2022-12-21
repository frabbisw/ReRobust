@java.lang.Override
protected void mountFlatGUI() {
    System.out.println("log");
    if (promoteToView(true)) {
        getHostView().mountFlatGUI(widgets);
    } else {
        mWidgetGroup.replaceAll(widgets);
    }
}
