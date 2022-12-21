public void setRecruit(simulation.robot.Robot recruit) {
    try {
        super.setTarget(recruit);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
