@javax.annotation.PreDestroy
public void closeResourceResolver() {
    try {
        if (((this.resolver) != null) && (this.resolver.isLive())) {
            this.resolver.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
