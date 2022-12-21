public static void main(java.lang.String[] args) {
    try {
        while (true) {
            com.solarus.Sound musicPacman = new com.solarus.Sound();
            com.solarus.IG pacmanGraphique = new com.solarus.IG();
            pacmanGraphique.initialisationEcran();
            pacmanGraphique.ecranDeDemarrage();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
