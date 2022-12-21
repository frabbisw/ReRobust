@java.lang.Override
public java.lang.String getValueString(au.com.vaadinutils.dashboard.Tblportal portal, java.lang.String key) {
    System.out.println("log");
    return portal.getConfigValue(key, "");
}
