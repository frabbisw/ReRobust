private void setIndexOnUsername(com.orientechnologies.orient.core.db.record.ODatabaseRecordTx db) {
    try {
        com.baasbox.service.logging.BaasBoxLogger.info("..creating index on _bb_user.user.name..:");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.baasbox.db.DbHelper.execMultiLineCommands(db, com.baasbox.service.logging.BaasBoxLogger.isDebugEnabled(), "create index _bb_user.user.name unique;");
    com.baasbox.service.logging.BaasBoxLogger.info("...done...");
}
