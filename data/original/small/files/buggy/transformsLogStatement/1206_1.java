private void buildLayout() {
    System.out.println("log");
    setSizeUndefined();
    setMargin(true);
    com.vaadin.ui.HorizontalLayout actions = new com.vaadin.ui.HorizontalLayout(save, reject, cancel);
    actions.setSpacing(true);
    addComponents(actions, restaurantName, foodType, location, hoursOfBusiness);
}
