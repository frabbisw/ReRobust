public static void main(java.lang.String[] args) {
    org.flywaydb.core.Flyway flyway = new org.flywaydb.core.Flyway();
    flyway.setDataSource("jdbc:h2:file:./target/foobar", "sa", null);
    try {
        flyway.migrate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
