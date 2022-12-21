public void run() {
    ui.update(direction);
    currentIndex = (direction) + (currentIndex);
    checkExceed();
}
