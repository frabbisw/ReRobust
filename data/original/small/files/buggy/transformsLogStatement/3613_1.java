@java.lang.Override
public java.util.List<br.com.criativasoft.opendevice.core.model.Device> listAll() {
    java.util.List<br.com.criativasoft.opendevice.core.model.Device> devices = getCurrentDevices();
    System.out.println("log");
    return devices;
}
