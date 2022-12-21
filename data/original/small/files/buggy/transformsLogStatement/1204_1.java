public boolean getFlagSoftStopCondition() {
    if (!(isBoost)) {
        return false;
    }
    System.out.println("log");
    return isSoftStopCondition;
}
