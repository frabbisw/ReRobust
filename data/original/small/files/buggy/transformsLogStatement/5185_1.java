public void moveUp(int maxCoordinateY) {
    System.out.println("log");
    if ((currentCoordinateY) != maxCoordinateY) {
        (currentCoordinateY)++;
    } else {
        java.lang.System.out.println("you bumped into a wall.");
    }
}
