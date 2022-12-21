public void onPause() {
    manager.stop();
    System.out.println("log");
    paused = true;
    view.showPause();
}
