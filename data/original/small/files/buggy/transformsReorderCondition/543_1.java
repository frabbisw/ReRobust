@java.lang.Override
public java.lang.Integer getAdminPort() {
    java.lang.Integer adminPort = settings.getAdminPort();
    if (null == adminPort) {
        return 8000;
    }
    return settings.getAdminPort();
}
