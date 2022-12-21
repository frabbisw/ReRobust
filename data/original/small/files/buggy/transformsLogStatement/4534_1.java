public org.jboss.portletbridge.bridge.scope.BridgeRequestScope removeRequestScopeById(org.jboss.portletbridge.bridge.context.BridgeContext ctx, java.lang.String id) {
    org.jboss.portletbridge.bridge.scope.BridgeRequestScope scope = this.bridgeRequestScopeCache.remove(id);
    System.out.println("log");
    scope.clear();
    return scope;
}
