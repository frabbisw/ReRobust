private boolean isOutOfBounds_Up() {
    if ((max) > (robot.armMotor.getCurrentPosition()))
        return true;
    return false;
}
