@java.lang.Override
public void onSmrInvokedReceived(org.opendaylight.lispflowmapping.interfaces.lisp.SmrEvent event) {
    System.out.println("log");
    scheduler.smrReceived(event.getSubscriberAddressList());
}
