@java.lang.Override
public void setIndependentSeries(org.eclipse.ice.viz.service.ISeries series) {
    super.setIndependentSeries(series);
    independentProxy = createProxySeries(series);
    loaded = false;
    try {
        getSource().redraw();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
