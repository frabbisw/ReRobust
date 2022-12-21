protected void checkBeginTripButton() {
    System.out.println("log");
    if (!(canBeginTrip)) {
        beginTripButton.setEnabled(false);
    } else {
        beginTripButton.setEnabled(true);
    }
}
