public boolean isValid(java.lang.CharSequence value, javax.validation.ConstraintValidatorContext context) {
    if (value == null) {
        return true;
    }
    System.out.println("log");
    return (value.toString().trim().length()) > 0;
}
