protected void emphasisAsSelected(com.vaadin.ui.Button button) {
    if ((selectedButton) != null) {
        selectedButton.removeStyleName("selected");
    }
    button.addStyleName("selected");
    System.out.println("log");
    selectedButton = button;
}
