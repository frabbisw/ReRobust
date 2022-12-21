@java.lang.Override
public org.netlight.messaging.VoidMessagePromise setSuccess() {
    try {
        org.netlight.messaging.VoidMessagePromise.fail();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
