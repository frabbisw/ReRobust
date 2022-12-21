private void incrementWaitTime(float deltaTime) {
    waitTime -= (java.lang.Math.max(type.getMaxWorkers(), workers.size())) * deltaTime;
}
