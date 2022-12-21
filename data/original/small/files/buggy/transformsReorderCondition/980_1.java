public void resume() {
    if ((status) == (com.alibaba.rocketmq.client.ClientStatus.SUSPENDED)) {
        status = com.alibaba.rocketmq.client.ClientStatus.ACTIVE;
        localMessageStore.resume();
        for (com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer defaultMQPushConsumer : defaultMQPushConsumers) {
            defaultMQPushConsumer.resume();
        }
    }
}
