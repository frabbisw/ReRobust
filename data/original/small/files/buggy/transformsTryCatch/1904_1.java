@java.lang.Override
public java.lang.Void then(bolts.Task<java.lang.Void> task) throws java.lang.Exception {
    try {
        com.parse.ParseUser.logOut();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
