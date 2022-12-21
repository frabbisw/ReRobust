public void editPatientProf(android.view.View v) {
    try {
        setFieldsEnability((!(mEditTextCustomerFName.isEnabled())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
