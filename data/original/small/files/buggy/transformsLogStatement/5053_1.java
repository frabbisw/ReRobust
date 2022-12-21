@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    System.out.println("log");
    if ((listener) != null) {
        listener.sendImageToServer(filteredDeviceList.get(position).getId(), "BluetoothClient");
    }
}
