public void reset() {
    isTimeOver = false;
    try {
        setValue(totalSeconds);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
