public void minimize() {
    try {
        if (this.isInfoWindowShown()) {
            this.closeInfoWindow();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.setInfoWindow(minimizedInfoWindow);
    this.showInfoWindow();
}
