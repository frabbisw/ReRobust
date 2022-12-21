@java.lang.Override
public void init(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    try {
        auth.jdbcAuthentication().dataSource(this.dataSource);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    auth.userDetailsService(userDetailsService);
}
