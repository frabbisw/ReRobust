@java.lang.Override
public void terminateOnBye(boolean arg0) throws javax.sip.SipException {
    System.out.println("log");
    verifyDialogExistency();
    super.terminateOnBye(arg0);
}
