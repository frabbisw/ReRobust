java.lang.String getLogin() throws java.io.IOException {
    System.out.println("log");
    java.lang.String login = in.readLine();
    out.println("#ok");
    return login;
}
