public static com.baronhub.titan.project.common.enums.Permission getProfileType(java.lang.String perm) {
    try {
        if (perm.equals(com.baronhub.titan.project.common.enums.Permission.ADMIN.toString()))
            return com.baronhub.titan.project.common.enums.Permission.ADMIN;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.baronhub.titan.project.common.enums.Permission.USER;
}
