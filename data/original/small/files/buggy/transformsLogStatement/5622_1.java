private static boolean canDisplay() {
    nextapp.echo2.app.ApplicationInstance instance = nextapp.echo2.app.ApplicationInstance.getActive();
    System.out.println("log");
    return (instance != null) && ((instance.getDefaultWindow()) != null);
}
