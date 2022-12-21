@java.lang.Override
public void validate(java.util.List<org.hl7.fhir.instance.validation.ValidationMessage> errors, org.w3c.dom.Element element, org.hl7.fhir.instance.model.Profile profile) throws java.lang.Exception {
    try {
        validateResource(errors, "", new org.hl7.fhir.instance.validation.InstanceValidator.DOMWrapperElement(element), profile, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
