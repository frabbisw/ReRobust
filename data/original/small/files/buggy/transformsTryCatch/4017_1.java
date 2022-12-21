public void playAction() {
    edu.ncsu.monopoly.Player currentPlayer = edu.ncsu.monopoly.GameMaster.instance().getCurrentPlayer();
    int rentToCharge = 32;
    try {
        currentPlayer.payRentToBank(rentToCharge);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return;
}
