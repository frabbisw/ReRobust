public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    localDevice.terminate();
    try {
        init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
