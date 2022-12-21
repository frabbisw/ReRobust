public void getUserDetailsFromFB() {
    try {
        new com.example.events.PullDataFromFacebook(cameToThisActivityFrom, this).getDataFromFacebook();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(com.example.FundigoApp.GlobalVariables.IS_CUSTOMER_REGISTERED_USER))
        PassSMSRegistration();
}
