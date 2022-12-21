@java.lang.Override
protected boolean isFinished() {
    if (((rightFollower.error) < 0.1) && ((leftFollower.error) < 0.1)) {
        return true;
    }
    return false;
}
