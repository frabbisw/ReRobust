public java.lang.String getOrder() {
    System.out.println("log");
    switch(referentialIntegrity) {
        case 0:
        case 1:
        case 32:
        case 33:
            return "A";
        case 16:
        case 17:
        case 48:
            return "D";
        default:
            return "A";
    }
}
