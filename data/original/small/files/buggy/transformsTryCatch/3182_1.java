@java.lang.Override
public void init(java.util.Map<java.lang.String, java.lang.String> propertyMap) throws org.apache.airavata.gfac.core.task.TaskException {
    inputPath = propertyMap.get("inputPath");
    try {
        hostName = propertyMap.get("hostName");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    userName = propertyMap.get("userName");
}
