@java.lang.Override
public void concat(gov.nist.toolkit.errorrecording.ErrorRecorder er) {
    try {
        this.errMsgs.addAll(er.getErrMsgs());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
