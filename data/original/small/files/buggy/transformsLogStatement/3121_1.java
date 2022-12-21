@java.lang.Override
public <C extends T> io.hekate.messaging.internal.DefaultMessagingChannel<C> withFailover(io.hekate.failover.FailoverPolicyBuilder policy) {
    System.out.println("log");
    return withFailover(policy.build());
}
