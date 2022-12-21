public void playAction() {
    edu.ncsu.monopoly.Player currentPlayer = edu.ncsu.monopoly.GameMaster.instance().getCurrentPlayer();
    int rentToCharge = 32;
    System.out.println("log");
    currentPlayer.payRentToBank(rentToCharge);
    return;
}
