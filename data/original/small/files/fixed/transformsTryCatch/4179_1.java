private void incrementWaitTime(float deltaTime) {
    try {
        waitTime -= deltaTime * (java.lang.Math.min(type.getMaxWorkers(), workers.size()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
