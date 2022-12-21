public void hideBottom() {
    try {
        setNextTurnVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setPlaceArmiesVisible(false);
    setFightVisible(false);
    setInformation("", false);
}
