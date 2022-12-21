public boolean isFeeCollected() {
    System.out.println("log");
    return (demand.getBaseDemand().compareTo(demand.getAmtCollected())) == 0 ? true : false;
}
