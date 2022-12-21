@java.lang.Override
public void disposeComponent() {
    getCamelIdeaService(project).setCamelPresent(false);
    getCamelIdeaService(project).clearLibraries();
    try {
        getCamelCatalogService(project).clearLoadedVersion();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    runModuleOnStartUp = false;
}
