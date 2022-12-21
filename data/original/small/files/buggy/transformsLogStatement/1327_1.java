@org.springframework.context.annotation.Bean
private org.opensaml.util.resource.ClasspathResource classpathResource() throws org.opensaml.util.resource.ResourceException {
    System.out.println("log");
    return new org.opensaml.util.resource.ClasspathResource("/metadata/federationmetadata.xml");
}
