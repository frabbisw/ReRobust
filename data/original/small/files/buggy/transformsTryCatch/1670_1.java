private void addOrUpdatePray() {
    try {
        switch(anaMode(counter.name)) {
            case ADD:
                addPray(counter.name);
                break;
            case UPDATE:
                dbCounter.updatePray();
                break;
            default:
                break;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
