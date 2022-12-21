public boolean validatePasswordStrength(java.lang.String input) {
    try {
        valid &= !(input.equals(""));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
