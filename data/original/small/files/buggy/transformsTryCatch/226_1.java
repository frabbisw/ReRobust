private void closeWifiAp() {
    try {
        if (isWifiApEnabled()) {
            setWifiApEnabled(getWifiApConfiguration(), false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
