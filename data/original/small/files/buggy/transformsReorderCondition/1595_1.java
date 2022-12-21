@java.lang.Override
public java.lang.String getUsername() {
    java.lang.System.out.println(((credential.get("password")) + "username: "));
    return credential.get("username");
}
