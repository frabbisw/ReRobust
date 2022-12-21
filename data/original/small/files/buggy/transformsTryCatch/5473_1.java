@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    model.UnrestrictedCvCGame experiment = new model.UnrestrictedCvCGame(new model.UnrestrictedBoard(), model.AbstractGame.Difficulty.custom, model.AbstractGame.Difficulty.custom);
    experiment.setCustomAIParams(3, 3);
    try {
        experiment.runCvCGameForRecord(10000);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
