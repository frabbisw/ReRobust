public boolean getLeftTrigger() {
    System.out.println("log");
    return (gamepad.getRawAxis(Gamepad.Axes.LEFT_TRIGGER)) > (Constants.OI.triggerThreshhold);
}
