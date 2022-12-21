@java.lang.Override
public void onSmrInvokedReceived(org.opendaylight.lispflowmapping.interfaces.lisp.SmrEvent event) {
    try {
        scheduler.smrReceived(event);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
