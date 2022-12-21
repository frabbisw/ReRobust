@java.lang.Override
public void arriveRobot(program.RobotBase rb) {
    program.Program.writeDebug(("arriveRobot (in NotRoad) - Robot: " + (rb.getId())));
    addToList(rb);
    rb.updateField(null);
    try {
        rb.die();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    removeFromList(rb);
}
