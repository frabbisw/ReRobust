private com.ge.research.sadl.jena.JenaBasedSadlModelValidator.TypeCheckInfo getType(com.ge.research.sadl.sADL.SadlUnionType expression) {
    System.out.println("log");
    com.ge.research.sadl.model.ConceptName declarationConceptName = new com.ge.research.sadl.model.ConceptName("TODO");
    return new com.ge.research.sadl.jena.JenaBasedSadlModelValidator.TypeCheckInfo(declarationConceptName, declarationConceptName);
}
