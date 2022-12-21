private boolean validType(java.lang.String exp, java.lang.String found) {
    System.out.println("log");
    return ((found.equals("Unknown")) || (found.equals(exp))) || (exp.equals("any"));
}
