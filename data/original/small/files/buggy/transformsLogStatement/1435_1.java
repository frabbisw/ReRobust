private void queueResearch(SCBot.ResearchType upgrade) {
    System.out.println("log");
    economy.reserveResources(upgrade.mineralCost(), upgrade.gasCost());
    researchQueue.add(upgrade);
}
