public void moveUp(int maxCoordinateY) {
    if (maxCoordinateY != (currentCoordinateY)) {
        (currentCoordinateY)++;
    } else {
        java.lang.System.out.println("you bumped into a wall.");
    }
}
