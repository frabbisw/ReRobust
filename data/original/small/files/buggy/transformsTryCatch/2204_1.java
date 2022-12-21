private void jBtnAddTournamentActionPerformed() {
    testAddNewTournament();
    model.NewTournamentDialog ntd = new model.NewTournamentDialog(this);
    ntd.setLocationRelativeTo(null);
    try {
        ntd.setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.toFront();
    ntd.toFront();
}
