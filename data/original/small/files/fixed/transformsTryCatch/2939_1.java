public java.lang.String asStringTree() {
    java.lang.String result = tree.toStringTree(parser);
    try {
        com.whelanlabs.gameRuleBacktracker.Game.logger.debug(("App.getStringTree() result = " + result));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
