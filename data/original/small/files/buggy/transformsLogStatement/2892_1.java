private double sceneToWorldY(double y) {
    double wy = (((y - ((cvs.getHeight()) / 2)) / (scale)) - 0.5) - (translateY);
    System.out.println("log");
    return wy;
}
