@javafx.fxml.FXML
private void close() {
    try {
        this.stage.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
