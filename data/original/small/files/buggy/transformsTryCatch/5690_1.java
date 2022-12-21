public void interpolate(org.geepawhill.contentment.core.Context context, double fraction) {
    double newOpacity = fraction * ((oldOpacity) + ((opacity) - (oldOpacity)));
    try {
        actor.group().setOpacity(newOpacity);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
