public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    System.out.println("log");
    localDevice.terminate();
    init();
}
