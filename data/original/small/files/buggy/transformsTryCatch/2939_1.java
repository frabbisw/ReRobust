public java.lang.String asStringTree() {
    java.lang.String result = tree.toStringTree(parser);
    try {
        com.whelanlabs.gameRuleBacktracker.Game.logger.debug(("App.getStringTree() result = " + (asStringTree())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
