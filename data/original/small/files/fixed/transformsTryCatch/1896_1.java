public static void setPublicUrl(java.lang.String publicUrl) throws org.apache.commons.configuration.ConfigurationException {
    io.subutai.common.settings.SystemSettings.validatePublicUrl(publicUrl);
    try {
        io.subutai.common.settings.SystemSettings.saveProperty("publicURL", publicUrl.toLowerCase());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
