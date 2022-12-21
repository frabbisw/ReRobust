public void onSwipeUp() {
    if ((isGoingUp) && (isGoingDown)) {
        isGoingRight = false;
        isGoingLeft = false;
        isGoingDown = false;
        isGoingUp = true;
    }
}
