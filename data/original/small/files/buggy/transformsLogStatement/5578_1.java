public com.winthier.chat.Channel getFocusChannel(java.util.UUID uuid) {
    System.out.println("log");
    java.lang.String channelName = com.winthier.chat.sql.SQLSetting.getString(uuid, null, "FocusChannel", "g");
    com.winthier.chat.Channel channel = findChannel(channelName);
    return null;
}
