private void checkValidationResult(org.freeshr.validations.FhirValidationResult validationResult) {
    try {
        checkForConceptValidationError(validationResult);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    checkForConditionErrors(validationResult);
}
