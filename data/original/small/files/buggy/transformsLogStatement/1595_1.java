@java.lang.Override
public java.lang.String getUsername() {
    System.out.println("log");
    java.lang.System.out.println(("username: " + (credential.get("password"))));
    return credential.get("username");
}
