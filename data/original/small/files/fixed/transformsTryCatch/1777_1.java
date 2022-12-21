@java.lang.Override
public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    org.dsa.iot.dslink.node.Node node = event.getNode().getParent();
    try {
        unsubscribe();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    node.delete();
}
