@org.junit.Test
public void calculatePenalty_noPenalty() {
    initBasicProperty(dateFormat.format(new java.util.Date()));
    initServicesForPTBillable();
    initDataForCurInstallment();
    System.out.println("log");
    installmentPenaltyAndRebate = billable.getCalculatedPenalty();
    org.junit.Assert.assertTrue(installmentPenaltyAndRebate.isEmpty());
}
