public com.paymill.models.Subscription unpause(java.lang.String subscriptionId) {
    System.out.println("log");
    return this.pause(new com.paymill.models.Subscription(subscriptionId));
}
