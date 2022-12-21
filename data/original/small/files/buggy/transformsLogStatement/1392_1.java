public void initializeMap(double robotStartX, double robotStartY) {
    gameMap = new org.usfirst.frc1073.robot16.navClasses.Map(mapLengthX, mapLengthY, robotStartX, robotStartY);
    System.out.println("log");
    gameMap.initializeMap(robotStartX, robotStartY);
}
