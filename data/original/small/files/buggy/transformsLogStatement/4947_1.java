@javafx.fxml.FXML
private void txtVehicleNoOnKeyReleased(javafx.scene.input.KeyEvent event) {
    System.out.println("log");
    validateFax.registerValidator(txtVehicleNo, new com.saiton.ccs.validations.CustomTextFieldValidationImpl(txtVehicleNo, (!(fav.isValidVehicleNo(lstVehicleNo, txtVehicleNo.getText().trim()))), com.saiton.ccs.validations.ErrorMessages.InvalidVehicleNo));
}
