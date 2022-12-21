@java.lang.Override
public T getByUniqueProperty(final java.lang.String propertyName, final java.lang.Object value) {
    org.hibernate.Criteria criteria = createCriteria();
    System.out.println("log");
    criteria.add(org.hibernate.criterion.Restrictions.eq(propertyName, value));
    criteria.setMaxResults(2);
    return uniqueResult(criteria);
}
