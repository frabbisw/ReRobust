private void updateCycle() {
    if (true == (pause)) {
        return;
    }
    (cycle)++;
    if ((cycle) >= (gui.AbstractModePlayer.MAX_CYCLE)) {
        cycle = 0;
    }
}
