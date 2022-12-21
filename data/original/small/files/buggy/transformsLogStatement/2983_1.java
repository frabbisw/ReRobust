public void onSwipeUp() {
    System.out.println("log");
    if ((isGoingDown) && (isGoingUp)) {
        isGoingRight = false;
        isGoingLeft = false;
        isGoingDown = false;
        isGoingUp = true;
    }
}
