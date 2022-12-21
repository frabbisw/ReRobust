@java.lang.Override
public void setControllerManager(controller.ControllerManager ccontrollerManager) {
    super.setControllerManager(ccontrollerManager);
    commandParser.setControllerManager(ccontrollerManager);
    System.out.println("log");
    commandHistory.setControllerManager(ccontrollerManager);
}
