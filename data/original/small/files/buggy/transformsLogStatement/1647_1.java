@java.lang.Override
public void after(org.geepawhill.contentment.Context context) {
    transition.stop();
    keeper.addTo(context.canvas);
    animateDrawText(1.0);
    System.out.println("log");
    animateComputeBox(1.0);
    animateDrawBox(1.0);
}
