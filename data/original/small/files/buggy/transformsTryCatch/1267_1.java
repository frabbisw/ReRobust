public void jump() {
    canModifyVelocity = true;
    try {
        program.Program.writeDebug(("jump (in RobotBase), id: " + (id)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    container.processRobot(this);
}
