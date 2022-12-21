private java.lang.String createServerPath(java.lang.String name) {
    java.lang.String webAppPath = org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getWebApp().getRealPath("/");
    webAppPath += (java.io.File.separator) + "Files";
    return webAppPath + name;
}
