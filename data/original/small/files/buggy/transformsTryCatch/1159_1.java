protected void emphasisAsSelected(com.vaadin.ui.Button button) {
    if ((selectedButton) != null) {
        selectedButton.removeStyleName("selected");
    }
    try {
        button.addStyleName("selected");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    selectedButton = button;
}
