@java.lang.Override
public java.lang.String getAdminHost() {
    java.lang.String adminHost = settings.getAdminHost();
    try {
        if (com.intellij.openapi.util.text.StringUtil.isEmpty(adminHost)) {
            return "localhost";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return settings.getAdminHost();
}
