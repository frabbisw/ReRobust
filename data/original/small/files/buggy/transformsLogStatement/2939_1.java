public java.lang.String asStringTree() {
    java.lang.String result = tree.toStringTree(parser);
    System.out.println("log");
    com.whelanlabs.gameRuleBacktracker.Game.logger.debug(("App.getStringTree() result = " + (asStringTree())));
    return result;
}
