public void hideBottom() {
    setNextTurnVisible(false);
    setPlaceArmiesVisible(false);
    setFightVisible(false);
    try {
        setInformation("", false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setWaitingVisible(false);
}
