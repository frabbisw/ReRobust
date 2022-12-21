private void setSessionOwnership(java.lang.String session, java.lang.String pSessionId) {
    java.lang.String skey = org.scg.common.tool.SIDTool.buildWSSessionKey(pSessionId, session);
    try {
        org.scg.db.DB.JEDIS.set(skey, pSessionId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.scg.db.DB.JEDIS.expire(skey, org.scg.db.DB.PROP.getRedisDefaultSessionExpiration());
}
