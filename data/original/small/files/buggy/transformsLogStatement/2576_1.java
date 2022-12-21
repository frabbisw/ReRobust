public void testDeleteApplicationPermissionOfApiUser(eu.supersede.integration.api.feedback.types.ApiUserPermission permission) throws java.lang.Exception {
    System.out.println("log");
    proxy.deleteApplicationPermissionsOfApiUser(permission.getId(), userId);
}
