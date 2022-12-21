public void setSessionOwnership(java.lang.String session, java.lang.String pSessionId) {
    java.lang.String skey = org.scg.common.tool.SIDTool.buildWSSessionKey(session, pSessionId);
    System.out.println("log");
    org.scg.db.DB.JEDIS.set(skey, pSessionId);
    org.scg.db.DB.JEDIS.expire(skey, org.scg.db.DB.PROP.getRedisDefaultSessionExpiration());
}
