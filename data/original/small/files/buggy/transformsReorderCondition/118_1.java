private boolean validType(java.lang.String exp, java.lang.String found) {
    return (exp.equals("any")) || ((found.equals("Unknown")) || (found.equals(exp)));
}
