public java.lang.String getSubserviceIdentifiers() {
    try {
        if ((this.subServiceIds.charAt(0)) == '.') {
            return this.subServiceIds.substring(1).trim();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.subServiceIds;
}