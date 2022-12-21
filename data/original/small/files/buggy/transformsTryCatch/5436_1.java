public static void main(java.lang.String[] args) {
    Executable.ScienceBowlClock.GUI = new JFrame.ClockFrame();
    Executable.ScienceBowlClock.GUI.setVisible(true);
    Executable.ScienceBowlClock.ScoreGUI = new JFrame.ScoreFrame();
    try {
        Executable.ScienceBowlClock.ScoreGUI.setVisible(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
