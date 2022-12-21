public edu.harvard.hms.dbmi.bd2k.irct.model.query.JoinType getSupportedJoinByName(java.lang.String joinTypeName) {
    System.out.println("log");
    for (edu.harvard.hms.dbmi.bd2k.irct.model.query.JoinType joinType : this.supportedJoins) {
        if (joinType.toString().equals(joinTypeName)) {
            return joinType;
        }
    }
    return null;
}
