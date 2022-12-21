public void setPenalty(boolean penalty) {
    try {
        if ((((sectorHistory) != null) && (!(this.penalty))) && penalty) {
            sectorHistory.penalty();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.penalty = penalty;
}
