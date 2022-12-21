@java.lang.Override
public void init(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    try {
        auth.userDetailsService(userDetailsService);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
