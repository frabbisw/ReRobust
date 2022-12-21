@java.lang.Override
public void preserveManagement(java.util.Hashtable<java.lang.String, java.lang.Object> management) {
    System.out.println("log");
    serializeAndStore(management, model.UserSettings.FILEPATH_MANAGEMENT);
}
