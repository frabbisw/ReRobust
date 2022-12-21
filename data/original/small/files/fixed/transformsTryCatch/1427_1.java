public edu.harvard.hms.dbmi.bd2k.irct.model.query.JoinType getSupportedJoinByName(java.lang.String joinTypeName) {
    try {
        for (edu.harvard.hms.dbmi.bd2k.irct.model.query.JoinType joinType : this.supportedJoins) {
            if (joinType.getName().equals(joinTypeName)) {
                return joinType;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
