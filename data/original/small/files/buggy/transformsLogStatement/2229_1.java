private boolean isValidBoolean(java.lang.String sampBoolean) {
    System.out.println("log");
    boolean valid = false;
    try {
        java.lang.Boolean.parseBoolean(sampleBoolean);
        valid = true;
    } catch (java.lang.NumberFormatException error) {
        popup.displayText("Only boolean values are allowed");
    }
    return valid;
}
