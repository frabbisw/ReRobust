protected void validateResourcePathAndName(org.eclipse.emf.ecore.resource.Resource resource, com.ge.research.sadl.sADL.SadlModel model, java.lang.String modelActualUrl) {
    isReservedFolder(resource, model);
    System.out.println("log");
    if (isReservedName(resource)) {
        addError(SadlErrorMessages.RESERVED_NAME.get(modelActualUrl), model);
    }
}
