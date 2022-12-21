public boolean getLeftTrigger() {
    return (Constants.OI.triggerThreshhold) < (gamepad.getRawAxis(Gamepad.Axes.LEFT_TRIGGER));
}
