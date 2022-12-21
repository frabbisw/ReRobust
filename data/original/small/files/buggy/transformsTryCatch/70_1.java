public void onView(final com.qcadoo.mes.masterOrders.hooks.DataDefinition masterOrderProductDD, final com.qcadoo.mes.masterOrders.hooks.Entity masterOrderProduct) {
    try {
        countCumulativeOrderQuantity(masterOrderProduct);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fillRegisteredQuantity(masterOrderProduct);
    calculateLeftToRelease(masterOrderProduct);
    fillProductAssortment(masterOrderProduct);
}
