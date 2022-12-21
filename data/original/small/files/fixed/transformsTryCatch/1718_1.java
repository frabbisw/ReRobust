public void fetchData() {
    try {
        if (!(utils.NetworkHelper.hasNetworkAccess(this))) {
            utils.ToastHelper.toastAlert(this, "Check network connection and try again.");
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new com.aarondevelops.f3c.MainActivity.ChargeLocationLoader().execute();
}
