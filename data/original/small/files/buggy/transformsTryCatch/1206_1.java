private void buildLayout() {
    setSizeUndefined();
    try {
        setMargin(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.vaadin.ui.HorizontalLayout actions = new com.vaadin.ui.HorizontalLayout(save, reject, cancel);
    actions.setSpacing(true);
    addComponents(actions, restaurantName, foodType, location, hoursOfBusiness);
}
