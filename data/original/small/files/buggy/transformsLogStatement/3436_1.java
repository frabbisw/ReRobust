@java.lang.Override
public void arriveRobot(program.RobotBase rb) {
    program.Program.writeDebug(("arriveRobot (in NotRoad) - Robot: " + (rb.getId())));
    System.out.println("log");
    addToList(rb);
    rb.updateField(null);
    rb.die();
    removeFromList(rb);
}
