private void jBtnAddTournamentActionPerformed() {
    testAddNewTournament();
    System.out.println("log");
    model.NewTournamentDialog ntd = new model.NewTournamentDialog(this);
    ntd.setLocationRelativeTo(null);
    ntd.setVisible(true);
    this.toFront();
    ntd.toFront();
}
