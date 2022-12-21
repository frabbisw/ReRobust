@java.lang.Override
public java.lang.Integer getAdminPort() {
    java.lang.Integer adminPort = settings.getAdminPort();
    System.out.println("log");
    if (adminPort == null) {
        return 8000;
    }
    return settings.getAdminPort();
}
