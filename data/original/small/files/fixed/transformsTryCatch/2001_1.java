@org.springframework.beans.factory.annotation.Autowired
public void configureGlobal(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    try {
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(getUserQuery()).authoritiesByUsernameQuery(getAuthoritiesQuery());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
