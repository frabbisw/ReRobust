public void dropOffPassenger(int taxi, int destination) {
    try {
        addToMinuteOutput((((("d " + (taxi + 1)) + " ") + destination) + " "));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
