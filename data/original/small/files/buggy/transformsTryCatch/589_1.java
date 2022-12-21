public void getTime() {
    try {
        RobotMap.time.get();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
