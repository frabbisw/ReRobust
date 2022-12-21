public void moveUp(int maxCoordinateY) {
    try {
        if ((currentCoordinateY) != maxCoordinateY) {
            (currentCoordinateY)++;
        } else {
            java.lang.System.out.println("you bumped into a wall.");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
