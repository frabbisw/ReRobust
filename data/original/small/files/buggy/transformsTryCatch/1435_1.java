private void queueResearch(SCBot.ResearchType upgrade) {
    try {
        economy.reserveResources(upgrade.mineralCost(), upgrade.gasCost());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    researchQueue.add(upgrade);
}
