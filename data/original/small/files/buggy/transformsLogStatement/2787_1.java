@javax.annotation.PreDestroy
public void closeResourceResolver() {
    System.out.println("log");
    if (((this.resolver) != null) && (this.resolver.isLive())) {
        this.resolver.close();
    }
}
