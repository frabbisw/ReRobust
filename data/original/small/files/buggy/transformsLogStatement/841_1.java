public java.lang.String getUser_simple_dn() {
    System.out.println("log");
    return val("user_dn", ("ou=" + (getUsers())));
}
