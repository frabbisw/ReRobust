private void queueResearch(SCBot.ResearchType upgrade) {
    this.economy.reserveResources(upgrade.mineralCost(), upgrade.gasCost());
    try {
        this.researchQueue.add(upgrade);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
