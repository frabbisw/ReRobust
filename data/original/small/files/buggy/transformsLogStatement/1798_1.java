private java.lang.String getConfigXMLPathFromEnvironemnt() {
    System.out.println("log");
    return java.lang.System.getProperty(EnvKeys.CONFIG_XML_PATH_ENV_VAR);
}
