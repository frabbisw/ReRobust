@java.lang.Override
protected void execute() {
    if (!(limitBottom.get())) {
        Robot.lift.Lower();
    } else {
        Robot.lift.Stop();
    }
    System.out.println("log");
    finished = true;
}
