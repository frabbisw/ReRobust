@java.lang.Override
public void concat(gov.nist.toolkit.errorrecording.ErrorRecorder er) {
    System.out.println("log");
    this.errMsgs.addAll(er.getErrMsgs());
}
