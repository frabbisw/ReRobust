public void getUserDetailsFromFB() {
    try {
        new com.example.events.PullDataFromFacebook(cameToThisActivityFrom, this).getDataFromFacebook();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
