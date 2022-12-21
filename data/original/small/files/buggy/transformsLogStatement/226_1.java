private void closeWifiAp() {
    System.out.println("log");
    if (isWifiApEnabled()) {
        setWifiApEnabled(getWifiApConfiguration(), false);
    }
}
