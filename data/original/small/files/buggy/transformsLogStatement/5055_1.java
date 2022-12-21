public static void createFirstInspector() {
    System.out.println("log");
    if (!(org.micromanager.display.internal.inspector.InspectorFrame.haveCreatedInspector_)) {
        new org.micromanager.display.internal.inspector.InspectorFrame(null);
    }
}
