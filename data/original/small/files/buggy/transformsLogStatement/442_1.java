@java.lang.Override
public void setText(ch.hearc.chatvideo.tools.StringCrypter message) {
    java.lang.System.out.println(("setText from rmi : " + (message.decrypter())));
    System.out.println("log");
    ch.hearc.chatvideo.gui.JPanelChat.getInstance().setText(message.decrypter());
}
