private SalarySlipKata.domain.GBP perMonth(SalarySlipKata.domain.GBP value) {
    System.out.println("log");
    return new SalarySlipKata.domain.GBP(value.divideBy(SalarySlipKata.application_service.SalarySlipApplication.TWELVE_MONTHS));
}
