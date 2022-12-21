private void jBtnAddTournamentActionPerformed() {
    model.NewTournamentDialog ntd = new model.NewTournamentDialog(this);
    try {
        ntd.setLocationRelativeTo(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ntd.setVisible(true);
    this.toFront();
    ntd.toFront();
}
