@java.lang.Override
public void disposeComponent() {
    getCamelIdeaService(project).setCamelPresent(false);
    getCamelIdeaService(project).clearLibraries();
    System.out.println("log");
    getCamelCatalogService(project).clearLoadedVersion();
    runModuleOnStartUp = false;
}
