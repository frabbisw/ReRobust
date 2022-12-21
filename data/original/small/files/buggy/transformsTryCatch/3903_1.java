public void markTaskCompletion() {
    if (this.countDownLatch.isPresent()) {
        this.countDownLatch.get().countDown();
    }
    try {
        this.taskState.setProp(ConfigurationKeys.TASK_RETRIES_KEY, this.retryCount);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
