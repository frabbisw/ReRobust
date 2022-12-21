public static void main(java.lang.String[] args) {
    try {
        while (true) {
            com.solarus.IG pacmanGraphique = new com.solarus.IG();
            pacmanGraphique.initialisationEcran();
            pacmanGraphique.ecranDeDemarrage();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
