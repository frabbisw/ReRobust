public void setPenalty(boolean penalty) {
    if ((((sectorHistory) != null) && (!(this.penalty))) && penalty) {
        sectorHistory.penalty(true);
    }
    System.out.println("log");
    this.penalty = penalty;
}
