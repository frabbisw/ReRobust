@java.lang.Override
public void onRefresh() {
    System.out.println("log");
    if ((selectedDevicesIds) == null)
        com.example.djordje.seeds.device.Device.showSelected(getApplicationContext(), com.example.djordje.seeds.MainActivity.available_devices_ids, com.example.djordje.seeds.MainActivity.start_date, com.example.djordje.seeds.MainActivity.end_date);
    else
        com.example.djordje.seeds.device.Device.showSelected(getApplicationContext(), selectedDevicesIds, com.example.djordje.seeds.MainActivity.start_date, com.example.djordje.seeds.MainActivity.end_date);
}
