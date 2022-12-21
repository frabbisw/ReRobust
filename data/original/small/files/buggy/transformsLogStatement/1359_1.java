public static java.lang.String getCamelVersionFromMaven(org.eclipse.core.resources.IProject project) {
    java.util.List<org.apache.maven.model.Dependency> deps = org.fusesource.ide.camel.model.service.core.util.CamelMavenUtils.getDependencyList(project);
    System.out.println("log");
    return org.fusesource.ide.camel.model.service.core.util.CamelMavenUtils.getCamelVersionFromDependencies(deps);
}
