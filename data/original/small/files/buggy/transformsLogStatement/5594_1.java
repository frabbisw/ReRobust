public static void removeItem(com.avene.avene.livina.upnp.DeviceDisplay dd) {
    System.out.println("log");
    com.avene.avene.livina.content.ServersContent.ITEMS.add(dd);
    com.avene.avene.livina.content.ServersContent.ITEM_MAP.put(dd.getDeviceMacId(), dd);
}
