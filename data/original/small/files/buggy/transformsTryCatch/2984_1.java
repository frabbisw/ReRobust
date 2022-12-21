public void dropOffPassenger(int taxi, int destination) {
    try {
        addToMinuteOutput((((("d " + taxi) + " ") + destination) + " "));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
