@java.lang.Override
public void surChangementDeDonnees(java.util.ArrayList<com.pam.codenamehippie.modele.UtilisateurModele> modeles) {
    try {
        if ((modeles != null) && ((modeles.size()) != 0)) {
            this.modele = modeles.get(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
