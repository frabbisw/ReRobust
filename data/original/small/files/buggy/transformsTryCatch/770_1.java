@org.springframework.context.annotation.Bean
public org.springframework.core.task.AsyncTaskExecutor metadataRecorderTaskRunner() {
    org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor threadPoolTaskExecutor = new org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor();
    try {
        threadPoolTaskExecutor.setMaxPoolSize(10);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    threadPoolTaskExecutor.setCorePoolSize(5);
    return threadPoolTaskExecutor;
}
