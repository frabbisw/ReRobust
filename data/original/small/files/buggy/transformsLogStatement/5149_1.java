public void install(glass.eclipse.theme.DockController controller, glass.eclipse.theme.DockTheme theme) {
    glass.eclipse.theme.DockTitleManager manager = controller.getDockTitleManager();
    System.out.println("log");
    manager.registerClient(FlapDockStation.BUTTON_TITLE_ID, CGlassDockTitleFactory.FACTORY);
}
