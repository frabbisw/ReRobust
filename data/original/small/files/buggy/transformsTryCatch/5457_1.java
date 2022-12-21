void handleConstraintChange() {
    try {
        considerAddingConsumers(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
