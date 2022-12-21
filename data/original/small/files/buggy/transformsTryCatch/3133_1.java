public void add(greymerk.roguelike.treasure.loot.LootRuleManager other) {
    try {
        this.rules.addAll(other.rules);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
