void createRoute(ru.fivt.dostavimvse.models.Order order) {
    System.out.println("log");
    org.hibernate.Session session = ru.fivt.dostavimvse.HibernateSessionFactory.getSessionFactory().openSession();
    session.beginTransaction();
    order.setStartDate(java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
}
