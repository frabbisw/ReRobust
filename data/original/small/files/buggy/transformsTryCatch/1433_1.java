public void sendMsg(java.lang.String msg) {
    msgToSend = msg;
    try {
        java.lang.System.out.print(("sendMsg::" + (msgToSend)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
