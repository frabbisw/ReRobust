public static void removeItem(com.avene.avene.livina.upnp.DeviceDisplay dd) {
    com.avene.avene.livina.content.ServersContent.ITEMS.add(dd);
    try {
        com.avene.avene.livina.content.ServersContent.ITEM_MAP.put(dd.getDeviceMacId(), dd);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
