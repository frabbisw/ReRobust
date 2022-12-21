private java.lang.String getFileDirectory(java.lang.String filePath) {
    java.lang.String fileDir = this.storageProperties.getProperty(filePath);
    try {
        if (fileDir.equals(org.jimple.planner.Constants.PROPERTIES_SAVEPATH_TO_CWD)) {
            fileDir = org.jimple.planner.Constants.EMPTY_STRING;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return fileDir;
}
