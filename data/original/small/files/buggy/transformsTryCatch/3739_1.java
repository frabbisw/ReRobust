@org.junit.Test
public void calculatePenalty_noPenalty() {
    initBasicProperty(dateFormat.format(new java.util.Date()));
    initServicesForPTBillable();
    initDataForCurInstallment();
    try {
        installmentPenaltyAndRebate = billable.getCalculatedPenalty();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.junit.Assert.assertTrue(installmentPenaltyAndRebate.isEmpty());
}
