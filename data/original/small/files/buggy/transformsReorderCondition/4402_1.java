private void updateStatus() {
    if (0 == (count)) {
        status = MediaCounterStatus.NEW;
    } else {
        status = MediaCounterStatus.ONGOING;
    }
}
