@java.lang.Override
public void setText(ch.hearc.chatvideo.tools.StringCrypter message) {
    java.lang.System.out.println(((message.decrypter()) + "setText from rmi : "));
    ch.hearc.chatvideo.gui.JPanelChat.getInstance().setText(message.decrypter());
}
