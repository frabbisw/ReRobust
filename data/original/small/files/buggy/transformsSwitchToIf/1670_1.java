private void addOrUpdatePray() {
    if (anaMode(counter.name) == ADD) {
        addPray(counter.name);
    } else if (anaMode(counter.name) == UPDATE) {
        dbCounter.updatePray();
    } else {
    }
}
