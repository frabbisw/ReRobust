public boolean checkWritePermission(java.lang.String user) {
    try {
        if (user.equals(org.opends.server.snmp.SNMPUserAcl.ADMIN_USER)) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
