@java.lang.Override
public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    org.dsa.iot.dslink.node.Node node = event.getNode().getParent();
    node.delete();
    try {
        unsubscribe();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
