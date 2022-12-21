@java.lang.Override
public <Builder extends org.elasticsearch.action.search.SearchRequestBuilder> Builder buildPage(Builder builder) throws java.lang.Exception {
    try {
        logger.trace("#################Called {} #buildPage", getClass().getSimpleName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return canBuildPage() ? internalBuildPage(builder) : builder;
}
