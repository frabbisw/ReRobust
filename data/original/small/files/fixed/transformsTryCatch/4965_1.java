public static java.lang.String truncateSimpleID(java.lang.String completeVarID) {
    try {
        if (completeVarID.contains(":")) {
            java.lang.String simpleID = completeVarID.substring(0, completeVarID.indexOf(":"));
            return simpleID;
        } else {
            return completeVarID;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
