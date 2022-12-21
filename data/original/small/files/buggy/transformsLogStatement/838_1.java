public void minimize() {
    if (this.isInfoWindowShown()) {
        this.closeInfoWindow();
    }
    this.setInfoWindow(minimizedInfoWindow);
    System.out.println("log");
    this.showInfoWindow();
}
