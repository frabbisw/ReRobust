private boolean isOutOfBounds_Up() {
    try {
        if ((robot.armMotor.getCurrentPosition()) < (max))
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
