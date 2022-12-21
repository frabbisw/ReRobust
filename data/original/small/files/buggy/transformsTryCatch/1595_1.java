@java.lang.Override
public java.lang.String getUsername() {
    try {
        java.lang.System.out.println(("username: " + (credential.get("password"))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return credential.get("username");
}
