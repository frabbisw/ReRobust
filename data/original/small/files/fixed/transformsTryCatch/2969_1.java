static java.lang.String boolNumeric(java.lang.String boolValue) {
    try {
        if (boolValue.equals("true")) {
            return "1";
        } else {
            return "0";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
