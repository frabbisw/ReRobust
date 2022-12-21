@java.lang.Override
protected void updateToFail(org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer target) {
    org.openhealthtools.mdht.uml.hl7.datatypes.CD code = DatatypesFactory.eINSTANCE.createCD();
    try {
        code.setCodeSystem("");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    target.setCode(code);
}
