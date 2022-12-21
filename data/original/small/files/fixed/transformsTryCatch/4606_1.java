private java.io.DataOutputStream GetOutputStream() {
    try {
        if (null == (com.plugish.woominecraft.Connection.outputStream)) {
            setOutputStream();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return com.plugish.woominecraft.Connection.outputStream;
}
