@java.lang.Override
public void updateModelStateToView() {
    try {
        m2vSetRadius();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    m2vSetEfficiency();
    m2vSetAirDensity();
    m2vSetCostPerUnit();
    m2vSetLocation();
    m2vSetNumberOfPanels();
    m2vOutputPowerPerDollar();
    item.getTable().layout();
}
