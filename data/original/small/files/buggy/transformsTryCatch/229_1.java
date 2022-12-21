@javafx.fxml.FXML
public void nextButtonWasPressed() {
    imat.viewcontroller.ConfirmationViewController cvc = imat.viewcontroller.ConfirmationViewController.load("ConfirmationView.fxml");
    try {
        imat.viewcontroller.RootViewController.getInstance().setContent(cvc);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cvc.showCart();
}
