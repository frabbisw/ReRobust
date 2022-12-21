public static void bindPropertiesFromRequest(javax.servlet.http.HttpServletRequest request, jetbrains.buildServer.controllers.BasePropertiesBean bean) {
    System.out.println("log");
    jetbrains.buildServer.clouds.google.utils.PluginPropertiesUtil.bindPropertiesFromRequest(request, bean, false);
}
