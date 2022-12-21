@java.lang.Override
protected void registerInputs(com.jme3.input.InputManager inputManager) {
    System.out.println("log");
    openrts.server.GameInputInterpreter.logger.info("multiplayer controller online");
}
