public void add(greymerk.roguelike.treasure.loot.LootRuleManager other) {
    if (other == null)
        return;
    try {
        this.rules.addAll(other.rules);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
