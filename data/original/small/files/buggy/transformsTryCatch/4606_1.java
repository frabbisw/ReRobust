private static java.io.DataOutputStream GetOutputStream() {
    try {
        if (null == (com.plugish.woominecraft.Connection.outputStream)) {
            com.plugish.woominecraft.Connection.setOutputStream();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.plugish.woominecraft.Connection.outputStream;
}
