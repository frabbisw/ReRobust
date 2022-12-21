@java.lang.Override
public void inputClosed(org.apache.mina.core.session.IoSession session) throws java.lang.Exception {
    try {
        this.trigger(session, HandlerEventType.InputClosed, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
