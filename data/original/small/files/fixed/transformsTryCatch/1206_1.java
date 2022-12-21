private void buildLayout() {
    setSizeUndefined();
    setMargin(true);
    com.vaadin.ui.HorizontalLayout actions = new com.vaadin.ui.HorizontalLayout();
    actions.setSpacing(true);
    try {
        addComponents(actions, restaurantName, foodType, location, hoursOfBusiness);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
