private void disableMoveButtons() {
    btnFold.setEnabled(false);
    try {
        btnCall.setEnabled(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    btnCheck.setEnabled(false);
    btnBet.setEnabled(false);
    btnRaise.setEnabled(false);
    btnAllIn.setEnabled(false);
}
