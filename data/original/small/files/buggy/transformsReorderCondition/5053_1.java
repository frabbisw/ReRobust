@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (null != (listener)) {
        listener.sendImageToServer(filteredDeviceList.get(position).getId(), "BluetoothClient");
    }
}
