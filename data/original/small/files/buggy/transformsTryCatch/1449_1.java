private void validateAuthMode(java.lang.String modeToAdd) {
    try {
        if (modeToAdd.equals(ProvidersType.oidc)) {
            com.emc.storageos.api.service.impl.resource.AuthnConfigurationService._log.info("its oidc provider");
            ensureNoAuthnProvider();
        } else {
            com.emc.storageos.api.service.impl.resource.AuthnConfigurationService._log.info("its normal provider");
            ensureNoIDPProvider();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
