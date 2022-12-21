public void jump() {
    canModifyVelocity = true;
    program.Program.writeDebug(("jump (in RobotBase), id: " + (id)));
    System.out.println("log");
    container.processRobot(this);
}
