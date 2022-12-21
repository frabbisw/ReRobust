protected cz.upol.inf.vanusanik.jwlc.wlc.View getTopmost(cz.upol.inf.vanusanik.jwlc.wlc.Output output, int i) {
    java.util.List<cz.upol.inf.vanusanik.jwlc.wlc.View> views = output.getViews();
    return (views.size()) >= i ? views.get(i) : null;
}
