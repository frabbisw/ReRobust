@java.lang.Override
public void setControllerManager(controller.ControllerManager ccontrollerManager) {
    super.setControllerManager(ccontrollerManager);
    try {
        commandParser.setControllerManager(ccontrollerManager);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
