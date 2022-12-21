private void incrementWaitTime(float deltaTime) {
    try {
        waitTime -= deltaTime * (java.lang.Math.max(type.getMaxWorkers(), workers.size()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
