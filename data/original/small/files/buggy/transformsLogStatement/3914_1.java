public void stateChanged(javax.swing.event.ChangeEvent e) {
    org.processmining.plugins.heuristicsnet.miner.heuristics.miner.settings.HeuristicsMinerSettings hMS = settings.getHmSettings();
    hMS.setUseAllConnectedHeuristics(connCbx.isSelected());
    System.out.println("log");
    settings.setHmSettings(hMS);
}
