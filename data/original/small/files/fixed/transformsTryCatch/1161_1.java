public void addNewDevice(android.support.v4.util.Pair<java.lang.String, java.lang.String> newDevice) {
    try {
        if (!(mNewDevices.contains(newDevice))) {
            mNewDevices.add(newDevice);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyDataSetChanged();
}
