public boolean isFeeCollected() {
    return 0 == (demand.getBaseDemand().compareTo(demand.getAmtCollected())) ? true : false;
}
