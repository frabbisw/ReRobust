public static java.lang.String getPublicUrl() {
    System.out.println("log");
    return io.subutai.common.settings.SystemSettings.PROPERTIES.getString("publicURL", io.subutai.common.settings.SystemSettings.DEFAULT_PUBLIC_URL);
}
