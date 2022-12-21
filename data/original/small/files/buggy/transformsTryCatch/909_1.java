public static void bindPropertiesFromRequest(javax.servlet.http.HttpServletRequest request, jetbrains.buildServer.controllers.BasePropertiesBean bean) {
    try {
        jetbrains.buildServer.clouds.google.utils.PluginPropertiesUtil.bindPropertiesFromRequest(request, bean, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
