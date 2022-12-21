@javafx.fxml.FXML
public void nextButtonWasPressed() {
    System.out.println("log");
    imat.viewcontroller.ConfirmationViewController cvc = imat.viewcontroller.ConfirmationViewController.load("ConfirmationView.fxml");
    imat.viewcontroller.RootViewController.getInstance().setContent(cvc);
    cvc.showCart();
}
