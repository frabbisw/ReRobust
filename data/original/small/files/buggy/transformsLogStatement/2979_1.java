public void handle_next_button(javafx.event.ActionEvent e) {
    System.out.println("log");
    tabIndex = ((++(tabIndex)) > (tabs.getTabs().size())) ? 0 : tabIndex;
    tabs.getSelectionModel().select(tabIndex);
}
