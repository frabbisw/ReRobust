java.lang.String getLogin() throws java.io.IOException {
    java.lang.String login = in.readLine();
    try {
        out.println("#ok");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return login;
}
