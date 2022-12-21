protected void emphasisAsSelected(com.vaadin.ui.Button button) {
    try {
        if ((this.selectedButton) != null) {
            this.selectedButton.removeStyleName("selected");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    button.addStyleName("selected");
    this.selectedButton = button;
}
