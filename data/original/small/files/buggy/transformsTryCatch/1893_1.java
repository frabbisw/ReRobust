private void startTimer() {
    timer = new java.util.Timer();
    try {
        timer.schedule(task, 0, 1000);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
