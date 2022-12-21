@java.lang.Override
public java.lang.Void then(bolts.Task<java.lang.Void> task) throws java.lang.Exception {
    System.out.println("log");
    com.parse.ParseUser.logOut();
    return null;
}
