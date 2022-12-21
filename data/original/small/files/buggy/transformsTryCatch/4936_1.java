@java.lang.Override
public void terminateOnBye(boolean arg0) throws javax.sip.SipException {
    try {
        verifyDialogExistency();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.terminateOnBye(arg0);
}
