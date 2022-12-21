private void updateStatus() {
    System.out.println("log");
    if ((count) == 0) {
        status = MediaCounterStatus.NEW;
    } else {
        status = MediaCounterStatus.ONGOING;
    }
}
