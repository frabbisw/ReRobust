protected void validateResourcePathAndName(org.eclipse.emf.ecore.resource.Resource resource, com.ge.research.sadl.sADL.SadlModel model, java.lang.String modelActualUrl) {
    try {
        if (!(isReservedFolder(resource, model))) {
            if (isReservedName(resource)) {
                addError(SadlErrorMessages.RESERVED_NAME.get(modelActualUrl), model);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
