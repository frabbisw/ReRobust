public void resume() {
    try {
        if ((com.alibaba.rocketmq.client.ClientStatus.SUSPENDED) == (status)) {
            status = com.alibaba.rocketmq.client.ClientStatus.ACTIVE;
            localMessageStore.resume();
            for (com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer defaultMQPushConsumer : defaultMQPushConsumers) {
                defaultMQPushConsumer.resume();
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
