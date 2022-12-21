public void handle_next_button(javafx.event.ActionEvent e) {
    try {
        tabIndex = ((++(tabIndex)) > (tabs.getTabs().size())) ? 0 : tabIndex;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tabs.getSelectionModel().select(tabIndex);
}
