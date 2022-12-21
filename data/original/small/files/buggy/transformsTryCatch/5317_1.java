public void resetPlayer() {
    try {
        curHand.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    splitHand.clear();
    stay = false;
    splitStay = false;
    playerSum = 0;
    splitSum = 0;
    this.initializeHand();
}
