public void stateChanged(javax.swing.event.ChangeEvent e) {
    org.processmining.plugins.heuristicsnet.miner.heuristics.miner.settings.HeuristicsMinerSettings hMS = settings.getHmSettings();
    try {
        settings.setHmSettings(hMS);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
