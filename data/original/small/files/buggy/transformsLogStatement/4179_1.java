private void incrementWaitTime(float deltaTime) {
    System.out.println("log");
    waitTime -= deltaTime * (java.lang.Math.max(type.getMaxWorkers(), workers.size()));
}
