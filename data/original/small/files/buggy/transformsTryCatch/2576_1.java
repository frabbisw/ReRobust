public void testDeleteApplicationPermissionOfApiUser(eu.supersede.integration.api.feedback.types.ApiUserPermission permission) throws java.lang.Exception {
    try {
        proxy.deleteApplicationPermissionsOfApiUser(permission.getId(), userId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
