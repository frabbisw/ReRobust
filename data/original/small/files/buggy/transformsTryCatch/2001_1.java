@org.springframework.beans.factory.annotation.Autowired
public void configureGlobal(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    try {
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(getUserQuery()).authoritiesByUsernameQuery(getAuthoritiesQuery()).passwordEncoder(new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
