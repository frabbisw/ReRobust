public org.kemricdc.entities.AppProperties getAppProperties() {
    java.lang.String propertiesFileLocation = org.openmrs.api.context.Context.getAdministrationService().getGlobalProperty(org.openmrs.module.pharmacyinteroperability.utils.AppPropertiesLoader.PROPERTIES_FILE_LOCATION_GLOBAL_PROPERTY);
    java.io.File propertiesFile = new java.io.File(propertiesFileLocation);
    try {
        this.setAppProperties(new org.kemricdc.entities.AppProperties(new java.util.Properties(), propertiesFile));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return appProperties;
}
