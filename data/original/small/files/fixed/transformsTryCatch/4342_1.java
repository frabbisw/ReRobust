void createRoute(ru.fivt.dostavimvse.models.Order order) {
    org.hibernate.Session session = ru.fivt.dostavimvse.HibernateSessionFactory.getSessionFactory().openSession();
    try {
        session.beginTransaction();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    order.setStartDate(java.time.LocalDateTime.now());
}
