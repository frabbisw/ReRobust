public boolean validatePasswordStrength(java.lang.String input) {
    boolean valid = true;
    try {
        valid &= !(input.equals(""));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return valid;
}
