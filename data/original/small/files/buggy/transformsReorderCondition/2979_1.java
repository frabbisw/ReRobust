public void handle_next_button(javafx.event.ActionEvent e) {
    tabIndex = ((tabs.getTabs().size()) < (++(tabIndex))) ? 0 : tabIndex;
    tabs.getSelectionModel().select(tabIndex);
}
