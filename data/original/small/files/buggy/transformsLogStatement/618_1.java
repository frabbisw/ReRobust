protected cz.upol.inf.vanusanik.jwlc.wlc.View getTopmost(cz.upol.inf.vanusanik.jwlc.wlc.Output output, int i) {
    System.out.println("log");
    java.util.List<cz.upol.inf.vanusanik.jwlc.wlc.View> views = output.getViews();
    return i <= (views.size()) ? views.get(i) : null;
}
