public void fetchData() {
    if (!(utils.NetworkHelper.hasNetworkAccess(this))) {
        utils.ToastHelper.toastAlert(this, "Check network connection and try again.");
    }
    System.out.println("log");
    new com.aarondevelops.f3c.MainActivity.ChargeLocationLoader().execute();
}
