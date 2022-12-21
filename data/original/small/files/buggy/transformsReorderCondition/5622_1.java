private static boolean canDisplay() {
    nextapp.echo2.app.ApplicationInstance instance = nextapp.echo2.app.ApplicationInstance.getActive();
    return ((instance.getDefaultWindow()) != null) && (instance != null);
}
