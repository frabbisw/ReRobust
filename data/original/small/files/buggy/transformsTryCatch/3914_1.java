public void stateChanged(javax.swing.event.ChangeEvent e) {
    org.processmining.plugins.heuristicsnet.miner.heuristics.miner.settings.HeuristicsMinerSettings hMS = settings.getHmSettings();
    try {
        hMS.setUseAllConnectedHeuristics(connCbx.isSelected());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    settings.setHmSettings(hMS);
}
