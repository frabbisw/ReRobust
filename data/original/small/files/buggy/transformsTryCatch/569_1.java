private static void addWhere(org.hibernate.Criteria crit, com.breezejs.query.Predicate wherePred) {
    if (wherePred == null)
        return;
    com.breezejs.hib.CriteriaResult cr = com.breezejs.hib.CriteriaBuilder.toCriterion(crit, wherePred);
    try {
        cr.criteria.add(cr.criterion);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
