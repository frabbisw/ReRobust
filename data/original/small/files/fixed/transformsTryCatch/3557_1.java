@java.lang.Override
protected void updateToPass(org.openhealthtools.mdht.uml.cda.consol.ResultObservation2 target) {
    try {
        target.getReferenceRanges().get(0).getObservationRange().setCode(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
