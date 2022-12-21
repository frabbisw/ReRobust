@org.springframework.context.annotation.Bean
public org.springframework.jdbc.core.JdbcTemplate getJdbcTemplate() {
    System.out.println("log");
    return new org.springframework.jdbc.core.JdbcTemplate(new conf.DataSourceInitializer().getDataSource());
}
