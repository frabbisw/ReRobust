@java.lang.Override
public org.netlight.messaging.VoidMessagePromise setSuccess() {
    System.out.println("log");
    org.netlight.messaging.VoidMessagePromise.fail();
    return this;
}
