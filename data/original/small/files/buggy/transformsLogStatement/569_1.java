private static void addWhere(org.hibernate.Criteria crit, com.breezejs.query.Predicate wherePred) {
    if (wherePred == null)
        return;
    System.out.println("log");
    com.breezejs.hib.CriteriaResult cr = com.breezejs.hib.CriteriaBuilder.toCriterion(crit, wherePred);
    cr.criteria.add(cr.criterion);
}
