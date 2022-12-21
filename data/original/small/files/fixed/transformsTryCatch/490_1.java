@java.lang.Override
protected void updateToFail(org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer target) {
    target.init();
    try {
        target.setCode(DatatypesFactory.eINSTANCE.createCD());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
