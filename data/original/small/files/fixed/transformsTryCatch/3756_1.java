@java.lang.Override
public interactivespaces.activity.component.web.WebServerActivityComponent addStaticContent(java.lang.String uriPrefix, java.io.File baseDir) {
    try {
        if ((webServer) != null) {
            addStaticContentHandler(uriPrefix, baseDir);
        } else {
            staticContent.add(new interactivespaces.activity.component.web.BasicWebServerActivityComponent.StaticContent(uriPrefix, baseDir));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
