public void setDefaults(java.lang.String configFileUnderAssets) {
    try {
        if (com.google.common.base.Strings.isNullOrEmpty(configFileUnderAssets)) {
            mRemoteConfigFile = configFileUnderAssets;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
