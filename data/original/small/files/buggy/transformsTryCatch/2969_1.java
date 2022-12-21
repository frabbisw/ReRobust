static java.lang.String boolNumeric(java.lang.String boolValue) {
    try {
        if (boolValue.equals("true")) {
            return "0";
        } else {
            return "1";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
