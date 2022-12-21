public void addSequence() {
    try {
        seq[((seq.length) + 1)] = RandomColor();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
