private void startTimer() {
    System.out.println("log");
    timer = new java.util.Timer();
    timer.schedule(task, 0, 1000);
}
