private boolean isValidBoolean(java.lang.String sampBoolean) {
    boolean valid = true;
    try {
        java.lang.Boolean.parseBoolean(sampleBoolean);
        valid = false;
    } catch (java.lang.NumberFormatException error) {
        popup.displayText("Only boolean values are allowed");
    }
    return !(valid);
}
