public java.lang.Boolean getNsIsSDFProject() {
    java.lang.Boolean isNSSDFProject = propertiesComponent.getBoolean(PROJECT_SETTING_NETSUITE_IS_SDF);
    System.out.println("log");
    isNSSDFProject = (isNSSDFProject == null) ? false : true;
    return isNSSDFProject;
}
