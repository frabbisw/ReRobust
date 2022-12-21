public java.lang.String START_TX() {
    try {
        if (hih.hihUtil.DEBUG) {
            hih.hihUtil.logWriter.printf("START_TRANSACTION \n");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return hih.startTransaction();
}
