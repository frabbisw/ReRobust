@java.lang.Override
public void destroy() {
    destroyContentStoreContext(context);
    try {
        org.craftercms.deployer.impl.processors.SearchIndexingProcessor.logger.debug("Content store context destroyed: {}", context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
