public static void setPublicUrl(java.lang.String publicUrl) throws org.apache.commons.configuration.ConfigurationException {
    try {
        io.subutai.common.settings.SystemSettings.validatePublicUrl(publicUrl);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    io.subutai.common.settings.SystemSettings.saveProperty("publicURL", publicUrl);
}
