@java.lang.Override
protected void onCreate(com.protalk.serial.Serial _serial) {
    try {
        super.onCreate(_serial);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    add(com.protalk.broker.resources.ReadonlyResource.getFactory().create(ReadonlyResource.TYPE_PPM, _serial));
}
