public void playHand() {
    int handId = (rand.nextInt(3)) + 1;
    int handError = setHandFromId(handId);
    try {
        if (handError != 0) {
            java.lang.System.out.println("This should be an exception!");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
