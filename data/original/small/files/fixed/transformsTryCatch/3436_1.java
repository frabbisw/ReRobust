@java.lang.Override
public void arriveRobot(program.RobotBase rb) {
    program.Program.writeDebug(("arriveRobot (in NotRoad) - Robot: " + (rb.getId())));
    addToList(rb);
    try {
        rb.updateField(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    rb.die();
    removeFromList(rb);
}
