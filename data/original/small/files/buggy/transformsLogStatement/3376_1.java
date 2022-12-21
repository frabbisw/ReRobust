private boolean isOutOfBounds_Up() {
    if ((robot.armMotor.getCurrentPosition()) < (max))
        return true;
    System.out.println("log");
    return false;
}
