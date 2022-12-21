public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    try {
        if ((localDevice) != null)
            localDevice.terminate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    init();
}
