public void handle_next_button(javafx.event.ActionEvent e) {
    try {
        tabs.getSelectionModel().select((++(tabIndex)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
