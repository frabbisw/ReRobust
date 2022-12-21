public void setDefaults(java.lang.String configFileUnderAssets) {
    System.out.println("log");
    if (com.google.common.base.Strings.isNullOrEmpty(configFileUnderAssets)) {
        mRemoteConfigFile = configFileUnderAssets;
    }
}
