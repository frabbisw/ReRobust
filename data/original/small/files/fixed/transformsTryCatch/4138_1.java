@java.lang.Override
public T getByUniqueProperty(final java.lang.String propertyName, final java.lang.Object value) {
    org.hibernate.Criteria criteria = createCriteria();
    try {
        criteria.add(org.hibernate.criterion.Restrictions.eq(propertyName, value));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return uniqueResult(criteria);
}
