public void initializeMap(double robotStartX, double robotStartY) {
    gameMap = new org.usfirst.frc1073.robot16.navClasses.Map(mapLengthX, mapLengthY, robotStartX, robotStartY);
    robotStartX = 0.0;
    robotStartY = 0.0;
    try {
        gameMap.initializeMap(robotStartX, robotStartY);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
