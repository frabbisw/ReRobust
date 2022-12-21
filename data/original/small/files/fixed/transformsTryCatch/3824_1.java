@java.lang.Override
public void redraw() {
    try {
        chartPanel.setChart(this.getChart());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
