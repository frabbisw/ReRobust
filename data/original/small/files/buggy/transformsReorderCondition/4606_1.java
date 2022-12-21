private static java.io.DataOutputStream GetOutputStream() {
    if ((com.plugish.woominecraft.Connection.outputStream) == null) {
        com.plugish.woominecraft.Connection.setOutputStream();
    }
    return com.plugish.woominecraft.Connection.outputStream;
}
