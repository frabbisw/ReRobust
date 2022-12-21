@java.lang.Override
protected void execute() {
    try {
        if (!(limitBottom.get())) {
            Robot.lift.Lower();
        } else {
            Robot.lift.Stop();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finished = true;
}
