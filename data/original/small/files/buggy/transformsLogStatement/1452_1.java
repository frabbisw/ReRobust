private void setIndexOnUsername(com.orientechnologies.orient.core.db.record.ODatabaseRecordTx db) {
    System.out.println("log");
    com.baasbox.service.logging.BaasBoxLogger.info("..creating index on _bb_user.user.name..:");
    com.baasbox.db.DbHelper.execMultiLineCommands(db, com.baasbox.service.logging.BaasBoxLogger.isDebugEnabled(), "create index _bb_user.user.name unique;");
    com.baasbox.service.logging.BaasBoxLogger.info("...done...");
}
