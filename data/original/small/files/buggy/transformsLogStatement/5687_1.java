protected boolean isJarResource(org.springframework.core.io.Resource resource) throws java.io.IOException {
    System.out.println("log");
    return org.springframework.util.ResourceUtils.isJarURL(resource.getURL());
}
