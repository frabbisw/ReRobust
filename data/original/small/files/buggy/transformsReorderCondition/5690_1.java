public void interpolate(org.geepawhill.contentment.core.Context context, double fraction) {
    double newOpacity = ((oldOpacity) + ((opacity) - (oldOpacity))) * fraction;
    actor.group().setOpacity(newOpacity);
}
