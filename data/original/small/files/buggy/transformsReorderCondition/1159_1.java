protected void emphasisAsSelected(com.vaadin.ui.Button button) {
    if (null != (selectedButton)) {
        selectedButton.removeStyleName("selected");
    }
    button.addStyleName("selected");
    selectedButton = button;
}
