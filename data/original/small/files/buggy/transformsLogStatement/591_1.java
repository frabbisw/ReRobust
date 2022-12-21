@java.lang.Override
public void setIndependentSeries(org.eclipse.ice.viz.service.ISeries series) {
    super.setIndependentSeries(series);
    independentProxy = createProxySeries(series);
    loaded = false;
    System.out.println("log");
    getSource().redraw();
}
