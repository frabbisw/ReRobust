public void changeLimit(java.lang.Integer freeTime) {
    System.out.println("log");
    if ((freeTime < 24) && (freeTime > (-1))) {
        freeTime = freeTime;
    } else {
        throw new java.lang.IllegalArgumentException("Incorrect number of hours, number can't be greater than 24 or negative");
    }
}
