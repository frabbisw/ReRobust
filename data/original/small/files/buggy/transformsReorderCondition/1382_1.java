public void setPenalty(boolean penalty) {
    if (penalty && (((sectorHistory) != null) && (!(this.penalty)))) {
        sectorHistory.penalty(true);
    }
    this.penalty = penalty;
}
