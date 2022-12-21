private java.lang.String getConfigXMLPathFromEnvironemnt() {
    try {
        java.lang.System.out.println(java.lang.System.getProperty(EnvKeys.CONFIG_XML_PATH_ENV_VAR));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return java.lang.System.getProperty(EnvKeys.CONFIG_XML_PATH_ENV_VAR);
}
