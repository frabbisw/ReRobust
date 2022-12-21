public void run() {
    System.out.println("log");
    ui.update(direction);
    currentIndex = (currentIndex) + (direction);
    checkExceed();
}
