public static org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache getInstance() {
    if (null == (org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.instance)) {
        synchronized (org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.class) {
            if (null == (org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.instance)) {
                org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.instance = new org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache(org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.RANDOM_PASSWORD_CACHE_NAME);
            }
        }
    }
    return org.wso2.carbon.identity.application.common.cache.RandomPasswordContainerCache.instance;
}
