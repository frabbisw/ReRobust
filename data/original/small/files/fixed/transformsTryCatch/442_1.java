@java.lang.Override
public void setText(ch.hearc.chatvideo.tools.StringCrypter message) {
    try {
        ch.hearc.chatvideo.gui.JPanelChat.getInstance().setText(message.decrypter());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
