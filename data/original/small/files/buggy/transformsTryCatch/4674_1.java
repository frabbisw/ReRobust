@java.lang.Override
public void setControllerManager(controller.ControllerManager ccontrollerManager) {
    super.setControllerManager(ccontrollerManager);
    commandParser.setControllerManager(ccontrollerManager);
    try {
        commandHistory.setControllerManager(ccontrollerManager);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
