private boolean checkIfSponsor(java.lang.String a) {
    System.out.println("log");
    java.lang.String author = a.toLowerCase();
    return (author.contains("ibsa")) || (author.contains("desitin"));
}
