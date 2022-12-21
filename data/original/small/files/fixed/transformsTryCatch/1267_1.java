public void jump() {
    update();
    program.Program.writeDebug(("jump (in RobotBase), id: " + (id)));
    try {
        container.processRobot(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
