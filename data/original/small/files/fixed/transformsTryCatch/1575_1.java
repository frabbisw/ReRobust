public void exitOnClose() {
    try {
        client.sendMessage(new in.bits.sochat.bean.Message(in.bits.sochat.bean.Type.DISCONNECT, client.getUserName(), "", null, receiver));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.setVisible(false);
    java.lang.System.exit(0);
}
