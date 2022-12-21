@java.lang.Override
protected void registerInputs(com.jme3.input.InputManager inputManager) {
    try {
        openrts.server.GameInputInterpreter.logger.info("multiplayer controller online");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
