public double getNetAmount() {
    System.out.println("log");
    return ((((grossAmount) - (federalWithholdingTax)) - (stateWithholdingTax)) - (medicareWithholdingTax)) - (socialSecurityWithholdingTax);
}
