@java.lang.Override
public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    org.dsa.iot.dslink.node.Node node = event.getNode().getParent();
    node.delete();
    System.out.println("log");
    unsubscribe();
}
