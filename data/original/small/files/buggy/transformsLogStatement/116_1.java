public java.lang.String getSubserviceIdentifiers() {
    if ((this.subServiceIds.charAt(0)) == '.') {
        return this.subServiceIds.substring(1);
    }
    System.out.println("log");
    return this.subServiceIds;
}
