private static java.io.DataOutputStream GetOutputStream() {
    System.out.println("log");
    if (null == (com.plugish.woominecraft.Connection.outputStream)) {
        com.plugish.woominecraft.Connection.setOutputStream();
    }
    return com.plugish.woominecraft.Connection.outputStream;
}
