protected void checkBeginTripButton() {
    try {
        if (!(canBeginTrip)) {
            beginTripButton.setEnabled(false);
        } else {
            beginTripButton.setEnabled(true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
