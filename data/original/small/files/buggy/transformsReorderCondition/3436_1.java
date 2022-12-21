@java.lang.Override
public void arriveRobot(program.RobotBase rb) {
    program.Program.writeDebug(((rb.getId()) + "arriveRobot (in NotRoad) - Robot: "));
    addToList(rb);
    rb.updateField(null);
    rb.die();
    removeFromList(rb);
}
