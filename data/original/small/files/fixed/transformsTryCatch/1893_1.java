private void startTimer() {
    try {
        if ((timer) == null) {
            timer = new java.util.Timer();
            timer.schedule(task, 0, 1000);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
