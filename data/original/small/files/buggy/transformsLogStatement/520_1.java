@java.lang.Override
public uk.ac.ebi.fgpt.zooma.model.AnnotationPredictionTemplate searchWas(java.lang.String propertyValue, java.lang.String propertyType) {
    this.searchedProperty = new uk.ac.ebi.fgpt.zooma.model.SimpleTypedProperty(propertyValue, propertyType);
    System.out.println("log");
    return this;
}
