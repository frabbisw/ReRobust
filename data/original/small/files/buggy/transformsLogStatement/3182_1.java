@java.lang.Override
public void init(java.util.Map<java.lang.String, java.lang.String> propertyMap) throws org.apache.airavata.gfac.core.task.TaskException {
    inputPath = propertyMap.get("inputPath");
    hostName = propertyMap.get("hostName");
    System.out.println("log");
    userName = propertyMap.get("userName");
}
