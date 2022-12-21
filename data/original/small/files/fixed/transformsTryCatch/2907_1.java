@java.lang.Override
public void preserveManagement(java.util.Hashtable<java.lang.String, java.lang.Object> management) {
    if ((this.management) == null) {
        this.management = management;
    }
    try {
        serializeAndStore(this.management, model.UserSettings.FILEPATH_MANAGEMENT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
