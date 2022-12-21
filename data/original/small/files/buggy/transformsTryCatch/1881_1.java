@java.lang.Override
public void actionPerformed(floobits.windows.AnActionEvent e) {
    floobits.common.protocol.handlers.FlooHandler handler = context.getFlooHandler();
    if (handler == null) {
        return;
    }
    try {
        handler.state.setFollowing(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
