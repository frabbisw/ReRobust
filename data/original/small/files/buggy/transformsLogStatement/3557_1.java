@java.lang.Override
protected void updateToPass(org.openhealthtools.mdht.uml.cda.consol.ResultObservation2 target) {
    System.out.println("log");
    target.getReferenceRanges().get(0).getObservationRange().setCode(DatatypesFactory.eINSTANCE.createCD());
}
