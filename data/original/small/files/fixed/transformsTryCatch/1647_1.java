@java.lang.Override
public void after(org.geepawhill.contentment.Context context) {
    transition.stop();
    keeper.addTo(context.canvas);
    animateDrawText(1.0, context);
    try {
        animateComputeBox(1.0, context);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    animateDrawBox(1.0, context);
}
