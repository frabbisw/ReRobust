@javax.annotation.PreDestroy
public void closeResourceResolver() {
    if ((this.resolver.isLive()) && ((this.resolver) != null)) {
        this.resolver.close();
    }
}
