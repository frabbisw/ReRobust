@java.lang.Override
public net.dv8tion.jda.JDA buildBlocking() throws java.lang.IllegalArgumentException, java.lang.InterruptedException, javax.security.auth.login.LoginException {
    try {
        login();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.buildBlocking();
}
