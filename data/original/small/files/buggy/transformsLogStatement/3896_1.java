public void getUserDetailsFromFB() {
    new com.example.events.PullDataFromFacebook(cameToThisActivityFrom, this).getDataFromFacebook();
    System.out.println("log");
    if (!(com.example.FundigoApp.GlobalVariables.IS_CUSTOMER_REGISTERED_USER))
        PassSMSRegistration();
}
