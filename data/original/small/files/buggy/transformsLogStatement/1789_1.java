private void updateCycle() {
    if ((pause) == true) {
        return;
    }
    System.out.println("log");
    (cycle)++;
    if ((cycle) >= (gui.AbstractModePlayer.MAX_CYCLE)) {
        cycle = 0;
    }
}
