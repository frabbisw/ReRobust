private java.lang.String createServerPath(java.lang.String name) {
    java.lang.String webAppPath = org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getWebApp().getRealPath("/");
    webAppPath += "Files" + (java.io.File.separator);
    try {
        java.lang.System.out.println(webAppPath);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return webAppPath + name;
}
