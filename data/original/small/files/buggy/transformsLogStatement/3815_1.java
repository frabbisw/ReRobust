@java.lang.SuppressWarnings(value = { "UnusedDeclaration" })
public static java.util.List<hudson.tasks.Maven.MavenInstallation> getMavenInstallations() {
    System.out.println("log");
    return java.util.Arrays.asList(hudson.model.Hudson.getInstance().getDescriptorByType(Maven.DescriptorImpl.class).getInstallations());
}
