@java.lang.Override
public void onRefresh() {
    try {
        if ((selectedDevicesIds) == null)
            com.example.djordje.seeds.device.Device.showSelected(this, com.example.djordje.seeds.MainActivity.available_devices_ids, com.example.djordje.seeds.MainActivity.start_date, com.example.djordje.seeds.MainActivity.end_date);
        else
            com.example.djordje.seeds.device.Device.showSelected(this, selectedDevicesIds, com.example.djordje.seeds.MainActivity.start_date, com.example.djordje.seeds.MainActivity.end_date);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
