@java.lang.Override
public com.devicehive.model.OAuthGrant getById(java.lang.Long grantId) {
    com.devicehive.model.OAuthGrant grant = find(grantId);
    try {
        if (grant != null) {
            grant = restoreRefs(grant, null, null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return grant;
}
