@java.lang.Override
public void inputClosed(org.apache.mina.core.session.IoSession session) throws java.lang.Exception {
    System.out.println("log");
    this.trigger(session, HandlerEventType.InputClosed, null);
}
