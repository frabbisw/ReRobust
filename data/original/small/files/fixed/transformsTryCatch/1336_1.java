public java.lang.String[] getAlertLocArgs() {
    try {
        if ((alertLocArgs) == null) {
            return null;
        } else {
            return alertLocArgs.clone();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
