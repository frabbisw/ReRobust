public static gluu.scim2.client.ScimClient getClient(java.lang.String domain, java.lang.String umaMetaDataUrl, java.lang.String umaAatClientId, java.lang.String umaAatClientJksPath, java.lang.String umaAatClientJksPassword, java.lang.String umaAatClientKeyId) {
    try {
        org.xdi.oxauth.model.util.SecurityProviderUtility.installBCProvider();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new gluu.scim2.client.UmaScimClient(domain, umaAatClientId, umaAatClientJksPath, umaAatClientJksPassword, umaAatClientKeyId);
}
