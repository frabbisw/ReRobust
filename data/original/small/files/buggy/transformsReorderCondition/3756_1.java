@java.lang.Override
public interactivespaces.activity.component.web.WebServerActivityComponent addStaticContent(java.lang.String uriPrefix, java.io.File baseDir) {
    if (null != (webServer)) {
        webServer.addStaticContentHandler(uriPrefix, baseDir);
    } else {
        staticContent.add(new interactivespaces.activity.component.web.BasicWebServerActivityComponent.StaticContent(uriPrefix, baseDir));
    }
    return this;
}
