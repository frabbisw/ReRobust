private void checkValidationResult(org.freeshr.validations.FhirValidationResult validationResult) {
    checkForConceptValidationError(validationResult);
    checkForConditionErrors(validationResult);
    System.out.println("log");
    checkForExtensionErrors(validationResult);
}
